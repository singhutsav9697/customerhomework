<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>

<body>
<form method="get" action="processupdate">

<label>Customer Id</label>
<div>
<input type="number" name="custid">
</div>
<br>
<label>Customer Name</label>
<div>s
<input type="text" name="custname">
</div>

<input type="submit" value="Update">

</form>
</body>
</html>
