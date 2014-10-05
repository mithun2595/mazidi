<%-- 
    Document   : index
    Created on : Sep 29, 2014, 5:39:59 PM
    Author     : acer
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="format.css" type="text/css">
        <title>Princeton-Plainsboro Teaching Hospital</title>
        <SCRIPT LANGUAGE='JAVASCRIPT' TYPE='TEXT/JAVASCRIPT'>
<!--
var popupWindow=null;
function popup(mypage,myname,w,h,pos,infocus){

if (pos == 'random')
{LeftPosition=(screen.width)?Math.floor(Math.random()*(screen.width-w)):100;TopPosition=(screen.height)?Math.floor(Math.random()*((screen.height-h)-75)):100;}
else
{LeftPosition=(screen.width)?(screen.width-w)/2:100;TopPosition=(screen.height)?(screen.height-h)/2:100;}
settings='width='+ w + ',height='+ h + ',top=' + TopPosition + ',left=' + LeftPosition + ',scrollbars=no,location=no,directories=no,status=no,menubar=no,toolbar=no,resizable=no';popupWindow=window.open('',myname,settings);
if(infocus=='front'){popupWindow.focus();popupWindow.location=mypage;}
if(infocus=='back'){popupWindow.blur();popupWindow.location=mypage;popupWindow.blur();}

}
// -->
</script>
    </head>
    <body background="login.jpg">
        
<header>
<h1>Princeton-Plainsboro Teaching Hospital</h1>
</header>

<nav>
    <a href="patient/patient.html">Patient Section</a><br><br>
    <a href=".jsp">Doctor Section</a><br><br>
    <a href="javascript:popup('nurse/nlogin.jsp','pagename','480','480','center','front');">Nurse Section</a><br><br>
    <a href="doclogin.jsp">Intern Section</a><br><br>
    <a href="doclogin.jsp">Receptionist</a><br><br>
    <a href="doclogin.jsp">Accountant</a>
</nav>
 
<section>
<h1>About Us</h1>
<p>
    Princeton-Plainsboro Teaching Hospital is one of the biggest NHS trusts in the country, offering a range of both general and specialist hospital services, with excellent clinical outcomes for patients. 
    We have an international reputation for excellence in specialist care, research and academic training.</p>
<p>
We ensure well managed hospitals which provide safe, high quality care to every patient, every time, is the ultimate responsibility of the Trust Board, which is leading our drive to become an NHS Foundation Trust.
We genuinely want to work with patients and the public to develop and enhance our services, and welcome feedback on all aspects of our care.
</p>

</section>

<footer>
Copyright ©Princeton-Plainsboro.com
</footer>

    </body>
</html>
