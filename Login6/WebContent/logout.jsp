<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
/*response.setHeader("Cache-Control", "no-cache");
response.setHeader("Cache-Control", "no-store");
response.setHeader("uname", "no-cache");
response.setDateHeader("Expires", 0);*/


session.removeAttribute("uname");
session.setAttribute("uname", null);
request.getSession(false).invalidate();
response.sendRedirect("Login.html");
%>
</body>
</html>