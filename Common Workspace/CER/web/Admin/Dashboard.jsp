<%-- 
    Document   : Dashboard
    Created on : May 16, 2020, 2:04:02 PM
    Author     : ranul
--%>
<%@page import="java.util.Map"%>
<%@page import="org.bson.Document"%>
<%@page import="com.mongodb.client.MongoDatabase"%>
<%@page import="com.mongodb.client.MongoClients"%>
<%@page import="com.mongodb.client.MongoClient"%>
<%@page import="com.mongodb.client.MongoCollection"%>
<%@page import="com.mongodb.client.FindIterable"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%
    MongoClient mongoClient = MongoClients.create("mongodb://admin:p5Dy6BoofEB9JAeB@cers-shard-00-00-qwvj6.mongodb.net:27017,cers-shard-00-01-qwvj6.mongodb.net:27017,cers-shard-00-02-qwvj6.mongodb.net:27017/test?ssl=true&replicaSet=CERs-shard-0&authSource=admin&retryWrites=true&w=majority");
    MongoDatabase database = mongoClient.getDatabase("CERdb");

    Document DB_Statistics = database.runCommand(new Document("dbstats", 1024));
    request.setAttribute("dbstats", DB_Statistics);

%>
<!DOCTYPE html>
<!doctype html>
<html lang="en">

    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="">
        <meta name="author" content="">
        <title>Dashboard</title>
        <link href="../assets/externalLibraries/bootstrap-v4.4.1/css/bootstrap.css" rel="stylesheet">
        <link href="../assets/css/dashboard.css" rel="stylesheet">
        <link rel="icon" href="../assets/images/favicon.png" type="image/png">
    </head>

    <body>
        <nav class="navbar navbar-dark fixed-top bg-light flex-md-nowrap p-0 shadow">
            <a class="navbar-brand col-sm-3 col-md-2 mr-0" href="#">Admin CER</a>
            <ul class="navbar-nav px-3">
                <li class="nav-item text-nowrap">
                    <a class="nav-link" style="color: black" href="../Home.jsp" >Sign out</a>
                </li>
            </ul>
        </nav>
        <div class="container-fluid">
            <div class="row">
                <!-- NAV BAR-->
                <nav class="col-md-2 d-none d-md-block bg-light sidebar">
                    <div class="sidebar-sticky">
                        <ul class="nav flex-column">
                            <li class="nav-item">
                                <a class="nav-link active" href="Dashboard.jsp"> <svg xmlns="http://www.w3.org/2000/svg" width="24"
                                                                                      height="24" viewbox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2"
                                                                                      stroke-linecap="round" stroke-linejoin="round" class="feather feather-home">
                                    <path d="M3 9l9-7 9 7v11a2 2 0 0 1-2 2H5a2 2 0 0 1-2-2z"></path>
                                    <polyline points="9 22 9 12 15 12 15 22"></polyline>
                                    </svg>
                                    Dashboard <span class="sr-only">(current)</span> </a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link " href="Users.jsp"> <svg xmlns="http://www.w3.org/2000/svg" width="24"
                                                                            height="24" viewbox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2"
                                                                            stroke-linecap="round" stroke-linejoin="round" class="feather feather-users">
                                    <path d="M17 21v-2a4 4 0 0 0-4-4H5a4 4 0 0 0-4 4v2"></path>
                                    <circle cx="9" cy="7" r="4"></circle>
                                    <path d="M23 21v-2a4 4 0 0 0-3-3.87"></path>
                                    <path d="M16 3.13a4 4 0 0 1 0 7.75"></path>
                                    </svg>
                                    Manage Users </a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="Settings.jsp"><svg xmlns="http://www.w3.org/2000/svg" width="24"
                                                                                    height="24" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2"
                                                                                    stroke-linecap="round" stroke-linejoin="round" class="feather feather-settings">
                                    <circle cx="12" cy="12" r="3"></circle>
                                    <path
                                        d="M19.4 15a1.65 1.65 0 0 0 .33 1.82l.06.06a2 2 0 0 1 0 2.83 2 2 0 0 1-2.83 0l-.06-.06a1.65 1.65 0 0 0-1.82-.33 1.65 1.65 0 0 0-1 1.51V21a2 2 0 0 1-2 2 2 2 0 0 1-2-2v-.09A1.65 1.65 0 0 0 9 19.4a1.65 1.65 0 0 0-1.82.33l-.06.06a2 2 0 0 1-2.83 0 2 2 0 0 1 0-2.83l.06-.06a1.65 1.65 0 0 0 .33-1.82 1.65 1.65 0 0 0-1.51-1H3a2 2 0 0 1-2-2 2 2 0 0 1 2-2h.09A1.65 1.65 0 0 0 4.6 9a1.65 1.65 0 0 0-.33-1.82l-.06-.06a2 2 0 0 1 0-2.83 2 2 0 0 1 2.83 0l.06.06a1.65 1.65 0 0 0 1.82.33H9a1.65 1.65 0 0 0 1-1.51V3a2 2 0 0 1 2-2 2 2 0 0 1 2 2v.09a1.65 1.65 0 0 0 1 1.51 1.65 1.65 0 0 0 1.82-.33l.06-.06a2 2 0 0 1 2.83 0 2 2 0 0 1 0 2.83l-.06.06a1.65 1.65 0 0 0-.33 1.82V9a1.65 1.65 0 0 0 1.51 1H21a2 2 0 0 1 2 2 2 2 0 0 1-2 2h-.09a1.65 1.65 0 0 0-1.51 1z">
                                    </path>
                                    </svg>&nbsp;Settings</a>
                            </li>
                            <li class="nav-item">
                            </li>
                        </ul>
                        <ul class="nav flex-column mb-2">
                            <li class="nav-item">
                            </li>
                            <li class="nav-item">
                            </li>
                            <li class="nav-item">
                            </li>
                            <li class="nav-item">
                            </li>
                        </ul>
                    </div>
                </nav>
                <!-- NAV BAR-->
                <main role="main" class="col-md-9 ml-sm-auto col-lg-10 px-4">
                    <div class="chartjs-size-monitor"
                         style="position: absolute; left: 0px; top: 0px; right: 0px; bottom: 0px; overflow: hidden; pointer-events: none; visibility: hidden; z-index: -1;">
                        <div class="chartjs-size-monitor-expand"
                             style="position:absolute;left:0;top:0;right:0;bottom:0;overflow:hidden;pointer-events:none;visibility:hidden;z-index:-1;">
                            <div style="position:absolute;width:1000000px;height:1000000px;left:0;top:0"></div>
                        </div>
                        <div class="chartjs-size-monitor-shrink"
                             style="position:absolute;left:0;top:0;right:0;bottom:0;overflow:hidden;pointer-events:none;visibility:hidden;z-index:-1;">
                            <div style="position:absolute;width:200%;height:200%;left:0; top:0"></div>
                        </div>
                    </div>
                    <div
                        class="d-flex justify-content-between flex-wrap flex-md-nowrap align-items-center pt-3 pb-2 mb-3 border-bottom">
                        <h1 class="h2">Administrator</h1>
                        <div class="btn-toolbar mb-2 mb-md-0">

                            <h4>System Health</h4> 

                        </div>
                    </div>
                    <div>
                        <div style="width:50%;float:left">
                            <canvas id="myChart" width="819" height="409"
                                    style="display: block; height: 298px; width: 596px;">
                            </canvas>
                            <br>
                            <h2 style="text-align: center;">Current System Statistics</h2>
                        </div>
                        <div style="width:50%;float:left;">
                            <div class="table-responsive">
                                <table class="table table-striped table-sm">
                                    <thead></thead>
                                    <tbody>
                                        <tr>
                                            <th>System Unit</th>
                                            <th>Values</th>
                                        </tr>
                                        <c:forEach items="${requestScope.dbstats}" var="dbstats">
                                            <tr>
                                                <td><c:out value="${dbstats.getKey()}"></c:out></td>
                                                <td><c:out value="${dbstats.getValue()}"></c:out></td>
                                            </c:forEach>
                                        </tr>
                                    </tbody>
                                </table>
                            </div>
                        </div>
                    </div>
                </main>
            </div>
        </div>

        <script src="assets/js/jquery.min.js"></script>
        <script src="assets/js/popper.js"></script>
        <script src="bootstrap/js/bootstrap.min.js"></script>

        <script src="https://unpkg.com/feather-icons/dist/feather.min.js"></script>
        <script>feather.replace()</script>

        <script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.7.1/Chart.min.js"></script>
        <script>
            var ctx = document.getElementById("myChart");
            var myChart = new Chart(ctx, {
                type: 'pie',
                data: {
                    labels: [<c:forEach items="${requestScope.dbstats}" var="dbstats" begin="2">'<c:out value="${dbstats.getKey()}"></c:out>',</c:forEach>],
                            datasets: [{
                                    data: [<c:forEach items="${requestScope.dbstats}" var="dbstats" begin="2"><c:out value="${dbstats.getValue()}"></c:out>,</c:forEach>],
                                    backgroundColor: ["#80ffbf", "#33ff99", "#00ff80", "#00cc66", "#4dc3ff", "#1ab2ff", "#0088cc", "#8585ad", "#666699", "#47476b", "#ff8080", "ff5050"],
                                }]
                },
                options: {
                    animation: {
                        easing: 'linear'
                    }
                }

            });
        </script>
    </body>

</html>