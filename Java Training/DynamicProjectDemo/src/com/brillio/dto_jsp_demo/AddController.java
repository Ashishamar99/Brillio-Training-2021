package com.brillio.dto_jsp_demo;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddController
 */
@WebServlet("/AddWithDTOAndBO")
public class AddController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			AddDTO dto = new AddDTO();
			
			dto.setNum1(
					Integer.parseInt(
										request.getParameter("a1")
									)
						);
			
			dto.setNum2(
					Integer.parseInt(
										request.getParameter("a2")
									)
						);
			
			AddBO bo = new AddBO();
			bo.getAdd(dto);
			
			RequestDispatcher rs = request.getRequestDispatcher("add.jsp");
			request.setAttribute("k1", dto);
			rs.forward(request, response);
		
		} catch(Exception e){
			
			RequestDispatcher rs = request.getRequestDispatcher("add.jsp");
			request.setAttribute("msg", e.getMessage());
			Cookie cookie = new Cookie("div_visibility","initial");
			response.addCookie(cookie);
			rs.forward(request, response);
			
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
