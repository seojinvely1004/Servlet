<%@page import="java.util.HashMap"%>
<%@page import="java.util.concurrent.ConcurrentHashMap"%>
<%@page import="dto.MemberDTO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

</head>
<body>
	<c:forEach begin="1" end="10" step="2" var="odd" varStatus="vs">
${odd } : ${vs.current }<br>
		<!-- current : 현재 반복중인 값 -->
	</c:forEach>

	<%
	String array[] = { "red", "balck", "white", "green", "blue" };
	%>
	<c:set var="colors" value="<%=array%>" />

	<c:forEach items="${colors }" var="col" varStatus="st">
		<h3>${st.index }번째데이터=${col }: ${st.current } --- ${st.count }번
			반복중입니다.</h3>
		<h3>첫번째냐?-${st.first } : 마지막이냐?-${st.last }</h3>
	</c:forEach>

	<c:forEach items="${colors }" varStatus="st">
		<c:if test="${st.first }">
			<h1>첫번째 = ${st.current }</h1>
		</c:if>
		<c:if test="${st.last }">
			<h1>마지막 = ${st.current }</h1>
		</c:if>
	</c:forEach>
	<!-- index는0부터, count는1부터 시작. -->

	<jsp:useBean id="list" class="java.util.ArrayList" />
	<jsp:useBean id="dto" class="dto.MemberDTO" />
	<jsp:setProperty property="id" name="dto" value="el" />
	<%
	list.add(dto);
	%>
</body>
</html>