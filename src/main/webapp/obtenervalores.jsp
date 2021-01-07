<%-- 
    Document   : obtenervalores
    Created on : 1/01/2021, 11:03:55 AM
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
        <h2>Operar</h2>
        <table style="border-collapse: collapse; width: 47.7341%; height: 132px;" border="1">
            <tbody>
                <tr>
                    <td style="width: 50%;">sumar</td>
                    <td style="width: 50%;">
                        <s:form action="calc/add.action">
                            <s:textfield label="x" name="x"/>
                            <s:textfield label="y" name="y"/>
                            <s:submit value="Sumar"></s:submit>
                        </s:form>
                    </td>
                </tr>
                <tr>
                    <td style="width: 50%;">restar</td>
                    <td style="width: 50%;">
                        <s:form action="calc/sub.action">
                            <s:textfield label="x" name="x"/>
                            <s:textfield label="y" name="y"/>
                            <s:submit value="Restar"></s:submit>
                        </s:form>
                    </td>
                </tr>
                <tr>
                    <td style="width: 50%;">multiplicar</td>
                    <td style="width: 50%;">
                        <s:form action="calc/mul.action">
                            <s:textfield label="x" name="x"/>
                            <s:textfield label="y" name="y"/>
                            <s:submit value="Multiplicar"></s:submit>
                        </s:form>
                    </td>
                </tr>
                <tr>
                    <td style="width: 50%;">Dividir</td>
                    <td style="width: 50%;">
                        <s:form action="calc/div.action">
                            <s:textfield label="x" name="x"/>
                            <s:textfield label="y" name="y"/>
                            <s:submit value="Post Data"></s:submit>
                        </s:form>
                    </td>
                </tr>
            </tbody>
        </table>
    </body>
</html>
