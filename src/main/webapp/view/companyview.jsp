<%@page import="com.example.Experience.model.CompanyData"%>
<%@page import="java.util.List"%>


<!Doctype html>
<html>
<head>

<title>new page</title>
</head>
<body>

<%

List<CompanyData> dataList = (List<CompanyData>)request.getAttribute("data");

for(int c=0;c<dataList.size();c++)
{
out.print("ID: "+dataList.get(c).getId()+"<br>");
out.print("Company Name: "+dataList.get(c).getComname()+"<br>");
out.print("Company Location: "+dataList.get(c).getComlocation()+"<br>");

out.print("Company description: "+dataList.get(c).getComdes()+"<br>");
out.print("company type: "+dataList.get(c).getComtype()+"<br>");

out.print("company criteria : "+dataList.get(c).getComcriteria()+"<br>");
out.print("job profile: "+dataList.get(c).getJobprofile()+"<br>");

out.print("company package: "+dataList.get(c).getCompackage()+"<br>");
out.print("your status: "+dataList.get(c).getStatus()+"<br>");

out.print("interview level : "+dataList.get(c).getLevel()+"<br>");

out.print("company package: "+dataList.get(c).getRounds()+"<br>");
out.print("your status: "+dataList.get(c).getIntdes()+"<br>");

out.print("interview level : "+dataList.get(c).getRating()+"<br>");
out.print("<br>");

}

%>

</body>
</html>