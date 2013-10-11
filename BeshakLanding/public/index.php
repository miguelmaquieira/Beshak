<?php
// 	error_reporting(E_ALL);
// 	ini_set('display_errors', '1');
	$email 		= $_POST["email"];
	$userName	= $_POST["username"];
	if (isset($email)) {
		$appPath = $_SERVER['DOCUMENT_ROOT'].'/../application/';
// 		$appPath = $_SERVER['DOCUMENT_ROOT'].'/BeshakLanding/application/';
		$dbAccessPath = $appPath."DbAccess.php";
		$sendMailPath = $appPath."SendMail.php";
		include_once $dbAccessPath;
		include_once $sendMailPath;
		
		insertSubscriptor($email, $userName);
		sendMailToAdmin("[Beshak - New Subscriptor]", $email, $userName);
		$ok = true;
	}
?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html lang="es">
  
  <head>
    <meta charset="utf-8">
    <title>
      Descubriendo y fomentando el talento literario · Beshak
    </title>
    <meta http-equiv="content-type" content="text/html; charset=utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0"
    />
    <meta http-equiv="Content-Language" content="es" />
    <meta name="author" content="Beshak">
    <!-- Inicio SEO -->
    <meta name="description" content="Beshak es la nueva forma de descubrir y fomentar el talento literario • Escribe, mejora, descubre, colabora."
    />
    <meta property='og:locale' content='es_ES' />
    <meta property='og:type' content='website' />
    <meta property='og:title' content='Descubriendo y fomentando el talento literario · Beshak'
    />
    <meta property='og:url' content='http://Beshak.com/' />
    <meta property='og:site_name' content='Beshak' />
    <meta property='og:description' content='Apúntate y sé de los primeros en probar Beshak! Beshak es la nueva forma de descubrir y fomentar el talento literario • Escribe, mejora, descubre, colabora.'
    />
    <meta property='og:image' content='assets/img/beshak_facebook.png'
    />
    <meta property="fb:app_id" content="157569024440657" />
    <!-- Fin SEO -->
    <!-- Inicio Estilos -->
    <link href="https://netdna.bootstrapcdn.com/twitter-bootstrap/2.3.2/css/bootstrap-combined.min.css"
    rel="stylesheet">
    <link href="assets/css/beshak.css" rel="stylesheet">
    <link href="http://fonts.googleapis.com/css?family=Open+Sans" rel="stylesheet"
    type="text/css" />
    <link href="http://fonts.googleapis.com/css?family=Raleway:600" rel="stylesheet"
    type="text/css" />
    <!-- Fin estilos -->

    <!-- JavaScript plugins (requires jQuery) -->
	<script src="assets/js/jquery-1.10.2.min.js"></script>
	<!-- Validate plugin -->
	<script src="assets/js/jquery.validate.min.js"></script>
	<script src="assets/js/localization/messages_es.js"></script>
    <script src="assets/js/bootstrap.min.js"></script>
    <script src="assets/js/validation-beshak.js"></script>
