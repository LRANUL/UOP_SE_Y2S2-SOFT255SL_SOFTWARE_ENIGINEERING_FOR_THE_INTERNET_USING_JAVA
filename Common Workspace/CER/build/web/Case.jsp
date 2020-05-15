<%-- 
    Document   : Case
    Created on : May 15, 2020, 5:00:36 PM
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
                            <li class="nav-item dropdown">
                                <a class="nav-link dropdown-toggle" id="dropdown01" data-toggle="dropdown"
                                   aria-haspopup="true" aria-expanded="false">Account</a>
                                <div class="dropdown-menu" aria-labelledby="dropdown01">
                                    <a class="dropdown-item" href="Login.html">Login</a>
                                    <a class="dropdown-item" href="Register.html">Register</a>
                                </div>
                            </li>
                        </ul>
                    </div>
                </nav>
            </div>
            <!-- Jumbotron -->
            <div class="jumbotron">
                <div class="row">
                    <div class="col-lg-auto">
                        <h2>Find a Case</h2>
                        <p class="text-left">Insert Your Case Number</p>
                        <p></p>
                    </div>
                </div>
                <div class="input-group">
                    <form name="CaseNoSearch" method="post" action="Case.jsp">
                        <input type="text" name="CaseNo" class="form-control bg-white" placeholder="Case Number" >
                        <button type="submit" class="btn-sm btn-outline-secondary">Search</button>
                    </form>
                </div>
                <h4>Or by Court Location</h4>
                <div class="input-group">
                    <form name="CaseLocationSearch" method="post" action="Case.jsp">
                        <input type="text" name="CourtLocation" class="form-control bg-white" placeholder="Court Location">
                        <button type="submit" class="btn-sm btn-outline-secondary">Search</button>
                    </form>
                </div>

                <h2>Search Results</h2>
                <%@page import="com.mongodb.BasicDBObject"%>
                <%@page import="com.mongodb.client.FindIterable"%>
                <%@page import="java.io.IOException"%>
                <%@page import="java.io.PrintWriter"%>
                <%@page import="javax.servlet.ServletException"%>
                <%@page import="javax.servlet.annotation.WebServlet"%>
                <%@page import="javax.servlet.http.HttpServlet"%>
                <%@page import="javax.servlet.http.HttpServletRequest"%>
                <%@page import="javax.servlet.http.HttpServletResponse"%>
                <%@page import="com.mongodb.client.MongoClients"%>
                <%@page import="com.mongodb.client.MongoCollection"%>
                <%@page import="com.mongodb.client.MongoCursor"%>
                <%@page import="com.mongodb.client.MongoClient"%>
                <%@page import="org.bson.Document"%>
                <%@page import="com.mongodb.client.MongoDatabase"%>
                <%@page import="java.util.ArrayList"%>
                <%

                    String CourtLocation = request.getParameter("CourtLocation");
                    String CaseNumber = request.getParameter("CaseNumber");
                    MongoClient mongoClient = MongoClients.create("mongodb://admin:p5Dy6BoofEB9JAeB@cers-shard-00-00-qwvj6.mongodb.net:27017,cers-shard-00-01-qwvj6.mongodb.net:27017,cers-shard-00-02-qwvj6.mongodb.net:27017/test?ssl=true&replicaSet=CERs-shard-0&authSource=admin&retryWrites=true&w=majority");
                    MongoDatabase database = mongoClient.getDatabase("CERdb");

                    MongoCollection<Document> collection = database.getCollection("cases");
//                    if (CaseNumber != null) {
                        BasicDBObject query = new BasicDBObject();
                        query.put("CaseNo", "'" + CaseNumber + "'");
                        FindIterable document = collection.find(query);
                        ArrayList<Document> docs = new ArrayList<Document>();
                        document.into(docs);
                        PrintWriter writer = response.getWriter();

                        for (Document doc : docs) {
                            System.out.println(doc);
                            String htmlRespone = "<html>";
                            htmlRespone += "<h2>Search Results : " + doc + "</h2>";
                            htmlRespone += "</html>";
                            writer.println(htmlRespone);

                        }

                    }
                    if (CourtLocation != null) {
                        BasicDBObject query = new BasicDBObject();
                        query.put("CourtLocation", "'" + CourtLocation + "'");
                        FindIterable document = collection.find(query);
                        ArrayList<Document> docs = new ArrayList<Document>();
                        document.into(docs);
                        PrintWriter writer = response.getWriter();

                        for (Document doc : docs) {
                            System.out.println(doc);
                            String htmlRespone = "<html>";
                            htmlRespone += "<h2>Search Results : " + doc + "</h2>";
                            htmlRespone += "</html>";
                            writer.println(htmlRespone);

                        }
                    }
                %>
            </div>
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
