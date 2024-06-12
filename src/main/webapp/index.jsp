<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<!-- <style type="text/css">
.back-img {
	background: url("All_Image/Doctor.jpg");
	width: 100%;
	height: 80vh;
	background-repeat: no-repeat;
	background-size: cover;
}
</style> -->
<meta charset="ISO-8859-1">

<title>Home</title>


<%@include file="Components/Allcss.jsp"%>

</head>
<body>

	<%@include file="Components/Navbar.jsp"%>

	<!-- <div class="container-fluid back-img"></div> -->


	<div id="carouselExampleIndicators" class="carousel slide"
		data-ride="carousel">
		<ol class="carousel-indicators">
			<li data-target="#carouselExampleIndicators" data-slide-to="0"
				class="active"></li>
			<li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
			<li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
		</ol>
		<div class="carousel-inner">
			<div class="carousel-item active">
				<img class="d-block " src="All_Image/Doctor.jpg" alt="First slide"
					height="700px" width="100%">
			</div>
			<div class="carousel-item">
				<img class="d-block h-80 w-auto" src="All_Image/Doctor.jpg"
					alt="Second slide" height="700px" width="100%">
			</div>
			<div class="carousel-item">
				<img class="d-block h-80 w-auto" src="All_Image/Doctor.jpg"
					alt="Third slide" height="700px" width="100%">
			</div>
		</div>
		<a class="carousel-control-prev" href="#carouselExampleIndicators"
			role="button" data-slide="prev"> <span
			class="carousel-control-prev-icon" aria-hidden="true"></span> <span
			class="sr-only">Previous</span>
		</a> <a class="carousel-control-next" href="#carouselExampleIndicators"
			role="button" data-slide="next"> <span
			class="carousel-control-next-icon mb-50" aria-hidden="true"></span> <span
			class="sr-only">Next</span>
		</a>
	</div>

	<div class="container p-3">
		<p class="text-center fs-2">Key Features of out Hospital</p>
		<div class="row">
			<div class="col-md-8 p-5">
				<div class="row">
					<div class="col-md-6 mt-2">
						<div class="card paint-card">
							<div class="card-body">
								<p class="fs-5">100% safety</p>
								<p>We r providing 100 perernt securuty and gurantee</p>
							</div>
						</div>
					</div>
					<div class="col-md-6 mt-2">
						<div class="card paint-card">
							<div class="card-body">
								<p class="fs-5">100% safety</p>
								<p>We r providing 100 perernt securuty and gurantee</p>
							</div>
						</div>
					</div>
					<div class="col-md-6 mt-2">
						<div class="card paint-card">
							<div class="card-body">
								<p class="fs-5">100% safety</p>
								<p>We r providing 100 perernt securuty and gurantee</p>
							</div>
						</div>
					</div>
					<div class="col-md-6 mt-2">
						<div class="card paint-card">
							<div class="card-body">
								<p class="fs-5">100% safety</p>
								<p>We r providing 100 perernt securuty and gurantee</p>
							</div>
						</div>
					</div>
				</div>

			</div>

			<div class="col-md-4 mt-20">
				<img alt="" src="All_Image/AllD.jpg" height="300px" width="300px">
			</div>
		</div>


	</div>


	<div></div>










</body>
</html>