package display;

import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import org.springframework.web.context.*;
import org.springframework.web.context.support.*;
/**
 * Creacion del controlador de pagina de la aplicacion 
 * @author Rafael Acosta, Ronald Rubi
 *
 */
public class PageController extends HttpServlet {

	protected WebApplicationContext context;

	/**
	 * Inicializacion de la configuracion del servlet
	 */
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		context = WebApplicationContextUtils.getWebApplicationContext(getServletContext());
	}
	
	/**
	 * Manejador de peticiones y respuestos del servlet
	 * @param target
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	protected void forward(String target, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher = context.getServletContext().getRequestDispatcher(target);
		dispatcher.forward(request, response);
	}
}