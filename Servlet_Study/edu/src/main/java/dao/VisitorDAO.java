package dao;

import vo.VisitorVO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VisitorDAO {
	//create read update delete  //visitorDAO data access object 라는 명칭 자주 씀. 값 보관 : VO   
	public boolean c(VisitorVO vo) {
		boolean result = false;
		Connection conn = MySQL.connect();
		try (PreparedStatement pstmt = conn
				.prepareStatement("insert into visitor (name, writedate, memo) values (?, now(), ?)")) {
			pstmt.setString(1, vo.getName());
			pstmt.setString(2, vo.getMemo());
			pstmt.executeUpdate();
			result = true;
		} catch (SQLException se) {
			System.out.println(se.getMessage());
		}
		MySQL.close(conn);
		return result;
	}
	
	//read
	public List<VisitorVO> r() {
		Connection conn = MySQL.connect();
		List<VisitorVO> vlist = null;
		try (Statement stmt = conn.createStatement()) {
			ResultSet rs = stmt.executeQuery(
					"select id, name, date_format(writedate, '%Y년 %m월 %d일') writedate, memo from visitor order by writedate desc");
			vlist = new ArrayList<VisitorVO>();
			VisitorVO vo =  null;
			while (rs.next()) {
				vo = new VisitorVO();
				vo.setId(rs.getInt("id"));
				vo.setName(rs.getString("name"));
				vo.setWriteDate(rs.getString("writedate"));
				vo.setMemo(rs.getString("memo"));
				vlist.add(vo);
			}
		} catch (SQLException se) {
			System.out.println(se.getMessage());
		}
		MySQL.close(conn);
		return vlist;
	}

	// id로 검색하기
	public VisitorVO rOne(int id) {
		Connection conn = MySQL.connect();
		VisitorVO vo = null;
		try (Statement stmt = conn.createStatement()) {
			ResultSet rs = stmt.executeQuery(
					"select id, name, date_format(writedate, '%Y년 %m월 %d일') writedate, memo from visitor where id = " + id);
			if(rs.next()) {
				vo = new VisitorVO();
				vo.setId(rs.getInt("id"));
				vo.setName(rs.getString("name"));
				vo.setWriteDate(rs.getString("writedate"));
				vo.setMemo(rs.getString("memo"));
			}
		} catch (SQLException se) {
			System.out.println(se.getMessage());
		}
		MySQL.close(conn);
		return vo;
	}	
	
	
	
	//업데이트
	public boolean u(VisitorVO vo) {
		boolean result = false;
		Connection conn = MySQL.connect();
		try (PreparedStatement pstmt = conn.prepareStatement("update visitor set name = ?,  memo = ? where id = ?")) {
			pstmt.setString(1, vo.getName());
			pstmt.setString(2, vo.getMemo());
			pstmt.setInt(3, vo.getId());
			pstmt.executeUpdate();		
			result = true;
		} catch (SQLException se) {
			System.out.println(se.getMessage());
		}
		MySQL.close(conn);
		return result;
	}

	
	//delete
	public boolean d(int id) {
		boolean result = false;
		Connection conn = MySQL.connect();
		try (PreparedStatement pstmt = conn.prepareStatement("delete from visitor where id = ?")) {
			pstmt.setInt(1, id);
			pstmt.executeUpdate();
			result = true;
		} catch (SQLException se) {
			System.out.println(se.getMessage());
		}
		MySQL.close(conn);
		return result;
	}
}
