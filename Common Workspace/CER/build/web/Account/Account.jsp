<%-- 
    Document   : Account
    Created on : May 16, 2020, 12:37:10 PM
    Author     : ranul
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    String Email = (String) session.getAttribute("Email");

    if(Email==null){
    response.sendRedirect("../Home.jsp");
    }
    
%>
<!doctype html>
<html lang="en">

    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="">
        <meta name="author" content="">
        <title>Account</title>
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
                                <a class="nav-link active" href="Account.jsp"> <svg xmlns="http://www.w3.org/2000/svg"
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
                        <h1 class="h2">Home</h1>
                        <div class="btn-toolbar mb-2 mb-md-0">

                            <h4>Search Cases</h4>

                        </div>

                    </div>
                    <div class="input-group">
                        <form name="CaseSearch" method="post" action="../Account/Case">
                            <input type="text" name="CaseNo" class="form-control bg-white" placeholder="Case Number" >
                            <button type="submit" class="btn-sm btn-outline-secondary">Search</button>
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
