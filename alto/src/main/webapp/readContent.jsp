<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.io.BufferedReader" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	String content = null;
	String buf = null;
	BufferedReader r = request.getReader();
	boolean loop = true;
	while(loop) {
		buf = r.readLine();
		if(buf == null) {
			loop = false;
		} else {
			content = content + buf;
		}
	}
	System.out.println(content);
	
%>
</body>
</html>