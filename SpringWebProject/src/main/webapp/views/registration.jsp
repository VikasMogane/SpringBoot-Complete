<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration </title>
</head>
<body>

<h1>Registration Form</h1>

<Form action="userDetails">

 User Name: <input id="uName" name="uName"><br>
 Email Id: <input id="emailId" name="emailId"><br>
 Password: <input  type="password"  id="password" name="password"><br>
 Gender: <input  type ="radio"  name="gender" value="1" checked=true />Male
 <input  type ="radio"  name="gender" value="2">Female<br>
 <br>
 
 <input type="checkbox" name="hobby" value="dancing">Dancing
  <input type="checkbox" name="hobby" value="singing">Singing<br>
  
 <input type="submit" value="Register Now">
</Form>


</body>
</html>