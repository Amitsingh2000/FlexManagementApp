<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 
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
		<h2>View Mounter</h2>

		<form action="viewMounter">
		<input type="text" name="mounterId" placeholder="Enter Mounter Id " class="form-control mb-4 col-4">	
		<button type="submit" class="btn btn-info col-2"> Search </button>
		<a  class="btn btn-info col-2" href="viewAllMounters"> Show All Mounters </a>
		</form>
		
		<hr>
		
<!-- 		<a href = "mounterHome" class="btn btn-info col-2"> Back to Mounter Home</a>
 -->		
	
	<table class="table" >
  <thead>
    <tr>
      <th scope="col">Mounter Id</th>
      <th scope="col">Mounter Name</th>
    </tr>
  </thead>
  <tbody>
	<c:forEach items="${mounterList}" var="mounter">
		<tr>
      		<td>${mounter.mounterId}</td>
      		<td>${mounter.mounterName}</td>
      	</tr>  
	</c:forEach>
  </tbody>
</table>
</div>

</body>
</html>