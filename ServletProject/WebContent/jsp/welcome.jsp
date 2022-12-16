<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

Hi, this is JSP!
<jsp:useBean id="student" class="com.servlet.javabeans.Student" />
<jsp:setProperty property="name" value="Shubham" name="student"/>

Hi ${student.name}
<c:set var="email" value="shubham@gmail.com"/>
<c:out value="${email}"></c:out>
<c:forEach var="count" begin="1" end="5" >
<c:out value="${count}"></c:out>
</c:forEach>
</body>
</html>