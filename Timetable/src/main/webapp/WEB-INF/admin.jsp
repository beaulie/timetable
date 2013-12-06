<%@page contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@page import="timetable.*"%>
 
<jsp:useBean id="adminDao" type="timetable.AdminDao" scope="request" />
 
<!DOCTYPE html>
 
<html>
    <head>
        <title>JPA Timetable Web Application Tutorial</title>
        <style>
        th, td { padding: 5px; }
        th, td { vertical-align: top; }
        table { border: 0; }
        </style>
    </head>
 
 	
 
    <body>
        <form method="POST" action="admin.html">
        <table>
        
        <tr>
        	<td>Course:
        	<td><select name="course">
				<option value="PSD3">Professional Software Development 3</option>
				<option value="ALG3">Algorithmic 3</option>
				<option value="AP3">Advanced Programming 3</option>
				<option value="IS3">Interactive Systems 3</option>
				<option value="PL3">Programming Language 3</option>
				</select>
        <tr>
        	<td>Date:
        	<td><input type ="date" name="date" />
        <tr>
        	<td>Time:
        	<td><input type ="time" name="time" />
        <tr>
        	<td>Duration:
        	<td><select name="duration">
        		<option value="1">1</option>
        		<option value="2">2</option>
        		<option value="3">3</option>
        		<option value="4">4</option>
        		<option value="5">5</option>
        		</select>
        <tr>
        	<td>Repeat Frequency:
        	<td><select name="repeatFreq">
				<option value="once">Once</option>
				<option value="weekly">Weekly</option>
				</select>
        <tr>
        	<td>Lecturer:
        	<td><select name="lecturer">
        		<option value="liew">Dr Liew Pak San</option>
        		<option value="loo">Dr Loo Poh Kok</option>
        		<option value="cha">Mr Frankie Cha</option>
        		<option value="keoh">Dr Keoh Sye Loong</option>
        		<option value="wong">Dr Steven Wong</option>
        		</select>
        <tr>
        	<td>Max Attendance:
        	<td><input type ="text" name="maxAtt" />
        <tr>
        	<td>Compulsory:
        	<td><input type ="radio" name="compulsory" value="Yes"/>Yes<br/>
        	<input type ="radio" name="compulsory" value="No"/>No
        <tr>
        	<td>Venue:
        	<td><select name="venue">
				<option value="lecture">Lecture Room</option>
				<option value="lab">Laboratory</option>
				</select>
        </table>
        <br/><input type="submit" value="Add" />
        </form>
 
        <hr><ol> 
        
        <% for (Admin admin : adminDao.getAllSession()) { %>
            <li> <%= admin %> </li>
        <% } %>
        </ol><hr>
     </body>
 </html>