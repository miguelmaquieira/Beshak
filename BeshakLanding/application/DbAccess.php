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
	$con 			= connectDb();
	$httpReferer 	= $_SERVER['HTTP_REFERER'];
	$userAgent		= $_SERVER['HTTP_USER_AGENT'];
	$email = mysqli_real_escape_string($con, $email);
	$query = "INSERT INTO Subscribers (email, httpReferer, userAgent) VALUES ('$email', '$httpReferer', '$userAgent')";
	$ok = mysqli_query($con, $query);
}

?>