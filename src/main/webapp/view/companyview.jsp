<%@page import="com.example.Experience.model.CompanyData"%>
<%@page import="java.util.List"%>


<!Doctype html>
<html>
<head>

<title>new page</title>
<style>
body {
  background-color:#63738a; /* Orange */
  color: #ffffff;
}
 h3{
 	font-size:27px;
  margin-left: 220px;
 padding:5px;
 }
</style>

</head>
<body >

<%

List<CompanyData> dataList = (List<CompanyData>)request.getAttribute("data");

for(int c=0;c<dataList.size();c++)
{
%>


<h1 style="text-decoration: underline;text-align:center;padding-top: 30px;font-size:35px;" >
<%
out.print(dataList.get(c).getComname()+"<br>");
%>
</h1>
<div style="text-align:left;padding-top: 20px;" class="container">
  <h3><%
out.print("Company Location: "+dataList.get(c).getComlocation()+"<br>");
%></h3>
    <h3><%
out.print("Company description: "+dataList.get(c).getComdes()+"<br>");
%></h3>
     <h3><%
out.print("company type: "+dataList.get(c).getComtype()+"<br>");
%></h3>
     <h3><%
out.print("company criteria : "+dataList.get(c).getComcriteria()+"<br>");
%></h3>
     <h3><%
out.print("job profile: "+dataList.get(c).getJobprofile()+"<br>");
%></h3>
     <h3><%
out.print("company package: "+dataList.get(c).getCompackage()+"<br>");
%></h3>
     <h3><%
out.print("your status: "+dataList.get(c).getStatus()+"<br>");
%></h3>
     <h3><%
out.print("interview level : "+dataList.get(c).getLevel()+"<br>");
%></h3>
     <h3><%
out.print("company package: "+dataList.get(c).getRounds()+"<br>");
%></h3>
       
       
     <h3><%
out.print("your status: "+dataList.get(c).getIntdes()+"<br>");
%></h3>           


     <h3>
     <%
out.print("interview level : "+dataList.get(c).getRating()+"<br>");
%></h3>  
  </div>

<% out.print("<br>");

}
%>





</body>
</html>