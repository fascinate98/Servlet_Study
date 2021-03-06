package model.dao;

import java.util.ArrayList;

import model.vo.ContentVO;

public interface Content {
	public ArrayList<ContentVO> listAll();
	public boolean insert(ContentVO vo);
	public ArrayList<ContentVO> searchCom(String keyword);
	public ArrayList<ContentVO> searchTitle(String keyword);
	public ArrayList<ContentVO> searchPac(String keyword);
	public ContentVO listOne(int writer);
	public boolean delete(int writer);
	public boolean update(ContentVO vo);
	public boolean updateCnt(int idnum);
	public ArrayList<ContentVO> getmylist(int writer);
	public boolean updateRec(int idnum);
}
