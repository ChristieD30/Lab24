<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome to Christies Coffee</title>
</head>
<body>

<h1>Register</h1>
	<form action= "addperson">
	Name: <input type = "text" name = "pname">
	Email: <input type = "text" name = "pemail">
	Phone: <input type = "text" name = "pphone">
	Password: <input type = "text" name = "ppassword">
	<input type = "submit" value ="Add">
	 </form>
	
	
	
	
	
	<div class ="container">
	<h1>Our Coffee</h1>
	
		<table class="table">
			<thead>
			<tr>
				<th>Brand</th>
				<th>Type</th>
				<th>Picture</th>
				<th>Price</th>
				
				</tr>
			</thead>
			<tbody>
			
				<c:forEach items="${items}" var="p">
					<tr>
						<td>${p.brand}</td>
						<td>${p.description}</td>
						<td> <img src = "${p.imagePath}"></td>
						<td>${p.price}</td>
						<td><a class ="btn btn-primary" href = "/update?itemid=${p.id}&n=${p.brand}">Edit</a></td>
						<td><a class ="btn btn-primary" href = "/delete?itemid=${p.id}">Remove</a></td>
				
					</tr>

				</c:forEach>
			</tbody>
		</table>
		</div> 

</body>
</html>