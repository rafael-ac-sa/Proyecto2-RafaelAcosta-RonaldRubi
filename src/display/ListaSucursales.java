package display;

import java.util.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import org.springframework.web.context.*;
import domain.SucursalRepository;
import domain.Sucursal;
/**
 * Controlador de pagina de la lista de sucursales
 * @author Rafael Acosta, Ronald Rubi
 */
public class ListaSucursales extends PageController {
	/**
	 * Obtencion y establecimiento del DTO de la lista de todas las sucursales
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		SucursalRepository sucursales = (SucursalRepository) context.getBean("sucursalRepository");
		try {
			Collection lista = sucursales.findAllSucursal();
			List data = new ArrayList();
			Iterator itr = lista.iterator();
			while (itr.hasNext()) {
				Sucursal obj = (Sucursal) itr.next();
				SucursalDTO dto = SucursalAssembler.Create(obj);
				data.add(dto);
			}
			request.setAttribute("sucursales", data);
			forward("/listaSucursales.jsp", request, response);
		} catch (Exception e) {
			request.setAttribute("mensaje", e.getMessage());
			forward("/paginaError.jsp", request, response);
		}
	}
}