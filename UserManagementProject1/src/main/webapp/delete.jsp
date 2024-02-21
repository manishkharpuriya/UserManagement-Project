<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
</head>
<body bgcolor="pink">
 <c:if test="${deleteResult==1 }">
    Deletion Successfully..... 
 </c:if>
 <c:if test="${deleteResult==0 }">
    Deletion fail check once....
    <%@ include file="userDelete.html" %>
 </c:if>

</body>
</html>