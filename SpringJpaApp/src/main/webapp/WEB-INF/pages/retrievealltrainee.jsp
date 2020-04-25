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
<div style="border:1px solid red;" align="center">
<h2>Retrieve all trainee</h2>


<table style="border:1px solid black;">
<tr><th>Trainee Id</th>
<th>Trainee Name</th>
<th>Trainee Location</th>
<th>Trainee Domain</th>
</tr>
<c:if test="${not empty trainees}">
<c:forEach items="${trainees}" var="t">
<tr>
<td>${t.traineeId}</td>
<td>${t.traineeName}</td>
<td>${t.traineeDomain}</td>
<td>${t.traineeLocation}</td></tr></c:forEach>
</c:if>
</table>
</div>


</body>
</html>