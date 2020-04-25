<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Lab2</title>
</head>
<body>
<div style="border:1px solid red;" align="center">
<h2>Modify Trainee</h2>

<form action="modify" method="post"><table>
<tr><td>Enter Trainee Id:</td>
<td><input type="text" name="traineeId"/></td>
<td><input type="submit" value="Find"/></td></tr></table></form><br><br>
<form action="modifytrainee"  method="post" modelAttribute="trainee"><table>
<tr><th>Trainee Id</th>
<th>Trainee Name</th>
<th>Trainee Location</th>
<th>Trainee Domain</th>
<th>Action</th>
</tr>

<tr>
<td><input type="text" value="${trainee.traineeId}" name="traineeId" /></td>
<td><input type="text" value="${trainee.traineeName}" name="traineeName" /></td>
<td><input type="text" value="${trainee.traineeDomain}" name="traineeDomain"/></td>
<td><input type="text" value="${trainee.traineeLocation}" name="traineeLocation"/></td>
<td></td><td></td><td align="left"><input type="submit" Value="Modify"/></td><td></td></tr>
</table></form>
</div>
</body>
</html>