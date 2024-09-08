<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:out value="${'Shirish'}}" />
	<c:set var="name" scope="session" value="kaivalya"></c:set>

	<c:out value="${name}"></c:out>

	<c:import url="NewFile.jsp"></c:import>

	<%
		pageContext.setAttribute("number", 5);
	%>

	<c:if test="${Number%2==0}">
		<c:out value="Even"></c:out>
	</c:if>

	<c:set var="income" scope="session" value="${78888*5}"></c:set>
	<c:choose>
		<c:when test="${income > 10000}">
			Income is more
		</c:when>
		<c:when test="${income <= 10000}">
			Income is less
		</c:when>
		<c:otherwise>
			otherwise exected
		</c:otherwise>
	</c:choose>
	<br>
	<c:forEach var="i" begin="1" end="10">
		Count <c:out value="${i}"></c:out>
		<br>
	</c:forEach>

</body>
</html>