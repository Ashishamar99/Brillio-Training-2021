package servlet_demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddServlet
 */

@WebServlet("/AddServlet")
public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		try {
		out.print("<html><body><form action='AddServlet' method='post'>");
		out.print("<center><h1>Addition of two numbers</h1><br><hr><br>");
		out.print("<br>Enter number:<input type='text' name='a1' value='0'/>");
		out.print("<br>Enter number:<input type='text' name='a2' value='0'/>");
		out.print("<br>Result: <input type='text' name='a3' value='0'/>");
		out.print("<br><input type='submit' value='Add'/>");
		out.print("<br></form></body></html>");
		} catch(Exception e) {

		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		try {
		int a = Integer.parseInt(request.getParameter("a1"));
		int b = Integer.parseInt(request.getParameter("a2"));
		int c = a + b;
		out.print("<html><body><form action='AddServlet' method='post'>");
		out.print("<center><h1>Addition of two numbers</h1><br><hr><br>");
		out.print("<br>Enter number:<input type='text' name='a1' value='"+a+"'/>");
		out.print("<br>Enter number:<input type='text' name='a2' value='"+b+"'/>");
		out.print("<br>Result: <input type='text' name='a3' value='"+c+"'/>");
		out.print("<br><input type='submit' value='Add'/>");
		out.print("<br></form></body></html>");
		} catch(Exception e) {

		}
	}

}
