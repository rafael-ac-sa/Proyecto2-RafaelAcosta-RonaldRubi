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
                        <li class="active"><a href="/averias/listaSuscriptores">Suscriptores</a></li>
                        <li><a href="/averias/listaSucursales">Sucursales</a></li>
                        <li><a href="/averias/listaAverias">Averias</a></li>
                        <li><a href="/averias/listaServicios">Servicios</a></li>
                    </ul>
                </div>
            </div>
            <div class="content">
                <h2>Listado de suscriptores</h2>
                <% List suscriptores = (List) request.getAttribute("suscriptores");%>
                <table class="list">
                    <tr><th>Nombre</th><th>Identificacion</th><th>Telefono</th><th>Direccion</th><th>Acciones</th></tr>
                    <% for (int i = 0, n = suscriptores.size(); i < n; i++) {
                    SuscriptorDTO suscriptor = (SuscriptorDTO) suscriptores.get(i); %>
                    <tr><td><%= suscriptor.nombre %></td>
                        <td><%= suscriptor.identificacion %></td>
                        <td><%= suscriptor.telefono %></td>
                        <td><%= suscriptor.direccion %></td>
                        <td>
                        	<a href='/averias/detalleSuscriptor?idSuscriptor=<%= suscriptor.idSuscriptor %>'><input type="submit" value="Detalle"/></a>
                            <a href='/averias/eliminarSuscriptor?idSuscriptor=<%= suscriptor.idSuscriptor %>'><input type="submit" value="Eliminar"/></a>
                        </td>
                    </tr>
                    <% }%>
                </table>
                <table>
                    <tr><td><a href='../nuevoSuscriptor.jsp'>
                                <input type="submit" name="action" value="Agregar"/></a>
                        </td></tr>
                </table>
            </div>
        </div>
    </body>
</html>