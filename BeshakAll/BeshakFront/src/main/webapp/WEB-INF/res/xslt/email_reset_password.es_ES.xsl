<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:import href="email_sign.es_ES.xsl" />
	<xsl:output method="html" indent="yes" omit-xml-declaration="yes" />
	<xsl:template match="/">
		<html>
			<head>
				<style type="text/css">
					.dearUser {
					color: rgb(34, 34, 34);
					font-family: arial, sans-serif;
					font-size: 13px;
					background-color: rgb(255, 255, 255);
					}
					.container {
					color: rgb(34, 34, 34);
					font-family: arial, sans-serif;
					font-size: 13px;
					background-color: rgb(255, 255, 255);
					}
					.goodBye {
					font-family: arial, sans-serif;
					}
				</style>
			</head>
			<body>
				<div class="dearUser">
					Estimado usuario de
					<strong>nombreEmpresa</strong>
					:
				</div>
				<div class="container">
					<div class="gmail_quote">
						<div>
							<p>
								Para iniciar el proceso de reseteo de la contraseña de su
								usuario
								<xsl:text disable-output-escaping="yes">&amp;nbsp;</xsl:text>
								<strong>
									<xsl:value-of select="AEMFTECRecAsync/AEMFTESString[@key='username']" />
								</strong>
								, haga click en el siguiente enlace:
							</p>
						</div>
						<p>
							URL:
							<a href="{AEMFTECRecAsync/AEMFTESString[@key='url']}">
								<xsl:value-of select="AEMFTECRecAsync/AEMFTESString[@key='url']" />
							</a>
						</p>
						<div>
							<p>
								Si al hacer click en el enlace no funciona, copie y pegue la
								URL anterior en su navegador.
							</p>
							<p>
								Si cree que ha recibido este correo por error, es muy probable
								que otro usuario haya introducido err&#243;neamente su
								direcci&#243;n de correo electr&#243;nico intentando activar una
								cuenta de usuario. Si usted no realiz&#243; esa acci&#243;n, no
								necesita hacer nada y puede ignorar y borrar este correo.
							</p>

							<div class="goodBye">
								Atentamente,
								<br></br>
								El Equipo T&#233;cnico de nombreEmpresa.
							</div>
						</div>
					</div>
				</div>
				<xsl:apply-imports />
			</body>
		</html>
	</xsl:template>
</xsl:stylesheet>
