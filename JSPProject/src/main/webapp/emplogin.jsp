<!DOCTYPE html>
<html>
<head>
<title>EP</title>
</head>
<body bgcolor="aqua">
<h1 align="center">JSP MVC Architecture Demo</h1>
<hr color="black"><hr color="black"><br>
<a href="main.jsp">Home</a>&nbsp;&nbsp;&nbsp;
<a href="empform.jsp">Display Values</a>&nbsp;&nbsp;&nbsp;
<a href="empreg.jsp">Employee Registration</a>&nbsp;&nbsp;&nbsp;
<a href="emplogin.jsp">Employee Login</a>&nbsp;&nbsp;&nbsp;
<br><br>
<h2 align="center"><u>Employee Login</u></h2>
<form method="post" action="checkemplogin">
<table align="center">
<tr>
    <td><b>Username</b></td>
    <td>
        <input type="text" name="uname" required>
    </td>
</tr>
<tr><td></td></tr>
<tr>
    <td><b>Password</b></td>
    <td>
        <input type="password" name="pwd" required>
    </td>
</tr>
<tr><td></td></tr>
<tr><td></td></tr>
<tr><td></td></tr>
<tr align="center">
    <td>
        <input type="submit" value="Login" required>
    </td>
    <td>
        <input type="reset" value="Clear" required>
    </td>
</tr>
</table>

</body>
</html>