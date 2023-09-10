<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<link href="webjars/bootstrap/5.3.1/css/bootstrap.min.css"
	rel="stylesheet">
<title>Todos Listing</title>

</head>
<body>
	
		<h2>Your Todos are:</h2>
		<div class="container">
		<table class="table">
			<thead>
				<tr>
					<th>Id</th>
					<th>Description</th>
					<th>Target Date</th>
					<th>Is Done?</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${todos}" var="todo">
					<tr>
						<td>${todo.id}</td>
						<td>${todo.description}</td>
						<td>${todo.targetDate}</td>
						<td>${todo.done}</td>
					</tr>
				</c:forEach>

			</tbody>
		</table>
		<a href="add-todos" class="btn btn-success">Add Todo</a>
		</div>
		<script src="webjars/jquery/3.7.0/jquery.min.js"></script>
		<script src="webjars/bootstrap/5.3.1/js/bootstrap.min.js"></script>
	
</body>



</html>