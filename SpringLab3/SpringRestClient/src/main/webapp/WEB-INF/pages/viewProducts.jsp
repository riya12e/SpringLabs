<%@page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<html>
<body>
 <div style="border:2px solid blue" align="center">
 <form action="viewAllProducts" method="post" modelAttribute="showProducts">
 <c:if test="${not empty products }">
  <table style="border:2px solid black;">
 <tr>
 <td>Product ID</td><td>Product Name</td><td>Product Price</td>
 </tr>
 <c:forEach items="${products}"  var="product">
 <tr><td style="border:2px solid black;">${product.prodId}</td><td style="border:2px solid black;">${product.prodName}</td><td>${product.prodPrice}</td></tr>
 </c:forEach>
 </table>
 </c:if>
 </form>
 
 </div>
</body>
</html>