<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="f"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Contacts</title>
</head>
<body style="background-color: Azure;">

	<h2 style="text-align: center; text-decoration: underline;">Contact
		Information</h2>

	<table border="1"
		style="border-color: lightblue; text-align: center; margin-left: 1cm;">
		<thead>
			<tr
				style="font-weight: bold; color: red; border-color: red; background-color: #dcc8e2;">
				<td style="column-width: 150px;">Id</td>
				<td style="column-width: 150px;">Name</td>
				<td style="column-width: 150px;">Email</td>
				<td style="column-width: 150px;">Contact Number</td>
				<td style="column-width: 150px;">Active Switch</td>
				<td style="column-width: 150px;">Create Date</td>
				<td style="column-width: 150px;">Update Date</td>
				<td style="column-width: 100px;">Action</td>
			</tr>
		</thead>

		<tbody>
			<f:forEach items="${ms}" var="m">
				<tr style="background-color: #eef0f7">
					<td>${m.contactId}</td>
					<td>${m.contactName}</td>
					<td>${m.contactEmail}</td>
					<td>${m.contactNo}</td>
					<td>${m.activeSwitch}</td>
					<td>${m.createdDate}</td>
					<td>${m.updateDate}</td>
					<td><a href="edit?contactId=${m.contactId}">Edit /</a><a
						href="delete?contactId=${m.contactId}">Delete</a></td>
				</tr>
			</f:forEach>
		</tbody>
	</table>
	<a href="contact" style="margin-left: 1cm;">+ Add New Contact</a>

</body>
</html>