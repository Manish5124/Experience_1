<%@page import="com.example.Experience.model.UserData"%>
<%@page import="java.util.List"%>


<!Doctype html>
<html>
<head>

<title>new page</title>
</head>
<body>

<%

List<UserData> dataList = (List<UserData>)request.getAttribute("data");

for(int c=0;c<dataList.size();c++)
{
out.print("ID: "+dataList.get(c).getId()+"<br>");

out.print("Name: "+dataList.get(c).getFname()+"<br>");
out.print("Name: "+dataList.get(c).getLname()+"<br>");

out.print("Name: "+dataList.get(c).getEmail()+"<br>");

out.print("Name: "+dataList.get(c).getPassword()+"<br>");
out.print("Address: "+dataList.get(c).getCollege()+"<br>");
out.print("<br>");

}

%>

</body>
</html>