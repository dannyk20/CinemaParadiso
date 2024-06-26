package com.dm.admin;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dm.paradiso.RegisterDAO;
import com.dm.paradiso.RegisterDTO;

/**
 * Servlet implementation class AdminUserController
 */
@WebServlet("/admin_user3.do")
public class AdminUserController3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminUserController3() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RegisterDAO rdao=new RegisterDAO();
		String id=request.getParameter("id");
		try {
			request.setCharacterEncoding("UTF-8");
			ArrayList<RegisterDTO> mList=rdao.selectUser(id);
			HttpSession session=request.getSession();
			session.setAttribute("ulist", mList);
			RequestDispatcher dispatcher=request.getRequestDispatcher("userModifyPage.jsp"); //forwarding
			dispatcher.forward(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			response.sendRedirect("error.jsp");
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
