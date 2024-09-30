<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<%@ include file= '../Includes/Header.jsp' %>
<body>
		<h1>${message}</h1>
		<h1>Insert Vehicle Data</h1>
		<form action="/insert" method="post">
			<label>vehicle Type</label>
			<select name="vehicaleType">
			<option>Tata</option>
			<option>Benz</option>
			<option>Nano</option>
			</select><br><br>
			<label>driver Name</label>
			<input type="text" name="drivarName" placeholder="Enter your name"><br><br>
			
			<label>vehicle Start Location</label>
			<input type="text" name="vehicaleStartLocation" placeholder="Enter vehicale Start Location"><br><br>
			
			<label>vehicle Current Location</label>
			<input type="text" name="vehicaleCurrentLocation" placeholder="Enter vehicale Current Location"><br><br>
			
			<label>goods Name</label>
			<input type="text" name="goodsName" placeholder="Enter goods Name"><br><br>
			
			<label>vehicle Capacity</label>
			<input type="text" name="vehicalCapacity" placeholder="Enter vehicle Capacity"><br><br>
			
			<label>vehicle End Location</label>
			<input type="text" name="vehicaleEndLocation" placeholder="Enter vehicle End Location"><br><br>
			
			<label>vehicle Status</label>
			<select name="status">
			<option>Start</option>
			<option>Processing</option>
			<option>End</option>
			</select><br><br>
			<button type="submit">Submit</button>
		</form>
</body>
</html>