<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<html>
   <head>
   <title> Tag Example</title>
   </head>
   <body>
    
   
      <c:set var = "salary" scope = "session" value = "${2000*2}"/>
      <c:out value = "${salary}"/>
      </c:set>
   </body>
</html>
