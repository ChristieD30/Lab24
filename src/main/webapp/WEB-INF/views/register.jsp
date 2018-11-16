<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register</title>
<link href="https://stackpath.bootstrapcdn.com/bootswatch/4.1.3/united/bootstrap.min.css" rel="stylesheet">
<link href = "main.css" rel="stylesheet">
</head>
<body>

 <h1>Register</h1>
	<form action= "addperson">
	Name: <input type = "text" name = "pname"><br>
	Email: <input type = "text" name = "pemail"><br>
	Phone: <input type = "text" name = "pphone"><br>
	Password: <input type = "text" name = "ppassword"> <br>
	<a href = "/added" class = "btn btn-primary">Register</a>

	 </form>
</body>
</html>