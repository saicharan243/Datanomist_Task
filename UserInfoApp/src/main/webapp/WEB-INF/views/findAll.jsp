<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Users</title>
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
	<div class="container">
		<div class="panel panel-primary">
			<div class="panel-heading">
				<b> User List</b>
			</div>
			<table class="table table-bordered"
				style="table-layout: fixed; width: 100%;">
				<thead>
					<tr>
						<th>User Id</th>
						<th>User Name</th>
						<th>Accept Policy</th>
						<th>Actions</th>
					</tr>
				</thead>
				<c:forEach items="${users}" var="user">
					<tr>
						<td>${user.userId}</td>
						<td><b>${user.firstName} ${user.lastName}</b></td>
						<td><c:if test="${user.acceptPolicy==1}">
								<span>Checked</span>
							</c:if></td>


						<td><div class="btn-group">
								<a class="btn btn-success"
									href="./findUserById?userId=<c:out value="${user.userId}"></c:out>"><span
									class="glyphicon glyphicon-pencil"></span></a> <a
									class="btn btn-danger"
									href="./deleteUser?userId=<c:out value="${user.userId}"></c:out> "><span
									class="glyphicon glyphicon-trash"></span></a>
							</div></td>
					</tr>
				</c:forEach>

			</table>
		</div>
	</div>
</body>
</html>