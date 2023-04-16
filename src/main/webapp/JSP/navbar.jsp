<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-light bg-light">

      <a class="navbar-brand" href="/Dashboard">Flex Management System</a>
      <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav"
        aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>
      <div class="collapse navbar-collapse" id="navbarNav">
        <ul class="navbar-nav">
        
        <c:set var="role" value="${userRole}" />	
        <c:if test="${role eq 'ADMIN'}">
        	 <li class="nav-item dropdown">
            <a class="nav-link dropdown-toggle" href="" id="navbarDropdownMenuLink" role="button"
              data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
              Users
            </a>
            <div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
              <a class="dropdown-item" href="/Dashboard/addUserForm">Add User</a>
              <a class="dropdown-item" href="/Dashboard/deleteUserForm">Delete User</a>
              <a class="dropdown-item" href="/Dashboard/updateUserForm">Update User</a>
              <a class="dropdown-item" href="/Dashboard/viewUserForm">View User</a>
            </div>
          </li>
        </c:if>
       		
          <li class="nav-item dropdown">
            <a class="nav-link dropdown-toggle" href="" id="navbarDropdownMenuLink" role="button"
              data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
              Customers
            </a>
            <div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
              <a class="dropdown-item" href="/Dashboard/addCustomerForm">Add Customer</a>
              <a class="dropdown-item" href="/Dashboard/deleteCustomerForm">Delete Customer</a>
              <a class="dropdown-item" href="/Dashboard/updateCustomerForm">Update Customer</a>
              <a class="dropdown-item" href="/Dashboard/viewCustomerForm">View Customer</a>
            </div>
          </li>
          <li class="nav-item dropdown">
            <a class="nav-link dropdown-toggle" href="" id="navbarDropdownMenuLink" role="button"
              data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
              Locations
            </a>
            <div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
              <a class="dropdown-item" href="/Dashboard/addLocationForm">Add Location</a>
              <a class="dropdown-item" href="/Dashboard/deleteLocationForm">Delete Location</a>
              <a class="dropdown-item" href="/Dashboard/updateLocationForm">Update Location</a>
              <a class="dropdown-item" href="/Dashboard/viewLocationForm">View Location</a>
            </div>
          </li>
          <li class="nav-item dropdown">
            <a class="nav-link dropdown-toggle" href="" id="navbarDropdownMenuLink" role="button"
              data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
              Mounters
            </a>
            <div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
              <a class="dropdown-item" href="/Dashboard/addMounterForm">Add Mounter</a>
              <a class="dropdown-item" href="/Dashboard/deleteMounterForm">Delete Mounter</a>
              <a class="dropdown-item" href="/Dashboard/updateMounterForm">Update Mounter</a>
              <a class="dropdown-item" href="/Dashboard/viewMounterForm">View Mounter</a>
            </div>
          </li>
        </ul>
      </div>
      <div class="collapse navbar-collapse" id="navbarNav">
        <ul class="navbar-nav ml-auto">
          <li class="nav-item">
            <a class="nav-link" href="/logout">Logout</a>
          </li>
        </ul>
      </div>
    </nav>

</body>
</html>