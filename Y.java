package p;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/hlo")
public class Y extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public Y() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String add = request.getParameter("address");
		String gen = request.getParameter("gender");
		String hob = request.getParameter("hobby");
		String skl = request.getParameter("skills");
		PrintWriter obj = response.getWriter();
		obj.println("the name is: "+name);
		obj.println("the address is: "+add);
		obj.println("the gender is :"+gen);
		obj.println("the hobby is :"+hob);
		obj.println("the skills is :"+skl);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
