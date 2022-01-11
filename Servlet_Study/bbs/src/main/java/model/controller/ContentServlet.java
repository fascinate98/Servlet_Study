 package model.controller;

import java.io.IOException;
import java.util.Objects;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.dao.Content;
import model.dao.ContentDAO;
import java.util.ArrayList;
import model.vo.*;


@WebServlet("/content")
public class ContentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			response.setContentType("text/html; charset=UTF-8");
			PrintWriter out = response.getWriter();
			String action = request.getParameter("action");
			HttpSession session = request.getSession(); 
			String old_url = request.getHeader("referer");
			String keyword = request.getParameter("keyword");
			String sername = request.getParameter("sername");
		
			MemberVO mvo=  new MemberVO();
			mvo = (MemberVO)session.getAttribute("logininfo");
			Content dao = new ContentDAO();
			
			//read
			if(action!=null && action.equals("read")) {
				ArrayList<ContentVO> volist = (ArrayList<ContentVO>)session.getAttribute("forumlist");
				int num = Integer.parseInt(request.getParameter("num"));
				dao.updateCnt(Integer.parseInt(request.getParameter("num")));
				if (volist != null) {
					//읽기성공
					for(int i = 0; i < volist.size(); i++)
					{
						if(volist.get(i).getNum() == num)
						{
							session.setAttribute("readone", volist.get(i));
						}
					}
					
					request.getRequestDispatcher("/jspsrc/readView.jsp").forward(request, response);
				} else {
					//읽기실패
					out.print("<script>alert('읽기 실패!'); window.location = '" + old_url +"';</script>");
				}
				out.close();
			}
			//get all list
			else if(action!=null && action.equals("getalllist")) {
				ArrayList<ContentVO> list = dao.listAll();
				
				session.setAttribute("forumlist", list);
				if(session.getAttribute("logininfo") == null) {
					request.getRequestDispatcher("/jspsrc/forumView.jsp").forward(request, response);
				}
				else {
					request.getRequestDispatcher("/jspsrc/forumViewlogin.jsp").forward(request, response);
				}
			}
			
			//get my list
			else if(action!=null && action.equals("getmylist")) {

				if(session.getAttribute("logininfo") == null) {
					request.getRequestDispatcher("/jspsrc/loginView.jsp").forward(request, response);
				}
				else {
					ArrayList<ContentVO> list = dao.getmylist(mvo.getMem_idnum());		
					session.setAttribute("forumlist", list);
					request.getRequestDispatcher("/jspsrc/myPageView.jsp").forward(request, response);
				}
			}
			
			// 검색 3개
			// search com 회사명 검색

			else if (sername != null && sername.equals("회사명")) {

				ArrayList<ContentVO> clist = dao.searchCom(keyword);
				
				if(!clist.isEmpty()) {
					session.setAttribute("forumlist", clist);
					if (session.getAttribute("logininfo") == null) {
						request.getRequestDispatcher("/jspsrc/forumView.jsp").forward(request, response);
					} else {
						request.getRequestDispatcher("/jspsrc/forumViewlogin.jsp").forward(request, response);
					
					}
				}else {
					out.print("<script>alert('검색 실패!'); window.location = '" + old_url +"';</script>");
				}

					
			} 
			
			// search title 한줄평 검색
			else if (sername != null && sername.equals("한줄평")) {
			
				ArrayList<ContentVO> tlist = dao.searchTitle(keyword);
					
				if(!tlist.isEmpty()) {
					session.setAttribute("forumlist", tlist);
					if (session.getAttribute("logininfo") == null) {
						request.getRequestDispatcher("/jspsrc/forumView.jsp").forward(request, response);
					} else {
						request.getRequestDispatcher("/jspsrc/forumViewlogin.jsp").forward(request, response);
					
					}
				}else {
					out.print("<script>alert('검색 실패!'); window.location = '" + old_url +"';</script>");
				}
			}
			
			// search advan, disadvan 장단점 검색

			else if (sername != null && sername.equals("장단점")) {
				
				ArrayList<ContentVO> adlist = dao.searchPac(keyword);

				if(!adlist.isEmpty()) { // Pros and Cons
					session.setAttribute("forumlist", adlist);
					if (session.getAttribute("logininfo") == null) {
						request.getRequestDispatcher("/jspsrc/forumView.jsp").forward(request, response);
					} else {
						request.getRequestDispatcher("/jspsrc/forumViewlogin.jsp").forward(request, response);
					

					}
					
				}else {
					out.print("<script>alert('검색 실패!'); window.location = '" + old_url +"';</script>");
				}
			}
			
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		HttpSession session = request.getSession();  
		String old_url = request.getHeader("referer");
		//String rec = request.getParameter("rec");
		String action = request.getParameter("action");
		String title = request.getParameter("title");
		String advan = request.getParameter("advan");
		String disadvan = request.getParameter("disadvan");

		PrintWriter out = response.getWriter();
		ArrayList<ContentVO> list = new ArrayList<>();
		boolean result = false;

		
		Content dao = new ContentDAO();
		ContentVO cvo = new ContentVO();
		MemberVO mvo=  (MemberVO)session.getAttribute("logininfo");

		
		cvo.setCon_writer(mvo.getMem_idnum());
		cvo.setCon_title(title);
		cvo.setCon_advan(advan);
		cvo.setCon_disadvan(disadvan);
		
		cvo.setCon_file("3");
		cvo.setCon_company(mvo.getMem_company());
		
		System.out.println(action);
		
		//write
		if(action.equals("write")) {

			int rate = Integer.parseInt(request.getParameter("rating"));
			cvo.setCon_star(rate);
			//들어감
			result = dao.insert(cvo);
			
			System.out.println(result);
			//안들어감
			if(result) {
				list = dao.listAll();
				
				session.setAttribute("forumlist", list);
				out.print("<script> alert('작성 성공!');   </script>");
				if(session.getAttribute("logininfo") == null) {
					request.getRequestDispatcher("/jspsrc/forumView.jsp").forward(request, response);
				}
				else {
					request.getRequestDispatcher("/jspsrc/forumViewlogin.jsp").forward(request, response);
				}
			}else {
				out.print("<script>alert('작성 실패!'); window.location = '" + old_url +"';</script>");
			}
		}
		
		//update
		else if(action!=null && action.equals("update")) {

			int rate = Integer.parseInt(request.getParameter("rating"));
			cvo.setCon_star(rate);
			
			list = (ArrayList<ContentVO>)session.getAttribute("forumlist");
			cvo.setNum(Integer.parseInt(request.getParameter("idnum")));
			
			result = dao.update(cvo);

			if(result) {
				list = dao.listAll();
				for(ContentVO vo:list) {
					cvo.setNum(vo.getNum());
			
				}
				session.setAttribute("forumlist", list);

				out.print("<script> alert('수정 성공!');   </script>");
				if(session.getAttribute("logininfo") == null) {
					request.getRequestDispatcher("/jspsrc/forumView.jsp").forward(request, response);
				}
				else {
					request.getRequestDispatcher("/jspsrc/forumViewlogin.jsp").forward(request, response);
				}
			}else {
				out.print("<script>alert('수정 실패!'); window.location = '" + old_url +"';</script>");
			}
		}
		
		
		//delete
		else if(action!=null && action.equals("delete")) {

			int rate = Integer.parseInt(request.getParameter("rating"));
			cvo.setCon_star(rate);
			
			boolean b = dao.delete(Integer.parseInt(request.getParameter("idnum")));
			if(b) {
				list = dao.listAll();
				for(ContentVO vo:list) {
					cvo.setNum(vo.getNum());
				}
				session.setAttribute("forumlist", list);

				if(session.getAttribute("logininfo") == null) {
					request.getRequestDispatcher("/jspsrc/forumView.jsp").forward(request, response);
				}
				else {
					request.getRequestDispatcher("/jspsrc/forumViewlogin.jsp").forward(request, response);
				}
			} else {
			//삭제실패
				out.print("<script>alert('삭제 실패!'); window.location = '" + old_url +"';</script>");
			out.close();
			}
		
		}
		
		else if(action!=null && action.equals("goback")) {
			list = dao.listAll();
			session.setAttribute("forumlist", list);
			if(session.getAttribute("logininfo") == null) {
				request.getRequestDispatcher("/jspsrc/forumView.jsp").forward(request, response);
			}
			else {
				request.getRequestDispatcher("/jspsrc/forumViewlogin.jsp").forward(request, response);
			}
		
		}
		
	       if (action!=null && action.equals("recommend")) {
	    	  
	    	  System.out.println("ㅇ런아ㅣ럼ㄴ아ㅣ러마");

	          boolean b = dao.updateRec(Integer.parseInt(request.getParameter("idnum")));
	          if(b) {
	             list = dao.listAll();
	             for(ContentVO vo:list) {
	                cvo.setNum(vo.getNum());
	             }
	             action = "";
	             session.setAttribute("forumlist", list);
	          
	             
	             if(session.getAttribute("logininfo") == null) {
	            	response.sendRedirect("http://192.168.0.12:8080/bbs/content?action=getalllist");
	                //request.getRequestDispatcher("/jspsrc/forumView.jsp").forward(request, response);
	             }
	             else {
		            	response.sendRedirect("http://192.168.0.12:8080/bbs/content?action=getalllist");
	                //request.getRequestDispatcher("/jspsrc/forumViewlogin.jsp").forward(request, response);
	             }
	          } else {
	          //삭제실패
	        	  out.print("<script>alert('추천 실패!'); window.location = '" + old_url +"';</script>");
	          out.close();
	          }
	       }
		
		
		
	}

}
