<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form action="springmvc/testHiddedMethod/ei" method="post">
		<input type="hidden" name="_method" value="delete" />
		<input type="submit" value="testDelete"/>
	</form>
	<form action="springmvc/testHiddedMethod/3" method="post">
	<input type="hidden" name="_method" value="put" />
		<input type="submit" value="testPut"/>
	</form>
	<br><br>
	
	<form action="springmvc/testHiddedMethod/2" method="post">
		<input type="submit" value="testpost"/>
	</form>
	
	<br><br>
	<a href="springmvc/testHiddedMethod/1">test Get</a>
	<br><br>
	<a href="springmvc/testVariable/123">test Variable</a>
<br>
<a href="springmvc/testParams?username=1&age=12">test params</a>
<br>
	<a href="springmvc/testMapping">testMapping</a><br>
	<a href="hello">Hello World</a>
</body>
</html>