package priya.login.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import priya.login.bean.Member;
import priya.login.dao.RegisterDao;

public class register extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String PHN_REGEX = "^\\d{10}$";
	String PASS_REGEX="^(?=.*[0-9])"
	        + "(?=.*[a-z])(?=.*[A-Z])"
	        + "(?=.*[@#$%^&+=])"
	        + "(?=\\S+$).{8,20}$";
	String EMAIL_REGEX="^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
    
	public register() {
        super();
       
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	String uname = request.getParameter("uname");
	String password = request.getParameter("password");
	String phone = request.getParameter("phone");
	String email = request.getParameter("email");
	
	 PrintWriter out = response.getWriter();
	 
	 
	if(!password.matches(PASS_REGEX))
	{
		out.print("pls provide correct Password!");
		out.print("at least one digit, one lower case alphabet, one upper case alphabet,one special character, at least 8 characters.");
	}
	else if(!email.matches(EMAIL_REGEX))
	{
		out.print("pls provide correct Email Address!");
	}
	else if(!phone.matches(PHN_REGEX))
	{
		out.print("10 digit Phone Number with No space!");
	}
	else {

		Member member = new Member(uname,password,email,phone);
		
		RegisterDao rDao = new RegisterDao();
		String result = rDao.insert(member);
	
		if(result.equals("Data entered successfully"))
		{
			response.sendRedirect("regsuccess.jsp");
		}
		else
		{
			response.sendRedirect("MemberRegistration.jsp");
		}
}
    }
    }
