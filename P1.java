package k;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/G")
public class P1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public P1() {
        super();
     
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		PrintWriter pw = response.getWriter();
		if(name.equals("ab")){
			pw.println("you are valid");
			RequestDispatcher rd = request.getRequestDispatcher("W1");
			rd.forward(request, response);
		}
		else if(name.equals("")) {
			pw.println("Please input the name");
			RequestDispatcher rd = request.getRequestDispatcher("H1.html");
			rd.include(request, response);
		}
		else if(!name.equals("ab")) {
			pw.println("Please input the right name");
			RequestDispatcher rd = request.getRequestDispatcher("H1.html");
			rd.include(request, response);
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
