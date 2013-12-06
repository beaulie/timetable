<%@page contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@page import="timetable.*"%>
 
<!DOCTYPE html>
 
<html>
    <head>
        <title>JPA Timetable Web Application Tutorial</title>
    </head>
 
 	
 
    <body>
		<%
        String username=request.getParameter("username");
        String password=request.getParameter("password");
        
        if((username.equals("admin") && password.equals("admin")))
            {
            response.sendRedirect("admin.html");
            }
        else
            response.sendRedirect("Error.jsp");
        %>

    </body>
 </html>