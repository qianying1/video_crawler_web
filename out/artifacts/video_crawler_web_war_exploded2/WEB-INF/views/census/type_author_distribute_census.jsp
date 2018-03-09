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
    <title>视频类型作者分布统计</title>
    <link rel="shortcut icon" href="/images/logo.ico"/>
    <meta http-equiv="content-Type" content="text/html; charset=UTF-8">
    <script type="application/javascript" src="/js/jquery.js"></script>
    <script type="application/javascript" src="/js/echarts.min.js"></script>
</head>
<body>
<div id="echart" style="width: 1000px;height: 500px;"></div>
<script type="application/javascript">
    var memberChart = echarts.init(document.getElementById('echart'));
    memberChart.setOption({});
    $(function () {
        $.ajax({
            url: "/video_author/typeDistributeCensus.htm",
            type: 'get',
            async: true,
            data: {},
            contentType: 'json',
            success: function (data) {
                var sourceData = eval('(' + data + ')');
                console.log(sourceData);
                if (sourceData.code == 0) {
                    var authorSourceData = sourceData.data;
                    var typeData = [];
                    var attentionData = [];
                    var audienceData = [];
                    var authorData = [];
                    var followerData = [];
                    var videoCountData = [];
                    for (var i = 0; i < authorSourceData.length; i++) {
                        typeData[i] = authorSourceData[i].typeName;
                        attentionData[i] = authorSourceData[i].attentionCount;
                        audienceData[i] = authorSourceData[i].audienceCount;
                        authorData[i] = authorSourceData[i].authorCount;
                        followerData[i] = authorSourceData[i].follower;
                        videoCountData[i] = authorSourceData[i].videoCount;
                    }
                    var option = {
                        title: {
                            text: '视频，类型，作者分布分析',
                            subtext: '来源于各大视频网站'
                        },
                        tooltip: {
                            trigger: 'axis'
                        },
                        legend: {
                            data: ['关注数量', '观众数量', '作者数量', '作者追随人数', '视频数量']
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
                                name: '关注数量',
                                type: 'line',
                                data: attentionData,
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
                                name: '作者数量',
                                type: 'bar',
                                data: authorData,
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
                                name: '观众数量',
                                type: 'bar',
                                data: audienceData,
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
                                name: '作者追随人数',
                                type: 'line',
                                data: followerData,
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
                                data: videoCountData,
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
