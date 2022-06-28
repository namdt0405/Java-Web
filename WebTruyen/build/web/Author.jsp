<%-- 
    Document   : Author
    Created on : 28-Jun-2022, 13:46:39
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
        <form method="POST" action="AuthorsController">
            <table>
                <tr>
                    <th>ID:</th>
                    <td><input type="text" readonly="readonly" name="id" value="<c:out value='${Author.id}'/>"/></td>
                </tr>
                <tr>
                    <th>Name:</th>
                    <td><input type="text"  name="id" value="<c:out value='${Author.name}'/>"/></td>
                </tr>
                <tr>
                    <th>alias:</th>
                    <td><input type="text"  name="name" value="<c:out value='${Author.alias}'/>"/></td>
                </tr>
                <tr>
                    <th>keyword:</th>
                    <td><input type="text"  name="keyword" value="<c:out value='${Author.keyword}'/>"/></td>
                </tr>
                <tr>
                    <th>description:</th>
                    <td><input type="text"  name="description" value="<c:out value='${Author.description}'/>"/></td>
                </tr>
                <tr>
                    <th>CreatedAt:</th>
                    <td><input type="text"  name="CreatedAt" value="<c:out value='${Author.CreatedAt}'/>"/></td>
                </tr>
                <tr>
                    <th>UpdatedAt:</th>
                    <td><input type="text"  name="UpdatedAt" value="<c:out value='${Author.UpdatedAt}'/>"/></td>
                </tr>
                <tr>
                    <td colspan="2"> <input type="submit" value="Save"/> </td>
                </tr>
            </table>
        </form>
                <a href="AuthorsController?action=listAuthor">Back</a>
    </body>
</html>
