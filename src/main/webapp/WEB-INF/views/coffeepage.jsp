<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://stackpath.bootstrapcdn.com/bootswatch/4.1.3/united/bootstrap.min.css" rel="stylesheet">
<link href = "main.css" rel="stylesheet">
</head>
<body>
 <div class ="container">
	<h1>Our Coffee</h1>
	
		<table class="table">
			<thead>
			<tr>
				<th>Brand</th>
				<th>Type</th>
				<th>Price</th>
				
				</tr>
			</thead>
			<tbody>
			
				<c:forEach items="${items}" var="p">
					<tr>
						<td>${p.brand}</td>
						<td>${p.description}</td>
						<td>${p.price}</td>
					<td><a class ="btn btn-primary" href = "/update?itemid=${p.id}">Edit</a></td>
						<td><a class ="btn btn-primary" href = "/delete?itemid=${p.id}">Remove</a></td> 
				
					</tr>

				</c:forEach>
			</tbody>
		</table>
		</div>  

</body>
</html>