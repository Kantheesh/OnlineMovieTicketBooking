<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml"
	xmlns:f="http://java.sun.com/jsf/core"
	xmlns:h="http://java.sun.com/jsf/html">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>ADD</title>
<style type="text/css">
<%@include file="CSS/login.css" %>
</style>
</head>
<body>
	<div id="main-holder">
		<h1>Add Costumer Details</h1>
		<form action="AddController" method="post" id="login-form">
			<table style="with: 100%" border="1">
				<tr>
					<td>Id</td>
					<td><input type="text" name="id" class="login-form-field" /></td>
				</tr>
				<tr>
					<td>Name</td>
					<td><input type="text" name="name" class="login-form-field" /></td>
				</tr>
				<tr>
					<td>Date of Show</td>
					<td><input type="text" name="dos" class="login-form-field" /></td>
				</tr>
				<tr>
					<td>Seat Number</td>
					<td><input type="text" name="seatNo" class="login-form-field" /></td>
				</tr>
			</table>
			<input type="submit" value="add" id="login-form-submit" />
		</form>
	</div>
</body>
</html>