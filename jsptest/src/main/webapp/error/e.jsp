<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- exception 내장객체-오류정보객체 -->
<H1>====toString====</H1>
<%=exception %>
<H1>====getMessage====</H1>
<%=exception.getMessage() %>
<H1>====printStackTrace(콘솔)====</H1>
<%=exception.printStackTrace() %>
</body>
</html>