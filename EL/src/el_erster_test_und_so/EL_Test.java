package el_erster_test_und_so;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EL_Test
 */
@WebServlet("/EL_Test")
public class EL_Test extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public EL_Test() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		EL_Test_DATENKLASSE dk = new EL_Test_DATENKLASSE();
		ArrayList<EL_Test_DATENKLASSE> books = new ArrayList<EL_Test_DATENKLASSE>();		
		
		dk.setBook(request.getParameter("bookname"));
		dk.setId(request.getParameter("id"));
		
		books.add(dk);
		
		request.setAttribute("list", books);
		request.setAttribute("dk", dk);
		
		String bookname = request.getParameter("bookname");
		int id = Integer.parseInt(request.getParameter("id"));
		
		RequestDispatcher rd = request.getRequestDispatcher("EL_Test.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
