package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.dao.Member;
import model.dao.MySQL;
import model.vo.*;

public class MemberDAO implements Member{
	
	
	public ArrayList<MemberVO> listAll(){
		ArrayList<MemberVO> list = new ArrayList<>();
		Connection conn = MySQL.connect();
		try(Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery("SELECT *\r\n"
						+ "INTO OUTFILE \"C:/ProgramData/MySQL/MySQL Server 8.0/Uploads/hello.xlsx\"\r\n"
						+ "FIELDS TERMINATED BY ',' ENCLOSED BY \"\" ESCAPED BY '\\\\' LINES TERMINATED BY \"\\n\"\r\n"
						+ "FROM members;");){	
			MemberVO vo;
			while(rs.next()) {
				vo = new MemberVO();
				vo.setMem_idnum(rs.getInt(1));
				vo.setMem_id(rs.getString(2));
				vo.setMem_password(rs.getString(3));
				vo.setMem_name(rs.getString(4));
				vo.setMem_email(rs.getString(5));
				vo.setMem_isadmin(rs.getInt(6));
				vo.setMem_company(rs.getString(7));
				list.add(vo);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		MySQL.close(conn);
		return list;
	}
	
	
	

	@Override
	public boolean register(MemberVO vo) {
		// TODO Auto-generated method stub
		boolean result = true;
		Connection conn = MySQL.connect();

		try (PreparedStatement pstmt = conn.prepareStatement("insert into members (id, password, name, email, isadmin, company) "
				+ "values(?, ?, ?, ?, ?, ?)");){
			pstmt.setString(1, vo.getMem_id());
			pstmt.setString(2, vo.getMem_password());
			pstmt.setString(3, vo.getMem_name());
			pstmt.setString(4, vo.getMem_email());
			pstmt.setInt(5, vo.getMem_isadmin());
			pstmt.setString(6, vo.getMem_company());
			pstmt.executeUpdate();			
		}catch(SQLException e){
			result = false;
			e.printStackTrace();
		}
		MySQL.close(conn);
		return result;
	}

	
//	public boolean insert(MeetingVO vo) {
//		boolean result = true;
//		Connection conn = MySQL.connect();
//		try (PreparedStatement pstmt = conn.prepareStatement("insert into meeting (name, title, meetingdate) values(? ,?, ?)");){
//			System.out.println(vo.getMeetingDate());
//			pstmt.setString(1, vo.getName());
//			pstmt.setString(2, vo.getTitle());
//			pstmt.setString(3, vo.getMeetingDate());
//			pstmt.executeUpdate();			
//		}catch(SQLException e){
//			result = false;
//			e.printStackTrace();
//		}
//		MySQL.close(conn);
//		return result;
//	}
		
	@Override
	public MemberVO login(String id, String pw) {
		// TODO Auto-generated method stub
		 MemberVO vo = new MemberVO();
		
		Connection conn = MySQL.connect();
		try(Statement stmt = conn.createStatement();
				
				ResultSet rs = stmt.executeQuery("select * from members where id = '" + id + "' and password = '" + pw + "'");){	
				System.out.println("select * from members where id = '" + id + "' and password = '" + pw + "'");

			while(rs.next()) {
				vo.setMem_idnum(rs.getInt(1));
				vo.setMem_id(rs.getString(2));
				vo.setMem_password(rs.getString(3));
				vo.setMem_name(rs.getString(4));
				vo.setMem_email(rs.getString(5));
				vo.setMem_isadmin(rs.getInt(6));
				vo.setMem_company(rs.getString(7));
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		MySQL.close(conn);
		
		return vo;
	}

	@Override
	public boolean logout(String id, String pw) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<MemberVO> search(String keyword) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(int eNo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(MemberVO vo) {
		// TODO Auto-generated method stub
		return false;
	}
	
//	public ArrayList<MeetingVO> search(String keyword){
//		ArrayList<MeetingVO> list = new ArrayList<>();
//		Connection conn = MySQL.connect();
//		try (Statement stmt = conn.createStatement();
//				ResultSet rs = stmt.executeQuery("select id, name, date_format(meetingdate, '%Y년 %m월 %d일 %H시 %i분'), "
//						+ "title from meeting where title like '%"+keyword + "%'");){	
//			MeetingVO vo;
//			while(rs.next()) {
//				vo = new MeetingVO();
//				vo.setId(rs.getInt(1));
//				vo.setName(rs.getString(2));
//				vo.setMeetingDate(rs.getString(3));
//				vo.setTitle(rs.getString(4));
//				list.add(vo);
//			}
//		}catch(SQLException e) {
//			e.printStackTrace();
//		}
//		MySQL.close(conn);
//		return list;
//	}
//	
//	public boolean insert(MeetingVO vo) {
//		boolean result = true;
//		Connection conn = MySQL.connect();
//		try (PreparedStatement pstmt = conn.prepareStatement("insert into meeting (name, title, meetingdate) values(? ,?, ?)");){
//			System.out.println(vo.getMeetingDate());
//			pstmt.setString(1, vo.getName());
//			pstmt.setString(2, vo.getTitle());
//			pstmt.setString(3, vo.getMeetingDate());
//			pstmt.executeUpdate();			
//		}catch(SQLException e){
//			result = false;
//			e.printStackTrace();
//		}
//		MySQL.close(conn);
//		return result;
//	}
//	
//	public boolean delete(int id) {
//		boolean result = true;
//		Connection conn = MySQL.connect();
//		try (PreparedStatement pstmt = conn.prepareStatement("delete from meeting where id = ?");){
//			pstmt.setInt(1,id);
//			int deleteNum = pstmt.executeUpdate();
//			if(deleteNum != 1)
//				result = false;
//		}catch(SQLException e){
//			result = false;
//			e.printStackTrace();
//		}
//		MySQL.close(conn);
//		return result;
//	}
//	public boolean update(MeetingVO vo) {
//		boolean result = true;
//		Connection conn = MySQL.connect();
//		try (PreparedStatement pstmt = conn.prepareStatement(
//						"update meeting set " + 
//						"name = ?, " + 
//						"title = ?, " + 
//						"meetingdate = ? " + 
//						"where id = ?");){
//			pstmt.setString(1, vo.getName());
//			pstmt.setString(2, vo.getTitle());
//			pstmt.setString(3, vo.getMeetingDate());
//			pstmt.setInt(4, vo.getId());
//			pstmt.executeUpdate();			
//		}catch(SQLException e){
//			result = false;
//			e.printStackTrace();
//		}
//		MySQL.close(conn);
//		return result;
//	}
	
}
