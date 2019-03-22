<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="style.css" rel="stylesheet">
<title>Bibliothek</title>
</head>
<body>
	
	<form class="form" action="Bibliothekserv">
	
	<p>
		Buch Name: <br><input type="text" class="textfield" name="buchname" required>
	<br>
		anz. Seiten: <br><input type="number" class="textfield" name="seiten" required>
	<br>
		Kategorie: <br><input type="text" class="textfield" name="kategorie" required>
	<br>
		Vorname:<br> <input type="text" class="textfield" name="vorname" >
	<br>
		Name: <br><input type="text" class="textfield" name="name" >
	<br>
		Geburtsdatum:<br> <input type="date" class="textfield" name="datum" >
	<p>
		<button class="button">Erstellen</button>
	<p>
	</form>
	
	
	
	
</body>
</html>