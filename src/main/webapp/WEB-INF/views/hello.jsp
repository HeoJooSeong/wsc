<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>양평해장국</title>
</head>
<body>
    <br>
    <h1 align="center">아두이노를 활용한 동작인식 보안시스템<br/></h1>
    <br/>
    <c:set var="user" value="${SPRING_SECURITY_CONTEXT.authentication.principal}"/>

    <%--logout 버튼--%>
    <sec:authorize access="hasAnyRole('ROLE_USER', 'ROLE_ADMIN')">
        <div class="logout" align="right">
            <c:url var="logoutUrl" value="/j_spring_security_logout"/>
            <form action="${logoutUrl}" method="post">
                <input type="submit" value="로그 아웃" />
                <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
            </form>
            <br/>
        </div>
    </sec:authorize>
    <sec:authorize access="isAnonymous()">
        <h2 align="center"><a href="/user/signin">로그인</a><br></h2>
        <h2 align="center"><a href="/user/signup">회원가입</a><br></h2>
        <br>

    </sec:authorize>

    <sec:authorize access="hasRole('ROLE_ADMIN')">
    <h2 align="center"> 관리자 계정</h2>
    </sec:authorize>

    <sec:authorize access="hasRole('ROLE_USER')">
        <h2 align="center"> 사용자 계정</h2>
    </sec:authorize>
    <div align="center"><img width="450" height="300" src="/resources/images/YangSoup.jpg"/></div><br>
    <sec:authorize access="hasAnyRole('ROLE_USER', 'ROLE_ADMIN')">

        <div align="center">
            <input size="50" type="button" value="등록 기기 확인" >
            <input type="button" value="센싱 정보 확인" onclick="location.href='/login?id=${user.id}'">
        </div>
        <br><br>
        <h2> 현재 ${user.name} 사용자의 등록된 기기는 ${user.id} 입니다.</h2><br>
        <h2> 등록된 기기의 센싱 정보는 </h2>
        <table align="center">
            <tr>
                <th> PIR</th>
                <th> SONIC </th>
                <th> LIGHT </th>
                <th> TIME </th>
            </tr>
            <c:forEach var="m" items="${sensor}">
                <tr>
                    <td>${m.pir}</td>
                    <td>${m.sonic}</td>
                    <td>${m.light}</td>
                    <td>${m.time}</td>
                </tr>


            </c:forEach>



        </table>


        <%--<br>--%>
        <%--<h3 align="center"><img width="450" height="300" src="/resources/images/YangSoup.jpg"/></h3>--%>
        <%--이 문장은 ROLE_USER 혹은 ROLE_ADMIN 권한을 가진 사람에게만 보입니다.<br/>--%>
        <%--현재 로그인된 유저는 ${user.name} 입니다. 부여된 권한은 <br/>--%>
        <%--<c:forEach var="authority" items="${user.authorities}">--%>
            <%--${authority}<br/>--%>
        <%--</c:forEach>--%>
        <%--<br/>--%>

        <%--<c:choose>--%>
            <%--<c:when test="${user.age == -1}">--%>
                <%--<a href="/daum_book_request?userId=${user.email}">다음 책 검색</a>--%>
                <%--<br/>--%>
            <%--</c:when>--%>
            <%--<c:when test="${user.age == -2}">--%>
                <%--<a href="/facebook_likes_request?userId=${user.email}">페이스북 좋아요 검색</a>--%>
                <%--<br/>--%>
            <%--</c:when>--%>
        <%--</c:choose>--%>

        <br/>

    </sec:authorize>

    <%--<sec:authorize access="hasRole('ROLE_USER')">--%>
        <%--이 문장은 ROLE_USER 권한을 가진 사람에게만 보입니다.<br/>--%>
    <%--</sec:authorize>--%>

    <%--<sec:authorize access="hasRole('ROLE_ADMIN')">--%>
        <%--이 문장은 ROLE_ADMIN 권한을 가진 사람에게만 보입니다.<br/>--%>
    <%--</sec:authorize>--%>

</body>
</html>
