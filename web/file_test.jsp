<%--
  Created by IntelliJ IDEA.
  User: taoger
  Date: 2020-12-29
  Time: 16:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="com.mysql.cj.api.Session" %>
<%@ page import="java.util.Date" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
    pageContext.setAttribute("ctp", request.getContextPath());

%>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="js/jQuery.min.js"></script>
</head>
    <body>
    <h1>${sessionScope.get("zx")}</h1>
    <button id="aj"> 测试ajax</button>
    <div id="append"></div>
    <hr>
    <form action="${ctp}/testRequestBody" method="post">
        <input type="text" name="zx_name" placeholder="xxx"><br>
        <input type="submit" value="提交">
    </form>
    <br>


    <form action="${ctp}/file_sc" method="post" enctype="multipart/form-data">
        <input type="text" name="zx_name" placeholder="xxx"><br>
        <input type="file" name="file"><br>
        <input type="file" name="file"><br>
        <input type="file" name="file"><br>
        <input type="submit" value="提交">
    </form>

    
    <img src="${ctp}/images/IMG_2701.jpg" height="300px" width="600px">

</body>

<script type="text/javascript">
    $("#aj").click(function(){
        alert("111");
        var user={zx_name:"bruce", zx_age:1, addres_num:1};
        var userJson = JSON.stringify(user);
        $.ajax({
            url:"${ctp}/json_test",
            dataType: "json",
            contentType:"application/json;charset=UTF-8",
            type:"POST",
            data:userJson,
            success:function(data){
                console.log(data);
                $.each(data,function(){
                    var uer = this.zx_name+"--"+this.zx_age+"--"+this.addres_num;
                    $("#append").append(uer);
                })
            }
        });
        return false;
    });

</script>
</html>
