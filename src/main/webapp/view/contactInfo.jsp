<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="f1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Contact Info</title>
</head>
<body
	style="background-color: cyan; margin-left: 500px; margin-top: 100px;">




	<h1
		style="margin-left: 86px; text-decoration: underline; font-weight: bold; color: orange;">Contact
		Form</h1>

	<f:form action="saveContact?contactId=${contact.contactId}"
		modelAttribute="contact" method="POST">
		<font color="green">${y}</font>
		<font color="red">${n}</font>
		<font color="red">${a}</font>
		<table style="font-size: 30px;">
			<tr>
				<td style="font-weight: bold;">Contact Name :</td>
				<td><f:input path="contactName" /></td>
			</tr>

			<tr>
				<td style="font-weight: bold;">Contact Email :</td>
				<td><f:input path="contactEmail" /></td>
			</tr>

			<tr>
				<td style="font-weight: bold;">Contact No :</td>
				<td><f:input path="contactNo" /></td>
			</tr>

			<tr>
				<td style="font-weight: bold;">Active Switch :</td>
				<td><f:input path="activeSwitch" /></td>
			</tr>




			<tr>
				<td><span><input type="submit" value="Save"
						style="background-color: lightgreen; font-size: 20px; border-style: dotted; font-weight: bold; margin-top: 0.2cm;" /></span>
				</td>

			</tr>




		</table>

	</f:form>

	<a href="contact" style="font-size: 20px;">Add new Contact</a>
	<a href="getcontacts" style="font-size: 20px; margin-left: 100px;">View
		All Contacts</a>


</body>
</html>