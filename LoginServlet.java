package priya.login.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import priya.login.bean.LoginBean;
import priya.login.dao.LoginDao;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public LoginServlet() {
        super();
    }
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 
		
		LoginDao loginDao = new LoginDao();
		
		String uname= request.getParameter("uname");
		String password= request.getParameter("password");
		
		LoginBean loginBean = new LoginBean();
		 loginBean.setuname(uname);
		 loginBean.setPassword(password);
		 
		// LoginDao loginDao = new LoginDao();
		if(loginDao.validate(loginBean))
		{
			response.sendRedirect("loginSuccess.jsp");
		}
		else
		{
			response.sendRedirect("login.jsp");
		}
	
	}
}
