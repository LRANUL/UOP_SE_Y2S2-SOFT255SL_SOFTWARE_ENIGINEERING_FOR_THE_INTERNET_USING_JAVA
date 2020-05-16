<%-- 
    Document   : Document.jsp
    Created on : May 16, 2020, 1:59:31 AM
    Author     : ranul
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
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
                                <a class="nav-link" href="Home.html">Home <span class="sr-only">(current)</span></a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="Case.html">Find a Case</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="Document.html">Request Case Documents</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="Services.html">Services</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="About.html">About</a>
                            </li>
                        </ul>
                    </div>
                    <!-- LOGIN BUTTON -->
                    <button class="btn" id="loginButton" type="button" onclick="location.href='Login.html'">
                        <p id="loginButtonText">LOGIN</p>
                    </button>
                    <!-- REGISTER BUTTON -->
                    <button class="btn" id="registerButton" type="button" onclick="location.href='Register.html'">
                        <p id="registerButtonText">REGISTER</p>
                    </button>
                </nav>
            </div>
            <div>
                <img src="assets/images/doc_cover.jpg" style="width:100%;height:200px">
            </div>
            <!-- Jumbotron -->
            <h1>Search Results</h1>
            <c:forEach items="${requestScope.documents}" var="case">
                <h3>Case No: <c:out value="${case.CaseNo}"></c:out> held at Court: <c:out value="${case.CourtLocation}"></c:out></h3>
                <h6>Party - <c:out value="${case.Party}"></c:out></h6><br>
                <h6>Co-Parties - <c:out value="${case.CoParty}"></c:out></h6>
                <h6>Documents Available - <c:out value="${case.DocumentNo}"></c:out></h6>
                <h6>Next Hearing - <c:out value="${case.Hearing}"></c:out></h6>
                <h6>Description - <c:out value="${case.Description}"></c:out></h6>
                    <h5>Available as Print Cost LKR: 350.00</h5>
                    <p><i>LKR: 150.00 each additional copy.</i></p>
                    <p> Please Login to request documents </p> <a href="Login.html">Login</a>
            </c:forEach>

            <!-- Example row of columns -->
            <!-- Site footer -->
            <footer class="footer">
                <p class="text-center">&copy; CER</p>
            </footer>
        </div>
        <!-- /container -->

        <script src="assets/js/jquery.min.js"></script>
        <script src="assets/js/popper.js"></script>
        <script src="bootstrap/js/bootstrap.min.js"></script>
    </body>

</html>