<%-- 
    Document   : Register
    Created on : May 13, 2020, 8:00:43 PM
    Author     : ranul
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="">
        <meta name="author" content="">
        <title>CER - Home</title>
        <!-- Bootstrap core CSS -->
        <link href="bootstrap/css/bootstrap.css" rel="stylesheet">
        <!-- Custom styles for this template -->
        <link href="justified-nav.css" rel="stylesheet">
    </head>
    <body>
        <div class="container">
            <div class="masthead">
                <h3 class="text-muted">Court Electronic Record system (CERs)</h3>
                <nav class="navbar navbar-expand-md navbar-light bg-light rounded mb-3">
                    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarCollapse" aria-controls="navbarCollapse" aria-expanded="false" aria-label="Toggle navigation">
                        <span class="navbar-toggler-icon"></span>
                    </button>
                    <div class="collapse navbar-collapse" id="navbarCollapse">
                        <ul class="navbar-nav text-md-center nav-justified w-100">
                            <li class="nav-item active">
                                <a class="nav-link" href="home.html">Home <span class="sr-only">(current)</span></a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="case.html">Find a Case</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="document.html">Request Case Documents</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="service.html">Services</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="#">About</a>
                            </li>
                            <li class="nav-item dropdown">
                                <a class="nav-link dropdown-toggle" id="dropdown01" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false" href="about.html">Account</a>
                                <div class="dropdown-menu" aria-labelledby="dropdown01">
                                    <a class="dropdown-item" href="#">Login</a>
                                    <a class="dropdown-item" href="#">Register</a>
                                </div>
                            </li>
                        </ul>
                    </div>
                </nav>
            </div>
            <!-- Jumbotron -->
            <div class="jumbotron">
                <p></p>
                <div class="input-group"> 
                    <div class="input-group-prepend"> 
                        <div class="input-group-text">@</div>                         
                    </div>                     
                    <input type="text" class="form-control" placeholder="First Name">
                    <input type="email" class="form-control" placeholder="Last Name">
                    <div class="input-group"> 
                        <div class="input-group-prepend"> 
                            <div class="input-group-text">@</div>                             
                        </div>                         
                        <input type="password" class="form-control" placeholder="Password"> 
                    </div>                     
                </div>
                <button type="button" class="btn btn-success">Register</button>
            </div>
            <!-- Example row of columns -->
            <div class="row">
</div>
            <!-- Site footer -->
            <footer class="footer">
                <p class="text-center">&copy; CER</p>
            </footer>
        </div>         
        <!-- /container -->
        <!-- Bootstrap core JavaScript
    ================================================== -->
        <!-- Placed at the end of the document so the pages load faster -->
        <script src="assets/js/jquery.min.js"></script>
        <script src="assets/js/popper.js"></script>
        <script src="bootstrap/js/bootstrap.min.js"></script>
    </body>
</html>
