<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <link rel="shortcut icon" href="/images/logo.ico"/>
    <meta http-equiv="content-Type" content="text/html; charset=UTF-8">
    <script type="application/javascript" src="/js/jquery.js"></script>
    <script type="application/javascript" src="/js/echarts.min.js"></script>
</head>
<title>视频收益分布统计</title>
<body>
<div id="echart" style="width: 1300px;height: 500px;"></div>
<script type="application/javascript">
    var memberChart = echarts.init(document.getElementById('echart'));
    $(function () {
        $.ajax({
            url: "/video/videoIncomeDistributeCensus.htm",
            type: 'get',
            async: true,
            data: {},
            contentType: 'json',
            success: function (data) {
                var jsonData = eval('(' + data + ')');
                console.log(jsonData);
                if (jsonData.code == 0) {
                    var typeData = [];
                    var coin = [];
                    var share = [];
                    var videoCount = [];
                    var data = jsonData.data;
                    for (var i = 0; i < data.length; i++) {
                        typeData[i] = data[i].typeName!=undefined?data[i].typeName:'综合';
                        coin[i] = data[i].coin;
                        share[i] = data[i].share;
                        videoCount[i] = data[i].videoCount;
                    }
                    var option = {
                        title: {
                            text: '视频收益分布统计',
                            subtext: '来源于各大视频网站'
                        },
                        tooltip: {
                            trigger: 'axis'
                        },
                        legend: {
                            data: ['投币数量', '分享数量', '视频数量']
                        },
                        toolbox: {
                            show: true,
                            feature: {
                                mark: {show: true},
                                dataView: {show: true, readOnly: false},
                                magicType: {show: true, type: ['line', 'bar']},
                                restore: {show: true},
                                saveAsImage: {show: true}
                            }
                        },
                        calculable: true,
                        xAxis: [
                            {
                                type: 'category',
                                data: typeData
                            }
                        ],
                        yAxis: [
                            {
                                type: 'value'
                            }
                        ],
                        series: [
                            {
                                name: '投币数量',
                                type: 'bar',
                                data: coin,
                                markPoint: {
                                    data: [
                                        {type: 'max', name: '最大值'},
                                        {type: 'min', name: '最小值'}
                                    ]
                                },
                                markLine: {
                                    data: [
                                        {type: 'average', name: '平均值'}
                                    ]
                                }
                            },
                            {
                                name: '分享数量',
                                type: 'bar',
                                data: share,
                                markPoint: {
                                    data: [
                                        {type: 'max', name: '最大值'}, {type: 'min', name: '最小值'}
                                    ]
                                },
                                markLine: {
                                    data: [
                                        {type: 'average', name: '平均值'}
                                    ]
                                }
                            },
                            {
                                name: '视频数量',
                                type: 'line',
                                data: videoCount,
                                markPoint: {
                                    data: [
                                        {type: 'max', name: '最大值'}, {type: 'min', name: '最小值'}
                                    ]
                                },
                                markLine: {
                                    data: [
                                        {type: 'average', name: '平均值'}
                                    ]
                                }
                            }
                        ]
                    };
                }
                memberChart.setOption(option);
            },
            error: function () {

            },
            beforeSend: function () {

            }

        });
    });
</script>
</body>
</html>
