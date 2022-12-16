<%@ page import="java.io.IOException" %>
<%@ page import="javax.servlet.annotation.WebServlet" %>
<%@ page import="javax.swing.JOptionPane.showMessageDialog" %><%--
  Created by IntelliJ IDEA.
  User: delgadoa.
  Date: 12/15/22
  Time: 10:21 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%! public String username = ""; %>
<%! public String password = ""; %>

<%
    if(request != null){
        username = request.getParameter("username");
        password = request.getParameter("password");

        if(username != null && password != null){
            if(username.equals("admin") && password.equals("password")){
                response.sendRedirect("profile.jsp");
            }else{
                response.sendRedirect("login.jsp");

            }
        }
    }
%>

<html>
<head>
    <title>Title</title>

</head>
<body>







<form  method="POST">
    <label for="username">User name</label><br>
    <input type="text" id="username" name="username"><br>
    <label for="password">Password</label><br>
    <input type="password" id="password" name="password"><br>
    <input type="submit" value="Submit">
</form>









<%--    <% @WebServlet(name = "profile.jsp", urlPatterns = "/")--%>
<%--class profile extends HttpServlet {--%>
<%--    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {--%>
<%--        response.getWriter().println("<h2>User name is: " + request.getParameter("username") + "</h2>");--%>

<%--    }--%>
<%--}%>--%>



<%--<c:set  var="num" value="username"/>--%>
<%--<c:if test="${num}">--%>
<%--    <h1>You are an admin</h1>--%>
<%--</c:if>--%>


<%--</body>--%>
<%--</html>--%>
