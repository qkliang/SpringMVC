<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h4>success page</h4>
	time : ${requestScope.time }
	<br>
	map: ${requestScope.names }
	
	<br>
	requestUser: ${requestScope.user }
	<br>
	sessionUser: ${sessionScope.user }
	<br>
	requestaddress: ${requestScope.address }
	<br>
	sessionaddress: ${sessionScope.address }
	<br>
	sessionSchool: ${sessionScope.School }

</body>
</html>