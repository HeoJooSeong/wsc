<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Edit</title>
</head>
<body>
다음 책 검색<br/>
<form action="/oauth2/daumbook" method="GET">
    <input type="hidden" name="userId" value="${userId}"/>
    <input type="text" name="searchWord" placeholder="검색어"/>
    <input type="submit" value="검색">
</form>
</body>
</html>