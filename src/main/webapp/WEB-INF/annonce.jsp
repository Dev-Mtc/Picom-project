<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form modelAttribute="annonce" action="annonce" method="post"
		cssClass="annonce-form">
		<h1>Ajouter une annonce :</h1>
		<form:label path="contenu">contenu</form:label>
		<form:input path="contenu" />
		<form:errors path="contenu" cssClass="erreur" />	
		<br>
		<form:label path="zones">Zones de diffusion : </form:label>
		<form:checkboxes items="${zones}" path="zones" itemValue="id" itemLabel="nom"/>
		<form:errors path="zones" cssClass="erreur" />
		<br>
		<form:label path="trancheHoraires">Tranche horaire de diffusion : </form:label>
		<form:checkboxes items="${trancheHoraire}" path="trancheHoraires" itemValue="id" itemLabel="debut"/>
		<form:errors path="trancheHoraires" cssClass="erreur" />
		<br>
		<fmt:formatDate value="${yourObject.date}" var="dateString" pattern="dd/MM/yyyy" />
		<form:input path="dateHeureDebut" value="${dateString}"/>

		
		<form:button>Ajouter</form:button>
	</form:form>

</body>
</html>