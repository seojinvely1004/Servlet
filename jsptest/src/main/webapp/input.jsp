<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!--<script src="js/jquery-3.6.1.min.js"></script> -->

<body>
<form action="output.jsp"><!-- get방식으로전달 -->
시작단:<input type=text name="start" value=2 ><br>
종료단:<input type=text name="end" value=9><br>
관리자아이디:<input type=text name="id" value=<%=request.getParameter("id") %> ><br>
<input type=submit value="구구단출력"><br>

</form>
</body>
</html>