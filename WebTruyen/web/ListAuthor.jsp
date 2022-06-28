<%-- 
    Document   : ListAuthor
    Created on : 28-Jun-2022, 13:19:59
    Author     : dinht
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <a  href="AuthorsController?action=insert">Create </a>
        <table border="1">
               <thead>
               <tr>
               <th> ID </th>
                <th> Name </th>
                <th> alias </th>
                <th> keyword </th>
                <th> description </th>
                
                <th> CreatedAt </th>
                <th> UpdatedAt </th>
                <th colspan="2">Action</th>
</tr>
        </thead>
        <tbody>
        <c:forEach items="${Authors}" var="Author">
            <tr>
                <td><c:out value = "${Author.id}"/></td>
                <td><c:out value = "${Author.name}"/></td>
                <td><c:out value = "${Author.alias}"/></td>
                <td><c:out value = "${Author.description}"/></td>
                <td><c:out value = "${Author.keyword}"/></td>
                <td><c:out value = "${Author.CreatedAt}"/></td>
                <td><c:out value = "${Author.UpdatedAt}"/></td>
                <td><a href="AythorsController?action=edit&id=<c:out value = '${Author.id}'/>">Edit</a></td>
                <td><a href="AythorsController?action=delete&id=<c:out value = '${Author.id}'/>">Delete</a></td>
            </tr>
        </c:forEach>
        </tbody>
        </table>
    </body>
</html>
