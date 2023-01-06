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

<%! void multiply(int a, int b){
	System.out.println(a*b);//메서드를 추가하고 싶다
}
%>
<% multiply(10,20);//추가한메서드를 호출한다
%>
</body>
</html>