package notenrechner;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.lang.Math;

/**
 * Servlet implementation class NotenRechner
 */
@WebServlet("/NotenRechner")
public class NotenRechner extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NotenRechner() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		double note = 0;
		double punktAnzahl = 0;
		double maxpunktAnzahl = 0;
		try {
				
			punktAnzahl = Integer.parseInt(request.getParameter("punktAnzahl"));
			maxpunktAnzahl = Integer.parseInt(request.getParameter("maxpunktAnzahl"));
			
		}catch(NumberFormatException e){
			maxpunktAnzahl = 0;
		}
		
		if(maxpunktAnzahl > 0 && punktAnzahl >= 0 && punktAnzahl <= maxpunktAnzahl) {
			
			
			note = punktAnzahl / maxpunktAnzahl * 5 + 1;
			note = Math.round(note*100)/100.0;
			
			
			RequestDispatcher rd = request.getRequestDispatcher("NotenRechnerEnde.jsp");
			request.setAttribute("note" , note);
			request.setAttribute("name" , request.getParameter("name"));
			rd.forward(request, response);
		}
		else {
			RequestDispatcher rd = request.getRequestDispatcher("NotenRechnerError.jsp");
			rd.forward(request, response);
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
