<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="style.css" rel="stylesheet">
<title>NotenRechner</title>


</head>
<body>
<form class="form" method="get" action="NotenRechner">
		<h1>NotenRechner</h1>
		<p>
			Geben Sie bitte gültige Zahlen ein
		<p>
			Ihr Vorname	: <input type="text"  name="name" required>
		<p>
			Ihre Punktzahl: <input type="number"  name="punktAnzahl" required>
		<p>
			Max Punktzahl: <input type="number"  name="maxpunktAnzahl" required>
		<p>
			<button class="button">Senden</button>
	</form>
</body>
</html>