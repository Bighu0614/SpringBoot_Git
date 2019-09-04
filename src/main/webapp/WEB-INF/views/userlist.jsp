<%--
  Created by IntelliJ IDEA.
  User: Mr.hu
  Date: 2019/9/4
  Time: 18:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <c:forEach items="${userList}" var="user">
        <tr>
            <td>姓名：${user.name}</td>
            <td>电话：${user.phone}</td>
            <td>班级：${user.classId}</td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
