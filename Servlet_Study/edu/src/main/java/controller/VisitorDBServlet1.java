package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/visitortest")
public class VisitorDBServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		String url = "jdbc:mysql://localhost:3306/jdbcdb?characterEncoding=UTF-8&serverTimezone=UTC";
		String user = "root";
		String passwd = "1234";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (Exception cnfe) {
			System.out.println("드라이버 오류 발생" + cnfe.getMessage());
			out.println("<h2>오류발생</h2>");
			out.close();
			return;
		} try (Connection conn = DriverManager.getConnection(url, user, passwd);  
				//트라이 괄호 안에서 변수 선언중. 
				//closerble이라는 인터페이스를 추가상속받는 클래스의 객체만 가능. 변수선언도 여기서 해야함. 미리해놓고 대입 ㄴㄴ
					Statement stmt = conn.createStatement();     //이렇게 하면 나중에 클로즈 안해도 됨..           try catch with resource 구문이라고 함. 
					ResultSet rs = stmt.executeQuery("select id, name, date_format(writedate, '%Y년%m월%d일')writedate, memo from visitor order by writedate desc");){
				out.println("<h1>방명록 리스트</h1><hr>");
				out.println("<table border = '1'>");
				while(rs.next()) {
						out.println("<tr>");
						out.println("<td>" + rs.getString("id") + "</td>");
						out.println("<td>" + rs.getString("name") + "</td>");
						out.println("<td>" + rs.getString("writedate") + "</td>");
						out.println("<td>" + rs.getString("memo") + "</td>");
						out.println("</tr>");
					}
					out.println("</table>");
				} catch (SQLException e) {
					out.println("<h2>sqlexception오류발생</h2>");
					e.printStackTrace();
				}
		out.close();
		
	}
}