<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>insert title here</title>
</head>
<body>
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
	   <th>조합</th>
	  </tr>
	 </thead>
	 
	 <tbody>
	  <c:forEach items="${list}" var="list">
	  	<tr>
	  		<td>${list.id}</td>
	  		<td>${list.rank}</td>
	  		<td>${list.bf_sword}</td>
	  		<td>${list.giant_belt}</td>
	  		<td>${list.recurve_bow}</td>
	  		<td>${list.spatula}</td>
	  		<td>${list.chain_vest}</td>
	  		<td>${list.large_rod}</td>
	  		<td>${list.tear_of_the_goddess}</td>
	  		<td>${list.sparring_gloves}</td>
	  		<td>${list.negatron_cloak}</td>
	  		<td>${list.johab}</td>
	  	</tr>
	  </c:forEach>
	 </tbody>
	
	</table>
	
	<div>
	<c:if test="${page.prev}">
 		<span>[ <a href="/board/listPage?num=${page.startPageNum - 1}">이전</a> ]</span>
	</c:if>
	<c:forEach begin="${page.startPageNum}" end="${page.endPageNum}" var="num">
	 <span>
	 
	  <c:if test="${select != num}">
	   <a href="/board/listPage?num=${num}">${num}</a>
	  </c:if>    
	  
	  <c:if test="${select == num}">
	   <b>${num}</b>
	  </c:if>
	    
	 </span>
	</c:forEach>
	<c:if test="${page.next}">
	 <span>[ <a href="/board/listPage?num=${page.endPageNum + 1}">다음</a> ]</span>
	</c:if>
	</div>
</body>
</html>