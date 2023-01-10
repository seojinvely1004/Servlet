<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>${pageContext.request.contextPath}</h1>

jsp a출력(pageContext) = <%=pageContext.getAttribute("a") %><br>
jsp a출력(request) = <%=request.getAttribute("a") %><br>
jsp a출력(session) = <%=session.getAttribute("a") %><br>
jsp a출력(application) = <%=application.getAttribute("a") %><br>

el a출력(현재페이지의 jsp태그 전달값) = ${pageScope.a }<br> <!-- 우선순위있으므로 pageScope은생략가능하다. -->
el a출력(이동전의 jsp태그 전달값) = ${requestScope.a }<br>
el a출력(세션 전달값) = ${sessionScope.a }<br>
el a출력(어플리케이션 전달값) = ${applicationScope.a }<br>
el 컨텍스트명 출력 = ${pageContext.request.contextPath }<br><!-- get은빼고 contextPath로 컨텍스트명을출력 -->
el jsp명 출력 = ${pageContext.request.requestURI }<br><!--jsp의 request라는 내장객체안에있는 값들  -->
<!-- 
e1 전달 변수 해석 출력
1. pageScope찾는다 
2.requestScope
3.sessionScope
4.applicationScope -->
</body>
</html>