</head>
  
  <body>
    <!-- Inicio Analytics Beshak landing mail -->
    <!--?php include_once( "analyticstracking.php") ?-->
    <!-- Fin Analytics Beshak landing mail -->
    <div class="container-fluid" id="principal">
      <div class="container">
      	<?php if ($ok):?>
			<br/>
			<div class="alert">
 				<button type="button" class="close" data-dismiss="alert">&times;</button>
  				<strong>Perfecto!</strong> Pronto tendrás noticias nuestras :)
			</div>
		<?php endif;?>
        <div id="logo">
          <img src="assets/img/logo_beshak_white.png"
          alt="Logo Beshak" title="Beshak" height="50" width="267">
        </div>
      </div>
      <div class="container row-fluid" style="margin-top:50px;">
        <div class="span7">
          <h1 id="eslogan">
            Una nueva forma
            <br>
            de descubrir
            <br>
            y fomentar
            <br>
            el talento literario
          </h1>
          <hr>
          <h4 id="eslogan" style="padding-top:5px;">
            Escribe y recibe feedback del resto de usuarios
          </h4>
        </div>
        <div class="span5">
          <div id="CTA">
            <p>
              Sé el primero en probar Beshak versión alfa*. Regístrate ahora y comienza
              a escribir y recibir feedback:
            </p>
            <!-- Begin MailChimp Signup Form -->
            <div id="mc_embed_signup">
              <form action="" method="post" id="subscribe-form" name="subscribe-form">
                <input type="text" 	class="form-field" 			placeholder="Nombre de usuario..." 	id="username" 	name="username"  style="font-family: 'Open Sans', Helvetica, Arial, sans-serif;">
				<input type="email" class="email form-field" 	placeholder="Introducir email..." 	id="email"		name="email">
                <div class="clear">
                  <input value="¡Crear mi cuenta ahora!" name="subscribe" id="mc-embedded-subscribe"
                  class="btn btn-large btn-danger" type="submit">
                </div>
              </form>
            </div>
            <!--End mc_embed_signup-->
          </div>
        </div>
      </div>
    </div>
    <div class="container-fluid" id="secundaria">
      <h2 id="title">
        ¿Qué te ofrece Beshak?
      </h2>
      <div class="container">
        <div class="row-fluid">
          <div class="span3">
            <img src="assets/img/icono_escribe.png"
            id="icono" alt="Icono escribir" title="Despreocúpate de todo. Tú, solo escribe.">
            <div class="row-fluid">
              <h2>
                Escribe
              </h2>
              <p>
                Disfruta de la más pura experiencia creativa. Preocúpate solo de escribir.
              </p>
            </div>
          </div>
          <div class="span3">
            <img src="assets/img/icono_mejora.png"
            id="icono" alt="Icono mejora" title="Mejora tu talento creativo">
            <div class="row-fluid">
              <h2>
                Mejora
              </h2>
              <p>
                Desarrolla al máximo tu talento gracias al feedback de los demás usuarios.
              </p>
            </div>
          </div>
          <div class="span3">
            <img src="assets/img/icono_descubre.png"
            id="icono" alt="Icono descubre" title="Accede a los escritos de otros usuarios">
            <div class="row-fluid">
              <h2>
                Descubre
              </h2>
              <p>
                Inspírate, explora, descubre o entretente con las obras de tus compañeros.
              </p>
            </div>
          </div>
          <div class="span3">
            <img src="assets/img/icono_colabora.png"
            id="icono" alt="Icono colabora" title="Descubre todo el potencial de la escritura colaborativa">
            <div class="row-fluid">
              <h2>
                Colabora
              </h2>
              <p>
                Experimenta la creación colaborativa y aprovéchate de todo su potencial.
              </p>
            </div>
          </div>
        </div>
        <a class="btn btn-danger btn-large" href="#CTA" target="" style="margin-top: 30px;">¡Crear mi cuenta ahora!</a>
      </div>
    </div>
    <div class="container-fluid footer">
      <div class="container">
        © iMotion Factory, S.L. ·
        <a href="#avisoLegal" role="" data-toggle="modal">* Aviso legal</a>
        · Contáctanos en el tlf:
        <a href="tel:622392858">622.392.858</a>
        o envíanos un
        <a href="mailto:info@imotionfactory.com?subject=Consulta landing Beshak">email</a>
        o un mensaje en
        <a href="http://twitter.com/BeshakCom" target="_blank">twitter</a>
      </div>
    </div>
    <!-- Modal -->
    <div id="avisoLegal" class="modal hide fade" tabindex="-1" role="dialog"
    aria-labelledby="myModalLabel" aria-hidden="true">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
          ×
        </button>
        <h3 id="myModalLabel">
          Aviso Legal
        </h3>
      </div>
      <div class="modal-body">
        <p style="font-weight:bold;">
          VERSIÓN ALFA
        </p>
        <p>
          Versión Alfa significa que la plataforma se encuentra en una fase todavía inestable, todavía deben eliminarse errores o poner en práctica completa de toda su funcionalidad, pero satisface la mayoría de los requisitos.
        </p>
        <p>
          Se avisará puntualmente a los usuarios del lanzamiento mediante comunicación
          por correo electrónico.
        </p>
        <p style="font-weight:bold;">
          LOPD
        </p>
        <p>
          iMOTION FACTORY manifiesta cumplir las prescripciones de la Ley Orgánica
          de Protección de Datos 15/1999, así como de su normativa de desarrollo.
          De conformidad con dicha legislación, los datos personales facilitados
          por los Usuarios, serán incorporados a un fichero titularidad de PEREGRINA
          GOURMET con la finalidad de gestionar la relación con el Usuario, así como
          el envío de comunicaciones postal y/o electrónica de información publicitaria
          por parte de iMOTION FACTORY, S.L., a lo que Ud. consiente de forma expresa.
        </p>
        <p>
          El Usuario podrá en cualquier momento ejercer los derechos de acceso,
          rectificación, cancelación y oposición comunicándolo por escrito a iMOTION FACTORY en la dirección C/ Paseo de Colón 1, 5º, 36002 - Pontevedra, España
          o mediante correo electrónico a la dirección info@imotionfactory.com, adjuntando
          en ambos casos una fotocopia de su DNI o pasaporte en vigor.
        </p>
        <p style="font-weight:bold;">
          USO DE COOKIES
        </p>
        <p>
          Esta página web utiliza Google Analytics, un servicio analítico de web
          prestado por Google, Inc., una compañía de Delaware cuya oficina principal
          está en 1600 Amphitheatre Parkway, Mountain View (California), CA 94043,
          Estados Unidos ("Google"). Google Analytics utiliza "cookies", que son
          archivos de texto ubicados en su ordenador, para ayudar al website a analizar
          el uso que hacen los usuarios del sitio web. La información que genera
          la cookie acerca de su uso del website (incluyendo su dirección IP) será
          directamente transmitida y archivada por Google en los servidores de Estados
          Unidos. Google usará esta información por cuenta nuestra con el propósito
          de seguir la pista de su uso del website, recopilando informes de la actividad
          del website y prestando otros servicios relacionados con la actividad del
          website y el uso de Internet.
        </p>
        <p>
          Google podrá transmitir dicha información a terceros cuando así se lo
          requiera la legislación, o cuando dichos terceros procesen la información
          por cuenta de Google. Google no asociará su dirección IP con ningún otro
          dato del que disponga Google.
        </p>
        <p>
          Puede Usted rechazar el tratamiento de los datos o la información rechazando
          el uso de cookies mediante la selección de la configuración apropiada de
          su navegador, sin embargo, debe Usted saber que si lo hace puede ser que
          no pueda usar la plena funcionabilidad de este website.
        </p>
        <p>
          Al utilizar este website Usted consiente el tratamiento de información
          acerca de Usted por Google en la forma y para los fines arriba indicados.
        </p>
      </div>
      <div class="modal-footer">
        <button class="btn" data-dismiss="modal" aria-hidden="true">
          Cerrar
        </button>
      </div>
    </div>
  </body>

</html>