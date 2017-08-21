package homework_01;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet_04_from_homework
 */
@WebServlet("/Servlet_04_from_homework")
public class Servlet_04_from_homework extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Servlet_04_from_homework() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Random r = new Random();
		int[] list = new int[10];
		for (int i = 0; i < 10; i++) { 
			int a = r.nextInt(100)+1;
			list[i] = a;
		}
		PrintWriter writer = response.getWriter();
		writer.append("<!DOCTYPE html><html><body><table>");
		for (int i = 0; i < 10; i++) {
			writer.append("<tr><td style='border: 1px solid black;'>" + list[i] + "</td></tr>");
		}
		writer.append("</table></body></html>");
		Arrays.sort(list);
		writer.append("\n\n\n" + "<!DOCTYPE html><html><body><table>");
		for (int i = 0; i < 10; i++) {
			writer.append("<tr><td style='border: 1px solid black;'>" + list[i] + "</td></tr>");
		}
		writer.append("</table></body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
