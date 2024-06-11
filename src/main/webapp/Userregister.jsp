<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User_Register</title>

<%@include file="Components/Allcss.jsp"%>
</head>
<body>
<%@include file="Components/Navbar.jsp"%>
<div class="container-fluid">
		<div class="row">
			<div class="col-md-6 offset-md-3">
				<div class="card">
					<div class="card-header text-black text-center bg-success mt-5">
						<i class="fa fa-user-plus fa-2x" aria-hidden="true"></i>
						<h4>User Registration</h4>
					</div>
					<div class="card-body">
						<form action="UserRegister" method="post">
						
						 <div class="form-group">
								<label for="name">Name</label> <input
									type="text" class="form-control" id="name1"
									name="name"
									aria-describedby="emailHelp" placeholder="Enter email">
								
							</div>
							
							<div class="form-group">
								<label for="exampleInputEmail1">Email address</label> <input
									type="email" class="form-control" id="exampleInputEmail1"
									name="email"
									aria-describedby="emailHelp" placeholder="Enter email">
								
							</div>
							<div class="form-group">
								<label for="exampleInputPassword1">Password</label> <input
									type="password" class="form-control" id="exampleInputPassword1" name="password"
									placeholder="Password">
							</div>
														<button type="submit" class="btn btn-primary">Register</button>
														<a href="User.jsp">Login</a>
						</form>


					</div>
				</div>

			</div>
		</div>
	</div>
</body>
</html>