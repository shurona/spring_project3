<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>
<p><a href = "/board/list">게시물 목록</a></p>
<p><a href = "/board/listPage?num=1">게시물 목록(아래 페이지)</a></p>
<p><a href = "/board/listPageSearch?num=1">게시물 목록(검색 가능)</a></p>

</body>
</html>
