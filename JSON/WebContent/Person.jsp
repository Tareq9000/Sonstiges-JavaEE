<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<script>
	
	var text = '{"Person":['+'{"firstName":"John", "lastName":"Smith", "alter":"56"}, '+' {"firstName":"Tareq", "lastName":"Kattit", "alter":"16"}, '+'{"firstName":"Peter", "lastName":"Parker", "alter":"23"}]}';
	
	var obj = JSON.parse(text);
	</script>
	<p id="par"></p>
	
	<script>

	document.getElementById("par").innerHTML = obj.Person[1].firstName + " " + obj.Person[1].lastName + " " + obj.Person[1].alter;
	
	</script>
	

</body>
</html>