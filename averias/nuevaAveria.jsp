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
                <h2>Nueva Averia</h2>
				<% List servicios = (List)request.getAttribute("servicios"); %>
                <form name="InsertarAveria" action="/averias/insertarAveria" method="get">
                    <table>
                        <tr><td>Descripcion:</td><td><input type="text" name="descripcion" value=""/></td></tr>
                        <tr><td>Fecha:</td><td><input type="text" name="fecha" value=""/></td></tr>
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
                        <tr><td></td><td><input type="submit" value="Agregar" /></td></tr>
                    </table>
                </form>
            </div>
        </div>
    </body>
</html>