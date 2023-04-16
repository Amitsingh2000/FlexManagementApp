<!DOCTYPE html>
<html lang="en" xmlns:th="http://www.thymeleaf.org">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<head>
<meta charset="ISO-8859-1">
<title>Employee Management System</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
	integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
	crossorigin="anonymous">
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>

</head>
<body>
	<%@ include file="navbar.jsp" %>
	<div class="container">
		<hr>
		<h2>Insert User</h2>

		<form action="addUser">
		<input type="text" name="username" placeholder="UserName" class="form-control mb-4 col-4" autocomplete="off">		
		<input type="text" name="password" placeholder="Password" class="form-control mb-4 col-4">	
		<select class="form-control mb-4 col-4"  name="role" >
			 <option selected>Select Role</option>
			 <option value="ADMIN">ADMIN</option>
			 <option value="USER">USER</option>	
		</select>
		<button type="submit" class="btn btn-info col-2"> Save User</button>
		</form>
		
		<hr>
	</div>
</body>
</html>