<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
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
		<h2>Update Location</h2>
		<form action="retrieveLocation" class="row g-9">
			<div class="col-auto">
			    <input type="number" class="form-control" name="locationId" placeholder="Enter Location Id">
			  </div>
			  <div class="col-auto">
			    <button type="submit" class="btn btn-primary mb-3">Search</button>
			 </div>
		</form>
		<form action="updateLocation">
		<input type="number" name="locationId" value="${location.locationId}" placeholder="Location Id" class="form-control mb-4 col-4" readonly="readonly">
		<input type="text" name="locationName" value="${location.locationName}" placeholder="Location Name" class="form-control mb-4 col-4">	
		<input type="text" name="hoardingSize" value="${location.hoardingSize}" placeholder="Hoarding Size" class="form-control mb-4 col-4">	
		<button type="submit" class="btn btn-info col-1"> Update</button>	
<!-- 		<a href = "locationHome" class="btn btn-info col-2"> Back to Location Home</a> -->		</form>
	</div>

</body>
</html>