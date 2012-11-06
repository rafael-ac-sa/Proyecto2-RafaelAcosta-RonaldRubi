package display;

import java.util.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import org.springframework.web.context.*;
import domain.AveriaRepository;
import domain.Averia;
/**
 * Controlador de pagina de actualizar averia
 * @author Rafael Acosta, Ronald Rubi
 */
public class ActualizarAveria extends PageController {
	/**
	 * Metodo para actualizar un servicio existente
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		AveriaRepository averias = (AveriaRepository) context.getBean("averiaRepository");
		try {  
			String codAveria = request.getParameter("codAveria");
			String descripcion = request.getParameter("descripcion");
			String fecha = request.getParameter("fecha");
			String servicio_codServicio = request.getParameter("servicio_codServicio");
						
			Averia obj = averias.findAveria(codAveria);
			try {
				if (codAveria != null)
					obj.setCodAveria(codAveria);
				if (descripcion != null)
					obj.setDescripcion(descripcion);
				if (fecha != null)
					obj.setFecha(fecha);
				if (servicio_codServicio != null)
					obj.setServicioCodServicio(servicio_codServicio);
			} catch (Exception e) {
			}
			response.sendRedirect("listaAverias");
		} catch (Exception e) {
			request.setAttribute("mensaje", e.getMessage());
			forward("/paginaError.jsp", request, response);
		}
	}
}