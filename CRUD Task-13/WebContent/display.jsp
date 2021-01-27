<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml"
	xmlns:f="http://java.sun.com/jsf/core"
	xmlns:h="http://java.sun.com/jsf/html">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Admin Operations</title>
<style type="text/css">
<%@include file="CSS/login.css" %>
</style>
</head>
<body>
	<div align="left">
		<a href="add.jsp" style="color: white">Add New Costumer</a>
	</div>

	<div id="main-holder">
		<table border="1">
			<thead>
				<tr>
					<th>Id</th>
					<th>Name</th>
					<th>Date of Show</th>
					<th>Seat Number</th>
					<th>Operations</th>
				</tr>
			</thead>

			<tbody>

				<c:forEach var="user" items="${CostumerList}">
					<tr>
						 <td>
                                        <c:out value="${user.id}" />
                                    </td>
                                    <td>
                                        <c:out value="${user.name}" />
                                    </td>
                                    <td>
                                        <c:out value="${user.dos}" />
                                    </td>
                                    <td>
                                        <c:out value="${user.seatNo}" />
                                    </td>
                                    
                                    <td><a href="edit.jsp">Edit</a> &nbsp;&nbsp;&nbsp;&nbsp; <a href="delete.jsp">Delete</a></td>
					</tr>
				</c:forEach>
				<!-- } -->
			</tbody>
		</table>
	</div>
	<div align="right">
		<a href="index.jsp" style="color: white">Logout</a>
	</div>
</body>
</html>