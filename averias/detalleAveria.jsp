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
                <div class="logo"><a href="<%=request.getContextPath()%>/index.html"><img src="<%=request.getContextPath()%>/images/logo.png" /></a></div>
                <div class="nav">
                    <ul>
						<li><a href="<%=request.getContextPath()%>/index.html">Inicio</a></li>
                        <li><a href="/averias/listaSuscriptores">Suscriptores</a></li>
                        <li><a href="/averias/listaSucursales">Sucursales</a></li>
                        <li class="active"><a href="/averias/listaAverias">Averias</a></li>
                        <li><a href="/averias/listaServicios">Servicios</a></li>
                    </ul>
                </div>
            </div>
            <div class="content">
                <h2>Detalle de Averia</h2>
                <% AveriaDTO averia = (AveriaDTO)request.getAttribute("averia"); %>
				<% List servicios = (List)request.getAttribute("servicios"); %>
                <form name="ActualizarAveria" action="/averias/actualizarAveria" method="get">
                    <input type="hidden" name="codAveria" value="<%= averia.codAveria %>"/>
                    <table>
                        <tr><td>Fecha Instalacion:</td><td><input type="text" name="descripcion" value="<%= averia.descripcion %>"/></td></tr>
                        <tr><td>Fecha:</td><td><input type="text" name="fecha" value="<%= averia.fecha %>"/></td></tr>
						<tr><td>Servicio:</td>
						<td>
						<select name="servicio_codServicio">
							<% for (int i = 0, n = servicios.size(); i < n; i++) {
							ServicioDTO servicio = (ServicioDTO) servicios.get(i);
							%>
							<option value="<%= servicio.codServicio %>" ><%= servicio.direccion %></option>
							<%  } %>
						</select>
						</td></tr>
                        <tr><td></td><td><input type="submit" value="Actualizar" /></td></tr>
                    </table>
                </form>
            </div>
        </div>
    </body>
</html>