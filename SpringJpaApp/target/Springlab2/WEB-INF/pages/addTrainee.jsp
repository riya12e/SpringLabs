<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

</head>
<body>
<div style="border:1px solid red;" align="center">
<h2>Enter Trainee details</h2>
<form  action="add" method="post" modelAttribute="trainee">
<table style="border:2px inset white;">
<tr>
<td>Trainee Id:-</td>
<td><input type="text" placeholder="Enter Id" name="traineeId"/></td>
</tr>
<tr>
<td>Trainee Name:-</td>
<td><input type="text" placeholder="Enter Name" name="traineeName"/></td>
</tr>
<tr><td>Trainee Domain:-</td>
<td><select name="traineeDomain">
	<option value="Java">Java</option>
	<option value=".Net">.Net</option>
	<option value="Android">Android</option>
</select></td></tr>
<tr><td>Trainee Location:-</td>
<td><input type="radio" value="Chennai" name="traineeLocation"/>Chennai
	<input type="radio" value="Banglore" name="traineeLocation"/>Bangalore
	<input type="radio" value="Pune" name="traineeLocation"/>Pune
	<input type="radio" value="Mumbai" name="traineelocation"/>Mumbai</td>
	</tr>
<tr><td><input type="submit" value="Add Trainee"/></td></tr></table></form>
</div>
</body>
</html>