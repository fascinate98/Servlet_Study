package base;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/reservation")
public class ReservationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		request.setCharacterEncoding("UTF-8");
		
		String name = request.getParameter("name");
		String sel = request.getParameter("sel");
		String[] req = request.getParameterValues("req");
		String date = request.getParameter("date");
		
		String from = date;
		SimpleDateFormat transFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date to;
		try {
			to = transFormat.parse(from);
			String datePattern = "yyyy년 MM월 dd일";
			SimpleDateFormat format = new SimpleDateFormat(datePattern);
			date = format.format(to);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		out.print("<h2>"+ name +"님의 예약 내용</h2>");
		out.print("<hr>");
		out.print("<ul>");
		out.print("<li>휴양림 : "+sel + "</li>");
		out.print("<li>추가 요청 사항 : ");
		for(int i=0; i < req.length; i++) {
			if(i == req.length - 1) {
				out.print(req[i] );
			}else {
				out.print(req[i] + ", ");
			}
		}
		
		out.print("</li>");
		out.print("<li>예약날짜 : " + date );
		out.print("</ul>");
		
		out.close();
	}
}



