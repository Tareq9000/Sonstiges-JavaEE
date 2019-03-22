<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="style.css" rel="stylesheet">
<title>Bibliothek</title>
</head>
<body>
	
	<form class="form" action="BibliothekStart.jsp">
	<p>
	
	<table style="width:30%">
		<tr>
			<th>Buchname</th>
			<th>anz. Seiten</th> 
			<th>Kategorie</th>
	
		</tr>
		<c:forEach var="b" items="${bibliothek.buch}">
		<tr>
			<td><c:out value="${b.titel}"/></td>
			<td><c:out value="${b.seiten}"/></td> 
			<td><c:out value="${b.kategorie}"/></td>
		</tr>	
		</c:forEach>
	</table> 
	<p>
		
	<p>
		<button class="button">Zurück</button>
	<p>
	</form>
	
	
	
	
</body>
</html>