<!DOCTYPE html>
<html>
<head>
<title>EP</title>
</head>
<body bgcolor="lightblue">
<h1 align="center">JSP MVC Architecture Demo</h1>
<hr color="black"><hr color="black"><br>
<a href="main.jsp">Home</a>&nbsp;&nbsp;&nbsp;
<a href="empform.jsp">Display Values</a>&nbsp;&nbsp;&nbsp;
<a href="empreg.jsp">Employee Registration</a>&nbsp;&nbsp;&nbsp;
<a href="emplogin.jsp">Employee Login</a>&nbsp;&nbsp;&nbsp;
<br><br>
<h2 align="center"><u>Display Values Demo</u></h2>
<form method = "post" action = "mvcactiontags.jsp">
<table align="center">
<tr>
    <td><b>ID</b></td>
    <td>
        <input type="number" name="id" required>
    </td>
</tr>
<tr><td></td></tr>
<tr>
    <td><b>Full Name</b></td>
    <td>
        <input type="text" name="name" required>
    </td>
</tr>
<tr>
    <td><b>Username</b></td>
    <td>
        <input type="text" name="uname" required>
    </td>
</tr>
<tr><td></td></tr>
<tr><td></td></tr>
<tr align="center">
    <td>
        <input type="submit" value="Display" required>
    </td>
    <td>
        <input type="reset" value="Clear" required>
    </td>
</tr>
</table>

</body>
</html>