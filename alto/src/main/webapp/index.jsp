<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.sql.Connection"%>
<%@ page import="java.sql.DriverManager"%>
<%@ page import="java.sql.PreparedStatement"%>
<%@ page import="java.sql.ResultSet"%>
<%@ page import="java.sql.ResultSetMetaData"%>
<%@ page import="org.hibernate.Session" %>
<%@ page import="org.hibernate.SessionFactory"%>
<%@ page import="org.hibernate.cfg.Configuration"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Results</title>
</head>
<body>
	<table CELLSPACING="0" CELLPADDING="3" BORDER="1">
<%-- 		<%
			try {
				String sql = request.getParameter("sql");
				String userName = "alto";
				String password = "DT%emZRypLO£Azyt";
				Class.forName("org.mariadb.jdbc.Driver");
				String url = "jdbc:mariadb://qadb01.waratek.lan:3306/ALTO";

				Connection c = DriverManager.getConnection(url, userName,
						password);
				PreparedStatement stmt = c.prepareStatement(sql);
				ResultSet rs = stmt.executeQuery();
				ResultSetMetaData rsm = rs.getMetaData();

				out.println("<TR>");
				for (int i = 1; i <= rsm.getColumnCount(); i++) {
					String colName = rsm.getColumnName(i);
					out.print("<TH>" + colName + "</TH>");
				}
				out.println("</TR>");
				while (rs.next()) {
					out.println("<TR>");
					for (int i = 1; i <= rsm.getColumnCount(); i++) {
						Object content = rs.getObject(i);
						if (content != null) {
							out.println("<TD>" + content.toString() + "</TD>");
						} else {
							out.println("<TD>null</TD>");
						}
					}
					out.println("</TR>");
				}

			} catch (Exception e) {
				e.printStackTrace();
				System.out.println(e.getMessage());
			}
		%> --%>
		<%Session s = new Configuration().configure().buildSessionFactory().getCurrentSession();%>
	</table>
</body>
</html>
