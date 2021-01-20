<%@ page import = "mvc_package.LoginModel" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>




<body>
<h1>
<%
LoginModel login = (LoginModel)request.getAttribute("login");
out.print("welcome "+login.getUsername()+".");
%>
</h1>





</body>
</html>

