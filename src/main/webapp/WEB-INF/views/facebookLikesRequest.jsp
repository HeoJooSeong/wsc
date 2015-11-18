<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Edit</title>
</head>
<body>
페이스북 친구 검색<br/>
<form action="/oauth2/facebookLikes" method="GET">
    <input type="text" name="userId" value="${userId}"/>
    <input type="submit" value="검색">
</form>
</body>
</html>