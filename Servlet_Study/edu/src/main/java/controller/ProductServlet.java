package controller;
import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import vo.ProductVO;

@WebServlet("/product")
public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		response.setContentType("text/html; charset=UTF-8");
		String pid = request.getParameter("pid");
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();   
		
		
		if(session.getAttribute("product") == null) {
			ProductVO vo = new ProductVO();
			vo = addProd(vo, pid);
			session.setAttribute("product", vo );
		} else {
			ProductVO vo = (ProductVO)session.getAttribute("product");
			vo = addProd(vo, pid);
			session.setAttribute("product", vo );
		}
		
		request.getRequestDispatcher("/jspsrc/productViewEL.jsp").
		              forward(request, response);
	}
	
	private ProductVO addProd(ProductVO vo, String pid) {
		if(pid.equals("p001"))
			vo.setApple(1);
		else if(pid.equals("p002"))
			vo.setBanana(1);
		else if(pid.equals("p003"))
			vo.setHalabong(1);
		
		return vo;
	}
}
