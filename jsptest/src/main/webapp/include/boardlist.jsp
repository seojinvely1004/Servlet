<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="bottom.jsp" />
	<h1>게시물 리스트를 보여드립니다.</h1>
	<jsp:include page="bottom.jsp">
		<jsp:param name="filename" value="<%=request.getRequestURI() %>" />
	</jsp:include>
</body>
</html>