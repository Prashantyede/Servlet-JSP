package com.demoServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EvenOddServlet
 */
@WebServlet(name = "EvenOddServlets", urlPatterns = { "/EvenOddServlet" })
public class EvenOddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public EvenOddServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// Set response content type
        response.setContentType("text/html");

        // Actual logic of the servlet
        PrintWriter out =null;
        try {
        	out= response.getWriter();
        	int n = Integer.parseInt(request.getParameter("n1"));
        	out.println("<Center>");
        	
        	if (n%2 ==0) 
        	out.println(+n+" Numer is Even");
        	else 
        		out.println(+n+" Number is Odd");
        }
       catch(Exception e) {
    	   out.println("Error :"+e.getMessage());
       }  
        finally {
        	out.println("<br><br>");
        	out.println("Go to main Page <a href=index.html>"
        			+ "<input type = submit value=\"Back\"></a>");
        	out.println("</center>");
        }
    }
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		doGet(request, response);
//	}

}
