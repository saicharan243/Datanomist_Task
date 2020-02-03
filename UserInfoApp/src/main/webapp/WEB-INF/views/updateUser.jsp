<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=US-ASCII"
	pageEncoding="US-ASCII"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>New User Sign-Up</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>


</head>

<body>
	<div>
		<jsp:include page="main.jsp"></jsp:include>
	</div>
	<div class="container" class="well">
		<div class="panel panel-primary">
			<div class="panel-heading">
				<b>Add Employee</b>
			</div>
			<div class="container-fluid">
				<c:if test="${not empty msg}">
					<div class="msg">${msg}</div>
				</c:if>

				<form:form action="updateUser" modelAttribute="user"
					id="contact_form">
					<table class="table table-small">
						<tr>
							<td>User ID :</td>
							<td><input type="hidden" id="userId" name="userId"
								value="${user.userId}" /><input type="text" disabled="disabled"
								value="${user.userId}" /></td>
						</tr>
						<tr>
							<td>First Name:</td>
							<td><form:input path="firstName" class="form-control"
									value="${user.firstname}" /> <form:errors path="firstName" /></td>

							<td>Last Name:</td>
							<td><form:input path="lastName" class="form-control"
									value="${user.lastname}" /> <form:errors path="lastName" /></td>
						</tr>
						<tr>
							<td>Password :</td>
							<td><form:password path="password" showPassword="true"
									class="form-control" value="${user.password}" /> <form:errors
									path="password" /></td>
							<td>Accept Policy :</td>
							<td><form:checkbox path="acceptPolicy"
									<c:if test="${user.acceptPolicy == 1}">CHECKED</c:if> value="1" />
								<form:errors path="acceptPolicy" /></td>
						</tr>
					</table>
					<hr>
					<div class="d-flex justify-content-center" class="btn-group">
						<input class="btn btn-primary" type="submit" value="Save" /><input
							type="reset" class="btn btn-danger" value="Reset" />
					</div>
					<hr>
				</form:form>
			</div>
		</div>
	</div>
</body>
</html>