<%@ page import = "mvc_package.LoginModel" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

</head>
<body>

<h2>Enter your username and password.</h2>

<form action= "<%= request.getContextPath() %>/Controller" method = "post">
	 Username: <input type= "text" required name = "username">
	 Password: <input type= "password" required name = "password">
	 
	 <input type= "submit" value = "Log in">


</form>

</body>
</html>