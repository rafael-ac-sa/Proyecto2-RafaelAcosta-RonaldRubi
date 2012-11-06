package display;

import java.util.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import org.springframework.web.context.*;
import domain.SuscriptorRepository;
import domain.Suscriptor;
import domain.RegionRepository;
import domain.Region;

/**
 * Controlador de pagina del detalle del servicio
 * @author Rafael Acosta, Ronald Rubi
 */
public class NuevaServicio extends PageController {
	/**
	 * Obtencion y establecimiento del DTO de detalle del servicio
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		SuscriptorRepository suscriptores = (SuscriptorRepository) context.getBean("suscriptorRepository");
		RegionRepository regiones = (RegionRepository) context.getBean("regionRepository");
		try {
			
			//Obtencion suscriptores
			Collection lista_suscriptores = suscriptores.findAllSuscriptor();
			List data = new ArrayList();
			Iterator itr = lista_suscriptores.iterator();
			while (itr.hasNext()) {
				Suscriptor obj_suscriptor = (Suscriptor) itr.next();
				SuscriptorDTO dto_suscriptor = SuscriptorAssembler.Create(obj_suscriptor);
				data.add(dto_suscriptor);
			}
			request.setAttribute("suscriptores", data);
			
			//Obtencion regiones
			Collection lista_regiones = regiones.findAllRegion();
			List data_regiones = new ArrayList();
			Iterator itr_region = lista_regiones.iterator();
			while (itr_region.hasNext()) {
				Region obj_region = (Region) itr_region.next();
				RegionDTO dto_region = RegionAssembler.Create(obj_region);
				data_regiones.add(dto_region);
			}
			request.setAttribute("regiones", data_regiones);
			
			forward("/nuevaServicio.jsp", request, response);
		} catch (Exception e) {
			request.setAttribute("mensaje", e.getMessage());
			forward("/paginaError.jsp", request, response);
		}
	}
}