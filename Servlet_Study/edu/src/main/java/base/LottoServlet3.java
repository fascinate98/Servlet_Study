package base;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/lotto3")
public class LottoServlet3 extends HttpServlet {
	   private static final long serialVersionUID = 1L;
	   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {      
	      response.setContentType("text/html; charset=UTF-8");
	      
	      
	    int inputNum =Integer.parseInt(request.getParameter("num")); 
	    int lot = (int)(Math.random()*6)+1;
	      
	  	HttpSession session = request.getSession();   // 매개변수 안주면 true주는거 . 새로만들어서 리턴 잇으면 그거 ㅇㅇ 
		if(session.getAttribute("cnt") == null)  //cnt라는 이름의 객체를 찾아 
			session.setAttribute("cnt", new int[1]); // 데이터를 저장할 방을 등록 int 배열을 보관 하고 이써 
		int[] session_v = (int[])session.getAttribute("cnt"); //보관하고있는애ㅡㄹ ㄹ꺼내서 넣음
	      
		System.out.println(session_v[0]);
		
		if(session_v[0] > 2) {
			RequestDispatcher rd = request.getRequestDispatcher("/jspsrc/impossible.jsp");
	         rd.forward(request, response);  
		}else {
			
			      System.out.println("전달된 값 : " + lot + ", 추출된 값 : " + inputNum);
			      
			      if(lot == inputNum) {
			         RequestDispatcher rd = request.getRequestDispatcher("/jspsrc/success.jsp");
			         session_v[0] = 3;
			         rd.forward(request, response);   
			      }else {
			         RequestDispatcher rd = request.getRequestDispatcher("/jspsrc/fail.jsp");
			         rd.forward(request, response);   
			      }
			      session_v[0] += 1;
			}
		
	   }
}










