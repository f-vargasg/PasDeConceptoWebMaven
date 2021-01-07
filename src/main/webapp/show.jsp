<%-- 
    Document   : show
    Created on : 1/01/2021, 12:00:32 PM
    Author     : garfi
--%>
<%@taglib uri="/struts-tags" prefix="s" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <p>x = <s:property value="x"/> operado con y= <s:property value="y"/> </p>
        <p>El resultado de <s:property value="msg"/> es: <s:property value="resultado"/> </p>

    </body>
</html>
