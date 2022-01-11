package base;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/forward")
public class ForwardServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("FowardServlet 수행 시작");		
		RequestDispatcher rd = request.getRequestDispatcher("/htmlexam/first.html");// 컨텍스트패스 이후 부분을 줘야	/edu주면 안댐. 
		//같은 웹 안에 잇어야 한다고 해서 그런듯 
		//RequestDispatcher rd = request.getRequestDispatcher("http://www.naver.com/");// 컨텍스트패스 이후 부분을 줘야	
		rd.forward(request, response);	
		System.out.println("FowardServlet 수행 종료");		// 얘는 얘대로 내려감. 그래도 밑에는 ㅓㅁ 많이 안하는게 좋음 비동기인거가틈 쓰레드 어쩌고 
	}
}





