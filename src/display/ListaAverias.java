package display;

import java.util.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import org.springframework.web.context.*;
import domain.AveriaRepository;
import domain.Averia;
/**
 * Controlador de pagina de la lista de averias
 * @author Rafael Acosta, Ronald Rubi
 */
public class ListaAverias extends PageController {
	/**
	 * Obtencion y establecimiento del DTO de la lista de todas las averias
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		AveriaRepository averias = (AveriaRepository) context.getBean("averiaRepository");
		try {
			Collection lista = averias.findAllAveria();
			List data = new ArrayList();
			Iterator itr = lista.iterator();
			while (itr.hasNext()) {
				Averia obj = (Averia) itr.next();
				AveriaDTO dto = AveriaAssembler.Create(obj);
				data.add(dto);
			}
			request.setAttribute("averias", data);
			forward("/listaAverias.jsp", request, response);
		} catch (Exception e) {
			request.setAttribute("mensaje", e.getMessage());
			forward("/paginaError.jsp", request, response);
		}
	}
}