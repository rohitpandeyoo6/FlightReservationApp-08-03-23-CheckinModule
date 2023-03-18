<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Reservation Details</title>
</head>
<body>
	<h2>Reservation Details</h2>
	Passenger Name: ${reservation.getPassenger().firstName}
	<br> Passenger Name: ${reservation.getPassenger().email}
	<br> Passenger Name: ${reservation.getPassenger().phone}
	<br> Operating Airlines:
	${reservation.getFlight().operatingAirline}
	<br> Operating Airlines: ${reservation.getFlight().flightNumber}
	<br> Operating Airlines: ${reservation.getFlight().departureCity}
	<br> Operating Airlines: ${reservation.getFlight().arrivalCity}
	<br> Operating Airlines:
	${reservation.getFlight().dateOfdeparture}
	<br>
	<h2>Update Number Of Bags & Status</h2>
	<form action="proceedToCheckIn" method="post">

		<!-- 
		<pre>
	 Number Of Bags<input type="text" name="NumberOfBags">
	Checked In Status<input type="text" name="checkedIn">
	<input type="submit" value="confirm">
	</pre>
	-->
		Reservation id<input type="text" name="id" value="${reservation.id}" readonly> 
		Number Of Bags<input type="text"name="numberOfBags"> 
		<input type="submit" value="proceed">

	</form>
</body>
</html>
