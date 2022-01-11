package base;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/basket")
public class baseBasketServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.print("<h2>선택한 상품 : "+request.getParameter("pid")+"</h2>");
		out.print("<img src = \"/edu/images/"+request.getParameter("fname") +".jpg\"> <br>");
		
		out.print("<a href='/edu/htmlexam/productlog.html'>"
				+ "상품 선택 화면</a>");
		
		
		out.close();
	}
}



