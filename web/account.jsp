<%@taglib prefix="st" uri="/struts-tags" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
            <st:form>
                <table cellspacing="20" cellpadding="20"  style="background-color: rgba(105,91,80,0.5);width: 400px;" >
                    <tr><td align="center" style="font-size: 50px;" ><st:a href="companyaccountpage.action">SIGN UP AS COMPANY</st:a></td></tr>
                    <tr><td align="center" ><st:a href="useraccountpage.action">SIGN UP AS USER</st:a></td></tr>
                </table>
            </st:form>
        </div>
    </body>
</html>
