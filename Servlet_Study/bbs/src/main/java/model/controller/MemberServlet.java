package model.controller;
import java.awt.FileDialog;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.JFrame;

import model.dao.Member;
import model.dao.MemberDAO;
import model.vo.MemberVO;


@WebServlet("/memberset")
public class MemberServlet  extends HttpServlet {
	static FileDialog fd;
	 static JFrame frame;
	 
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		String action = request.getParameter("action");
		HttpSession session = request.getSession(); 
		String old_url = request.getHeader("referer");
		
		
		Member dao = new MemberDAO();
		
		//로그아웃
		 if(action.equals("logout")) {
			 MemberVO vo = (MemberVO)session.getAttribute("logininfo");
			 if(vo != null) {
				 session.removeAttribute("logininfo");

					request.getRequestDispatcher("/jspsrc/loginView.jsp").forward(request, response);
					//out.print("<script>alert('로그 아웃!'); window.location = 'http://localhost:8080/bbs/jspsrc/loginView.jsp';</script>");
			 } else {
				 out.print("<script>\r\nalert(\"로그인 상태가 아님!\");\r\n window.location = '\" + old_url +\"</script>");
			 }
		}
		//으애앵 
		 else if(action.equals("getallmemlist")) {
			 ArrayList<MemberVO> vo = (ArrayList<MemberVO>)session.getAttribute("allmemlist");
			 ArrayList<MemberVO> mvo = dao.listAll();
			 session.setAttribute("allmemlist", mvo);
//				request.getRequestDispatcher("/jspsrc/loginView.jsp").forward(request, response);
			out.print("<script>alert('파일 내보내기 완료!');</script>");

			  
			  out.print("<script> window.location = '" + old_url +"';</script>");
			  
			  fd = new FileDialog(frame, "파일 열기",0);
			  fd.setDirectory("C:\\ProgramData\\MySQL\\MySQL Server 8.0\\Uploads"); //초기 디렉토리 경로를 C:로 잡아준다.
			  fd.setVisible(true);
			  
			  String fdirectory = fd.getDirectory();  //선택된 파일의 경로를 갖고온다. 
		}
		 
		out.close();
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		request.setCharacterEncoding("UTF-8");
		String action = request.getParameter("action");
		HttpSession session = request.getSession(); 
		String old_url = request.getHeader("referer");
		
		Member dao = new MemberDAO();

		//로그인
		 if(action.equals("login")) {
			String memid = request.getParameter("memid");
			String mempw = request.getParameter("mempw");
			
			MemberVO vo = dao.login(memid, mempw);
			if (vo.getMem_name() != null) {
				//로그인성공
				out.print("<script>alert('로그인 성공!'); </script>");
				request.setAttribute("login_result", vo);
				request.setAttribute("list", dao.listAll());
				session.setAttribute("logininfo", vo);
				
				request.getRequestDispatcher("/jspsrc/homeView.jsp").forward(request, response);
			
			} else {
				//로그인실패
				out.print("<script>alert('로그인 실패!'); window.location = '" + old_url +"';</script>");
			}
			out.close();
			
		} 
		//회원가입
		else if(action.equals("register")) {
			
			String memid = request.getParameter("memid");
			String mempw = request.getParameter("mempw");
			String memname = request.getParameter("memname");
			String mememail = request.getParameter("mememail");
			String memcompany = request.getParameter("memcompany");

			MemberVO vo = new MemberVO(memid, mempw, memname, mememail, memcompany, false);
			
			boolean b = dao.register(vo);
			if (b) {
				//회원가입성공
				request.setAttribute("msg", "joinsuccess");
				
				
			} else {
				//로그인실패
				request.setAttribute("msg", "joinfail");
				out.print("<script>alert('회원가입 실패!'); window.location = '" + old_url +"';</script>");
			}
			request.getRequestDispatcher("/jspsrc/loginView.jsp").forward(request, response);
			out.close();
		}
//		
//		//로그아웃
//		else if(action.equals("logout")) {
//			 String membername = (String)session.getAttribute("member_id");
//			 if(membername != null) {
//				 session.removeAttribute("member_id");
//				 session.removeAttribute("member_passwd");
//				 out.print("<script>\r\nalert(\"로그 아웃!\");\r\n</script>");
//			 } else {
//				 out.print("<script>\r\nalert(\"로그인 상태가 아님!\");\r\n</script>");
//			 }
//		}

	
	}
}


