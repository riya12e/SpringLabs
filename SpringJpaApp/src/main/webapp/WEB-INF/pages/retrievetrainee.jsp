<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Lab2</title>
</head>
<body>
<div style="border:2px solid pink;" align="center">
<h2>Retrieve Operation</h2>
<form action="findTrainee" method="post">
<table style="border:1px solid black">
<tr><td>Enter Trainee Id:</td>
<td><input type="text" name="traineeId"/></td>
<td><input type="submit" value="Retrieve"/></td></tr>
</table>
</form>
<br><br>
<h2>Trainee Info</h2>
<table style="border:2px inset grey;">
<tr><th>Trainee Id</th>
<th>Trainee Name</th>
<th>Trainee Location</th>
<th>Trainee Domain</th>
</tr>

<tr>
<td>${trainee.traineeId}</td>
<td>${trainee.traineeName}</td>
<td>${trainee.traineeDomain}</td>
<td>${trainee.traineeLocation}</td></tr>
</table>

</div>
</body>
</html>