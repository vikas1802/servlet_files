package p;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet("/oy")

public class T extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public T() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		pw.println("<html>");
		pw.println("<body>");
		pw.println("<form action = 'oy' method = 'post'>");
		pw.println("name : <input type = 'text' name = 'name'>");
		pw.println("email : <input type = 'text' name = 'email'>");
		pw.println("password : <input type = 'text' name = 'password'>");
		pw.println("<button type = 'submit'>submit</button>");
		pw.println("</form>");
		pw.println("</body>");
		pw.println("</html>");
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String name = request.getParameter("name");
	String email = request.getParameter("email");
	String password = request.getParameter("password");
	PrintWriter pw = response.getWriter();
	pw.println("the name is :"+name);
	pw.println("the email is :"+email);
	pw.println("the password is :"+password);
//			doGet(request, response);
	}

}
