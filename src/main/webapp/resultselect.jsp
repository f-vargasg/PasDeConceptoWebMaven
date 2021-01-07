<%-- 
    Document   : resultselect
    Created on : 6/01/2021, 09:05:59 PM
    Author     : garfi
--%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Struts 2 drop down box example</h1>

        <h2>
            Favor search engine : <s:property value="yourSearchEngine"/>
        </h2> 

        <h2>
            Selected month : <s:property value="yourMonth"/>
        </h2> 

    </body>
</html>
