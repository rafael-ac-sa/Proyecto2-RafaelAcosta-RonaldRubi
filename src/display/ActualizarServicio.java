package display;

import java.util.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import org.springframework.web.context.*;
import domain.ServicioRepository;
import domain.Servicio;
/**
 * Controlador de pagina de actualizar servicio
 * @author Rafael Acosta, Ronald Rubi
 */
public class ActualizarServicio extends PageController {
	/**
	 * Metodo para actualizar un servicio existente
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ServicioRepository servicios = (ServicioRepository) context.getBean("servicioRepository");
		try {  
			String codServicio = request.getParameter("codServicio");
			String fechaInst = request.getParameter("fechaInst");
			String direccion = request.getParameter("direccion");
			String region_codRegion = request.getParameter("region_codRegion");
			String suscriptor_idSuscriptor = request.getParameter("suscriptor_idSuscriptor");
			
			Servicio obj = servicios.findServicio(codServicio);
			try {
				if (codServicio != null)
					obj.setCodServicio(codServicio);
				if (fechaInst != null)
					obj.setFechaInst(fechaInst);
				if (direccion != null)
					obj.setDireccion(direccion);
				if (region_codRegion != null)
					obj.setRegionCodRegion(region_codRegion);
				if (suscriptor_idSuscriptor != null)
					obj.setSuscriptorIdSuscriptor(suscriptor_idSuscriptor);
			} catch (Exception e) {
			}
			response.sendRedirect("listaServicios");
		} catch (Exception e) {
			request.setAttribute("mensaje", e.getMessage());
			forward("/paginaError.jsp", request, response);
		}
	}
}