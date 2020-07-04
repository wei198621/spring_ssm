<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%--
  Created by IntelliJ IDEA.
  User: tz_wl
  Date: 2020/7/4
  Time: 17:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" isELIgnored="false" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>遍历员工数据</h1>
    <c:forEach items="${requestScope.users}" var="user">
        id:${user.id}
        name:${user.name}
        <br>
    </c:forEach>

</body>
</html>
