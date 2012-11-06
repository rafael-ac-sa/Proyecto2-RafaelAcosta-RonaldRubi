package display;

import java.util.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import org.springframework.web.context.*;
import domain.SuscriptorRepository;
import domain.Suscriptor;
/**
 * Controlador de pagina de la lista de suscriptores
 * @author Rafael Acosta, Ronald Rubi
 */
public class ListaSuscriptores extends PageController {
	/**
	 * Obtencion y establecimiento del DTO de la lista de todos los suscriptores
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		SuscriptorRepository suscriptores = (SuscriptorRepository) context.getBean("suscriptorRepository");
		try {
			Collection lista = suscriptores.findAllSuscriptor();
			List data = new ArrayList();
			Iterator itr = lista.iterator();
			while (itr.hasNext()) {
				Suscriptor obj = (Suscriptor) itr.next();
				SuscriptorDTO dto = SuscriptorAssembler.Create(obj);
				data.add(dto);
			}
			request.setAttribute("suscriptores", data);
			forward("/listaSuscriptores.jsp", request, response);
		} catch (Exception e) {
			request.setAttribute("mensaje", e.getMessage());
			forward("/paginaError.jsp", request, response);
		}
	}
}