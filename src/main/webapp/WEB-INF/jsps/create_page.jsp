<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register here</title>
</head>
<body>
   <h2>Register here..</h2>
   <form action="save" method="post">
   <pre>
   First Name<input type="text" name="firstName"/>
   Last Name<input type="text" name="lastName"/>   
   Email<input type="text" name="email"/>
   Mobile<input type="text" name="mobile"/>
   <input type="submit" value="save"/>
   ${msg}
      
   
   
   
   
   </pre>
   
   
   
   
   
   </form>

</body>
</html>