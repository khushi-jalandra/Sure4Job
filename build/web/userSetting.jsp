<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="st" uri="/struts-tags" %>

<html>
    <style>
        .backtheme{
            background-image: url("media/pic.jpg");
            background-repeat: no-repeat;
            background-size: 100%;
        }
        .buttontheme{
            border-radius:10px;
            size: 30px;
        }
    </style>
        
    <body class="backtheme">
       
        
        <%@include file="userTop.jsp" %>

        <h1 style="color: #E6E7E9; margin-left: 40px; font-size: 60px; h" >SURE FOR </h1>
        <h1 style="color: #E6E7E9; margin-left: 40px; font-size: 60px;" >JOB </h1>
        <p style="color: #E6E7E9; margin-left: 50px; margin-top: -15px;" >Hand to Hand employment</p>
        <div align="right" style="margin-top: -80px ; margin-right: 100px;">
            <st:form action="userpassworddb.action" >
                <table cellspacing="5" cellpadding="3" style="background-color: rgba(105,91,80,0.5) ;width: 450px;"  >
                    <tr><td><st:textfield  label="Id" name="id" style="height:30px; width:250px;" /></td></tr>
                    <tr><td><st:password label="Old Password"  name="password" style="height:30px; width:250px;" /></td></tr>
                    <tr><td><st:password label="New Password"  name="newPassword" style="height:30px; width:250px;" /></td></tr>
                    <tr><td><st:password label="Confirm New Password"  name="confirmPassword" style="height:30px; width:250px;" /></td></tr>
                    <tr><td align="center" colspan="2" ><st:submit value="UPDATE" theme="simple"  style="border-radius:10px;font-size:15px;height:30px; width:100px;"  />
                            <st:reset value="CLEAR" theme="simple" style="border-radius:10px; height:30px; width:100px; font-size:15px;" /></td></tr>
                </table>
            </st:form>
        </div>
    </body>
</html>
