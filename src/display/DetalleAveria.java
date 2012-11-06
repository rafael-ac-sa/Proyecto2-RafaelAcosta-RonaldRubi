package display;

import java.util.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import org.springframework.web.context.*;
import domain.AveriaRepository;
import domain.Averia;
import domain.ServicioRepository;
import domain.Servicio;

/**
 * Controlador de pagina del detalle de la averia
 * @author Rafael Acosta, Ronald Rubi
 */
public class DetalleAveria extends PageController {
	/**
	 * Obtencion y establecimiento del DTO de detalle de la averia
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		AveriaRepository averias = (AveriaRepository) context.getBean("averiaRepository");
		ServicioRepository servicios = (ServicioRepository) context.getBean("servicioRepository");
		try {
			String codAveria = request.getParameter("codAveria");
			Averia obj = averias.findAveria(codAveria);
			
			AveriaDTO dto = AveriaAssembler.Create(obj);
			request.setAttribute("averia", dto);
			
			//Obtencion servicios
			Collection lista_servicios = servicios.findAllServicio();
			List data = new ArrayList();
			Iterator itr = lista_servicios.iterator();
			while (itr.hasNext()) {
				Servicio obj_servicio = (Servicio) itr.next();
				ServicioDTO dto_servicio = ServicioAssembler.Create(obj_servicio);
				data.add(dto_servicio);
			}
			request.setAttribute("servicios", data);
			
			forward("/detalleAveria.jsp", request, response);
		} catch (Exception e) {
			request.setAttribute("mensaje", e.getMessage());
			forward("/paginaError.jsp", request, response);
		}
	}
}