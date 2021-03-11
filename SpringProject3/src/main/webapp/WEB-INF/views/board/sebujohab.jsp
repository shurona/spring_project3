<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

	<p>현재 조합 : ${sebu.johab}  아이디 : ${sebu.id}</p>
	
	<table>
		<thead>
			<tr>
				<th>세부 조합</th>
				<th>사용된 아이템</th>
				<th>사용된 챔피온</th>
				<th>사용된 재료 아이템</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<th>${sebu.detailed}</th>
				<th>${sebu.useditem}</th>
				<th>${sebu.usedchamp }</th>
				<th>${sebu.smallitem }</th>
			</tr>
		</tbody>	
	</table>
</body>
</html>