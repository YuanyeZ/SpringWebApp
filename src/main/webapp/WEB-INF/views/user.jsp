<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>

<!DOCTYPE>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Users PAGE</title>
	 <style type="text/css">
        .tg  {border-collapse:collapse;border-spacing:0;border-color:#ccc;}
        .tg td{font-family:Arial, sans-serif;font-size:14px;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#fff;}
        .tg th{font-family:Arial, sans-serif;font-size:14px;font-weight:normal;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#f0f0f0;}
        .tg .tg-4eph{background-color:#f9f9f9}
    </style>
</head>
<body>
	<h1>Add a User</h1>
 	<c:url var="addAction" value="/users/add" ></c:url>
 	
 	<form:form action="${addAction}" commandName="user">
	<table>
	    <c:if test="${!empty user.userName}">
	    <tr>
	        <td>
	        	<form:label path="ID"> <spring:message text="ID"/> </form:label>
	        </td>
	        <td>
	        	<form:input path="ID" readonly="true" size="8"  disabled="true" />
	            <form:hidden path="ID" />
	        </td> 
	    </tr>
	    </c:if>
	    <tr>
	        <td>
	            <form:label path="userName"> <spring:message text="Name"/> </form:label>
	        </td>
	        <td>
	            <form:input path="userName" />
	        </td> 
	    </tr>
	    
	    <tr>
	        <td colspan="2">
	            <c:if test="${!empty user.userName}">
	                <input type="submit"
	                    value="<spring:message text="Edit User"/>" />
	            </c:if>
	            <c:if test="${empty user.userName}">
	                <input type="submit"
	                    value="<spring:message text="Add User"/>" />
	            </c:if>
	        </td>
	    </tr>
	</table>  
	</form:form>
<br>

<h3>Users List</h3>
<c:if test="${!empty listUsers}">
    <table class="tg">
	    <tr>
	        <th width="80">Person ID</th>
	        <th width="120">Person Name</th>
	        <th width="60">Edit</th>
	        <th width="60">Delete</th>
	    </tr>
    <c:forEach items="${listUsers}" var="user">
        <tr>
            <td>${user.ID}</td>
            <td>${user.userName}</td>
            <td><a href="<c:url value='/edit/${user.ID}' />" >Edit</a></td>
            <td><a href="<c:url value='/remove/${user.ID}' />" >Delete</a></td>
        </tr>
    </c:forEach>
    </table>
</c:if>
 	
</body>
</html>