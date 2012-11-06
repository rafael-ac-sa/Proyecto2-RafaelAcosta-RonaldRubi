<%@ page import="java.util.Map" %>
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
                        <li class="active"><a href="/averias/listaSucursales">Sucursales</a></li>
                        <li><a href="/averias/listaAverias">Averias</a></li>
                        <li><a href="/averias/listaServicios">Servicios</a></li>
                    </ul>
                </div>
            </div>
            <div class="content">
                <h2>Detalle de Sucursal</h2>
                <% SucursalDTO sucursal = (SucursalDTO)request.getAttribute("sucursal"); %>
                <form name="ActualizarSucursal" action="/averias/actualizarSucursal" method="get">
                    <input type="hidden" name="codSucursal" value="<%= sucursal.codSucursal %>"/>
                    <table>
                        <tr><td>telefono:</td><td><input type="text" name="telefono" value="<%= sucursal.telefono %>"/></td></tr>
                        <tr><td>ciudad:</td><td><input type="text" name="ciudad" value="<%= sucursal.ciudad %>"/></td></tr>
                        <tr><td>direccion:</td><td><input type="text" name="direccion" value="<%= sucursal.direccion %>"/></td></tr>
                        <tr><td>encargado:</td><td><input type="text" name="encargado" value="<%= sucursal.encargado %>"/></td></tr>
                        <tr><td></td><td><input type="submit" value="Actualizar" /></td></tr>
                    </table>
                </form>
            </div>
        </div>
    </body>
</html>