<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Location</title>
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
		<h2>View User</h2>

		<form action="viewUser">
		<input type="text" name="username" placeholder="Enter Username " class="form-control mb-4 col-4">	
		<button type="submit" class="btn btn-info col-2"> Search </button>
		<a  class="btn btn-info col-2" href="viewAllUsers"> Show All Users </a>
		</form>

	<table class="table" >
  <thead>
    <tr>
      <th scope="col">Username</th>
      <th scope="col">Password</th>
      <th scope="col">Role</th>
    </tr>
  </thead>
  <tbody>
	<c:forEach items="${userList}" var="user">
		<tr>
      		<td>${user.username}</td>
      		<td>${user.password}</td>
      		<td>${user.role}</td>
      	</tr>  
	</c:forEach>
  </tbody>
</table>
</div>

</body>
</html>