
<%@page  %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Lab2</title>
</head>
<body>
<div style="border:1px solid pink;backgroud-color:yellow;" align="center">
<h2>Login Page</h2>

<form action="loginadmin" method="post">
<table style="border:1px solid black;">
<tr>
<td>UserName:</td>
<td><input type="text" placeholder="Enter user name" name="userName"/></td></tr>
<tr  style="border:1px solid black;"><td>Password:</td>
<td><input type="password" placeholder="Enter Password" name="password"/></td></tr>
<tr>
<td></td><td align="left"><input type="submit" value="Login"/></td>
</tr>

</table>
</form>
</div>
</body>
</html>