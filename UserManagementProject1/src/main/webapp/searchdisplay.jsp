<%@ page language="java" contentType="text/html" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
</head>
<body bgcolor="pink">
  <c:if test="${empty user }">
   Search result not found....
  <jsp:include page="search.html"/>
  </c:if>
  
  <c:if test="${not empty user }">
  <jsp:include page="search.html"/>
  User Id....${user.userId }<br>
  User Name....${user.userName }<br>
  User Email...${user.userEmail }<br>
  User Mobile...${user.userMobile }<br>
  User Location...${user.userLocation }<br>
  </c:if>

</body>
</html>