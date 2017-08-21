

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class SecondServlet
 */
@WebServlet("/SecondServlet")
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SecondServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		List<Country> listOfCountries = initialize();
		Iterator<Country> it = listOfCountries.iterator();
		PrintWriter writer = response.getWriter();
		while(it.hasNext()) {
			Country c = it.next();
			writer.append(c.getName() + " " + c.getCapital() + "\n");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	public static List<Country> initialize () {
		List<Country> listOfCountries = new ArrayList<>();
		Country poland = new Country ("Poland", "Warsaw");
		listOfCountries.add(poland);
		Country czechia = new Country ("Czechia", "Prague");
		listOfCountries.add(czechia);
		Country belgium = new Country ("Belgium", "Brussel");
		listOfCountries.add(belgium);
		listOfCountries.add(new Country("France", "Paris"));
		listOfCountries.add(new Country("Spain", "Madrit"));
		return listOfCountries;

	}
}
