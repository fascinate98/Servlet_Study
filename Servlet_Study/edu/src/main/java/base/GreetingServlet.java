package base;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GreetingServlet
 */
@WebServlet("/greeting")
public class GreetingServlet extends HttpServlet {
	   private static final long serialVersionUID = 1L;

	   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	      response.setContentType("text/html;charset = UTF-8");
	      PrintWriter out = response.getWriter();
	      LocalDate date = LocalDate.now();
	      String a = date.format(DateTimeFormatter.ofPattern("E"));
	      String name = request.getParameter("guestname");
	      
	      if(name == null || name.length() == 0) {
	    	  name = "�մ�";
	      }
	      
	      out.print("<h2>" + name +"��!  �ݰ�����.. ������ "+ a + "�����Դϴ�!! </h2>");

	  
	      out.close();

	   }
	}