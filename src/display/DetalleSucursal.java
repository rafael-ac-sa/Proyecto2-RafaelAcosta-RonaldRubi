package display;

import java.util.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import org.springframework.web.context.*;
import domain.SucursalRepository;
import domain.Sucursal;

/**
 * Controlador de pagina del detalle de la sucursal
 * @author Rafael Acosta, Ronald Rubi
 */
public class DetalleSucursal extends PageController {
	/**
	 * Obtencion y establecimiento del DTO de detalle de la sucursal
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		SucursalRepository sucursales = (SucursalRepository) context.getBean("sucursalRepository");
		try {
			String codSucursal = request.getParameter("codSucursal");
			Sucursal obj = sucursales.findSucursal(codSucursal);
			
			SucursalDTO dto = SucursalAssembler.Create(obj);
			request.setAttribute("sucursal", dto);
			forward("/detalleSucursal.jsp", request, response);
		} catch (Exception e) {
			request.setAttribute("mensaje", e.getMessage());
			forward("/paginaError.jsp", request, response);
		}
	}
}