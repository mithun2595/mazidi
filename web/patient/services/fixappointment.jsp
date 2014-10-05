<%-- 
    Document   : login
    Created on : Sep 30, 2014, 1:24:37 AM
    Author     : acer
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="pformat.css" type="text/css">
<SCRIPT LANGUAGE='JAVASCRIPT' TYPE='TEXT/JAVASCRIPT'>
<!--
var signupWindow=null;
function signup(mypage,myname,w,h,pos,infocus){

if (pos == 'random')
{LeftPosition=(screen.width)?Math.floor(Math.random()*(screen.width-w)):100;TopPosition=(screen.height)?Math.floor(Math.random()*((screen.height-h)-75)):100;}
else
{LeftPosition=(screen.width)?(screen.width-w)/2:100;TopPosition=(screen.height)?(screen.height-h)/2:100;}
settings='width='+ w + ',height='+ h + ',top=' + TopPosition + ',left=' + LeftPosition + ',scrollbars=no,location=no,directories=no,status=no,menubar=no,toolbar=no,resizable=no';signupWindow=window.open('',myname,settings);
if(infocus=='front'){signupWindow.focus();signupWindow.location=mypage;}
if(infocus=='back'){signupWindow.blur();signupWindow.location=mypage;signupWindow.blur();}

}
// -->
</script>
        <title>Appointment</title>
    </head>
    <body background="login.jpg">
        <header>
<h1>Princeton-Plainsboro Teaching Hospital</h1>
</header>
        <section>
            <h2 ><center>Request an appointment</center></h2>
       
        <form action="../../FixAppointment" method="post">
            <div>
                <label>Name:</label><input type="text" name="pname" /><br><br>
                <label>User Name:</label><input type="text" name="uname" /><br><br>
                <label>Required Specialist:</label><select name="sel" align="center">
                                   <option value="genchk">General Checkup</option>
                                  <option value="gensurg">General Surgery</option>
                                  <option value="plasurg">Plastic Surgery</option>
                                  <option value="cardio">Cardiology</option>
                                  <option value="ent">ENT</option>
                                <option value="pedia">Pediatric</option>
                                <option value="dent">Dentist</option>
                                <option value="Gyne">Gynecologist</option>
                                <option value="ortho">Orthopedic</option>
                                
            </select><br><br>
            <label>Intern Required:</label><input type="radio" name="intern" value="No"> No</input>
                                           <input type="radio" name="intern" value="Yes"> Yes</input><br><br>
            
            <label>Message :</label><textarea rows="4" cols="50" name="msg" ></textarea><br><br>
            <div style="text-align:center">
            <input type="submit" value="Submit your request" />
            </div><br><br><br><br>
            <label>   <a style="font-size:17px;color:red;font-family:verdana;" align="center" href="javascript:signup('signup.jsp','pagename','440','480','center','front');">New User?</a>
            </label></section>  
 <footer>
Copyright ©Princeton-Plainsboro.com
</footer>           
        </form>
    </body>
</html>
