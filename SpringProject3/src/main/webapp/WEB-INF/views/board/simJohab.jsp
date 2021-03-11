<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib  prefix="spring" uri="http://www.springframework.org/tags" %>  
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
			<tr>
				<td></td>
				<td></td>
				<td>
					<button type="button" class = "btm_img" id="bf_button">	
						<img src="<spring:url value='/resources/img/bf.png'/>">
					</button>
				</td>
				<td>
					<button type="button" class = "btm_img" id="belt_button">	
						<img src="<spring:url value='/resources/img/belt.png'/>">
					</button>
				</td>
				<td>
					<button type="button" class = "btm_img" id="bow_button">	
						<img src="<spring:url value='/resources/img/bow.png'/>">
					</button>
				</td>
				<td>
					<button type="button" class = "btm_img" id="spatula_button">	
						<img src="<spring:url value='/resources/img/Spatula.png'/>">
					</button>
				</td>
				<td>
					<button type="button" class = "btm_img" id="vest_button">	
						<img src="<spring:url value='/resources/img/1031.png'/>">
					</button>
				</td>
				<td>
					<button type="button" class = "btm_img" id="rod_button">	
						<img src="<spring:url value='/resources/img/Rod.png'/>">
					</button>
				</td>
				<td>
					<button type="button" class = "btm_img" id="tear_button">	
						<img src="<spring:url value='/resources/img/tear.png'/>">
					</button>
				</td>
				<td>
					<button type="button" class = "btm_img" id="gloves_button">	
						<img src="<spring:url value='/resources/img/BrawlersGloves.png'/>">
					</button>
				</td>				
				<td>
					<button type="button" class = "btm_img" id="cloak_button">	
						<img src="<spring:url value='/resources/img/cloak.png'/>">
					</button>
				</td>				
				
			</tr>
		
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
	
	<script>
		document.getElementById("bf_button").onclick = function(){
			johab = '${board.getJohab()}';
			let swordnum = ${oldpage.getSword()}+1;
			location.href = "/board/simJohab?&sword="+swordnum+"&belt="+${oldpage.getBelt()}+
			  "&recurve="+${oldpage.getRecurve()} + "&spatula="+${oldpage.getSpatula()}+
			  "&chain="+${oldpage.getChain()}+"&large="+${oldpage.getLarge()}
			  +"&tear="+${oldpage.getTear()}+"&gloves="+${oldpage.getGloves()}+"&cloak="+${oldpage.getCloak()}
			  +"&johab="+johab;
		}
		document.getElementById("belt_button").onclick = function(){
			let beltnum = ${oldpage.getBelt()}+1;
			location.href = "/board/simJohab?&sword="+${oldpage.getSword()}+"&belt="+beltnum+
			  "&recurve="+${oldpage.getRecurve()} + "&spatula="+${oldpage.getSpatula()}+
			  "&chain="+${oldpage.getChain()}+"&large="+${oldpage.getLarge()}
			  +"&tear="+${oldpage.getTear()}+"&gloves="+${oldpage.getGloves()}+"&cloak="+${oldpage.getCloak()}
			  +"&johab="+'${board.getJohab()}';
		}
	</script>
	
</body>
</html>