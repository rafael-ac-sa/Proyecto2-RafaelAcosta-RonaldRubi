<%@ page import="java.util.*" %>
<%@ page import="display.*" %>
<html>
	<head>
		<title>Sistema de Averias</title>
		<style type="text/css">
			<%@ include file="css/reset.css" %>
			<%@ include file="css/all.css" %>
		</style>
	</head>
	<body>
		<div id="wrapper">
			<div  class="header">
				<div class="logo">
					<a href="<%=request.getContextPath()%>/index.html"><img src="<%=request.getContextPath()%>/images/logo.png" /></a>
				</div>
				<div class="nav">
					<ul>
						<li><a href="<%=request.getContextPath()%>/index.html">Inicio</a></li>
						<li><a href="/averias/listaSuscriptores">Suscriptores</a></li>
						<li><a href="/averias/listaSucursales">Sucursales</a></li>
						<li><a href="/averias/listaAverias">Averias</a></li>
						<li class="active"><a href="/averias/listaServicios">Servicios</a></li>
					</ul>
				</div>
			</div>
			<div class="content">
				<h2>Listado de servicios</h2>
				<% List servicios = (List) request.getAttribute("servicios");%>
				<table class="list">
					<tr>
						<th>Fecha de Instalacion</th><th>Descripcion</th><th>Codigo Region</th><th>Codigo Suscriptor</th><th>Acciones</th>
					</tr>
					<% for (int i = 0, n = servicios.size(); i < n; i++) {
					ServicioDTO servicio = (ServicioDTO) servicios.get(i); %>
					<tr>
						<td><%= servicio.fechaInst %></td>
						<td><%= servicio.direccion %></td>
						<td><%= servicio.region_codRegion %></td>
						<td><%= servicio.suscriptor_idSuscriptor %></td>
						<td>
							<a href='/averias/detalleServicio?codServicio=<%= servicio.codServicio %>'><input type="submit" value="Detalle"/></a>
							<a href='/averias/eliminarServicio?codServicio=<%= servicio.codServicio %>'><input type="submit" value="Eliminar"/></a>
							<a href='/averias/detalleSuscriptor?idSuscriptor=<%= servicio.suscriptor_idSuscriptor %>'><input type="submit" value="Ver suscriptor"/></a>
						</td>
					</tr>
					<% }%>
				</table>
				<table>
					<tr>
						<td><a href='/averias/nuevaServicio'>
						<input type="submit" name="action" value="Agregar"/>
						</a></td>
					</tr>
				</table>
			</div>
		</div>
	</body>
</html>