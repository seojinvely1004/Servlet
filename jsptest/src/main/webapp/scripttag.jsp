<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% String msg="콘솔출력";
 System.out.println(msg);
 //jsp서블릿 변환시 _jspService()문장으로간주
 //jsp서블릿 변환시 _jspService()지역변수로간주
%>
<%!//선언문
String msg2="멤버변수";//선언문내에서 선언한 변수는 '멤버변수'가된다.
int multiply(int a, int b){
	System.out.println(msg2 + ":" + a*b);//메서드를 추가하고 싶다
	return a * b;
}
%>
<%=multiply(10,20)//추가한메서드를 호출한다 (원하는 시점에)호출하여브라우저에 출력한다 <%=
%>
</body>
</html>