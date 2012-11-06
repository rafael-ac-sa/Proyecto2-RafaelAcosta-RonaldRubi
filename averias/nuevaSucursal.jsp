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
                        <li class="active"><a href="/averias/listaSucursales">Sucursales</a></li>
                        <li><a href="/averias/listaAverias">Averias</a></li>
                        <li><a href="/averias/listaServicios">Servicios</a></li>
                    </ul>
                </div>
            </div>
            <div class="content">
                <h2>Nueva Sucursal</h2>
                <form name="InsertarSucursal" action="/averias/insertarSucursal" method="get">
                    <table>
                        <tr><td>Telefono:</td><td><input type="text" name="telefono" value=""/></td></tr>
                        <tr><td>Ciudad:</td><td><input type="text" name="ciudad" value=""/></td></tr>
                        <tr><td>Direccion:</td><td><input type="text" name="direccion" value=""/></td></tr>
                        <tr><td>Encargado:</td><td><input type="text" name="encargado" value=""/></td></tr>
                        <tr><td></td><td><input type="submit" value="Agregar" /></td></tr>
                    </table>
                </form>
            </div>
        </div>
    </body>
</html>