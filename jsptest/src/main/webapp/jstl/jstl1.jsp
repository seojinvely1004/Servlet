<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body><!-- pageContext의 setAttribute메서드와 같다고생각(scope속성없는)-->
<!-- set태그는 브라우저에 아무것도 보여주는 것이 없다. -->
<%String jspname = "홍길동"; %> <!-- jsp로 변수선언 -->
<c:set var="id" value="jstl"/>
<c:set var="pw" value="1111"/>
<c:set var="name" value="<%=jspname %>"/> <!-- 변수에 저장할 값을 자바의 변수 jsp로줌 -->
<c:set var="result" value="${pw + 100 }"/> <!--el변수에 연산저장도할수있다 -->

<!-- 모든출력은 el태그작성. -->
${pageContext.request.contextPath } <!-- // /jsptest :현재웹어플리케이션 이름출력됨.--> 
${pageContext.request.remoteAddr }<!--  //0:0:0:0:0:0:0:1접속했던 클라이언트의 IP출력-->
<c:set var="clientip" value="${pageContext.request.remoteAddr }"/>
<c:set var="clientfile" value="${pageContext.request.requestURI }"/>
<h1>${id }</h1>
<h1>${pw }</h1>
<h1>${name }</h1>
<h1>${result }</h1>
<H1>클라이언트IP = ${clientip }</H1>
<H1>클라이언트요청 파일명 = ${clientfile }</H1>

<c:remove var="clientip"/>
<c:remove var="clientfile"/>
<H1>클라이언트IP = ${clientip }</H1>
<H1>클라이언트요청 파일명 = ${clientfile }</H1>
</body>
</html>