package display;

import java.util.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import org.springframework.web.context.*;
import domain.SuscriptorRepository;
import domain.Suscriptor;
/**
 * Controlador de pagina de actualizar Suscriptor
 * @author Rafael Acosta, Ronald Rubi
 */
public class ActualizarSuscriptor extends PageController {
	/**
	 * Metodo para actualizar un Suscriptor existente
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		SuscriptorRepository suscriptores = (SuscriptorRepository) context.getBean("suscriptorRepository");
		try {
			
			String idSuscriptor = request.getParameter("idSuscriptor");
			String nombre = request.getParameter("nombre");
			String identificacion = request.getParameter("identificacion");
			String telefono = request.getParameter("telefono");
			String direccion = request.getParameter("direccion");
			
			Suscriptor obj = suscriptores.findSuscriptor(idSuscriptor);
			try {
				if (idSuscriptor != null)
					obj.setIdSuscriptor(idSuscriptor);
				if (nombre != null)
					obj.setNombre(nombre);
				if (identificacion != null)
					obj.setIdentificacion(identificacion);
				if (telefono != null)
					obj.setTelefono(telefono);
				if (direccion != null)
					obj.setDireccion(direccion);
			} catch (Exception e) {
			}
			response.sendRedirect("listaSuscriptores");
		} catch (Exception e) {
			request.setAttribute("mensaje", e.getMessage());
			forward("/paginaError.jsp", request, response);
		}
	}
}