<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a href="/board/listPageSearch?num=1">이전으로 돌아가기</a>
	
	<table>
	 <thead>
	  <tr>
	   <th>조합이름</th>
	   <th>조합의 갯수</th>
	  </tr>
	 </thead>
	 <tbody>
	 	  <c:forEach items="${list}" var="list">
	  	<tr>
	  		<td>${list.johabname}</td>
	  		<td>${list.johabcount}</td>
	  	</tr>
	  </c:forEach>
	 </tbody>
	</table>
</body>
</html>