<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="st" uri="/struts-tags" %>
<style>

    a{
                    
        font-size: 20px;
        text-decoration: none;
        color: white;
        font-weight: bolder;
    }
    .tdtheme :hover{
 text-decoration: underline;
    }
</style>


<table style="background-color:rgba(105,91,80,0.5); margin-left: 560px; height: 50px;">
    <tr >
        <td align="center" class="tdtheme" style="width: 220px;" ><st:a href="loadpage.action">HOME</st:a></td>
        <td  align="center" class="tdtheme" style="width: 220px;" ><st:a href="jobpage.action">JOB ACCEPT</st:a></td>
        <td align="center"  class="tdtheme" style="width: 220px;" ><st:a href="settingpage.action">SETTINGS</st:a></td>
        <td align="center"  class="tdtheme" style="width: 220px;" ><st:a href="userdelete.action">DELETE ACCOUNT</st:a></td>
        <td align="center"  class="tdtheme" style="width: 220px;" ><st:a href="homepage.action">LOGOUT</st:a></td>
</table>