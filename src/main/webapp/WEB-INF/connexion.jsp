<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Page de connexion</title>
</head>
<body>
	<div class="container">
		<!-- Spring va injecter l'objet métier dans le  -->
		<!-- formulaire ci-dessous -->
		<form:form modelAttribute="utilisateur" action="connexion"
			method="post" cssClass="connexion-form">
			<h1>Page de connexion</h1>
			<form:label path="email">Email</form:label>
			<form:input path="email" />
			<form:errors path="email" cssClass="erreur" />
			<br>
			<form:label path="motDePasse">Mot de passe</form:label>
			<form:password path="motDePasse" />
			<form:errors path="motDePasse" cssClass="erreur" />
			<br>
			<form:button>Connexion</form:button>
		</form:form>
	</div>

</body>
</html>