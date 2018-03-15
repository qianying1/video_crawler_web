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
<title>类型视频占比</title>
<body>
<div id="echart" style="width: 2450px;height: 1800px;"></div>
<script type="application/javascript">
    var memberChart = echarts.init(document.getElementById('echart'));
    $(function () {
        $.ajax({
            url: "/video_type/typeVideRateCensus.htm",
            type: 'get',
            async: true,
            data: {},
            contentType: 'json',
            success: function (data) {
                var jsonData = eval('(' + data + ')');
                console.log(jsonData);
                if (jsonData.code == 0) {
                    var typeData = [];
                    var videoCount = [];
                    var data = jsonData.data;
                    for (var i = 0; i < data.length; i++) {
                        typeData[i] = data[i].typeName;
                        videoCount[i] = {value: data[i].videoCount, name: data[i].typeName};
                    }
                    var option = {
                        title: {
                            text: '类型视频占比',
                            subtext: '数据来源于各大视频网站',
                            x: 'right'
                        },
                        tooltip: {
                            trigger: 'item',
                            formatter: "{a} <br/>{b} : {c} ({d}%)"
                        },
                        legend: {
                            orient: 'vertical',
                            x: 'left',
                            data: typeData
                        },
                        toolbox: {
                            show: true,
                            feature: {
                                mark: {show: true},
                                dataView: {show: true, readOnly: false},
                                magicType: {
                                    show: true,
                                    type: ['pie', 'funnel'],
                                    option: {
                                        funnel: {
                                            x: '20%',
                                            width: '50%',
                                            funnelAlign: 'left',
                                            max: 1548
                                        }
                                    }
                                },
                                restore: {show: true},
                                saveAsImage: {show: true}
                            }
                        },
                        calculable: true,
                        series: [
                            {
                                name: '类型占比',
                                type: 'pie',
                                radius: '35%',
                                center: ['20%', '70%'],
                                data: videoCount
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
