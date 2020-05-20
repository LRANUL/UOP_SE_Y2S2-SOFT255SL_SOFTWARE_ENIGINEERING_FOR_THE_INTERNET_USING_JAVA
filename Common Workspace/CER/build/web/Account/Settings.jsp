<%-- 
    Document   : Settings
    Created on : May 17, 2020, 1:04:10 PM
    Author     : ranul
--%>

<%@page import="com.mongodb.BasicDBObject"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.mongodb.client.FindIterable"%>
<%@page import="com.mongodb.client.MongoClients"%>
<%@page import="com.mongodb.client.MongoCollection"%>
<%@page import="com.mongodb.client.MongoDatabase"%>
<%@page import="com.mongodb.client.MongoClient"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%

    String Email = (String) session.getAttribute("Email");
    /*Sample Data till Auth System is Connected*/
    Email = "smithanderson@sample.com";
    MongoClient mongoClient = MongoClients.create("mongodb://admin:p5Dy6BoofEB9JAeB@cers-shard-00-00-qwvj6.mongodb.net:27017,cers-shard-00-01-qwvj6.mongodb.net:27017,cers-shard-00-02-qwvj6.mongodb.net:27017/test?ssl=true&replicaSet=CERs-shard-0&authSource=admin&retryWrites=true&w=majority");
    MongoDatabase database = mongoClient.getDatabase("CERdb");
    MongoCollection<org.bson.Document> collection = database.getCollection("users");
    BasicDBObject query = new BasicDBObject().append("emailAddress", Email);
    FindIterable document = collection.find(query);
    ArrayList<org.bson.Document> docs = new ArrayList<org.bson.Document>();
    document.into(docs);
    request.setAttribute("details", docs);

