<%-- 
    Document   : select
    Created on : 6/01/2021, 09:04:48 PM
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

    <s:form action="resultSelection.action" namespace="/">

        <h2>
            <s:select label="What's your favor search engine" 
                      headerKey="-1" headerValue="Select Search Engines"
                      list="searchEngine" 
                      name="yourSearchEngine" 
                      value="defaultSearchEngine" />
        </h2> 

        <h2>
            <s:select label="Select a month" 
                      headerKey="-1" headerValue="Select Month"
                      list="#{'1':'Jan', '2':'Feb', '3':'Mar', '4':'Apr'}" 
                      name="yourMonth" 
                      value="2" />
        </h2> 

        <s:submit value="submit" name="submit" />

    </s:form>

</body>
</html>
