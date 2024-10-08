<%-- 
    Document   : CaseUpload
    Created on : May 17, 2020, 12:50:38 PM
    Author     : ranul
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
    <title>Dashboard - Case</title>
    <script>
    function validDocument(){
         if (document.NDocumentform.caseNo.value == "" || document.NDocumentform.CLocation.value == "" || document.NDocumentform.DNumber.value == "" || document.NDocumentform.party.value == "" || document.NDocumentform.CParty.value == "" ||  document.NDocumentform.descrip.value == "" || document.NDocumentform.hearing.value == ""){
         alert ( "Please enter all the fields to add the document" );
         return false;
         }
         return true;
       }
    </script>
    <script>
        function validCase(){
         if (document.ACasetform.DcaseNo.value == "" || document.ACasetform.DCLocation.value == "" || document.ACasetform.Dparty.value == "" || document.ACasetform.Ddate.value == ""){
         alert ( "Please enter all the fields to add the case" );
         return false;
         }
         return true;
       }
    </script>
    <link href="../assets/externalLibraries/bootstrap-v4.4.1/css/bootstrap.css" rel="stylesheet">
    <link href="../assets/css/dashboard.css" rel="stylesheet">
    <link rel="icon" href="../assets/images/favicon.png" type="image/png">
</head>

