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
	var city=document.weather.city.value;
	if (city==null ||city==""){  
		  alert("city can't be blank");  
		 return false;
		}
	   
}  
</script>  
</head>
<body>
<div style="text-align:center">
<h2>WEATHER REPORT</h2>
<form:form name="weather" method="get" action="/weatherReport/fetch" modelAttribute="weather" onsubmit=" return validateform()">
<label for="city">Enter City:</label>
	 <form:input path="city" id ="city"/> 
	 <br>

 <input type="submit" value="Submit" />  
</form:form>
</div>
</body>
</html>