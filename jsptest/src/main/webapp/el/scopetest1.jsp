<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
//JSP 태그 값 정의 : el 출력
String b = "jsp만의 변수";
pageContext.setAttribute("a","pageContext공유");
request.setAttribute("a","request공유");//forward까지
session.setAttribute("a","session공유");//브라우저내부전부까지
application.setAttribute("a","application공유");
%>
jsp b출력 = <%=b %><br>
jsp a출력(pageContext) = <%=pageContext.getAttribute("a") %><br>
jsp a출력(request) = <%=request.getAttribute("a") %><br>
jsp a출력(session) = <%=session.getAttribute("a") %><br>
jsp a출력(application) = <%=application.getAttribute("a") %><br>
el b출력 = ${b }<br> <!--jsp에서변수를만들어 el까지쓰려면 setAttribute로값저장후출력 -->
el a출력 = ${a }<br>
el a출력 = ${a }<br>
el a출력 = ${a }<br>
el a출력 = ${a }<br>
<a href="${pageContext.request.contextPath }/el/scopetest2.jsp">링크이동</a>
<%--<jsp:forward page="/el/scopetest2.jsp"/> --%>
</body>
</html>