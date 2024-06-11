<%@ page language="java" contentType="text/html; charset=ISO-8859-1" import="java.sql.*"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>My Cart:</title>
<link rel="stylesheet" type="text/css" href="veew.css">
</head>
<body>
<div id='d1'><center><h1>My-Cart</h1></center></div>
<%
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/banks","root","root");
Statement sp= con.createStatement();
ResultSet rs =sp.executeQuery("select * from storee where qty>0");



out.println("<table border='5px solid black' cellpadding='15'  align='center' background-color='white'> ");

out.println("<tr><th>Name</th><th>Quantity</th><th>Rate(kg)</th><th>Amount</th></tr>");
while(rs.next())
{
%>
<tr><td><%out.println( rs.getString("namee"));%> </td><td><% out.println(rs.getInt("qty"));%> </td><td><% out.println(rs.getInt("rate"));%> </td><td><% out.println(rs.getInt("amt"));%> </td></tr>
<%
}

Statement sb= con.createStatement();
ResultSet rp =sb.executeQuery("select sum(amt) from storee");
out.println("<tr><th>Total Amount</th>");
while(rp.next())
{
%>
<th><% out.println(rp.getInt("sum(amt)"));%>  </th></tr>

<%
}
out.println("</table>");


rs.close();
con.close();
%>
<div id="d2">
<a href='gret.html'>Continue to Purchase</a>
</div>
<div id="d3"><a href='openr.html'>Go Back</a></div>
</body>
</html>
