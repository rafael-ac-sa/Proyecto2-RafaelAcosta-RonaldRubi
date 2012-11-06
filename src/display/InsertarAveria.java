package display;

import java.util.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import org.springframework.web.context.*;
import domain.*;
/**
 * Controlador de pagina de insertar averia
 * @author Rafael Acosta, Ronald Rubi
 */
public class InsertarAveria extends PageController {
	/**
	 * Setea de los atributos de la nueva averia, creacion y envio del objeto averia
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		AveriaRepository repository = (AveriaRepository) context.getBean("averiaRepository");
		try {
			String descripcion = request.getParameter("descripcion");
			String fecha = request.getParameter("fecha");
			String servicio_codServicio = request.getParameter("servicio_codServicio");

			Random generator = new Random();
			int id = -1;
			while (id <= 0) {
				id = generator.nextInt();
			}
			String codAveria = id + "";

			Averia obj = new Averia(codAveria, descripcion, fecha, servicio_codServicio);
			repository.insertAveria(obj);
			response.sendRedirect("listaAverias");
		} catch (Exception e) {
			request.setAttribute("mensaje", e.getMessage());
			forward("/paginaError.jsp", request, response);
		}
	}
}