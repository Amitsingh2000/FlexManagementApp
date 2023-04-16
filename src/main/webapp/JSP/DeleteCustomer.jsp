<!DOCTYPE html>
<html lang="en" xmlns:th="http://www.thymeleaf.org">
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
		<h2>Delete Customer</h2>

		<form action="deleteCustomer">
		<input type="text" name="reciptNo" placeholder="Enter Recipt No " class="form-control mb-4 col-4">	
		<button type="submit" class="btn btn-info col-2"> Delete </button>
		<a class="btn btn-info col-2" href="deleteAllCustomers"> Delete All Customers </a>
		</form>
		
		<hr>
</div>
</body>
</html>