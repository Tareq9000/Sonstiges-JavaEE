package json;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Personserv
 */
@WebServlet("/Personserv")
public class Personserv extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	ArrayList<String> pers = new ArrayList<>();

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out = response.getWriter();
	
		out.print("{\"firstName\":\"Tareq\", \"lastName\":\"Kattit\", \"alter\":\"16\"}, '+' {\"firstName\":\"Tareq\", \"lastName\":\"Kattit\", \"alter\":\"16\"}");

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
