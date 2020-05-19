<%-- 
    Document   : About
    Created on : May 17, 2020, 3:02:58 AM
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
                            <li class="nav-item">
                                <a class="nav-link" href="Services.jsp">Forum</a>
                            </li>
                            <li class="nav-item active">
                                <a class="nav-link" href="About.jsp">About<span class="sr-only">(current)</span></a>
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
             <div>
            <img src="assets/images/about.jpeg" style="width: 100%; height: 240px;">
             </div>
        <div class="container" style=" padding-top: 30px;">
            <p>
                We Provide a service to the general public by providing all the court records that the user requires from The Supreme 
                Court, The Court of Appeal, The High Court., The District Court, The Magistrate Court, The
                Primary Court and The Judicial Service Commission. The service is a free of charge service as this 
                service is maintained by the court service office and made for the benefit of the public rather 
                than for a method of income. Our main objectives are to ensure that all the court records are 
                there or provided after the public request it and provide easy access to them.
            </p>
            <p>
                In this website only the judges and attorneys can submit a court record and the customer and the users are able to view
                the basic information they may need to know while the private details of the person who is accused will not be displayed in the 
                report as it is confidential. The website only contains record from the recent years since this service was introduced recently so
                if you need a specific case then it must be requested and will be available within 5 business days for the user. 
            </p>
            <p>
                If you run into any issues or have inquaries  please feel free to email us or you could call us for a faster response regarding your issue
                and our customer service would more than happy to help or provide information you needed.
            </p>
            <img src="assets/images/document.jpg" style=" width: 100%; height: 400px; padding-top: 20px" >
            <div class="row justify-content-between" style=" padding-top: 20px">
              <div class="col-4">
                  <h3>Vision</h3>
                  <p> 
                      Our vision is to provide all the records 
                      requested by the public and to provide 
                      easy access to legitimate records.
                  </p>
              </div>
              <div class="col-4">
                 <h3>Mission</h3>
                 <p>
                     Our mission is to Provide electronic 
                     public access to court information, in 
                     accordance with legislative and Judiciary 
                     policies, security requirements, and user 
                     demands.
                 </p>
              </div>
            </div>
         </div>
        <div class="container">
           <h3> Contact Us</h3>
          <div class="d-flex justify-content-around">
            <div class="card" style="width: 18rem;">
             <div class="card-body">
               <h5 class="card-title">E-Mail</h5>
                <p class="card-text">e_recordsystem@gmail.com</p>
             </div>
            </div>
              <div class="card" style="width: 18rem;">
             <div class="card-body">
               <h5 class="card-title">Telephone Numbers</h5>
               <p class="card-text">
               <p> HotLine Colombo - 0118497635,</p>
               <p> HotLine Panadura - 0389745316,</p>
               <p> HotLine Ratmalana - 0113849246 </p>
                </p>
             </div>
             </div>
               <div class="card" style="width: 18rem;">
             <div class="card-body">
               <h5 class="card-title">Address</h5>
               <p class="card-text">
                   08, Sri Lankaramaya 
                   Serpentine Road, 
                   Colombo
               </p>
             </div>
            </div>
          </div>
        </div>
        <br>
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
