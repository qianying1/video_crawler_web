<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <link rel="shortcut icon" href="/images/logo.ico"/>
    <meta http-equiv="content-Type" content="text/html; charset=UTF-8"/>
    <link href="${base}/css/amazeui.css" rel="stylesheet" type="text/css"/>
</head>
<title>首页</title>
<body>
<div class="am-tabs" id="doc-my-tabs" style="width: 80%;margin-left: 10%;margin-right: 10%;margin-top: 20px;">
    <ul class="am-tabs-nav am-nav am-nav-tabs am-nav-justify">
        <li class="am-active am-tabs-nav1" id="videoLike"><a href="" style="white-space: nowrap">视频喜欢人数统计</a></li>
        <li id="videoLen" class="am-tabs-nav1"><a href="" style="white-space: nowrap">视频长度分布统计</a></li>
        <li class="am-tabs-nav1" id="videoComments"><a href="" style="white-space: nowrap">视频评论统计</a></li>
        <li class="am-tabs-nav1" id="videoIncome"><a href="" style="white-space: nowrap">视频收益分布统计</a></li>
        <li class="am-tabs-nav1" id="videoType"><a href="" style="white-space: nowrap">视频类型作者分布统计</a></li>
        <li class="am-tabs-nav1" id="fictionAndVideo"><a href="" style="white-space: nowrap">小说和视频分布统计</a></li>
        <li class="am-tabs-nav1"><a href="" style="white-space: nowrap">视频作者性别比例</a></li>
        <li><a href="" style="white-space: nowrap">视频类型占比</a></li>
    </ul>
    <div class="am-tabs-bd">
        <div class="am-tab-panel am-active">
            <iframe name="myiframe" src="/go/census/videoLikesCensus.htm" frameborder="0" align="left"
                    width="110%" height="500"
                    scrolling="no">
                <p>你的浏览器不支持iframe标签</p>
            </iframe>
        </div>
        <div class="am-tab-panel">
            <iframe name="myiframe" src="/go/census/videoLengthCensus.htm" frameborder="0" align="left"
                    width="110%" height="500"
                    scrolling="no">
                <p>你的浏览器不支持iframe标签</p>
            </iframe>
        </div>
        <div class="am-tab-panel">
            <iframe name="myiframe" src="/go/census/videoCommentsCensus.htm" frameborder="0" align="left"
                    width="110%" height="500"
                    scrolling="no">
                <p>你的浏览器不支持iframe标签</p>
            </iframe>
        </div>
        <div class="am-tab-panel">
            <iframe name="myiframe" src="/go/census/videoIncomeDistributeCensus.htm" frameborder="0"
                    align="left"
                    width="110%" height="500"
                    scrolling="no">
                <p>你的浏览器不支持iframe标签</p>
            </iframe>
        </div>
        <div class="am-tab-panel">
            <iframe name="myiframe" src="/go/census/typeAuthorDistributeCensus.htm" frameborder="0"
                    align="left"
                    width="110%" height="500"
                    scrolling="no">
                <p>你的浏览器不支持iframe标签</p>
            </iframe>
        </div>
        <div class="am-tab-panel">
            <iframe name="myiframe" src="/go/census/fictionAndVideoDistributeCensus.htm" frameborder="0"
                    align="left"
                    width="110%" height="500"
                    scrolling="no">
                <p>你的浏览器不支持iframe标签</p>
            </iframe>
        </div>
        <div class="am-tab-panel">
            <iframe name="myiframe" src="/go/census/videoAuthorSexRateCensus.htm" frameborder="0"
                    align="left"
                    width="110%" height="500"
                    scrolling="no">
                <p>你的浏览器不支持iframe标签</p>
            </iframe>
        </div>
        <div class="am-tab-panel">
            <iframe name="myiframe" src="/go/census/typeVideRateCensus.htm" frameborder="0"
                    align="left"
                    width="2550px" height="1900px"
                    scrolling="no">
                <p>你的浏览器不支持iframe标签</p>
            </iframe>
        </div>
    </div>
</div>
</body>
<script type="application/javascript" src="/js/jquery.js"></script>
<script type="application/javascript" src="/js/amazeui.min.js"></script>
<script type="application/javascript">
    $(function () {
        $('#doc-my-tabs').tabs();
    });
</script>
</html>
