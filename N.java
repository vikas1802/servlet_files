package k;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/or ji")
public class N extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public N() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String email = request.getParameter("email");
	String password = request.getParameter("password");
	PrintWriter out = response.getWriter();
	if(email.equals("abcd")&&password.equals("1234")) {
		RequestDispatcher re = request.getRequestDispatcher("M");
		re.forward(request,response);
	}
	else if(!email.equals("abcd")&&!password.equals("1234")) {
		RequestDispatcher rd = request.getRequestDispatcher("page.html");
		rd.include(request,response);
	}
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
