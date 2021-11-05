<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Inserção de dados por formulários.</title>
</head>
<body>
Digite o seu nome:
<form action="ServletAgenda">
<input type="text" name="nome" /> <br>
Digite o seu telefone:<br>
<form action="ServletAgenda">
<input type="number" name="telefone" /> <br>
Digite a sua data de nascimento:<br>
<form action="ServletAgenda">
<input type="date" name="data_de_nascimento" /><br>
<input type="submit" value="Enviar" />
</body>
</html>