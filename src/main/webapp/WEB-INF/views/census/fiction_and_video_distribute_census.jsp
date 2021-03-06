<%--
  Created by IntelliJ IDEA.
  User: qianying
  Date: 2018/3/7
  Time: 21:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>小说和视频分布统计</title>
    <link rel="shortcut icon" href="/images/logo.ico"/>
    <meta http-equiv="content-Type" content="text/html; charset=UTF-8">
    <script type="application/javascript" src="/js/jquery.js"></script>
    <script type="application/javascript" src="/js/echarts.min.js"></script>
</head>
<body>
<div id="echart" style="width: 1000px;height: 500px;"></div>
<script type="application/javascript">
    var memberChart = echarts.init(document.getElementById('echart'));
    $(function () {
        $.ajax({
            url: "/fiction/fictionAndVideoDistributeCensus.htm",
            type: 'get',
            async: true,
            data: {},
            contentType: 'json',
            success: function (data) {
                var sourceData = eval('(' + data + ')');
                console.log(sourceData);
                if (sourceData.code == 0) {
                    var fictionData = sourceData.data;
                    var typeData = [];
                    var favoriteKeyVal = [];
                    var masksKeyVal = [];
                    var viewsKeyVal = [];
                    var countsKeyVal = [];
                    for (var i = 0; i < fictionData.length; i++) {
                        typeData[i] = fictionData[i].typeName!=undefined?fictionData[i].typeName:'综合';
                        favoriteKeyVal[i] = fictionData[i].favorite;
                        masksKeyVal[i] = fictionData[i].masks;
                        viewsKeyVal[i] = fictionData[i].views;
                        countsKeyVal[i] = fictionData[i].counts;
                    }
                    var option = {
                        title: {
                            text: '小说和视频分布统计',
                            subtext: '来源于各大视频网站'
                        },
                        tooltip: {
                            trigger: 'axis'
                        },
                        legend: {
                            data: ['收藏人数', '弹幕数量', '点击次数', '内容数量']
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
                                boundaryGap: false,
                                data: typeData
                            }
                        ],
                        yAxis: [
                            {
                                type: 'value',
                                axisLabel: {
                                    formatter: '{value}'
                                }
                            }
                        ],
                        series: [
                            {
                                name: '收藏人数',
                                type: 'line',
                                data: favoriteKeyVal,
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
                                name: '弹幕数量',
                                type: 'bar',
                                data: masksKeyVal,
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
                                name: '点击次数',
                                type: 'bar',
                                data: viewsKeyVal,
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
                                name: '内容数量',
                                type: 'line',
                                data: countsKeyVal,
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
    })
    ;
</script>
</body>
</html>
