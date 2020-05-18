<%-- 
    Document   : Case
    Created on : May 15, 2020, 5:00:36 PM
    Author     : ranul
--%>

<%@page import="org.bson.types.ObjectId"%>
<%@page import="com.mongodb.DBObject"%>
<%@page import="javax.swing.table.DefaultTableModel"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
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
        <!-- Custom styles for this template -->
        <link href="assets/css/justified-nav.css" rel="stylesheet">
        <style>
            .nav-item.dropdown:hover .dropdown-menu {
                display: block;
            }
        </style>
        <style>
            #cases {
                font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
                border-collapse: collapse;
                width: 100%;
            }

            #cases td, #cases th {
                border: 1px solid #ddd;
                padding: 8px;
            }

            #cases tr:nth-child(even){background-color: #f2f2f2;}

            #cases tr:hover {background-color: #ddd;}

            #cases th {
                padding-top: 12px;
                padding-bottom: 12px;
                text-align: left;
                background-color: #585858;
                color: white;
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
                            <li class="nav-item ">
                                <a class="nav-link" href="Home.jsp">Home </a>
                            </li>
                            <li class="nav-item active">
                                <a class="nav-link" href="Case.jsp">Find a Case<span class="sr-only">(current)</span></a>
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
            <!-- Jumbotron -->
            <h2>Search Results</h2>
            <table id="cases">
                <tbody>
                    <tr>
                        <th>Case No</th>
                        <th>Party</th>
                        <th>Court Location</th>
                    </tr>
                    <c:forEach items="${requestScope.cases}" var="case">
                        <tr>
                            <td><c:out value="${case.CaseNo}"></c:out></td>
                            <td><c:out value="${case.Party}"></c:out></td>
                            <td><c:out value="${case.CourtLocation}"></c:out></td>
                            </tr>
                    </c:forEach>
                </tbody>
            </table>
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
