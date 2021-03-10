package com.shurona.showtem.board.impl;

import java.util.HashMap;
import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.shurona.showtem.board.BoardVO;
import com.shurona.showtem.board.GroupVO;
import com.shurona.showtem.board.SebuVO;

@Repository
public class BoardDAO {
	
	@Inject
	private SqlSession mybatis;
	
	private static String namespace = "com.shurona.mappers.board";
	
	public List<BoardVO> list() throws Exception{
		return mybatis.selectList(namespace + ".list");
	}
	
	public int count() throws Exception{
		return mybatis.selectOne(namespace + ".count");
	}
	
	public List<BoardVO> listPage(int displayPost, int postNum) throws Exception{
		
		HashMap<String, Integer> data = new HashMap<String, Integer>();
		data.put("displayPost", displayPost);
		data.put("postNum", postNum);
		
		return mybatis.selectList(namespace + ".listPage",data);
	}
	
	public List<BoardVO> listPageSearch(int displayPost, int postNum, String beltnum, String swordNum,
			String recurveNum, String chainNum, String largeNum, String tearNum, String glovesNum,
			String cloakNum, String spatulaNum
			) throws Exception{
		
		HashMap<String, Object>data = new HashMap<String, Object>();
		//페이지 확인
		data.put("displayPost", displayPost);
		data.put("postNum", postNum);
		data.put("swordNum", swordNum);
		data.put("beltNum", beltnum);
		data.put("recurveNum", recurveNum);
		data.put("chainNum", chainNum);
		data.put("largeNum", largeNum);
		data.put("tearNum", tearNum);
		data.put("glovesNum", glovesNum);
		data.put("cloakNum", cloakNum);
		data.put("spatulaNum", spatulaNum);		
			
		return mybatis.selectList(namespace + ".listPageSearch", data);
	}
	
	public int searchCount(String beltnum, String swordNum,
			String recurveNum, String chainNum, String largeNum, String tearNum, String glovesNum,
			String cloakNum, String spatulaNum) throws Exception{
		
		HashMap<String, String> data = new HashMap<String, String>();
		data.put("beltNum", beltnum);
		data.put("swordNum", swordNum);
		data.put("beltNum", beltnum);
		data.put("recurveNum", recurveNum);
		data.put("chainNum", chainNum);
		data.put("largeNum", largeNum);
		data.put("tearNum", tearNum);
		data.put("glovesNum", glovesNum);
		data.put("cloakNum", cloakNum);
		data.put("spatulaNum", spatulaNum);		
		
		return mybatis.selectOne(namespace + ".searchCount",data);
	}
	
	public List<GroupVO> groupSearch(String beltnum, String swordNum,
			String recurveNum, String chainNum, String largeNum, String tearNum, String glovesNum,
			String cloakNum, String spatulaNum) throws Exception{
			HashMap<String, String> data = new HashMap<String, String>();
			data.put("beltNum", beltnum);
			data.put("swordNum", swordNum);
			data.put("beltNum", beltnum);
			data.put("recurveNum", recurveNum);
			data.put("chainNum", chainNum);
			data.put("largeNum", largeNum);
			data.put("tearNum", tearNum);
			data.put("glovesNum", glovesNum);
			data.put("cloakNum", cloakNum);
			data.put("spatulaNum", spatulaNum);		
				
		return mybatis.selectList(namespace+".groupSearch",data);
	}
	
	public List<GroupVO> simGroupSearch(String beltnum, String swordNum,
			String recurveNum, String chainNum, String largeNum, String tearNum, String glovesNum,
			String cloakNum, String spatulaNum) throws Exception{
		
			HashMap<String, String> data = new HashMap<String, String>();
			data.put("beltNum", beltnum);
			data.put("swordNum", swordNum);
			data.put("beltNum", beltnum);
			data.put("recurveNum", recurveNum);
			data.put("chainNum", chainNum);
			data.put("largeNum", largeNum);
			data.put("tearNum", tearNum);
			data.put("glovesNum", glovesNum);
			data.put("cloakNum", cloakNum);
			data.put("spatulaNum", spatulaNum);	
		return mybatis.selectList(namespace +".simGroupSearch", data);
	}
	
	public List<BoardVO> simJohab(String beltnum, String swordNum,
			String recurveNum, String chainNum, String largeNum, String tearNum, String glovesNum,
			String cloakNum, String spatulaNum, String johab) throws Exception{
		
			HashMap<String, String> data = new HashMap<String, String>();
			data.put("beltNum", beltnum);
			data.put("swordNum", swordNum);
			data.put("beltNum", beltnum);
			data.put("recurveNum", recurveNum);
			data.put("chainNum", chainNum);
			data.put("largeNum", largeNum);
			data.put("tearNum", tearNum);
			data.put("glovesNum", glovesNum);
			data.put("cloakNum", cloakNum);
			data.put("spatulaNum", spatulaNum);	
			data.put("johab", johab);
			
			return mybatis.selectList(namespace +".simJohab", data);
		
	}
	
	public SebuVO sebuJohab(int id) throws Exception {
		
		
		HashMap<String, Object> data = new HashMap<String, Object>();
		data.put("id", id);
		
		return mybatis.selectOne(namespace+".sebuJohab", data);
	}
}
