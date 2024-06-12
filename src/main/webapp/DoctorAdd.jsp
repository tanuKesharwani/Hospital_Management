<%@page import="com.Dao.UserDao"%>
<%@page import="javax.print.Doc"%>
<%@page import="com.DB.DBConnect"%>
<%@page import="java.util.*"%>
<%@page import="Entity.DoctorDetails"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    
<%--     
<%
DoctorDetails user3 = (DoctorDetails) session.getAttribute("msg1");

if (user3 == null) {

	response.sendRedirect("DoctorAdd.jsp");
	session.setAttribute("login-Error", "Please login..");
%>
<%
}
%>
 --%>

    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title><%@include file="Components/Allcss.jsp"%>
</head>
<body>

<%
DoctorDetails dd=new DoctorDetails();





%>
<%@include file="Components/AdminNavbar.jsp"%>
<div class="container-fluid">
		<div class="row">
			<div class="col-md-3 offset-md-0">
				<div class="card">
					<div class="card-header text-black text-center  mt-2" style="background-color: #5791a8">
						<i class="fa fa-user-plus fa-2x" aria-hidden="true"></i>
						<h4>Add Doctor</h4>
					</div>
					<div class="card-body">
						<form action="DoctorAdds" method="post">
						
						 <div class="form-group">
								<label for="name">Full Name</label> <input
									type="text" class="form-control" id="name1"
									name="name"
									aria-describedby="emailHelp" placeholder="Enter name">
								
							</div>
							
							 <div class="form-group">
								<label for="name">DOB</label> <input
									type="text" class="form-control" id="name4"
									name="dob"
									aria-describedby="emailHelp" placeholder="Enter Date of Birth">
								
							</div>
							 <div class="form-group">
								<label for="name">Qualification</label> <input
									type="text" class="form-control" id="name3"
									name="qualification"
									aria-describedby="emailHelp" placeholder=" Qualification">
								
							</div>
							
							
						 <div class="form-group">
    <label for="exampleFormControlSelect1">Specialist</label>
    <select class="form-control" id="exampleFormControlSelect1" name="specialist">
      <option>Select...</option>
      <option>eye</option>
      <option>Gynologist</option>
      <option>Darmeologist</option>
      <option>Homeopathisc</option>
    </select>
  </div>
							
							<div class="form-group">
								<label for="exampleInputEmail1">Email address</label> <input
									type="email" class="form-control" id="exampleInputEmail1"
									name="email"
									aria-describedby="emailHelp" placeholder="Enter email">
								
							</div>
							
							
							 <div class="form-group">
								<label for="name">Mobile No.</label> <input
									type="number" class="form-control" id="name1"
									name="mobile"
									aria-describedby="emailHelp" placeholder="Mobile no">
								
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
			
			
			<div class="col-md-8 offset-md-1">
				<div class="card">
					<div class="card-header text-black text-center mt-2"style="background-color: #5791a8;">
						
						<h4>Doctor List</h4>
					</div>
					<div class="card-body">
						<table class="table">
						<thead>
							<tr>
								<th scope="col">ID</th>
								<th scope="col">Name</th>
								<th scope="col">Email</th>
								<th scope="col">Type</th>
								<th scope="col">phone Number</th>
								<th scope="col">DOB</th>
								<th scope="col">Password</th>
							</tr>
						</thead>
				<%-- 		<% if (user3 != null) {
							UserDao ob=new UserDao(DBConnect.getConn());
				
					List<DoctorDetails> post = ob.getDoctor(user3.getId());
					for (DoctorDetails po : post){
					
					
					
					%>
						 --%>
						
						<tbody>
							<tr>
								<th scope="row">1</th>
								<td>Mark</td>
								<td>Otto</td>
								<td>@mdo</td>
								<td>@mdo</td>
								<td>@mdo</td>
								<td>@mdo</td>
							</tr>
							
		<%-- 	<%
					}
					
						
					}
			%> --%>
						
					
					</table>

						

					</div>
				</div>

			</div>
			
			
			
			
			
			
						
			<div class="col-md-8 offset-md-4">
				<div class="card">

					
				</div>
			</div>


					</div>
				</div>

			</div>
		</div>
		
		
	</div>


 <!-- <form>

  <div class="form-group">
    <label for="exampleFormControlInput1">Email address</label>
    <input type="email" class="form-control" id="exampleFormControlInput1" placeholder="name@example.com">
  </div>
  <div class="form-group">
    <label for="exampleFormControlSelect1">Example select</label>
    <select class="form-control" id="exampleFormControlSelect1">
      <option>1</option>
      <option>2</option>
      <option>3</option>
      <option>4</option>
      <option>5</option>
    </select>
  </div>
  <div class="form-group">
    <label for="exampleFormControlSelect2">Example multiple select</label>
    <select multiple class="form-control" id="exampleFormControlSelect2">
      <option>1</option>
      <option>2</option>
      <option>3</option>
      <option>4</option>
      <option>5</option>
    </select>
  </div>
  <div class="form-group">
    <label for="exampleFormControlTextarea1">Example textarea</label>
    <textarea class="form-control" id="exampleFormControlTextarea1" rows="3"></textarea>
  </div>
</form> -->


</body>
</html>