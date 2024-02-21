<%@ page language="java" contentType="text/html" import="java.util.Date"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
</head>
<body bgcolor="pink">
<c:if test="${result==1 }">
     Data Inserted Successfully....${result }
</c:if>
<c:if test="${result==0 }">
     Data Insertion Fail....${result }
     <%@include file="addUser.html" %>
</c:if>

</body>
</html>