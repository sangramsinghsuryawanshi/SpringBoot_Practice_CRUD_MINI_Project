<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
       <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<%@ include file= '../Includes/Header.jsp' %>
<body>
		<h1>${message}</h1>
		<h1>Update Vehicle Tracking</h1>
		<c:forEach var="v" items="${vehicalList}">
		<form action="/update" method="post">
		 <input type="hidden" name="id" value="${v.id}">

			<label>vehicle Type</label>
			<input type="text" name="vehicaleType" value="${v.vehicaleType}"><br><br>
			
			<label>driver Name</label>
			<input type="text" name="drivarName" value="${v.drivarName}"><br><br>
			
			<label>vehicle Start Location</label>
			<input type="text" name="vehicaleStartLocation" value="${v.vehicaleStartLocation}"><br><br>
			
			<label>vehicle Current Location</label>
			<input type="text" name="vehicaleLocation" value="${v.vehicaleLocation}"><br><br>
			
			<label>goods Name</label>
			<input type="text" name="goodsName" value="${v.goodsName}"><br><br>
			
			<label>vehicle Capacity</label>
			<input type="text" name="vehicalCapacity" value="${v.vehicalCapacity}"><br><br>
			
			<label>vehicle End Location</label>
			<input type="text" name="vehicaleEndLocation" value="${v.vehicaleEndLocation}"><br><br>
			
			<label>vehicle Status</label>
			<input type="text" name="status" value="${v.status}"><br><br>
			<button type="submit">Submit</button>
		</form>
		
		</c:forEach>
</body>
</html>