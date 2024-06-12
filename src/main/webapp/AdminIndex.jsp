<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin_Home</title>
<%@include file="Components/Allcss.jsp"%>
</head>
<body>


<%@include file="Components/AdminNavbar.jsp"%>



<div class="container p-3 text-center">
		
		<div class="row">
			<div class="col-md-8 p-5">
			<h3 class="">ADMIN DASHBOARD</h3>
				<div class="row">
					<div class="col-md-6 mt-4">
						<div class="card paint-card">
							<div class="card-body">
								<p class="fs-5">Total Doctor</p>
								<p><i class="fa-solid fa-stethoscope"></i></p>
							</div>
						</div>
					</div>
					<div class="col-md-6 mt-4">
						<div class="card paint-card">
							<div class="card-body">
								<p class="fs-5">Total User</p>
								<p><i class="fa-solid fa-users"></i></p>
							</div>
						</div>
					</div>
					<div class="col-md-6 mt-4">
						<div class="card paint-card">
							<div class="card-body">
								<p class="fs-5">Total Appointment</p>
								<p><i class="fa-regular fa-calendar-check"></i></p>
							</div>
						</div>
					</div>
					<div class="col-md-6 mt-4">
						<div class="card paint-card">
							<div class="card-body">
								<p class="fs-5">Add Specialist</p>
								<p><i class="fa-solid fa-plus"></i></p>
							</div>
						</div>
					</div>
				</div>

			</div>

			
		</div>


	</div>



</body>
</html>