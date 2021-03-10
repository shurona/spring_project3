<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>근접한 조합을 찾아드립니다.</title>
</head>
<style>
  table {
    width: 100%;
    border: 1px solid #444444;
  }
  th, td {
    border: 1px solid #444444;
  }
 }
</style>
<body>

    
	<a href="/">홈으로 돌아가기</a>
	<p>골라주세요</p>

	<table>
	 <thead>
	  <tr>
	   <th>순위</th>
	   <th>BF 대검</th>
	   <th>자벨</th>
	   <th>곡궁</th>
	   <th>뒤집개</th>
	   <th>철가옷</th>
	   <th>지팡이</th>
	   <th>여눈</th>
	   <th>도적의 장갑</th>
	   <th>음전자 망토</th>
	   <th>검색</th>
	  </tr>
	 </thead>
	 
	 <tbody>
	 	<tr>
			<td></td>
			<td>
			<select name="selectSword">
				<option value="0"<c:if test="${page.getSword() eq 0}">selected</c:if>>0</option>
				<option value="1"<c:if test="${page.getSword() eq 1}">selected</c:if>>1</option>
				<option value="2"<c:if test="${page.getSword() eq 2}">selected</c:if>>2</option>
				<option value="3"<c:if test="${page.getSword() eq 3}">selected</c:if>>3</option>
				<option value="4"<c:if test="${page.getSword() eq 4}">selected</c:if>>4</option>
				<option value="5"<c:if test="${page.getSword() eq 5}">selected</c:if>>5</option>
			</select>
			</td>
			<td>
			<select name = "selectBelt">
				<option value="0"<c:if test="${page.getBelt() eq 0}">selected</c:if>>0</option>
				<option value="1"<c:if test="${page.getBelt() eq 1}">selected</c:if>>1</option>
				<option value="2"<c:if test="${page.getBelt() eq 2}">selected</c:if>>2</option>
				<option value="3"<c:if test="${page.getBelt() eq 3}">selected</c:if>>3</option>
				<option value="4"<c:if test="${page.getBelt() eq 4}">selected</c:if>>4</option>
				<option value="5"<c:if test="${page.getBelt() eq 5}">selected</c:if>>5</option>
			</select>
			</td>
			<td>
			<select name = "selectRecurve">	
				<option value="0"<c:if test="${page.getRecurve() eq 0}">selected</c:if>>0</option>
				<option value="1"<c:if test="${page.getRecurve() eq 1}">selected</c:if>>1</option>
				<option value="2"<c:if test="${page.getRecurve() eq 2}">selected</c:if>>2</option>
				<option value="3"<c:if test="${page.getRecurve() eq 3}">selected</c:if>>3</option>
				<option value="4"<c:if test="${page.getRecurve() eq 4}">selected</c:if>>4</option>
				<option value="5"<c:if test="${page.getRecurve() eq 5}">selected</c:if>>5</option>
			</select>	
			</td>
			<td>
			<select name = "selectSpatula">
				<option value="0"<c:if test="${page.getSpatula() eq 0}">selected</c:if>>0</option>
				<option value="1"<c:if test="${page.getSpatula() eq 1}">selected</c:if>>1</option>
				<option value="2"<c:if test="${page.getSpatula() eq 2}">selected</c:if>>2</option>
				<option value="3"<c:if test="${page.getSpatula() eq 3}">selected</c:if>>3</option>
				<option value="4"<c:if test="${page.getSpatula() eq 4}">selected</c:if>>4</option>
				<option value="5"<c:if test="${page.getSpatula() eq 5}">selected</c:if>>5</option>
			</select>
			</td>
			<td>
			<select name = "selectChain">
				<option value="0"<c:if test="${page.getChain() eq 0}">selected</c:if>>0</option>
				<option value="1"<c:if test="${page.getChain() eq 1}">selected</c:if>>1</option>
				<option value="2"<c:if test="${page.getChain() eq 2}">selected</c:if>>2</option>
				<option value="3"<c:if test="${page.getChain() eq 3}">selected</c:if>>3</option>
				<option value="4"<c:if test="${page.getChain() eq 4}">selected</c:if>>4</option>
				<option value="5"<c:if test="${page.getChain() eq 5}">selected</c:if>>5</option>
			</select>
			</td>
			<td>
			<select name = "selectLarge">
				<option value="0"<c:if test="${page.getLarge() eq 0}">selected</c:if>>0</option>
				<option value="1"<c:if test="${page.getLarge() eq 1}">selected</c:if>>1</option>
				<option value="2"<c:if test="${page.getLarge() eq 2}">selected</c:if>>2</option>
				<option value="3"<c:if test="${page.getLarge() eq 3}">selected</c:if>>3</option>
				<option value="4"<c:if test="${page.getLarge() eq 4}">selected</c:if>>4</option>
				<option value="5"<c:if test="${page.getLarge() eq 5}">selected</c:if>>5</option>
			</select>
			</td>
			<td>
			<select name = "selectTear">
				<option value="0"<c:if test="${page.getTear() eq 0}">selected</c:if>>0</option>
				<option value="1"<c:if test="${page.getTear() eq 1}">selected</c:if>>1</option>
				<option value="2"<c:if test="${page.getTear() eq 2}">selected</c:if>>2</option>
				<option value="3"<c:if test="${page.getTear() eq 3}">selected</c:if>>3</option>
				<option value="4"<c:if test="${page.getTear() eq 4}">selected</c:if>>4</option>
				<option value="5"<c:if test="${page.getTear() eq 5}">selected</c:if>>5</option>
			</select>
			</td>
			<td>
			<select name = "selectGloves">
				<option value="0"<c:if test="${page.getGloves() eq 0}">selected</c:if>>0</option>
				<option value="1"<c:if test="${page.getGloves() eq 1}">selected</c:if>>1</option>
				<option value="2"<c:if test="${page.getGloves() eq 2}">selected</c:if>>2</option>
				<option value="3"<c:if test="${page.getGloves() eq 3}">selected</c:if>>3</option>
				<option value="4"<c:if test="${page.getGloves() eq 4}">selected</c:if>>4</option>
				<option value="5"<c:if test="${page.getGloves() eq 5}">selected</c:if>>5</option>
			</select>
			</td>
			<td>
			<select name = "selectCloak">
				<option value="0"<c:if test="${page.getCloak() eq 0}">selected</c:if>>0</option>
				<option value="1"<c:if test="${page.getCloak() eq 1}">selected</c:if>>1</option>
				<option value="2"<c:if test="${page.getCloak() eq 2}">selected</c:if>>2</option>
				<option value="3"<c:if test="${page.getCloak() eq 3}">selected</c:if>>3</option>
				<option value="4"<c:if test="${page.getCloak() eq 4}">selected</c:if>>4</option>
				<option value="5"<c:if test="${page.getCloak() eq 5}">selected</c:if>>5</option>
			</select>
			</td>
			<td>
				<button id="searchBtn"  type="button">검색</button>
			</td>
		</tr>
	</tbody>
	</table>	 
	<!-- div style="width: 750px" align="right"><button id="searchBtn"  type="button">검색</button></div> -->
	<script>
	 document.getElementById("searchBtn").onclick = function () {
		  
		  let swordnum = document.getElementsByName("selectSword")[0].value;
		  let beltnum = document.getElementsByName("selectBelt")[0].value;
		  let recurvenum = document.getElementsByName("selectRecurve")[0].value;
		  let spatulanum = document.getElementsByName("selectSpatula")[0].value;
		  let chainnum = document.getElementsByName("selectChain")[0].value;
		  let largenum = document.getElementsByName("selectLarge")[0].value;
		  let tearnum = document.getElementsByName("selectTear")[0].value;
		  let glovesnum = document.getElementsByName("selectGloves")[0].value;
		  let cloaknum = document.getElementsByName("selectCloak")[0].value;

	      location.href = "/board/listjohab?num=1"+"&sword="+swordnum+"&belt="+ beltnum
		  +"&recurve="+recurvenum + "&spatula="+spatulanum+"&chain="+chainnum+"&large="+largenum
		  +"&tear="+tearnum+"&gloves="+glovesnum+"&cloak="+cloaknum ;
		  
	 //     location.href = "/board/listPageSearch?num=1"+"&swordnum="+swordnum+"&belt="+ beltnum
	  //  		  +"&recurve="+recurvenum + "&spatula="+spatulanum+"&chain="+chain+"&large="+largenum
	 //   		  +"&tear="+tearnum+"&gloves="+glovesnum+"&cloak="+cloak ;
		 };
	</script>
	<br><br><br>
	<table>
		<thead>
			<tr>
				<th>조합</th>
			  <c:forEach items="${list}" var="list">
			  	<th>${list.johabname}</th>
		  	  </c:forEach>
		  </tr>
		</thead>
		<tbody>
			<tr>
				<td>조합 갯수</td>
				<c:forEach items="${list}" var="list">
					<td>${list.johabcount}</td>
				</c:forEach>
			</tr>
			<tr>
				<td>유사도</td>
				<c:forEach items="${list}" var="list">
					<td>${list.simgroup}%</td>
				</c:forEach>
			</tr>
			<tr>
				<td>이동</td>
				<c:forEach items="${list}" var="list">
						<td><a href="/board/simJohab?&sword=${page.getSword()}&belt=${page.getBelt()}&recurve=${page.getRecurve()}&spatula=${page.getSpatula() }&chain=${page.getChain()}&large=${page.getLarge()}&tear=${page.getTear()}&gloves=${page.getGloves()}&cloak=${page.getCloak()}&johab=${list.johabname}">조합상세보기</a></td>
				</c:forEach>
			</tr>
		</tbody>
	</table>
</body>
</html>