

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Benutzer")
public class Benutzer extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ArrayList<String> list = new ArrayList<String>();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String user = null;
		user = (String)request.getParameter("username");
	
			if(user.equals("Tareq")) {
				response.getOutputStream().println(false);
			}else {
				response.getOutputStream().println(true);
			}
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
