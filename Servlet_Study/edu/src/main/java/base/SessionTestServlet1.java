package base;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/sessiontest1")
public class SessionTestServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	int member_v=0;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int local_v=0;		
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();   // 매개변수 안주면 true주는거 . 새로만들어서 리턴 잇으면 그거 ㅇㅇ 
		if(session.getAttribute("cnt") == null)  //cnt라는 이름의 객체를 찾아 
			session.setAttribute("cnt", new int[1]); // 데이터를 저장할 방을 등록 int 배열을 보관 하고 이써 
		int[] session_v = (int[])session.getAttribute("cnt"); //보관하고있는애ㅡㄹ ㄹ꺼내서 넣음
		session_v[0] += 10; 
		member_v += 10;
		local_v += 10;
		out.print("<ul>");
		out.print("<li>멤버변수 : "+ member_v +"</li>");
		out.print("<li>지역변수 : "+ local_v +"</li>");
		out.print("<li>세션객체에저장된배열원소 : "+ session_v[0] +"</li>");
		out.print("</ul>");
		out.close();		
	}
}





