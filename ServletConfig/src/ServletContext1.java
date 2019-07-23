
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ServletContext")
public class ServletContext1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		PrintWriter pw = response.getWriter();
		
		//creating ServletContext object:
		ServletContext context = getServletContext();
		
		// getting the value os the initialization parameter and printing it.
		String driverName = context.getInitParameter("dname");
		pw.println("Driver name is : " +driverName);
		
		pw.close();
		
	}

}
