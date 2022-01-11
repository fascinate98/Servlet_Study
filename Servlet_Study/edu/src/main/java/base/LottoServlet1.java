package base;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/lotto1")
public class LottoServlet1 extends HttpServlet {
	   private static final long serialVersionUID = 1L;
	   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {      
	      response.setContentType("text/html; charset=UTF-8");
	      int inputNum =Integer.parseInt(request.getParameter("num")); 
	      int lot = (int)(Math.random()*6)+1;
	      
	      System.out.println(lot + "  " + inputNum);
	      
	      if(lot == inputNum) {
	         RequestDispatcher rd = request.getRequestDispatcher("/htmlexam/success.html");
	         rd.forward(request, response);   
	      }else {
	         RequestDispatcher rd = request.getRequestDispatcher("/htmlexam/fail.html");
	         rd.forward(request, response);   
	      }
	      
	      
	      
	   }
}










