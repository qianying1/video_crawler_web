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
    <title>视频作者性别比例分布统计</title>
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
            url: "/video_author/videoAuthorSexRateCensus.htm",
            type: 'get',
            async: true,
            data: {},
            contentType: 'json',
            success: function (data) {
                var sourceData = eval('(' + data + ')');
                console.log(sourceData);
                if (sourceData.code == 0) {
                    var fictionData = sourceData.data;
                    var type = [];
                    var maleKeyVal = [];
                    var femaleKeyVal = [];
                    var secretKeyVal = [];
                    for (var i = 0; i < fictionData.length; i++) {
                        maleKeyVal[i] = fictionData[i].male;
                        femaleKeyVal[i] = fictionData[i].female;
                        secretKeyVal[i] = fictionData[i].secret;
                        type[i] = fictionData[i].typeName!=undefined?fictionData[i].typeName:'综合';
                    }
                    var option = {
                        title: {
                            text: '作者性别比例分布统计',
                            subtext: '来源于各大视频网站'
                        },
                        tooltip: {
                            trigger: 'axis'
                        },
                        legend: {
                            data: ['男', '女', '保密']
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
                                data: type
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
                                name: '男',
                                type: 'bar',
                                data: maleKeyVal,
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
                                name: '女',
                                type: 'bar',
                                data: femaleKeyVal,
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
                                name: '保密',
                                type: 'bar',
                                data: secretKeyVal,
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
                    memberChart.setOption(option);
                }
            },
            error: function () {
            }
            ,
            beforeSend: function () {
            }
        })
        ;
    })
    ;
</script>
</body>
</html>
