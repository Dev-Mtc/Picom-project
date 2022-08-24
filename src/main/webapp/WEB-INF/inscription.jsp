<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Page d'Inscription</title>
</head>
<body>
	<div class="container">
		<!-- Spring va injecter l'objet métier dans le  -->
		<!-- formulaire ci-dessous -->
		<form:form modelAttribute="utilisateur" action="inscription"
			
			method="post" cssClass="inscription-form">
			<h1>Inscription</h1>
			<form:label path="nom">Nom</form:label>
			<form:input path="nom" />
			<form:errors path="nom" cssClass="erreur" />
			<br>
			<form:label path="prenom">Prénom</form:label>
			<form:input path="prenom" />
			<form:errors path="prenom" cssClass="erreur" />
			<br>
			<form:label path="email">Email</form:label>
			<form:input path="email" />
			<form:errors path="email" cssClass="erreur" />
			<br>
			<form:label path="motDePasse">Mot de passe</form:label>
			<form:password path="motDePasse" />
			<form:errors path="motDePasse" cssClass="erreur" />
			<br>
			<form:label path="motDePasse">Numéro de telephone</form:label>
			<form:password path="motDePasse" />
			<form:errors path="motDePasse" cssClass="erreur" />
			<br>
			<form:button>Inscription</form:button>
		</form:form>
	</div>
</body>
</html>