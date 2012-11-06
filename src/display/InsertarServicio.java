package display;

import java.util.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import org.springframework.web.context.*;
import domain.*;
/**
 * Controlador de pagina de insertar servicio
 * @author Rafael Acosta, Ronald Rubi
 */
public class InsertarServicio extends PageController {
	/**
	 * Setea de los atributos del nueva servicio, creacion y envio del objeto servicio
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ServicioRepository repository = (ServicioRepository) context.getBean("servicioRepository");
		try {
			String fechaInst = request.getParameter("fechaInst");
			String direccion = request.getParameter("direccion");
			String region_codRegion = request.getParameter("region_codRegion");
			String suscriptor_idSuscriptor = request.getParameter("suscriptor_idSuscriptor");

			Random generator = new Random();
			int id = -1;
			while (id <= 0) {
				id = generator.nextInt();
			}
			String codServicio = id + "";

			Servicio obj = new Servicio(codServicio, fechaInst, direccion, region_codRegion, suscriptor_idSuscriptor);
			repository.insertServicio(obj);
			response.sendRedirect("listaServicios");
		} catch (Exception e) {
			request.setAttribute("mensaje", e.getMessage());
			forward("/paginaError.jsp", request, response);
		}
	}
}