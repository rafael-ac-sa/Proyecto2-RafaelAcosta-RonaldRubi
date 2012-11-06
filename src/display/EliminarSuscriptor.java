package display;

import java.util.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import org.springframework.web.context.*;
import domain.SuscriptorRepository;
import domain.Suscriptor;

/**
 * Controlador de pagina del detalle del Suscriptor
 * @author Rafael Acosta, Ronald Rubi
 */
public class EliminarSuscriptor extends PageController {
	/**
	 *  Elimina la suscriptor seleccionado
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		SuscriptorRepository suscriptores = (SuscriptorRepository) context.getBean("suscriptorRepository");
		try {
			String idSuscriptor = request.getParameter("idSuscriptor");
			Suscriptor obj = suscriptores.findSuscriptor(idSuscriptor);
			
			suscriptores.deleteSuscriptor(obj);
			response.sendRedirect("listaSuscriptores");
		} catch (Exception e) {
			request.setAttribute("mensaje", e.getMessage());
			forward("/paginaError.jsp", request, response);
		}
	}
}