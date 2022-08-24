<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Page de connexion</title>
</head>
<body>
	<div class="container">
		<form action="connexion" method="post" class="inscription-form">
			<c:if test="${param.notification ne null}">
				<h2>${param.notification}</h2>
			</c:if>
			<h1>Connexion</h1>
			<input type="email" name="EMAIL" placeHolder="Email" required><br>
			<input type="password" name="MOT_DE_PASSE" placeHolder="Mot de Passe"
				required> <br> <input type="submit" value="Connexion">
			<a href="inscription">S'inscrire</a>
		</form>
	</div>

</body>
</html>