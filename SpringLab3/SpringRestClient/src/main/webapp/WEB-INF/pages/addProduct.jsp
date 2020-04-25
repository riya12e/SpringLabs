

<html>
<body>
 <div style="border:2px solid blue" align="center">
 <form action="addProduct" method="post" modelAttribute="product">
 
 <table>
 <tr>
 <td>Enter Product Id:</td><td><input type="text" name="prodId"></td>
 </tr>
 <tr>
 <td>Enter Product Name:</td><td><input type="text" name="prodName"></td>
 </tr>
 <tr>
 <td>Enter Product Price:</td><td><input type="text" name="prodPrice"></td>
 </tr>
  <tr>
 <td><input type="submit" value="Add Product"></td><td></td>
 </tr>
 </table>
 
 </form>
 <p>${msg}</p>
 
 </div>
</body>
</html>