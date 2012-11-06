package display;

import java.util.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import org.springframework.web.context.*;
import domain.ServicioRepository;
import domain.Servicio;

/**
 * Controlador de pagina del detalle del servicio
 * @author Rafael Acosta, Ronald Rubi
 */
public class EliminarServicio extends PageController {
	/**
	 * Elimina el servicio seleccionada
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ServicioRepository servicios = (ServicioRepository) context.getBean("servicioRepository");
		try {
			String codServicio = request.getParameter("codServicio");
			Servicio obj = servicios.findServicio(codServicio);
			
			servicios.deleteServicio(obj);
			response.sendRedirect("listaServicios");
		} catch (Exception e) {
			request.setAttribute("mensaje", e.getMessage());
			forward("/paginaError.jsp", request, response);
		}
	}
}