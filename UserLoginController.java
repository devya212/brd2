package com.nucleus.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.nucleus.dao.IUserDao;

import com.nucleus.dao.UserRDBMSDaoImpl;
import com.nucleus.model.User;
import com.nucleus.service.IUserService;
import com.nucleus.service.UserServiceImpl;

/**
 * Servlet implementation class UserLoginController
 */
@WebServlet("/UserLoginController")
public class UserLoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserLoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		User user=new User();
		user.setUserId(request.getParameter("uid"));
		user.setPassword(request.getParameter("pwd"));
		user.setRole(request.getParameter("role"));
		
		
		PrintWriter out=response.getWriter();
		RequestDispatcher rd=null;
		
		IUserService iuservice=new UserServiceImpl();
		boolean check=iuservice.validLogin(user);
		if(check==true && request.getParameter("role").equals("maker") )
		{
			/*HttpSession session=request.getSession(false);
			if(session!=null && session.getAttribute("uid").equals(request.getParameter("uid")))
			{
				out.println("<h1 style=color:red>Session with user id exists one user can login one time</h1>");
			}
			else
			{*/
				HttpSession newsession=request.getSession();
			newsession.setAttribute("uid",user.getUserId());
			//response.sendRedirect("Success");
			 rd=getServletContext().getRequestDispatcher("/makerhome.jsp");
			 rd.forward(request, response);
			
		}
		else
		{
			//response.sendRedirect("Invalid");
			rd=request.getRequestDispatcher("Invalid");
			rd.forward(request, response);
			
		}
		
	}
		
	}


