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
		<h2>Update Mounter</h2>
		<form action="retrieveMounter" class="row g-9">
			<div class="col-auto">
			    <input type="number" class="form-control" name="mounterId" placeholder="Enter Mounter Id">
			  </div>
			  <div class="col-auto">
			    <button type="submit" class="btn btn-primary mb-3">Search</button>
			 </div>
		</form>
		<form action="updateMounter">
		<input type="number" name="mounterId" value="${mounter.mounterId}" placeholder="Mounter Id" class="form-control mb-4 col-4" readonly="readonly">
		<input type="text" name="mounterName" value="${mounter.mounterName}" placeholder="Mounter Name" class="form-control mb-4 col-4">	
		<button type="submit" class="btn btn-info col-1"> Update</button>	
<!-- 		<a href = "mounterHome" class="btn btn-info col-2"> Back to Mounter Home</a>
 -->		</form>
	</div>
</body>
</html>