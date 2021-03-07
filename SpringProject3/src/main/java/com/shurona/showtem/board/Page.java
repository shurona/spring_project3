package com.shurona.showtem.board;

public class Page {
	
	// 현재 페이지 번호
	private int num;
	
	// 게시물 총 갯수
	private int count;
	
	// 한 페이지에 출력할 게시물 갯수
	private int postNum = 10;
	
	// 하단 페이징 번호 ([ 게시물 총 갯수 ÷ 한 페이지에 출력할 갯수 ]의 올림)
	private int pageNum;
	
	// 출력할 게시물
	private int displayPost;
	
	// 한번에 표시할 페이징 번호의 갯수
	private int pageNumCnt = 10;
	
	// 표시되는 페이지 번호 중 마지막 번호
	private int endPageNum;
	
	// 표시되는 페이지 번호 중 첫번째 번호
	private int startPageNum;
	
	// 다음/이전 표시 여부
	private boolean prev;
	private boolean next;
	
	private String belt;
	private String sword;
	private String recurve;
	private String spatula;
	private String chain;
	private String large;
	private String tear;
	private String gloves;
	private String cloak;
	
	private String returnvalue;
	
	public void setNum(int num) {
		this.num = num;
	}
	
	public void setCount(int count) {
		this.count = count;
		
		dataCalc();
	}
	
	public int getCount() {
		return count;
	}
	
	public int getPostNum() {
		return postNum;
	}
	
	public int getPageNum() {
		return pageNum;
	}
	
	public int getDisplayPost() {
		return displayPost;
	}
	
	public int getPageNumCnt() {
		return pageNumCnt;
	}
	
	public int getEndPageNum() {
		return endPageNum;
	}
	
	public int getStartPageNum() {
		return startPageNum;
	}
	
	public boolean getPrev() {
		return prev;
	}	
	
	public boolean getNext() {
		return next;
	}
		
	private void dataCalc() {
		
		// 마지막 번호
		endPageNum = (int)(Math.ceil((double)num / (double)pageNumCnt) * pageNumCnt);
		
		// 시작 번호
		startPageNum = endPageNum - (pageNumCnt - 1);
		
		// 마지막 번호 재계산
		int endPageNum_tmp = (int)(Math.ceil((double)count / (double)pageNumCnt));
		
		if(endPageNum > endPageNum_tmp) {
			endPageNum = endPageNum_tmp;
		}
		
		prev = startPageNum == 1 ? false : true;
		next = endPageNum * pageNumCnt >= count ? false : true;
		
		displayPost = (num - 1) * postNum;
		
	}
	
	public String getSearchCondition() {
		returnvalue = "";
		if (!belt.equals("0")){
			returnvalue = returnvalue+"&belt="+belt;
		} 
		if (!sword.equals("0")){
			returnvalue = returnvalue+"&sword="+sword;
		} 
		if (!recurve.equals("0")){
			returnvalue = returnvalue+"&recurve="+recurve;
		}
		if (!spatula.equals("0")) {
			returnvalue = returnvalue+"&spatula="+spatula;
		}
		if (!chain.equals("0")) {
			returnvalue = returnvalue+"&chain="+chain;
		}
		if (!large.equals("0")) {
			returnvalue = returnvalue+"&large="+large;
		}
		if (!tear.equals("0")) {
			returnvalue = returnvalue+"&tear="+tear;
		}
		if (!gloves.equals("0")) {
			returnvalue = returnvalue+"&gloves="+gloves;
		}
		if (!cloak.equals("0")) {
			returnvalue = returnvalue+"&cloak="+cloak;
		}

		return returnvalue;

	}

	public String getBelt() {
		return belt;
	}

	public void setBelt(String belt) {
		this.belt = belt;
	}

	public String getSword() {
		return sword;
	}

	public void setSword(String sword) {
		this.sword = sword;
	}

	public String getRecurve() {
		return recurve;
	}

	public void setRecurve(String recurve) {
		this.recurve = recurve;
	}

	public String getSpatula() {
		return spatula;
	}

	public void setSpatula(String spatula) {
		this.spatula = spatula;
	}

	public String getChain() {
		return chain;
	}

	public void setChain(String chain) {
		this.chain = chain;
	}

	public String getLarge() {
		return large;
	}

	public void setLarge(String large) {
		this.large = large;
	}

	public String getTear() {
		return tear;
	}

	public void setTear(String tear) {
		this.tear = tear;
	}

	public String getGloves() {
		return gloves;
	}

	public void setGloves(String gloves) {
		this.gloves = gloves;
	}

	public String getCloak() {
		return cloak;
	}

	public void setCloak(String cloak) {
		this.cloak = cloak;
	}
	
	
}