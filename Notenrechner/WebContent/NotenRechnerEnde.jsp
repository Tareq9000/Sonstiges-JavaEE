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

	<%double note = (double)request.getAttribute("note");%>
	<%
	String smiley = "";
	
	if(note <= 6 && note >= 5){
		smiley = "smileygreen.png";
	}
	if(note < 5 && note >= 4){
		smiley = "smileyyellow.png";
	}
	if(note < 4){
		smiley = "smileyred.png";
	}
	
	%>
	<form class="form" method="post" action=NotenRechnerStart.jsp>
			<h1>NotenRechner</h1>
			<p>
				<%out.print(request.getAttribute("name"));%>, deine Note ist <%out.print(note); %>
			<p>
			<p>
				<button class="button">Zurück</button>
		</form>
		<p>
		<img src=<%=smiley%> width="400px" height="auto">
</body>
</html>