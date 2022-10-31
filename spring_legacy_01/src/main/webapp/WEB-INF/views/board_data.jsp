<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
</head>
<body>
<div>
<!-- 지금 HashMap이기 때문에 키 값이 대문자임 -->
<c:forEach items="${board_data_01}" var="ele">
				${ele.NUM}
				${ele.WRITER}
				${ele.READCOUNT}			
</c:forEach>
	<table>
		<tr>
			<th width="5%">번호</th>
			<th width="45%">제목</th>
			<th width="20%">글쓴이</th>
			<th width="5%">조회수</th>
		</tr>
		<!-- ${aList} 컨트롤에서 보내주는것 ${aList} : aList키값의 벨류값을 가져옴 -->
		<!-- items 가 attribute로 가져오는 리스트나 맵, var이 각 원소 -->
		
		<c:forEach items="${board_data_01}" var="ele">
			<tr>
				<td>${ele.num}</td>
				<td>
					"dd"
				</td>
				<td>${ele.writer}</td>
				<td>${ele.readcount}</td>
			</tr>
		</c:forEach>
	</table>
</div>
</body>
</html>