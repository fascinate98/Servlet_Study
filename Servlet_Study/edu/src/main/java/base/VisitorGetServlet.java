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

@WebServlet("/visitorget")
public class VisitorGetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
 
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		LocalDate date = LocalDate.now();
		String d = date.format(DateTimeFormatter.ofPattern("YYYY년 MM월 dd일"));
		
		String name = request.getParameter("name");
		String op = request.getParameter("op");
		
		out.print("<h2>"+ name + " 님이 " + d + "에 남긴 글입니다</h2>"); out.print("<hr>");
		

		out.print("<h1> 내용 : " + op + "</h1>");
		out.print("<a href='/edu/htmlexam/visitorForm.html'>입력화면으로</a>");
		
		out.close();
	}

}
