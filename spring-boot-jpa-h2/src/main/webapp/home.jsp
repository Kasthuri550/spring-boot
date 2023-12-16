<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body>
<form action="getClient">
<p>Search client by id: <input type="text" name="clientId"><input type="submit" value="search"></p>
</form>
<form action="getClientsByTech">
<p>Search client by tech: <input type="text" name="clientTech"><input type="submit" value="search"></p>
</form>
<form action="getClientIdBetween">
<p>Search client by id between: 
<input type="text" name="clientId1">
<input type="text" name="clientId2">
<input type="submit" value="search"></p>
</form>
<p>${getClientIdBetween}</p>
<form action="addClient">
<p>Client id: <input type="text" name="clientId"></p>
<p>Client name: <input type="text" name="clientName"></p>
<input type="submit">
</form>
</body>
</html>