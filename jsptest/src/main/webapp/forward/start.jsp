<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%String id = request.getParameter("id");
String filename="";
if(id != null){
	if(id.equals("admin") || id.equals("administrator")){
		filename="admin.jsp";		
	}else{
		filename="user.jsp";
	}
}
else{
	filename="none.jsp";
}
%>

<jsp:forward page="<%=filename %>"/>
</body>
</html>