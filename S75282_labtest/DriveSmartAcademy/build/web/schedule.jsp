<%@page import="java.util.*"%>
<%@page import="bean.SessionBean"%>

<%@ include file="header.html" %>

<html>
<head>
<title>Schedule Dashboard</title>
</head>

<body>

<center>

<h2>
Centralized Schedule Dashboard
</h2>

<table border="1"
cellpadding="10">

<tr>
<th>ID</th>
<th>Student</th>
<th>Branch</th>
<th>Lesson</th>
<th>Status</th>
</tr>

<%
List<SessionBean> list =
(List<SessionBean>)
request.getAttribute(
"sessionList");

if(list != null){

for(SessionBean s : list){
%>

<tr>
<td><%=s.getSession_id()%></td>
<td><%=s.getStudent_name()%></td>
<td><%=s.getBranch_location()%></td>
<td><%=s.getLesson_type()%></td>
<td><%=s.getStatus()%></td>
</tr>

<%}
}%>

</table>

<br>

<a href="index.jsp">
Back To Main Menu
</a>

</center>

</body>
</html>

<%@ include file="footer.jsp" %>