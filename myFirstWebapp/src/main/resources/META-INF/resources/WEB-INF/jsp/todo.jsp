<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
<link href="webjars/bootstrap/5.3.1/css/bootstrap.min.css"
	rel="stylesheet">
<title>Todos Listing</title>

</head>
<body>
	<div class="container">
		<h2>Add New Todo:</h2>
		<form:form  method="post" modelAttribute="todo">
			Description: <form:input type="text" path="description" required="required"/>
			<button class="btn btn-success">Submit</button>
		</form:form>


	</div>
	<script src="webjars/jquery/3.7.0/jquery.min.js"></script>
	<script src="webjars/bootstrap/5.3.1/js/bootstrap.min.js"></script>

</body>



</html>