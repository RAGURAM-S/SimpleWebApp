package com.ragu.learn.web;

import com.ragu.learn.spring.core.*;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ragu.learn.spring.core.StandardEmployeeService;

/**
 * Servlet implementation class EmployeeServlet
 */
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public EmployeeServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("GET");
		System.out.println("EmployeeServlet.doGet()");
		
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		System.out.println("Received values are " + firstName + " " + lastName);
		
		Employee emp = new Employee(firstName, lastName);
		
		EmployeeService service = new StandardEmployeeService();
		service.generateMail(emp);
		System.out.println(emp);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		System.out.println("POST");
		System.out.println("EmployeeServlet.doPost()");
		
	}

}
