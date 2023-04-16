<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
		<h2>View Customer</h2>

		<form action="viewCustomer">
		<select class="form-control mb-4 col-4"  name="searchType" >
			 <option selected value="byId">Search By ID</option>
			 <option value="byName">Search By Name</option>
			 <option value="byMobileNo">Search By Mobile No.</option>
		</select>
		<input type="text" name="searchValue" placeholder="Enter Recipt No " class="form-control mb-4 col-4">	
		<button type="submit" class="btn btn-info col-2"> Search </button>
		<a  class="btn btn-info col-2" href="viewAllCustomers"> Show All Customers </a>
		</form>
		
		<hr>
		
		
		<table class="table" >
  <thead>
    <tr>
      <th scope="col">Recipt No</th>
      <th scope="col">Customer Name</th>
      <th scope="col">Mobile No</th>
      <th scope="col">Location Name</th>
      <th scope="col">Location Size</th>
      <th scope="col">Mounter Name</th>
      <th scope="col">Amount Details</th>       
    </tr>
  </thead>
  <tbody>
	<c:forEach items="${customerList}" var="std">
		<tr>
      		<th scope="row">${std.reciptNo}</th>
      		<td>${std.customerName}</td>
      		<td>${std.mobileNo}</td>
      		<td>${std.locationDetails.locationName}</td>
      		<td>${std.locationDetails.hoardingSize}</td>
      		<td>${std.mounterDetails.mounterName}</td>
      		<td>${std.amountDetails}</td>
      	</tr>  
	</c:forEach>
  </tbody>
</table>
</div>
</body>
</html>