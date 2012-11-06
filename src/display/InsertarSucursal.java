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
public class InsertarSucursal extends PageController {
	/**
	 * Setea de los atributos de la nueva sucursal, creacion y envio del objeto sucursal
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		SucursalRepository repository = (SucursalRepository) context.getBean("sucursalRepository");
		try {
			String telefono = request.getParameter("telefono");
			String ciudad = request.getParameter("ciudad");
			String direccion = request.getParameter("direccion");
			String encargado = request.getParameter("encargado");

			Random generator = new Random();
			int id = -1;
			while (id <= 0) {
				id = generator.nextInt();
			}
			String codSucursal = id + "";

			Sucursal obj = new Sucursal(codSucursal, telefono, ciudad, direccion, encargado);
			repository.insertSucursal(obj);
			response.sendRedirect("listaSucursales");
		} catch (Exception e) {
			request.setAttribute("mensaje", e.getMessage());
			forward("/paginaError.jsp", request, response);
		}
	}
}