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
		<h2>Insert Customer</h2>

		<form action="addCustomer">
		<input type="text" name="reciptNo" placeholder="Recipt No" class="form-control mb-4 col-4">		
		<input type="text" name="customerName" placeholder="Customer Name" class="form-control mb-4 col-4">	
		<input type="text" name="mobileNo" placeholder="Mobile No" class="form-control mb-4 col-4">	
		<select class="form-control mb-4 col-4"  name="locationDetails.locationId" >
			 <option selected>Select Location</option>
			 <c:forEach items="${locationList}" var="loc">
			 	<option value="${loc.locationId}">${loc.locationName}</option>	
			 </c:forEach>
		</select>
		<select class="form-control mb-4 col-4"  name="mounterDetails.mounterId" >
			 <option selected>Select Mounter</option>
			 <c:forEach items="${mounterList}" var="mounter">
			 	<option value="${mounter.mounterId}">${mounter.mounterName}</option>	
			 </c:forEach>
		</select>
		<input type="text" name="amountDetails" placeholder="Amount " class="form-control mb-4 col-4">	
		<button type="submit" class="btn btn-info col-2"> Save Customer</button>
		</form>
		
		<hr>
	</div>
</body>
</html>