<%-- 
    Document   : Services
    Created on : May 17, 2020, 3:15:04 AM
    Author     : ranul
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="com.mongodb.client.FindIterable"%>
<%@page import="com.mongodb.client.MongoCollection"%>
<%@page import="com.mongodb.client.MongoClients"%>
<%@page import="com.mongodb.client.MongoDatabase"%>
<%@page import="com.mongodb.client.MongoClient"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%
    MongoClient mongoClient = MongoClients.create("mongodb://admin:p5Dy6BoofEB9JAeB@cers-shard-00-00-qwvj6.mongodb.net:27017,cers-shard-00-01-qwvj6.mongodb.net:27017,cers-shard-00-02-qwvj6.mongodb.net:27017/test?ssl=true&replicaSet=CERs-shard-0&authSource=admin&retryWrites=true&w=majority");
    MongoDatabase database = mongoClient.getDatabase("CERdb");

    MongoCollection<org.bson.Document> collection = database.getCollection("forum");
    FindIterable document = collection.find();
    ArrayList<org.bson.Document> docs = new ArrayList<org.bson.Document>();
    document.into(docs);
    request.setAttribute("comments", docs);
%>
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
        <link href="assets/css/justified-nav.css" rel="stylesheet"><style>
            .nav-item.dropdown:hover .dropdown-menu {display: block;}
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
                            <li class="nav-item">
                                <a class="nav-link" href="Case.jsp">Find a Case</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="Document.jsp">Request Case Documents</a>
                            </li>
                            <li class="nav-item active">
                                <a class="nav-link" href="Services.jsp">Forum<span class="sr-only">(current)</span></a>
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
                    <button class="btn" id="loginButton" type="button" onclick="location.href = 'Login.jsp'">
                        <p id="loginButtonText">LOGIN</p>
                    </button>
                    <!-- REGISTER BUTTON -->
                    <button class="btn" id="registerButton" type="button"
                            data-toggle="modal" data-target="#registerModal">
                        <p id="registerButtonText">REGISTER</p>
                    </button>
                </nav>
            </div>
            <h2>CERs Forum</h2>
            <p class="lead">Having questions, discuss and provide your comment to improve our services</p>
            <div class="row">
                <div class="input-group">
                    <form name="forumForm" method="post" action="Services" id='commentForm'>
                        <input type="text" name="Email" class="form-control bg-white" placeholder="Email Address" style="width:150px">
                        <textarea rows="2" cols="50" class="form-control bg-white" name="Comment" form="commentForm" placeholder="Enter your comment here !"></textarea>
                        <button type="submit" class="btn-sm btn-outline-success">Comment</button>
                    </form>
                </div>
            </div>
            <hr>
            <div class="container h-100">
                <div class="row h-100 justify-content-center align-items-center" >
                    <c:forEach items="${requestScope.comments}" var="comment">
                        <div class="card card-block w-25 bg-white clear-left" style="margin-right: 100px;margin-top: 20px" >
                            <div>
                                <img src='assets/images/profile.png' style='width:40px;'><c:out value="${comment.Email}"></c:out><br>
                                <c:out value="${comment.Comment}"></c:out><br>
                                <b style="font-size:8px;font-family: Arial">Comment added on <c:out value="${comment.DateTime}"></c:out></b>
                                </div>
                            </div><br>
                    </c:forEach>
                </div>
            </div>

        </div>
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