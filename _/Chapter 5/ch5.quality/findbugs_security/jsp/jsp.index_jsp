<html>
<head>
<meta http-equiv="Content-Type" content="text/html;
charset=UTF-8">
<title>Hello World Example</title>
</head>
<body>
<%
String evilInput= null;
evilInput = request.getParameter("someUnfilteredInput");
if (evilInput==null){evilInput="Hello Kind Person";}
%>
<form action="index.jsp">
The big head says: <%=evilInput%><p>
Please add input:<input type='text'
name='someUnfilteredInput'>
<input type="submit">
</form>
</body>
</html>

