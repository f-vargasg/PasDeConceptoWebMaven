<%-- 
    Document   : result
    Created on : 31/12/2020, 10:51:38 PM
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
        <h1>Struts 2 &lt;s:combobox&gt; example</h1>

        <h2>
            Favor fruit : <s:property value="yourFruits"/>
        </h2> 

        <h2>
            Selected month : <s:property value="yourMonth"/>
        </h2> 
    </body>
</html>
