package controller;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import vo.MemberVO;
@WebServlet("/member")
public class MemberServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		request.setCharacterEncoding("UTF-8");
		
		
		MemberVO vo = new MemberVO
				(request.getParameter("name").equals("") ? "없음" : request.getParameter("name"),
				request.getParameter("phone").equals("") ? "없음" : request.getParameter("phone"),
				request.getParameter("id").equals("") ? "없음" : request.getParameter("id"),
				request.getParameter("pw").equals("") ? "없음" : request.getParameter("pw"));
		
		request.setAttribute("memobj", vo) ;
		request.getRequestDispatcher("/jspsrc/memberViewEL.jsp").
		              forward(request, response);
		
	}
}
