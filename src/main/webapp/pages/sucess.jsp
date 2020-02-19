<%@page import="java.util.Arrays"%>
<%@page import="com.cts.StudentBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
StudentBean s=(StudentBean)request.getAttribute("student");

String str=Arrays.toString(s.getCourses());

%>


<h2>Student Registerd Sucessfully</h2>

<h2>Roll is :${student.roll }</h2>
<h2>Name is :${student.name }</h2>
<h2>Marks is :${student.marks }</h2>
<h2>Courses Are :<%=str %></h2>

<h2>IS Indian :${student.isIndian }</h2>

<h2>Gender is :${student.gender }</h2>

<h2>City is :${student.city }</h2>


</body>
</html>