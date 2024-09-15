<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="st" uri="/struts-tags" %>

<html>
    <style>
        .backtheme{
            background-image: url("media/pic.jpg");
            background-repeat: no-repeat;
            background-size: 100%;
        }

    </style>
        
    <body class="backtheme">
        
        <%@include file="publicTop.jsp" %>

        <h1 style="color: #E6E7E9; margin-left: 40px; font-size: 60px;" >SURE FOR </h1>
        <h1 style="color: #E6E7E9; margin-left: 40px; font-size: 60px;" >JOB </h1>
        <p style="color: #E6E7E9; margin-left: 50px; margin-top: -15px;" >Hand to Hand employment</p>
        
        <div align="right" style="margin-top: -80px ; margin-right: 200px;">
            <st:form action="logindb.action" >
                <table cellspacing="5" cellpadding="10" style="background-color: rgba(105,91,80,0.5)" >
                    <tr><td><st:textfield  label="Id" name="id" style="height:30px; width:250px;" /></td></tr>
                    <tr><td><st:password label="Password"  name="password" style="height:30px; width:250px;" /></td></tr>
                    <tr><td align="center" colspan="2" ><st:submit value="login" theme="simple" /></td></tr>
                </table>
            </st:form>
        </div>
    </body>
</html>
