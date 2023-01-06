<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>구구단을 출력합니다.</h1>
<%
//get/post동일한방법으로 로직 처리한다
if(request.getMethod().equals("GET")){
	int start = Integer.parseInt(request.getParameter("start"));
	int end = Integer.parseInt(request.getParameter("end"));
%>
	<table border=1>
	<%for(int j=1; j<=9; j++){%>
		<tr>
		<%for(int i = start; i <=end; i++){%>
		<td><%=i%>i * <%=j%> = <%=i*j%></td>
		<%}%>
		</tr>
	<% }%>
	</table>
<%}else {
%>
	<h3>post방식은 지원하지 않습니다.</h3>
<%
}
%>
</body>
</html>