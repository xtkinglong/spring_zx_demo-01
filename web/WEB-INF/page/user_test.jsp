<%@ page import="com.mysql.cj.api.Session" %><%--
  Created by IntelliJ IDEA.
  User: taoger
  Date: 2020-12-29
  Time: 16:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
    pageContext.setAttribute("ctp", request.getContextPath());

%>
<html>
<head>
    <title>Title</title>
</head>
    <body>
    <h1>${sessionScope.get("zx")}</h1>
    <h1>${requestScope.get("httpSerReq")}</h1>

    <form action="${ctp}/perweb" method="post">
        <input type="text" name="zx_name" placeholder="xxx">
        <input type="text" name="zx_age" placeholder="xxx">
        <input type="text" name="addres_num" placeholder="xxx">
        <input type="submit" value="提交">
    </form>

    <form action="${ctp}/modeltest" method="post">
        <input type="hidden" name="id" value="1">
        <%--<input type="text" name="zx_name" placeholder="xxx">--%>
        <input type="text" name="zx_age" placeholder="xxx">
        <input type="text" name="addres_num" placeholder="xxx">
        <input type="submit" value="提交">
    </form>

</body>
</html>
