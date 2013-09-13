<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:output method="html" indent="yes" omit-xml-declaration="yes" />
	<xsl:template match="/" name="sign">
		<xsl:param name="campaign">mailordinario</xsl:param>
		<div class="root" style="padding:10px;border-collapse:collapse;border-spacing:0px;color:rgb(65,65,65);font-family:Helvetica,Arial,sans-serif;font-size:12px;line-height:18.200000762939453px;border-width:3px 0px 2px 0px;border-style:solid;border-color:rgb(211,225,182)">
		<div class="logo" style="padding:20px 0px;text-decoration:blink;" >
			<a style="text-decoration: none;" href="http://www.nombreEmpresa.com/?utm_source=automatizados&amp;utm_medium=email&amp;utm_content=logo&amp;utm_campaign=mailordinario" target="_blank">
				<img alt="Logo" hspace="5" src="http://www.imotionfactory.com/images/nologo.png" />
			</a>
		</div>
		<div class="content" style="padding:0px 10px;font-family:Helvetica,Arial,sans-serif;font-size:12px;">
			<div class="team" style="color:#304500;">
				<b>Equipo Técnico </b>
			</div>
			<div class="enterprise" style="padding-top:5px;color:#304500">
				nombreEmpresa
			</div>
			<div class="address" style="color:#87af20;font-size:11px;">
				Plaza de Fernando Conde Montero-Ríos, 9 · Despacho 3 · 36201 Vigo · Pontevedra
			</div>
			<div class="contact" style="">
				<a href="tel:912183582" style="color: rgb(17, 85, 204);" target="_blank" value="+34986120104">
				 	<b>912183582</b>
				</a>
				<a href="mailto:info@nombreEmpresa.com" style="color: rgb(0, 153, 204); font-family: Verdana, Geneva, sans-serif; font-size: 11px;text-decoration: initial;" target="_blank">
					info@nombreEmpresa.com
				</a>
				<a href="http://www.nombreEmpresa.com/?utm_source=automatizados&amp;utm_medium=email&amp;utm_campaign={$campaign}"
					style="color: rgb(0, 153, 204); font-family: Verdana, Geneva, sans-serif; font-size: 11px; 
					text-decoration: initial;" target="_blank">
					www.nombreEmpresa.com
				</a>
			</div>
			<div class="socialNetworks" style="padding:10px 0px;">
				<a href="http://www.facebook.com/pages/nombreEmpresa/237606442971095" style="color: rgb(0, 153, 204); text-decoration: initial;" target="_blank">
						<img alt="facebook" border="0" height="24" src="http://www.imotionfactory.com/images/nombreEmpresa/facebook.png" style="border: 0px; " width="24" />
				</a>
				<a href="http://www.twitter.com/nombreEmpresa" style="color: rgb(0, 153, 204); text-decoration: initial;" target="_blank">
					<img alt="twitter" border="0" height="24" src="http://www.imotionfactory.com/images/nombreEmpresa/twitter.png" tyle="border: 0px; " width="24" />
				</a>
				<a href="http://www.linkedin.com/company/nombreEmpresa" style="color: rgb(0, 153, 204); text-decoration: initial;" target="_blank">
					<img alt="linkedIn" border="0" height="24" src="http://www.imotionfactory.com/images/nombreEmpresa/linkedin.png" style="border: 0px; " width="24" />
				</a>
			</div>
		</div>
	</div>
	</xsl:template>
</xsl:stylesheet>