<body style="background-color: #f0f0f0;">
    <nav class="navbar navbar-dark fixed-top bg-dark flex-md-nowrap p-0 shadow">
        <a class="navbar-brand col-sm-3 col-md-2 mr-0" href="#">CERs- Officer</a>
        <ul class="navbar-nav px-3" style="background-color: #000000;">
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
                            <a class="nav-link " href="Dashboard.jsp"> <svg xmlns="http://www.w3.org/2000/svg"
                                    width="24" height="24" viewbox="0 0 24 24" fill="none" stroke="currentColor"
                                    stroke-width="2" stroke-linecap="round" stroke-linejoin="round"
                                    class="feather feather-home">
                                    <path d="M3 9l9-7 9 7v11a2 2 0 0 1-2 2H5a2 2 0 0 1-2-2z"></path>
                                    <polyline points="9 22 9 12 15 12 15 22"></polyline>
                                </svg>
                                Dashboard <span class="sr-only">(current)</span> </a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link active" href="CaseUpload.jsp"><svg xmlns="http://www.w3.org/2000/svg"
                                    width="24" height="24" viewbox="0 0 24 24" fill="none" stroke="currentColor"
                                    stroke-width="2" stroke-linecap="round" stroke-linejoin="round"
                                    class="feather feather-file">
                                    <path d="M13 2H6a2 2 0 0 0-2 2v16a2 2 0 0 0 2 2h12a2 2 0 0 0 2-2V9z"></path>
                                    <polyline points="13 2 13 9 20 9"></polyline>
                                </svg>&nbsp;Cases/Documents</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="Orders.jsp"><svg xmlns="http://www.w3.org/2000/svg" width="24"
                                    height="24" viewbox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2"
                                    stroke-linecap="round" stroke-linejoin="round"
                                    class="feather feather-shopping-cart">
                                    <circle cx="9" cy="21" r="1"></circle>
                                    <circle cx="20" cy="21" r="1"></circle>
                                    <path d="M1 1h4l2.68 13.39a2 2 0 0 0 2 1.61h9.72a2 2 0 0 0 2-1.61L23 6H6"></path>
                                </svg>&nbsp;Print Orders</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="Customer.jsp"> <svg xmlns="http://www.w3.org/2000/svg" width="24"
                                    height="24" viewbox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2"
                                    stroke-linecap="round" stroke-linejoin="round" class="feather feather-users">
                                    <path d="M17 21v-2a4 4 0 0 0-4-4H5a4 4 0 0 0-4 4v2"></path>
                                    <circle cx="9" cy="7" r="4"></circle>
                                    <path d="M23 21v-2a4 4 0 0 0-3-3.87"></path>
                                    <path d="M16 3.13a4 4 0 0 1 0 7.75"></path>
                                </svg>
                                Customers </a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="Search.jsp"> <svg xmlns="http://www.w3.org/2000/svg" width="24"
                                    height="24" viewbox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2"
                                    stroke-linecap="round" stroke-linejoin="round" class="feather feather-bar-chart-2">
                                    <line x1="18" y1="20" x2="18" y2="10"></line>
                                    <line x1="12" y1="20" x2="12" y2="4"></line>
                                    <line x1="6" y1="20" x2="6" y2="14"></line>
                                </svg>
                                Search Reports </a>
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
                <div
                    class="d-flex justify-content-between flex-wrap flex-md-nowrap align-items-center pt-3 pb-2 mb-3 border-bottom">
                    <h1 class="h2">Add Cases and Documents</h1>
                    <div class="btn-toolbar mb-2 mb-md-0">
                    </div>
                </div>
            </main>
        </div>
    </div>

     <!-- MAIN CONTENT SECTION -->
      <div style="height: 600px;
                width: 80.65%;
                position: absolute;
                right: 1.3%;
                background-color: #f0f0f0;">
        <!-- ADD NEW DOCUMENT TO A CASE SECTION -->
        <div style="width: 48.5%;
                    height: 850px;
                    background-color: #ffffff;
                    position: relative;
                    left: 1%;
                    float: left;
                    border-radius: 10px;">
            <p style="font-size: 22px;
                    letter-spacing: 1px;
                    font-weight: 500;
                    margin-top: 15px;
                    position: relative;
                    left: 25px;
                    text-align: center;">
                ADD DOCUMENT TO CASE</p>
            <form style="padding-left: 50px; padding-right: 50px; padding-top: 20px;" name="NDocumentform" method="post" action="../Office/AddCaseDocument" onsubmit="return validDocument();">
                <p>Case Number</p>
                <input type="text" name="caseNo">
                <p style="padding-top: 20px">Court Location</p>
                <input type="text" name="CLocation">
                <p style="padding-top: 20px"> Document Number</p>
                <input type="number" name="DNumber">
                <p style="padding-top: 20px">Party</p>
                <input type="text" name="party">
                <p style="padding-top: 20px">CO Party</p>
                <input type="text" name="CParty">
                <p style="padding-top: 20px">Description</p>
                 <textarea rows = "5" cols = "50" name = "descrip">
                 </textarea>
                <p style="padding-top: 20px">Hearing</p>
                <input type="date" name="hearing">
                <br>
                <br>
                <div class="text-center">
                    <button  class="btn btn-primary w-100" type="submit" name="Dsubmit">Submit</button> 
                </div>
            </form>  
        </div>
        <!-- ADD NEW CASE SECTION -->
        <div style="width: 48.5%;
                    height: 500px;
                    background-color: #ffffff;
                    position: absolute;
                    right: 1%;
                    float: left;
                    border-radius: 10px;">
            <p style="font-size: 22px;
                    letter-spacing: 1px;
                    font-weight: 500;
                    margin-top: 15px;
                    position: relative;
                    left: 25px;
                    text-align: center;">
                ADD NEW CASE</p>
             <form style="padding-left: 50px; padding-right: 50px; padding-top: 20px;" method="POST" action="../Office/AddCase" name="ACasetform" onsubmit="return validCase();">
                <p>Case Number</p>
                <input type="text" name="DcaseNo" >
                <p style="padding-top: 20px">Court Location</p>
                 <input type="text" name="DCLocation" >
                <p style="padding-top: 20px">Party</p>
                <input type="text" name="Dparty">
                <p style="padding-top: 20px">Date</p>
                <input type="date" name="Ddate">
                <br>
                <br>
                <div class="text-center">
                    <button  class="btn btn-primary w-100" type="submit" name="Csubmit">Submit</button> 
                </div>
            </form>    
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
            type: 'line',
            data: {
                labels: ["Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"],
                datasets: [{
                    data: [15339, 21345, 18483, 24003, 23489, 24092, 12034],
                    lineTension: 0,
                    backgroundColor: 'transparent',
                    borderColor: '#007bff',
                    borderWidth: 4,
                    pointBackgroundColor: '#007bff'
                }]
            },
            options: {
                scales: {
                    yAxes: [{
                        ticks: {
                            beginAtZero: false
                        }
                    }]
                },
                legend: {
                    display: false,
                }
            }
        });
    </script>
</body>

</html>
