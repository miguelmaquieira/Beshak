<?php

function sendMailToAdmin($tagAsunto, $subscriberMail, $subscriberUserName) {
	$httpReferer = $_SERVER['HTTP_REFERER'];
	$userAgent	= $_SERVER['HTTP_USER_AGENT'];
// 	$recipient = "info@beshak.com";
// 	$recipient = "gael@imotionfactory.com";
	$recipient = "jorge@imotionfactory.com";
	$subject   = $tagAsunto." ".$subscriberMail." - ".$subscriberUserName;
	$message   = "El usuario con correo <strong>".$subscriberMail."</strong> y nombre de usuario <strong>".$subscriberUserName."</strong> se ha suscrito a Beshak <br/>";

	$cabeceras  = 'MIME-Version: 1.0' . "\r\n";
	$cabeceras .= 'Content-type: text/html; charset=UTF-8' . "\r\n";
	$cabeceras .= "From: $recipient" . "\r\n";

	if ($httpReferer != "") {
	 $message = $message." El usuario procedía de: <strong>$httpReferer</strong> <br/>";
	}
	
	if ($userAgent != "") {
		$message = $message." User-Agent: <strong>$userAgent</strong> <br/>";
	}
	
// 	echo "<h1>".$subject."</h1>";
// 	echo "<br/>";
// 	echo $message ;
	mail($recipient, $subject, $message, $cabeceras);
}

?>