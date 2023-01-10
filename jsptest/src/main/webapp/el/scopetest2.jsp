<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>scopetest2.jsp</h1>

jsp a출력 = <%=pageContext.getAttribute("a") %><br>
jsp a2출력 = <%=request.getAttribute("a2") %><br>
jsp a3출력 = <%=session.getAttribute("a3") %><br>
jsp a4출력 = <%=application.getAttribute("a4") %><br>
<!--jsp에서변수를만들어 el까지쓰려면 setAttribute로값저장후출력 -->
el a출력 = ${a }<br>
el a2출력 = ${a2 }<br>
el a3출력 = ${a3 }<br>
el a4출력 = ${a4 }<br>

</body>
</html>