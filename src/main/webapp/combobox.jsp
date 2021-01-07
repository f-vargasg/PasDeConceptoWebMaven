<%-- 
    Document   : combobox
    Created on : 30/12/2020, 01:43:25 PM
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

        <s:form action="result.action" namespace="/">

            <h2>
                <s:combobox label="What's your favor fruit" 
                            headerKey="-1" headerValue="--- Select ---"
                            list="fruits" 
                            name="yourFruits" />
            </h2>

            <h2>
                <s:combobox label="Select a month" 
                            headerKey="-1" headerValue="--- Select ---"
                            list="#{'1':'Jan', '2':'Feb', '3':'Mar', '4':'Apr'}" 
                            name="yourMonth" />
            </h2> 

            <s:submit value="submit" name="submit" />

        </s:form>
    </body>
</html>
