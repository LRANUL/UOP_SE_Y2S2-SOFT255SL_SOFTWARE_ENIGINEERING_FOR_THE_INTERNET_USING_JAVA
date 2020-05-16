<%-- 
    Document   : Document
    Created on : May 17, 2020, 3:11:47 AM
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
    <!-- Bootstrap core CSS -->
    <link href="assets/externalLibraries/bootstrap-v4.4.1/css/bootstrap.css" rel="stylesheet">
    <!-- Importing Fontawesome from Localhost -->
    <link rel="stylesheet" type="text/css" href="assets/externalLibraries/fontawesome-v5.13.0/css/all.css">
    <!-- Custom styles for this template -->
    <link href="assets/css/justified-nav.css" rel="stylesheet">
    <style>
        .nav-item.dropdown:hover .dropdown-menu {
            display: block;
        }
    </style>
    <link rel="icon" href="assets/images/favicon.png" type="image/png">
</head>

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
                        <li class="nav-item active">
                            <a class="nav-link" href="Home.jsp">Home <span class="sr-only">(current)</span></a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="Case.jsp">Find a Case</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="Document.jsp">Request Case Documents</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="Services.jsp">Services</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="About.jsp">About</a>
                        </li>
                    </ul>
                </div>
                <!-- LOGIN BUTTON -->
                <button class="btn" id="loginButton" type="button" onclick="location.href='Login.jsp'">
                    <p id="loginButtonText">LOGIN</p>
                </button>
                <!-- REGISTER BUTTON -->
                <button class="btn" id="registerButton" type="button"
                data-toggle="modal" data-target="#registerModal">
                    <p id="registerButtonText">REGISTER</p>
                </button>
            </nav>
        </div>
        <div>
                <img src="assets/images/doc_cover.jpg" style="width:100%;height:200px">
            </div>
        <!-- Jumbotron -->
        <div class="jumbotron">
            <div class="row">
                <div class="col-lg-auto">
                    <h2>Find a Case Document</h2>
                    <p class="text-left">Insert Your Case Number to Find Documents</p>
                    <p></p>
                </div>
            </div>
            <div class="input-group">
                 <form name="CaseNoSearch" method="post" action="DocumentSearch">
                        <input type="text" name="CaseNumber" class="form-control bg-white" placeholder="Case Number" >
                        <button type="submit" class="btn-sm btn-outline-secondary">Search</button>
                    </form>
            </div>
        </div>
        <!-- Example row of columns -->
        <!-- Site footer -->
        <footer class="footer">
            <p class="text-center">&copy; CER</p>
        </footer>
        <!-- Retrieving RegisterModal Webpage -->
        <%@include file="RegisterModal.html" %>
    </div>
    <!-- /container -->
     <!-- Bootstrap core JavaScript
    ================================================== -->
        <!-- Placed at the end of the document so the pages load faster -->
        <script src="assets/externalLibraries/bootstrap-v4.4.1/js/jquery.min.js"></script>
        <script src="assets/externalLibraries/bootstrap-v4.4.1/js/popper.min.js"></script>
        <script src="assets/externalLibraries/bootstrap-v4.4.1/js/bootstrap.min.js"></script>
</body>

</html>