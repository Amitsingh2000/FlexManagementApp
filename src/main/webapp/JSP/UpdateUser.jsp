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
		<h2>Update User</h2>
		<form action="retrieveUser" class="row g-9">
			<div class="col-auto">
			    <input type="text" class="form-control" name="username" placeholder="Enter Username ">
			  </div>
			  <div class="col-auto">
			    <button type="submit" class="btn btn-primary mb-3">Search</button>
			 </div>
		</form>
		<form action="updateUser">
		<input type="text" name="username" value="${user.username}" placeholder="Username" class="form-control mb-4 col-4">	
		<input type="text" name="password" value="${user.password}" placeholder="Password" class="form-control mb-4 col-4">	
		<select class="form-control mb-4 col-4"  name="role" >
			 <option selected>Select Role</option>
			 <option value="ADMIN">ADMIN</option>
			 <option value="USER">USER</option>	
		</select>
		<button type="submit" class="btn btn-info col-1"> Update</button>	
		</form>
	</div>

</body>
</html>