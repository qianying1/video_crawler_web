<%--
  Created by IntelliJ IDEA.
  User: qianying
  Date: 2018/3/7
  Time: 19:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="shortcut icon" href="/images/logo.ico"/>
    <title>跳转中。。。。。。</title>
</head>
<body>
<script type="text/javascript">
    <!--
    function go(t, url) {
//t设置跳转时间：秒
//url设置跳转网址
        document.write("<h3 id='text' style='width: 500px;font-size: 1.5em;margin-left: 25%;margin-top: 10%;color:#009;'>正在进行首页跳转，请等待<strong id='tt'></strong>s...........</h3>");
        $(t, url);
    }
    function $(t, url) {
        ta = t - 1;
        tb = t + "000";
        d = document.getElementById("tt");
        d.innerHTML = t;
        window.setInterval(function () {
            go_to(url);
        }, 1000);
    }
    function go_to(url) {
        d.innerHTML = ta--;
        if (ta < 0) {
            location.href = url;
        }
        else {
            return;
        }
    }
    //-->
</script>
<script type="text/javascript">
    go(5, "/go/census/index.htm")
</script>
</body>
</html>
