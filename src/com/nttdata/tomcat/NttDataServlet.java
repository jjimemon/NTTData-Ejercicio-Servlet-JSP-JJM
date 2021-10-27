package com.nttdata.tomcat;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Ejemplo NTT-DATA - Servlet.
 * 
 * @author jjimemon
 *
 */

@WebServlet("/NttDataServlet")
public class NttDataServlet extends HttpServlet {

	/** Serializable */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor por defecto.
	 * 
	 * @see HttpServlet#HttpServlet()
	 */
	public NttDataServlet() {
		super();

	}

	/**
	 * Obtención de petición GET.
	 * 
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.getWriter().append("Te veo");
	}

	/**
	 * Obtención de petición POST.
	 * 
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// Obtención y guardado de los parámetros.
		final String param1 = request.getParameter("param1");
		final String param2 = request.getParameter("param2");

		// Respuesta.
		response.getWriter().append("Primer parámetro " + param1 + " Segundo parámetro " + param2);
	}

}
