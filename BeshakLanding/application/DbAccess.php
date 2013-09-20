<?php

function connectDb() {
	$con = mysqli_connect('localhost','usuariobeshak','felipelotas','beshaklanding');
	if (!$con)
	{
		die('Could not connect: ' . mysqli_error($con));
	}
	return $con;
}

function insertSubscriptor($email) {
	$httpReferer = $_SERVER['HTTP_REFERER'];
	
	$con = connectDb();
	$query = "INSERT INTO Subscribers (email, httpReferer) VALUES ('$email', '$httpReferer')";
	$ok = mysqli_query($con, $query);
}

?>