%>
<!doctype html>
<html lang="en">

    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="">
        <meta name="author" content="">
        <title>Account - Settings</title>
        <link href="../assets/externalLibraries/bootstrap-v4.4.1/css/bootstrap.css" rel="stylesheet">
        <link href="../assets/css/account.css" rel="stylesheet">
        <link rel="icon" href="../assets/images/favicon.png" type="image/png">
    </head>

    <body>
        <nav class="navbar navbar-dark fixed-top bg-primary flex-md-nowrap p-0 shadow">
            <a class="navbar-brand col-sm-3 col-md-2 mr-0" href="#">CERs Account</a>
            <ul class="navbar-nav px-3">
                <li class="nav-item text-nowrap">
                    <a class="nav-link" href="../Home.jsp">Sign out</a>
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
                                <a class="nav-link " href="Account.jsp"> <svg xmlns="http://www.w3.org/2000/svg"
                                                                              width="24" height="24" viewbox="0 0 24 24" fill="none" stroke="currentColor"
                                                                              stroke-width="2" stroke-linecap="round" stroke-linejoin="round"
                                                                              class="feather feather-home">
                                    <path d="M3 9l9-7 9 7v11a2 2 0 0 1-2 2H5a2 2 0 0 1-2-2z"></path>
                                    <polyline points="9 22 9 12 15 12 15 22"></polyline>
                                    </svg>
                                    Home <span class="sr-only">(current)</span> </a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="Document.jsp"><svg xmlns="http://www.w3.org/2000/svg" width="24"
                                                                             height="24" viewbox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2"
                                                                             stroke-linecap="round" stroke-linejoin="round" class="feather feather-file">
                                    <path d="M13 2H6a2 2 0 0 0-2 2v16a2 2 0 0 0 2 2h12a2 2 0 0 0 2-2V9z"></path>
                                    <polyline points="13 2 13 9 20 9"></polyline>
                                    </svg>&nbsp;Request Documents</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="Orders.jsp"><svg xmlns="http://www.w3.org/2000/svg" width="24"
                                                                           height="24" viewbox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2"
                                                                           stroke-linecap="round" stroke-linejoin="round"
                                                                           class="feather feather-shopping-cart">
                                    <circle cx="9" cy="21" r="1"></circle>
                                    <circle cx="20" cy="21" r="1"></circle>
                                    <path d="M1 1h4l2.68 13.39a2 2 0 0 0 2 1.61h9.72a2 2 0 0 0 2-1.61L23 6H6"></path>
                                    </svg>&nbsp;Past Orders</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="Feedback.jsp">
                                    <svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24"
                                         fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round"
                                         stroke-linejoin="round" class="feather feather-message-circle">
                                    <path
                                        d="M21 11.5a8.38 8.38 0 0 1-.9 3.8 8.5 8.5 0 0 1-7.6 4.7 8.38 8.38 0 0 1-3.8-.9L3 21l1.9-5.7a8.38 8.38 0 0 1-.9-3.8 8.5 8.5 0 0 1 4.7-7.6 8.38 8.38 0 0 1 3.8-.9h.5a8.48 8.48 0 0 1 8 8v.5z">
                                    </path>
                                    </svg>&nbsp;Feedback</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link active" href="Settings.jsp"><svg xmlns="http://www.w3.org/2000/svg" width="24"
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
                    <div
                        class="d-flex justify-content-between flex-wrap flex-md-nowrap align-items-center pt-3 pb-2 mb-3 border-bottom">
                        <h1 class="h2">Settings</h1>
                        <div class="btn-toolbar mb-2 mb-md-0">
                        </div>
                    </div>
                    <div>
                        <h4>Your Details</h4>                      
                        <c:forEach items="${requestScope.details}" var="details">
                            <h6>Name: <c:out value="${details.name.prefix}"></c:out> <c:out value="${details.name.firstName}"></c:out> <c:out value="${details.name.middleName}"></c:out> <c:out value="${details.name.lastName}"></c:out> </h6>
                            <h6>Email: <% out.print(Email);%></h6>
                            <h6>NIC No: <c:out value="${details.nic}"></c:out></h6>
                            <h6>Street: <c:out value="${details.address.streetAddress}"></c:out></h6>
                            <h6>City: <c:out value="${details.address.city}"></c:out></h6>
                            <h6>Zip: <c:out value="${details.address.zipPostalCode}"></c:out></h6>
                            <h6>District: <c:out value="${details.address.district}"></c:out></h6>

                        </c:forEach>
                        <hr>
                        <h6>Update Password</h6>
                        <p>Enter your new password and press Change Password to update credentials</p>
                        <form name="updatePassword" method="post" action="../Office/Account" >
                            <input hidden type="text" name="Request" value="CustomerPassword">
                            <input hidden type="text" name="Email" value="<% out.print(Email);%>">
                            <input type="password" name="Password" class="form-control bg-white" placeholder="Enter New Password" style="width:250px">
                            <button type="submit" class="btn btn-outline-danger">Change Password</button>
                        </form>
                        <hr>
                        <h6>Update Address</h6>
                        <p>Enter your new Address details and press Update Address to update details</p>
                        <form name="updateAddress" method="post" action="../Office/Account" >
                            <input hidden type="text" name="Request" value="CustomerAddress">
                            <input hidden type="text" name="Email" value="<% out.print(Email);%>">
                            <input type="text" name="streetAddress" class="form-control bg-white" placeholder="Enter New Street Address" style="width:350px">
                            <input type="text" name="city" class="form-control bg-white" placeholder="Enter New City Name" style="width:350px">
                            <input type="text" name="zipPostalCode" class="form-control bg-white" placeholder="Enter New Zip code" style="width:350px">
                            <input type="text" name="district" class="form-control bg-white" placeholder="Enter New District Name" style="width:350px">
                            <button type="submit" class="btn btn-outline-primary">Update Address</button>
                        </form>
                    </div>
                </main>
            </div>
        </div>

        <script src="assets/js/jquery.min.js"></script>
        <script src="assets/js/popper.js"></script>
        <script src="bootstrap/js/bootstrap.min.js"></script>

        <script src="https://unpkg.com/feather-icons/dist/feather.min.js"></script>
        <script>feather.replace()</script>

    </body>

</html>
