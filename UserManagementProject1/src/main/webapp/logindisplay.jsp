<%@ page language="java" contentType="text/html" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
</head>
<body bgcolor="pink">
  <c:if test="${login }">
    <c:redirect url="https://sathyatech.com/"></c:redirect>
    <jsp:include page="userLogin.html"/>
  </c:if>
  <c:if test="${not login }">
  <jsp:include page="userLogin.html"/>
  Login fail try with valid data....
  </c:if>


</body>
</html>