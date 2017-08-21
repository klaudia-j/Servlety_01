package homework_01;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet_03_2
 */
@WebServlet("/Servlet_03_2")
public class Servlet_03_2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Servlet_03_2() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String products[] = {
			"Asus Transformr;2999.99",
			"iPhone 6';3499.18",
			"Converse Sneakers;125.00",
			"LG OLED55B6P OLED TV;6493.91",
			"Samsung HT-J4100;800.99",
			"Alpine Swiss Dress Belt;99.08",
			"60 Watt LED;1.50",
			"Arduino Nano;3.26"
		};
		int number = Integer.parseInt(request.getParameter("id"));
		response.getWriter().append(products[number]);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
