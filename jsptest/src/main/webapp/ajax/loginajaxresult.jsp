<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="${pageContext.request.contextPath}/js/jquery-3.6.1.min.js" ></script>
<script>
$(document).ready(function(){

});
</script>
</head>
<body>
<!-- 아이디 ajax이고 비번 ajax로그인성공 / 나머지 실패 -->
<c:if test="${param.id.equals(\"ajax\") && param.pw.equals(\"ajax\")}">
<h1> <%=new SimpleDateFormat("yyy년 MM월dd일 HH시 mm분ss초").format(new Date()) %>시각에
로그인성공했습니다.</h1>
</c:if>

</body>
</html>