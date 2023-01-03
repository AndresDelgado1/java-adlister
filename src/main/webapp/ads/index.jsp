<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: delgadoa.
  Date: 1/3/23
  Time: 9:21 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>List of ads</h1>
    <c:forEach var="ad" items="${ads}">
        <div class="ad">
            <h2>${ad.title}</h2>
            <p>${ad.description}</p>
        </div>
    </c:forEach>
</body>
</html>
