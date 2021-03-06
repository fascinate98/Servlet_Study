package model.dao;

import java.util.ArrayList;
import java.util.List;

import model.vo.MemberVO;

public interface Member{
	public ArrayList<MemberVO> listAll();
	public boolean register(MemberVO vo);
	public MemberVO login(String id, String pw);
	public boolean logout(String id, String pw);
	public List<MemberVO> search(String keyword);
	public boolean delete(int eNo);
	public boolean update(MemberVO vo);
	
}