package display;

import java.util.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import org.springframework.web.context.*;
import domain.ServicioRepository;
import domain.Servicio;
/**
 * Controlador de pagina de la lista de servicios
 * @author Rafael Acosta, Ronald Rubi
 */
public class ListaServicios extends PageController {
	/**
	 * Obtencion y establecimiento del DTO de la lista de todas las servicios
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ServicioRepository servicios = (ServicioRepository) context.getBean("servicioRepository");
		try {
			Collection lista = servicios.findAllServicio();
			List data = new ArrayList();
			Iterator itr = lista.iterator();
			while (itr.hasNext()) {
				Servicio obj = (Servicio) itr.next();
				ServicioDTO dto = ServicioAssembler.Create(obj);
				data.add(dto);
			}
			request.setAttribute("servicios", data);
			forward("/listaServicios.jsp", request, response);
		} catch (Exception e) {
			request.setAttribute("mensaje", e.getMessage());
			forward("/paginaError.jsp", request, response);
		}
	}
}