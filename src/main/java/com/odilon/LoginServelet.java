package com.odilon;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;

@WebServlet("/signin")
public class LoginServelet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String email = request.getParameter("email");
        String password = request.getParameter("password");

        if ("admin@gmail.com".equals(email) && "password".equals(password)) {
      
            response.sendRedirect("welcome.html");
        } else {
          
            RequestDispatcher dispatcher = request.getRequestDispatcher("forgot.html");
            dispatcher.forward(request, response);
        }
    }
	
}
