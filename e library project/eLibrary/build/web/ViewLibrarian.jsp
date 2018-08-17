<%-- 
    Document   : ViewLibrarian
    Created on : Jul 22, 2017, 11:11:51 AM
    Author     : Mukesh Arya
--%>

<%@page import="database.GetLibrarian"%>
<%@page import="beans.Librarian"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="header.html" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>view Librarian</title>
    </head>
    <body>
        
        <table border="2" align="center">
            <tr>
                <th>Name</th>
                <th>Email</th>
                <th>Password</th>
                <th>Contact</th>
                <th>Edit</th>
                <th>Delete</th>
            </tr>
        <%
            
            ArrayList<Librarian>list = GetLibrarian.getLibrarian();
            
            for(int i=0;i<list.size();i++){
            
                Librarian l = list.get(i);
                
                out.print("<tr>");
                out.print("<td>");
                out.print(l.getName());
                out.print("</td>");
                out.print("<td>");
                out.print(l.getEmail());
                out.print("</td>");
                out.print("<td>");
                out.print(l.getPassword());
                out.print("</td>");
               out.print("<td>");
                out.print(l.getContact());
                out.print("</td>");
               out.print("<td>");
                out.print("<a href='Edit'>Edit</a>");
                out.print("</td>");
               out.print("<td>");
                out.print("<a href='Delete'>Delete</a>");
                out.print("</td>");
               
               
                out.print("</tr>");
                
       
            }
           
            
            
            
            
            
            %>
        </table>
    </body>
</html>
