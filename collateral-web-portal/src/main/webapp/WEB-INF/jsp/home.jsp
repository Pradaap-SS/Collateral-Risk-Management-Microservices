<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Home Page</title>
<link rel="stylesheet" href="/portal/css/bootstrap.min.css">
<link rel="stylesheet" href="/portal/css/name.css/" type="text/css" />
<script src="/portal/js/bootstrap.min.js"></script>
<style type="text/css">
</style>
</head>
<body>
	<%-- <jsp:include page="./common/nav.jsp" /> --%>
	<%@ include file="common/header.jsp"%>

	<div class="container">

	<!-- <h1>Activities</h1>  -->
	<h1>
	<!-- <button type="button" class="btn btn-primary btn-lg btn-block">ACTIVTIES</button> -->
	<button type="button" class="btn btn-secondary btn-lg btn-block">ACTIVITIES</button></h1>
	<!-- <h1>
		<a class="btn btn-deep-orange"><i class="fas fa-clone left"></i> Activities</a>
		</h1> -->

<div class="sub-container">
		<div class="row">
			<div class="col-lg-4">
			
			<a href="/portal/customerloan" style="text-decoration: none">
				<img class="image" src="/portal/image/img1.jpg" alt="Snow"
					style="width: 300px; height: 300px;">
					<p><button type="button" class="btn btn-secondary btn-lg btn-block">Customer Loan Details</button></p></a>
			</div>
			<div class="col-lg-4">
			<a href="/portal/savecollateral" style="text-decoration: none">
				<img class="image" src="/portal/image/img3.jpg" alt="Mountains"
					style="width: 300px; height: 300px;">
					<p><button type="button" class="btn btn-secondary btn-lg btn-block">Save the Collateral Details</button></p></a>
			</div>
			<div class="col-lg-4">
			<a href="/portal/riskassessment" style="text-decoration: none">
				<img class="image" src="/portal/image/img2.jpg" alt="Forest"
					style="width: 300px; height: 300px;">
					<p><button type="button" class="btn btn-secondary btn-lg btn-block">Risk Assessment</button></p></a>
			</div>
			

		</div>


		
	</div>
	</div>
	
	<%--  <p>${sessionScope.token}</p> --%>
	<%@ include file="common/footer.jsp"%>
</body>
</html>