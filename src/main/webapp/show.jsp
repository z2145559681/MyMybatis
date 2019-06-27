<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <table border="1">
        <tr>
            <td>id</td>
            <td>姓名</td>
            <td>年龄</td>
            <td>地址</td>
        </tr>
        <c:forEach items="${list}" var="list">
            <tr>
                <td>id:${list.id}</td>
                <td>name:${stu.stu_name}</td>
                <td>age:${stu.stu_age}</td>
                <td>address:${stu.stu_address}</td>
                <td></td>
            </tr>

        </c:forEach>


    </table>

</body>
</html>
