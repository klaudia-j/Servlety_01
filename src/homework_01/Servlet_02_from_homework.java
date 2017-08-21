package homework_01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet_02_from_homework
 */
@WebServlet("/Servlet_02_from_homework")
public class Servlet_02_from_homework extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Servlet_02_from_homework() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		File file = new File ("/Users/Klaudia/kurs/Servlety_01/src/homework_01/oop.txt");
//		StringBuilder reading = new StringBuilder(); 
		PrintWriter writer = response.getWriter();
		try {
			Scanner scan = new Scanner(file); 
			while (scan.hasNextLine()) {
				writer.append(scan.nextLine() + "\n"); } //jak ze StringBuilderem to tu jest reading.append...
			scan.close();
		} catch (FileNotFoundException e) {
			System.out.println("brak pliku"); 
		}
//		String text = reading.toString();
//		writer.append(text);
	}
	//		response.getWriter().append("Served at: ").append(request.getContextPath());

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
