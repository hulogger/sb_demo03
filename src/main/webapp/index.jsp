<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<html>
<head>
    <title>新闻信息</title>
    <script language="JavaScript" src="js/jquery-1.8.3.min.js"></script>
    <script language="JavaScript">
        $(function(){
            alert("来到本页面");
        });
    </script>
</head>
<body>

<center>
    显示所有学生信息<hr/>
    <table  border="2" width="80%">
        <tr>
            <td>学号</td>
            <td>姓名</td>
            <td>年龄</td>
            <td>性别</td>
            <td>地址</td>
            <td>状态</td>
            <td>生日</td>
            <td>操作</td>
        </tr>
        <c:forEach items="${studentsList}" var="s">
        <tr>
            <td>${s.xh}</td>
            <td>${s.name}</td>
            <td>${s.age}</td>
            <td>${s.sex}</td>
            <td>${s.address}</td>
            <td>${s.state}</td>
            <td>${s.birthday}</td>
            <td><a href="getStuAction?xh=${s.xh}">修改</a>  <a href="javascript:if(confirm('确定想删除吗?')) location.href='delStudents?xh=${s.xh}';">删除</a></td>
        </tr>
        </c:forEach>
        <span>${del}</span>
</center>
</body>
</html>
