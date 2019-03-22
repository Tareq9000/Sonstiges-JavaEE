package bibliothek;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Bibliothekserv
 */
@WebServlet("/Bibliothekserv")
public class Bibliothekserv extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Bibliothekserv() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String buch = request.getParameter("buchname");
		int seiten = Integer.parseInt(request.getParameter("seiten"));
		String kategorie = request.getParameter("kategorie");
		String name = request.getParameter("name");
		String vorname = request.getParameter("vorname");
		String datum = request.getParameter("datum");
		
		HttpSession session = request.getSession();
		
		Bibliothek bibi = (Bibliothek) session.getAttribute("bibliothek");
		if(bibi == null) {
			bibi = new Bibliothek();
			
		}
		Buch book = new Buch();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		bibi.getBuch().add(book);
		book.setTitel(buch);		
		book.setSeiten(seiten);
		book.setKategorie(kategorie);
		
		book.setAuthor(new ArrayList<Author>());
		book.getAuthor().add(new Author());
		book.getAuthor().get(0).setName(name);
		book.getAuthor().get(0).setVorname(vorname);
		Date date = null;
		try {
			date = sdf.parse(datum);
		} catch (ParseException e) {e.printStackTrace();}
		book.getAuthor().get(0).setGeburtsdatum(date);


		
		for(int i = 0; i < bibi.getBuch().size(); i++) {
			
			System.out.print(book.toString());
			System.out.println(book.getAuthor().get(0).toString());

		}
		
		
	
		
		RequestDispatcher rd = request.getRequestDispatcher("Bibliothekend.jsp");
		session.setAttribute("bibliothek", bibi);
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
