<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>

  <!DOCTYPE html>
  <html>

  <head>
    <meta charset="ISO-8859-1">
    <title>Flex Management System</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
    <style type="text/css">
      body {
        background-image: url(Dashboard.jpg);
        background-repeat: no-repeat;
        background-size: cover;
        background-attachment: fixed;
       
       }
    </style>
  </head>

  <body>
	 <%@ include file="navbar.jsp" %>    
    <h1 style=" text-shadow: 2px 2px 2px #0baff0; color: rgb(7, 76, 136); transform:rotate(-0.3deg); font-size: 70px; margin-top: 200px; margin-left: 350px;">Flex Management System</h1>
	


    <!-- 	<div class="container">
		<h2>Admin Dashboard</h2>
		<a class="btn btn-primary" href="customerHome" role="button">Employee</a>
		<a class="btn btn-primary" href="customerHome" role="button">Customer</a>
		<a class="btn btn-primary" href="locationHome" role="button">Location</a>
		<a class="btn btn-primary" href="mounterHome" role="button">Mounter</a>
		<a href ="/" class="btn btn-primary"> Logout</a>
	</div>
	<div class="container">
			<h2>Employee Dashboard</h2>
		<a class="btn btn-primary" href="customerHome" role="button">Customer</a>
		<a class="btn btn-primary" href="locationHome" role="button">Location</a>
		<a class="btn btn-primary" href="mounterHome" role="button">Mounter</a>
		<a href ="/" class="btn btn-primary"> Logout</a>
	</div>
	 -->
   <footer style="margin-top: 305px;" class="bg-light py-1">
    <div class="container">
      <div class="row">
        <div class="col-lg-12 text-center">
          <h6>Copyright 2022 | Flex Management System | All Rights Reserved</h6>
      </div>
    </div>
  </div>
  </footer>
  
  </body>

  </html>