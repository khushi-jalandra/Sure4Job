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
        
        <div align="right" style="margin-top: -250px ; margin-right: 150px;">
            <st:form action="signupdb.action" enctype="multipart/form-data"  >
                <table cellspacing="5" cellpadding="3" style="background-color: rgba(105,91,80,0.5) ;width: 450px;"  >
                   <tr><td><st:textfield  label="Id" name="id" style="height:30px; width:250px;" /></td></tr>
                    <tr><td><st:textfield  label="Name" name="userName" style="height:30px; width:250px;" /></td></tr>
                    <tr><td><st:password label="Password"  name="password" style="height:30px; width:250px;" /></td></tr>
                    <tr><td><st:textfield  label="E-mail" name="email" style="height:30px; width:250px;" /></td></tr>
                    <tr><td><st:textfield  label="Contact" name="contact" style="height:30px; width:250px;" /></td></tr>
                    <tr><td><st:textarea  label="Address" name="Address" style="height:30px; width:250px;" /></td></tr>
                    <tr><td><st:textfield  label="Qualification" name="Qualification" style="height:30px; width:250px;" /></td></tr>
                    <tr><td><st:textfield  label="Status" name="Status" style="height:30px; width:250px;" /></td></tr>
                    <tr><td><st:file  label="Photo" name="photo" style="height:30px; width:250px;" /></td></tr>
                    <tr><td><st:textfield  label="10th-percentage" name="percentage_10" style="height:30px; width:250px;" /></td></tr>
                    <tr><td><st:textfield  label="12th-percentage" name="percentage_12" style="height:30px; width:250px;" /></td></tr>
                    <tr><td><st:textfield  label="CGPA" name="cgpa" style="height:30px; width:250px;" /></td></tr>
                    <tr><td><st:submit value="signup"/></td></tr>
                </table>
            </st:form>
        </div>
    </body>
</html>
