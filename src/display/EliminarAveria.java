package display;

import java.util.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import org.springframework.web.context.*;
import domain.AveriaRepository;
import domain.Averia;

/**
 * Controlador de pagina del detalle de la averia
 * @author Rafael Acosta, Ronald Rubi
 */
public class EliminarAveria extends PageController {
	/**
	 * Elimina la averia seleccionada
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		AveriaRepository averias = (AveriaRepository) context.getBean("averiaRepository");
		try {
			String codAveria = request.getParameter("codAveria");
			Averia obj = averias.findAveria(codAveria);
			
			averias.deleteAveria(obj);
			response.sendRedirect("listaAverias");
		} catch (Exception e) {
			request.setAttribute("mensaje", e.getMessage());
			forward("/paginaError.jsp", request, response);
		}
	}
}