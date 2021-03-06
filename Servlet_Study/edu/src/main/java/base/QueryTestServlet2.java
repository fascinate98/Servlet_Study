package base;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/querytest2")
public class QueryTestServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("name");
		String[] sel = request.getParameterValues("sel");
		String[] req = request.getParameterValues("req");
		String date = request.getParameter("date");
		
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		out.print("<h3>이름 : "+name+"</h3>");
		
		if(sel == null)
			out.print("<h3>선택한 과목명이 없네요!!</h3>");
		else {
			out.print("<h3>선택한 과목들</h3>");
			for(String s : sel)
				out.print("<h4>"+s+", </h4>");
		}
		out.close();
	}
}




