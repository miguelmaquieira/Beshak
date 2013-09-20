<?php
	//error_reporting(E_ALL);
	//ini_set('display_errors', '1');
	$email = $_POST["email"];
	if (isset($email)) {
		$appPath = $_SERVER['DOCUMENT_ROOT'].'/../application/';
// 		$appPath = $_SERVER['DOCUMENT_ROOT'].'/BeshakLanding/application/';
		$dbAccessPath = $appPath."DbAccess.php";
		$sendMailPath = $appPath."SendMail.php";
		include_once $dbAccessPath;
		include_once $sendMailPath;
		
		insertSubscriptor($email);
		sendMailToAdmin("[Beshak - New Subscriptor]", $email);
		$ok = true;
	}
?>
<!DOCTYPE html>
<html>
  <head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="Content-Language" content="es"/>

	<!-- Inicio SEO -->
	<title>Beshak • Descubriendo el talento literario</title>
	<meta name="description"
		content="Escribe, mejora, descubre, colabora." />
	<meta property='og:locale' content='es_ES' />
	<meta property='og:type' content='website' />
	<meta property='og:title'
		content='Beshak • Descubriendo el talento literario' />
	<meta property='og:url' content='http://beshak.com/' />
	<meta property='og:site_name' content='Beshak' />
	<meta property='og:description' content='Escribe, mejora, descubre, colabora.' />
	<meta property='og:image' content='http://beshak.com/images/logo_beshak_landing.png' />
	<meta property='og:image' content='http://beshak.com/images/landing_beshak_escribe.png' />
	<meta property='og:image' content='http://beshak.com/images/llanding_beshak_colabora.png' />
<!-- 	<meta property="fb:app_id" content="157569024440657" /> -->
	<!-- Fin SEO -->
    
    <!-- Bootstrap -->
    <link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" media="screen">
	<style>
		body{background-color:#40BA5A;  color:#fff; font-family:open-sans,min-height:768px;}
		.header{padding-top:115px; padding-bottom:75px;}
		.container{width:856px;}
		.logo{}
		.subLogo{font-size:28px;  padding-top:20px;}
		.featuresContainer{padding-bottom:50px;}
		.feature{padding:10px;}
		.featureImage{}
		.featureTitle{font-size:25px; padding-top:22px;}
		.featureDescription{font-size:16px; padding-top:12px; width:175px; margin-left:auto; margin-right:auto;}
		.separator {padding-bottom:15px;}
		.signContainer{font-size:18px; height:45px;}
		.signInfo{vertical-align:middle; width:240px; margin-right:23px;}
		.signTextBox input{background-color:rgba(0,0,0,0); font-family:inherit; color:#fff; font-size:inherit; vertical-align:middle; height:35px;width:236px; margin-right:23px;}
		.signButton{background-color:#fff; color:#40BA5A;border:0px; border-radius:3px; height:45px; width:320px; font-size:inherit;}
		.inline{display:inline;}
		.btn{background-color:#fff;
	</style>
	<script src="http://code.jquery.com/jquery.js"></script>
    <script src="bootstrap/js/bootstrap.min.js"></script>
  </head>
  <body>
	<div class="container" >
		<?php if ($ok):?>
			<br/>
			<div class="alert">
 				<button type="button" class="close" data-dismiss="alert">&times;</button>
  				<strong>Perfecto!</strong> Pronto tendrás noticias nuestras :)
			</div>
		<?php endif;?>
		<div class="header">
			<div class="logo pagination-centered">
				<img src="images/logo_beshak_landing.png"></img>	
			</div>
			<div class="subLogo pagination-centered">
				Descubriendo el talento literario
			</div>
		</div>
		<div class="descriptionContainer">
			<div class="featuresContainer">
				<div class="row-fluid">
					<div class="feature span3">
						<div class="featureImage pagination-centered">
							<img src="images/landing_beshak_escribe.png"></img>
						</div>	
						<div class="featureTitle text-center pagination-centered">
							Escribe
						</div>
						<div class="featureDescription text-center pagination-centered">
							Disfruta de la más pura experiencia creativa. Preocúpate solo de escribir.
						</div>
					</div>
					<div class="feature span3">
						<div class="featureImage pagination-centered">
							<img src="images/landing_beshak_mejora.png"></img>
						</div>	
						<div class="featureTitle text-center pagination-centered">
							Mejora
						</div>
						<div class="featureDescription text-center pagination-centered">
							Desarrolla al máximo tu talento gracias al feedback de los demás usuarios.
						</div>
					</div>
					<div class="feature span3">
						<div class="featureImage pagination-centered">
							<img src="images/landing_beshak_descubre.png"></img>
						</div>	
						<div class="featureTitle text-center pagination-centered">
							Descubre
						</div>
						<div class="featureDescription text-center pagination-centered">
							Inspírate, explora, descubre o entretente con las obras de tus compañeros.
						</div>
					</div>
					<div class="feature span3">
						<div class="featureImage pagination-centered">
							<img src="images/landing_beshak_colabora.png"></img>
						</div>	
						<div class="featureTitle text-center pagination-centered">
							Colabora
						</div>
						<div class="featureDescription text-center pagination-centered">
							Experimenta la creación colaborativa y aprovéchate de todo su potencial.
						</div>
					</div>
				</div>
			</div><!-- featuresContainer -->
			<div class="separator pagination-centered">
				<img src="images/landing_beshak_separador.png"></img>
			</div>
			<form action="" method="post">
				<div class="row-fluid signContainer">
					<div class="pull-left pagination-centered">
						<div class="signInfo">
								Apúntate ya y obtendrás acceso preferente a Beshak
						</div>
					</div>
					<div class="pull-left pagination-centered signTextBox">
						<input type="text" placeholder="Introducir email..." name="email">
					</div>
					<div class="pull-left pagination-centered">
						<button class="signButton" type="submit">Quiero estar entre los pioneros!</button>
					</div>
				</div>
			</form>
		</div>
	</div>
  </body>
</html>

