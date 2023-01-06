<%@ page 
contentType="text/html; charset=UTF-8"
buffer="8kb"
autoFlush="true"
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body><!-- out : JSP페이지에서 결과를 출력하는 내장객체 -->
<h1>버퍼크기 : <%= out.getBufferSize() %></h1><!-- 8192 -->
<h1>버퍼크기 : <%= out.getRemaining() %></h1><!-- 7999 -->
<h1>자바문장 실행 결과와 html태그를 모아서</h1>
<h1>응답 내용으로 만들고 서버 내부의 버퍼에 저장합니다.(아직 클라이언트에게 전송 전단계입니다)</h1>
<h1>예외 발생시 취소합니다</h1>
<h1>버퍼크기 : <%= out.getBufferSize() %></h1><!-- 8192 -->
<h1>버퍼크기 : <%= out.getRemaining() %></h1><!-- 7835 -->
<% out.flush(); %> 
<!-- 버퍼의 크기가 점점 줄어드는 것을 보면,  출력 후 버퍼 내부에 저장되고 있다는 것을 알 수 있다.  -->
<!-- buffer flush() :전송 후에 비워라. -->
</body>
</html>