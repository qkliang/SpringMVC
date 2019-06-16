<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<form action="springmvc/testModelAttribute" method="post">
	<input type="hidden" name="id" value="1"/>
		<br>
		userName:<input type="text" name="userName" value="Tom" />
		<br>
<!-- 		password:<input type="password" name="passwrod"/> -->
		email:<input type="text" name="email" value="tom@gy.com" />
		<br>
		country:<input type="text" name="address.country" value="123" />
		<br>
		city:<input type="text" name="address.city" value="21" /><br>
		<input type="submit" value="submit"/>
	</form>
	<br>
	<a href="springmvc/testSessionAttributes">test SessionAttributes</a>
	<br><br>
	<a href="springmvc/testMap">test testMap</a>
	<br><br>
	<a href="springmvc/testModelAndView">test ModelAndView</a>
	<br><br>

	<form action="springmvc/testPojo" method="post">
		userName:<input type="text" name="userName" value="lqk" /><br>
		email:<input type="text" name="email" value="" /><br>
		country:<input type="text" name="address.country" value="" /><br>
		city:<input type="text" name="address.city" value="" /><br>
		<input type="submit" value="submit"/>
	</form>
	
	<br>
	<form action="springmvc/testRequestParams" method="post">
		<input type="text" name="username" value="123" />
		<input type="password" name="password" value="" />
		<input type="submit" value="submit"/>
	</form>
	
	<br>
	
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