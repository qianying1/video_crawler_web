<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <link rel="shortcut icon" href="/images/logo.ico"/>
    <meta http-equiv="content-Type" content="text/html; charset=UTF-8"
    <style type="text/css" href="" rel="stylesheet"/>
    <link href="${base}/css/amazeui.css" rel="stylesheet" type="text/css"/>
    <script type="application/javascript" src="/js/jquery.js"></script>
    <script type="application/javascript" src="/js/amazeui.min.js"></script>
</head>
<title>首页</title>
<body>
<div class="am-tabs" id="doc-my-tabs" style="width: 80%;margin-left: 10%;margin-right: 10%;margin-top: 20px;">
    <ul class="am-tabs-nav am-nav am-nav-tabs am-nav-justify">
        <li class="am-active am-tabs-nav1"><a href="">视频喜欢人数统计</a></li>
        <li id="huamian" class="am-tabs-nav1"><a href="">视频长度分布统计</a></li>
        <li class="am-tabs-nav1"><a href="">用户分布统计</a></li>
        <li class="am-tabs-nav1"><a href="">视频类型作者分布统计</a></li>
        <li class="am-tabs-nav1"><a href="">收藏数量统计</a></li>
        <li class="am-tabs-nav1"><a href="">评论数量分布统计</a></li>
        <li class="am-tabs-nav1"><a href="">作者年龄段统计</a></li>
    </ul>
    <div class="am-tabs-bd">
        <div class="am-tab-panel am-active" style="padding-top: 20px;">
            <iframe name="myiframe" id="myrame" src="/go/census/videoLikesCensus.htm" frameborder="0" align="left"
                    width="110%" height="500"
                    scrolling="no">
                <p>你的浏览器不支持iframe标签</p>
            </iframe>
        </div>
        <div class="am-tab-panel" style="padding-top: 20px;">
            <iframe name="myiframe" id="myrame1" src="/go/census/videoLengthCensus.htm" frameborder="0" align="left"
                    width="110%" height="500"
                    scrolling="no">
                <p>你的浏览器不支持iframe标签</p>
            </iframe>
        </div>
        <div class="am-tab-panel" style="padding-top: 20px;">
            <iframe name="myiframe" id="myrame2" src="/go/census/userDistributeCensus.htm" frameborder="0" align="left"
                    width="110%" height="500"
                    scrolling="no">
                <p>你的浏览器不支持iframe标签</p>
            </iframe>
        </div>
        <div class="am-tab-panel" style="padding-top: 20px;">
            <iframe name="myiframe" id="myrame3" src="/go/census/typeAuthorDistributeCensus.htm" frameborder="0" align="left"
                    width="110%" height="500"
                    scrolling="no">
                <p>你的浏览器不支持iframe标签</p>
            </iframe>
        </div>
        <div class="am-tab-panel" style="padding-top: 20px;">
            <iframe name="myiframe" id="myrame4" src="/go/census/favoriteCountCensus.htm" frameborder="0" align="left"
                    width="110%" height="500"
                    scrolling="no">
                <p>你的浏览器不支持iframe标签</p>
            </iframe>
        </div>
        <div class="am-tab-panel" style="padding-top: 20px;">
            <iframe name="myiframe" id="myrame5" src="/go/census/commentCountDistributeCensus.htm" frameborder="0"
                    align="left"
                    width="110%" height="500"
                    scrolling="no">
                <p>你的浏览器不支持iframe标签</p>
            </iframe>
        </div>
        <div class="am-tab-panel" style="padding-top: 20px;">
            <iframe name="myiframe" id="myrame6" src="/go/census/authorAgeDistributeCensus.htm" frameborder="0"
                    align="left"
                    width="110%" height="500"
                    scrolling="no">
                <p>你的浏览器不支持iframe标签</p>
            </iframe>
        </div>
    </div>
</div>

<script>
    $(function () {
        $('#doc-my-tabs').tabs();
    });
    /*$('#huamian').on("click", function () {
     $('#doc-my-tabs').tabs("close", $('.am-tabs-nav1 a').eq(1));
     $('#doc-my-tabs').tabs("open", $('.am-tabs-nav1 a').eq(2));
     });*/
</script>
</body>
</html>
