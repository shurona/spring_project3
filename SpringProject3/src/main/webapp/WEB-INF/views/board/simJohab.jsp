<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>조합 리스트</title>
</head>


<body>
	<p><a href="/board/listjohab">아이템 선택으로 돌아가기</a></p>
	<p>세부조합을 골라주세요</p>
	<p>현재 조합 : ${board.getJohab()}</p>
	<table>
		<thead>
			<tr>
			   <th>인덱스</th>
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
			   <th>유사도</th>
				<th>세부조합 보러가기</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${newboard}" var="newboard" varStatus="status">
			
		  		<tr>
			  		<td>${newboard.id}</td>
			  		<td>${newboard.rank}</td>
			  		<td>${newboard.bf_sword-oldpage.getSword()}</td>
			  		<td>${newboard.giant_belt-oldpage.getBelt()}</td>
			  		<td>${newboard.recurve_bow-oldpage.getRecurve()}</td>
			  		<td>${newboard.spatula-oldpage.getSpatula()}</td>
			  		<td>${newboard.chain_vest-oldpage.getChain()}</td>
			  		<td>${newboard.large_rod-oldpage.getLarge()}</td>
			  		<td>${newboard.tear_of_the_goddess-oldpage.getTear()}</td>
			  		<td>${newboard.sparring_gloves-oldpage.getGloves()}</td>
			  		<td>${newboard.negatron_cloak-oldpage.getCloak()}</td>
			  		<td>${newboard.sim}</td>
			  		<td><a href="/board/sebujohab?&id=${newboard.id}">이동</a></td>
		  		</tr>
		  </c:forEach>
		</tbody>
	</table>
	
</body>
</html>