<%-- 
    Document   : index.jsp
    Created on : Jul 24, 2017, 7:44:21 AM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>USERS</h1>
        <table style="border: 1px solid black">
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Email</th>
                <th>Status</th>
            </tr>
            <c:forEach var="user" items="${requestScope.users}">
                <tr>
                    <td>${user.id}</td>
                     <td>${user.userName}</td>
                      <td>${user.email}</td>
                       <td>${user.status}</td>
                </tr>
            </c:forEach>
            
        </table>
        
    </body>
</html>
