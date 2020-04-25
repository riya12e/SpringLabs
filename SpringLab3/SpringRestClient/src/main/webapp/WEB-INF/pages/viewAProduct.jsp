<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<body>
 <div style="border:2px solid blue" align="center">
 <form action="viewById" method="post" modelAttribute="prodId">
 <br><br>
  <table><tr><td>Enter Product Id:</td><td><input type="text" name="prodId"></td></tr>
  <tr><td><input type="submit" value="Display Product"></td><td></td></tr>
  </table>
  </form>
  </div>
</body>
</html>