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
		<h2>Insert Mounter</h2>

		<form action="addMounter">
		<input type="text" name="mounterId" placeholder="Mounter Id" class="form-control mb-4 col-4">		
		<input type="text" name="mounterName" placeholder="Mounter Name" class="form-control mb-4 col-4">	
		<button type="submit" class="btn btn-info col-2"> Save Mounter</button>
		</form>
		
		<hr>
<!-- 		<a href = "mounterHome" class="btn btn-info col-2"> Back to Mounter Home</a>
 -->	</div>

</body>
</html>