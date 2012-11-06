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
						<li class="active"><a href="/averias/listaSucursales">Sucursales</a></li>
						<li><a href="/averias/listaAverias">Averias</a></li>
						<li><a href="/averias/listaServicios">Servicios</a></li>
					</ul>
				</div>
			</div>
			<div class="content">
				<h2>Listado de sucursales</h2>
				<% List sucursales = (List) request.getAttribute("sucursales");%>
				<table class="list">
					<tr>
						<th>Telefono</th><th>Ciudad</th><th>Direccion</th><th>Encargado</th><th>Acciones</th>
					</tr>
					<% for (int i = 0, n = sucursales.size(); i < n; i++) {
					SucursalDTO sucursal = (SucursalDTO) sucursales.get(i); %>
					<tr>
						<td><%= sucursal.telefono %></td>
						<td><%= sucursal.ciudad %></td>
						<td><%= sucursal.direccion %></td>
						<td><%= sucursal.encargado %></td>
						<td>
							<a href='/averias/detalleSucursal?codSucursal=<%= sucursal.codSucursal %>'><input type="submit" value="Detalle"/></a>
							<a href='/averias/eliminarSucursal?codSucursal=<%= sucursal.codSucursal %>'><input type="submit" value="Eliminar"/></a>
						</td>
					</tr>
					<% }%>
				</table>
				<table>
					<tr>
						<td><a href='../nuevaSucursal.jsp'>
						<input type="submit" name="action" value="Agregar"/>
						</a></td>
					</tr>
				</table>
			</div>
		</div>
	</body>
</html>