

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Hello
 */
@WebServlet(urlPatterns={"/ADD"})
public class Hello extends HttpServlet {
	private static final long serialVersionUID = 1L;
         public void service(HttpServletRequest req,HttpServletResponse res) throws IOException{
        	 int i=Integer.parseInt(req.getParameter("t1"));
        	 int j=Integer.parseInt(req.getParameter("t2"));
        	 
        	 int k=i+j;
        	 
        	 
        	 PrintWriter out=res.getWriter();		
             out.println(k);        	 
         }
    

}
