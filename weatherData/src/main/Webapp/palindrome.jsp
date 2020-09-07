<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>WeatherReport</title>
<script>  
function validateform(){  
	var input=document.palindrome.input.value;
	if (input==null ||input==""){  
		  alert("input can't be blank");  
		 return false;
		}
	   
}  
</script>  
</head>
<body>
<div style="text-align:center">
<h2>PALINDROME CHECK AND REVERSE STRING</h2>
<form:form name="palindrome" method="get" action="/palindrome/process" modelAttribute="palindrome" onsubmit=" return validateform()">
<label for="input">Enter String:</label>
	 <form:input path="input" id ="input"/> 
	 <br>

 <input type="submit" value="Submit" />  
</form:form>
</div>
</body>
</html>