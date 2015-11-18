<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Edit</title>
</head>
<body>
<h2>다음 책 검색 결과: 질의어 - ${searchWord}</h2>

<c:forEach var="item" items="${daumBook.channel.item}">
    ${item.title}, ${item.authorT} ${item.pubDate}<br/><br/>
</c:forEach>
</body>
</html>