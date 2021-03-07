package com.shurona.showtem.board.impl;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.shurona.showtem.board.BoardVO;
import com.shurona.showtem.board.GroupVO;

@Service
public class BoardService {

	@Inject
	private BoardDAO dao;
	
	public List<BoardVO> list() throws Exception{
		return dao.list();
	}
	
	public int count() throws Exception{
		return dao.count();
	}
	public List<BoardVO> listPage(int displayPost, int postNum) throws Exception{
		return dao.listPage(displayPost, postNum);
	}
	
	public List<BoardVO> listPageSearch(int displayPost, int postNum, String beltnum, String swordNum,
			String recurveNum, String chainNum, String largeNum, String tearNum, String glovesNum,
			String cloakNum, String spatulaNum
			) throws Exception{
		return dao.listPageSearch(displayPost, postNum, beltnum, swordNum, recurveNum, chainNum, largeNum
				, tearNum, glovesNum, cloakNum, spatulaNum);
	}
	
	public int searchCount(String beltnum, String swordNum,
			String recurveNum, String chainNum, String largeNum, String tearNum, String glovesNum,
			String cloakNum, String spatulaNum) throws Exception{
		return dao.searchCount(beltnum, swordNum, recurveNum, chainNum, largeNum
				, tearNum, glovesNum, cloakNum, spatulaNum);
	}
	
	public List<GroupVO> groupSearch(String beltnum, String swordNum,
			String recurveNum, String chainNum, String largeNum, String tearNum, String glovesNum,
			String cloakNum, String spatulaNum) throws Exception{
		return dao.groupSearch(beltnum, swordNum, recurveNum, chainNum, largeNum, tearNum, glovesNum, cloakNum, spatulaNum);
	}
}
