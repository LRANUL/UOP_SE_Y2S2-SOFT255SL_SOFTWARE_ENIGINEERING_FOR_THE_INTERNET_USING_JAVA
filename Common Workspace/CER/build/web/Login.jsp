<%-- 
    Document   : Login
    Created on : May 17, 2020, 3:13:30 AM
    Author     : ranul
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="">
        <meta name="author" content="">
        <title>CER - Home</title>
         <script>
            function validLogin(){
            if (document.loginForm.emailAddress.value == "" && document.loginForm.username.value == ""){
               alert ( "Please enter all the fields" );
               return false;
            }
            if (document.loginForm.emailAddress.value == ""){
               alert ( "Please enter your username" );
               return false;
            }
            if (document.loginForm.password.value == ""){
               alert ( "Please enter your password." );
               return false;
            }
            return true;
         }
         </script>
        <!-- Bootstrap core CSS -->
        <link href="assets/externalLibraries/bootstrap-v4.4.1/css/bootstrap.css" rel="stylesheet">
        <!-- Importing Fontawesome from Localhost -->
        <link rel="stylesheet" type="text/css" href="assets/externalLibraries/fontawesome-v5.13.0/css/all.css">
        <!-- Custom styles for this template -->
        <link href="assets/css/justified-nav.css" rel="stylesheet"><style>
            .nav-item.dropdown:hover .dropdown-menu {display: block;}
                .back{
                background-image: url("assets/images/background.jpg");
                background-repeat: no-repeat;
                background-size: cover;
                background-attachment: fixed;
                 }
                 .no-back{
                background-color: white;
                }
                 .l_back{
                background-image: url("assets/images/login.jpeg");
                background-repeat: no-repeat;
                }
                select{
                width: 180px;
                padding-top: 10px;
                }
        </style>
        <link rel="icon" href="assets/images/favicon.png" type="image/png">    </head>
    <body>
        <div class="container">
            <div class="masthead">
                <h3 class="text-muted">Court Electronic Record system (CERs)</h3>
                <nav class="navbar navbar-expand-md navbar-light bg-light rounded mb-3">
                    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarCollapse"
                        aria-controls="navbarCollapse" aria-expanded="false" aria-label="Toggle navigation">
                        <span class="navbar-toggler-icon"></span>
                    </button>
                    <div class="collapse navbar-collapse" id="navbarCollapse">
                        <ul class="navbar-nav text-md-center nav-justified w-100">
                            <li class="nav-item">
                                <a class="nav-link" href="Home.jsp">Home</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="Case.jsp">Find a Case</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="Document.jsp">Request Case Documents</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="Services.jsp">Forum</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="About.jsp">About</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="Contact.html">Contact</a>
                            </li>
                            <li class="nav-item dropdown">
                                <a class="nav-link dropdown-toggle" id="dropdown01" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">Language</a>
                                <div class="dropdown-menu" aria-labelledby="dropdown01">
                                    <a class="dropdown-item" href="Home.jsp">English</a>
                                    <a class="dropdown-item" href="Sinhala.html">සිංහල</a>
                                </div>
                            </li>
                        </ul>
                    </div>
                    <!-- REGISTER BUTTON -->
                    <button class="btn" id="registerButton" type="button"
                    data-toggle="modal" data-target="#registerModal">
                        <p id="registerButtonText">REGISTER</p>
                    </button>
                </nav>
            </div>
            </div>  
 
            <div class="row justify-content-center" style="padding-top: 50px;">
          <div class="col-3 no-back pt-5 pb-5">
        <img src="assets/images/profile.png" style=" width: 100px; height: 100px;"  class="rounded mx-auto d-block">
        <h3 style=" text-align: center; padding-top: 10px;"> Welcome</h3> 
        <style>
            .loginFormInput{
                margin-top: -15px;
                height: 50px;
                width: 300px;
                border-radius: 5px;
                font-size: 18px;
                border: #ccc solid 1px;
            }
            #loginButton{
                font-size: 22px;
                width: 260px;
                letter-spacing: 2px;
                height: 50px;
                position: relative;
                font-weight: 500;
                left: 20px;
                top: 0px;
                border-color: rgb(13, 153, 218);
                color: #ffffff;
                background-color: rgb(13, 153, 218);
            }
            #loginButton:hover{
                border-color: rgb(13, 153, 218);
                color: rgb(13, 153, 218);
                background-color: #ffffff;
            }
        </style>
        <div style=" padding-left: 60px; padding-top: 20px;">
            <br>
            <form name="loginForm" method="POST" action="LoginServlet" onsubmit="return validLogin();">
                <p style="font-size: 20px; 
                        padding-bottom: 0px;">
                    Email Address
                </p>
                <input type="email" name="emailAddress" size="30" class="form-control loginFormInput" style="margin-bottom: -20px;" required>
                <br>
                <p style="font-size: 20px; 
                        padding-bottom: 0px; 
                        padding-top: 20px;">
                    Password
                </p>
                <input type="password" name="password" size="30" class="form-control loginFormInput" required>
                <br>
                <button class="btn btn-primary" name="submit" type="submit" id="loginButton">
                    <p>LOGIN</p>
                </button>
            </form>
            <!-- LOGIN CREDENTIAL ERROR MESSAGES -->
            <%
                String loginNoRecordFound = null;
                loginNoRecordFound = (String)request.getAttribute("loginNoRecordFound");
                if(loginNoRecordFound != null){
            %>
                <p style="letter-spacing: 1px;
                          font-size: 18px;
                          color:rgb(214, 0, 0);
                          margin-top: 10px;
                          position: absolute;
                          left: 30%;">NO RECORD FOUND</p>
            <%}%>
            <%
                String loginPasswordIncorrect = null;
                loginPasswordIncorrect = (String)request.getAttribute("loginPasswordIncorrect");
                if(loginPasswordIncorrect != null){
            %>
                <p style="letter-spacing: 1px;
                            font-size: 22px;
                            font-weight: 700;
                            color:rgb(214, 0, 0);
                            margin-top: 10px;
                            position: absolute;
                            left: 18%;">ENTERED PASSWORD INCORRECT</p>
            <%}%>
            <%
                String accountStatusDisabled = null;
                accountStatusDisabled = (String)request.getAttribute("accountStatusDisabled");
                if(accountStatusDisabled != null){
            %>
                <p style="letter-spacing: 1px;
                            font-size: 22px;
                            font-weight: 700;
                            color:rgb(214, 0, 0);
                            margin-top: 10px;
                            position: absolute;
                            left: 22%;">ACCOUNT IS DISABLED</p>
            <%}%>
            <%
                String accountStatusPending = null;
                accountStatusPending = (String)request.getAttribute("accountStatusPending");
                if(accountStatusPending != null){
            %>
                <p style="letter-spacing: 1px;
                            font-size: 22px;
                            font-weight: 700;
                            color:rgb(214, 0, 0);
                            margin-top: 0px;
                            position: absolute;
                            left: 18%;">ACCOUNT REGISTRATION <br>
                    <span style="position: absolute;
                                   left: 21%;">UNDER REVIEW</span>
                </p>
            <%}%>
        </div>
        <p style="text-align: center;
                position: relative;
                bottom: -64px;
                left: 5px;
                "> Don't have an account? <a href="#" data-toggle="modal" data-target="#registerModal">Join Now</a></p>
    </div>
    <div class="col-3 l_back">
        <h2 class="d-flex justify-content-center" style="color: rgb(247, 247, 247);
                                                        margin-top: 180px;
                                                        margin-left: 10px;
                                                        letter-spacing: 4px;
                                                        text-shadow: -1px 0 black, 0 1px black, 1px 0 black, 0 -1px black;">
                                                        <strong> CERs -</strong></h2>
        <h2 class="d-flex justify-content-center" style="color: rgb(247, 247, 247);
                                                        margin-top: 10px;
                                                        letter-spacing: 1px;
                                                        margin-left: 20px;
                                                        text-shadow: -1px 0 black, 0 1px black, 1px 0 black, 0 -1px black;">
                                                        <strong>Court Electronic Record <span style="margin-left: 32%;">System</span></strong></h2>
        </div>
    </div>
            <!-- Site footer -->
            <footer class="footer">
                <p class="text-center">&copy; CER</p>
            </footer>
            <!-- Retrieving RegisterModal Webpage -->
            <%@include file="RegisterModal.html" %>
               
        <!-- /container -->
         <!-- Bootstrap core JavaScript
    ================================================== -->
        <!-- Placed at the end of the document so the pages load faster -->
        <script src="assets/externalLibraries/bootstrap-v4.4.1/js/jquery.min.js"></script>
        <script src="assets/externalLibraries/bootstrap-v4.4.1/js/popper.min.js"></script>
        <script src="assets/externalLibraries/bootstrap-v4.4.1/js/bootstrap.min.js"></script>
    </body>
</html>
