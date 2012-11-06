package display;

import java.util.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import org.springframework.web.context.*;
import domain.*;
/**
 * Controlador de pagina de insertar sucursal
 * @author Rafael Acosta, Ronald Rubi
 */
public class InsertarSuscriptor extends PageController {
	/**
	 * Setea de los atributos del nuevo suscriptor, creacion y envio del objeto suscriptor
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		SuscriptorRepository repository = (SuscriptorRepository) context.getBean("suscriptorRepository");
		try {
			String nombre = request.getParameter("nombre");
			String identificacion = request.getParameter("identificacion");
			String telefono = request.getParameter("telefono");
			String direccion = request.getParameter("direccion");
			Random generator = new Random();
			int id = -1;
			while (id <= 0) {
				id = generator.nextInt();
			}
			String idSuscriptor = id + "";

			Suscriptor obj = new Suscriptor(idSuscriptor, nombre, identificacion, telefono, direccion);
			repository.insertSuscriptor(obj);
			response.sendRedirect("listaSuscriptores");
		} catch (Exception e) {
			request.setAttribute("mensaje", e.getMessage());
			forward("/paginaError.jsp", request, response);
		}
	}
}