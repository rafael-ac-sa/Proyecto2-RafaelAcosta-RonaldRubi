package display;

import java.util.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import org.springframework.web.context.*;
import domain.SucursalRepository;
import domain.Sucursal;
/**
 * Controlador de pagina de actualizar sucursal
 * @author Rafael Acosta, Ronald Rubi
 */
public class ActualizarSucursal extends PageController {
	/**
	 * Metodo para actualizar una sucursal existente
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		SucursalRepository sucursales = (SucursalRepository) context.getBean("sucursalRepository");
		try {
			
			String codSucursal = request.getParameter("codSucursal");
			String telefono = request.getParameter("telefono");
			String ciudad = request.getParameter("ciudad");
			String direccion = request.getParameter("direccion");
			String encargado = request.getParameter("encargado");
			
			Sucursal obj = sucursales.findSucursal(codSucursal);
			try {
				if (codSucursal != null)
					obj.setCodSucursal(codSucursal);
				if (telefono != null)
					obj.setTelefono(telefono);
				if (ciudad != null)
					obj.setCiudad(ciudad);
				if (direccion != null)
					obj.setDireccion(direccion);
				if (encargado != null)
					obj.setEncargado(encargado);
			} catch (Exception e) {
			}
			response.sendRedirect("listaSucursales");
		} catch (Exception e) {
			request.setAttribute("mensaje", e.getMessage());
			forward("/paginaError.jsp", request, response);
		}
	}
}