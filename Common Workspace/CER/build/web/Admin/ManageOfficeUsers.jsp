<%-- 
    Document   : Users
    Created on : May 17, 2020, 12:40:49 PM
    Author     : ranul
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!doctype html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
    <title>ADMIN - CER</title>
    <link href="../assets/externalLibraries/bootstrap-v4.4.1/css/bootstrap.css" rel="stylesheet">
    <link href="../assets/css/dashboard.css" rel="stylesheet">
    <link rel="icon" href="../assets/images/favicon.png" type="image/png">
    <!-- Importing Fontawesome from Localhost -->
    <link rel="stylesheet" type="text/css" href="../assets/externalLibraries/fontawesome-v5.13.0/css/all.css">
</head>

<body style="background-color:rgb(243, 243, 243);">
    <nav class="navbar navbar-dark fixed-top bg-light flex-md-nowrap p-0 shadow">
        <a class="navbar-brand col-sm-3 col-md-2 mr-0" href="#">ADMIN CER</a>
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
                            <a class="nav-link active" href="ManageOfficeUsers.jsp"> <svg xmlns="http://www.w3.org/2000/svg" width="24"
                                    height="24" viewbox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2"
                                    stroke-linecap="round" stroke-linejoin="round" class="feather feather-users">
                                    <path d="M17 21v-2a4 4 0 0 0-4-4H5a4 4 0 0 0-4 4v2"></path>
                                    <circle cx="9" cy="7" r="4"></circle>
                                    <path d="M23 21v-2a4 4 0 0 0-3-3.87"></path>
                                    <path d="M16 3.13a4 4 0 0 1 0 7.75"></path>
                                </svg>
                                Manage Office Users </a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link " href="Settings.jsp"><svg xmlns="http://www.w3.org/2000/svg" width="24"
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
                    <h1 class="h2">Manage Office Users</h1>
                    <div class="btn-toolbar mb-2 mb-md-0">
                    </div>
                </div>
            </main>
        </div>
    </div>

    <style>
        #searchButton{
            border-color: rgb(5, 132, 206);
            background-color: rgb(5, 132, 206);
            color: #ffffff;
        }
        #searchButton:hover{
            border-color: rgb(5, 132, 206);
            background-color: #ffffff;
            color: rgb(5, 132, 206);
        }
        #registerButton{
            border-color: rgb(9, 90, 138);
            background-color: rgb(9, 90, 138);
            color: #ffffff;
        }
        #registerButton:hover{
            border-color: rgb(9, 90, 138);
            background-color: #ffffff;
            color: rgb(9, 90, 138);
        }
        
    </style>

    <!-- MAIN CONTENT SECTION -->
    <div style="height: 600px;
                width: 80.65%;
                position: absolute;
                right: 1.3%;
                background-color: #f0f0f0;">
        <!-- SEARCH REGISTERED OFFICE USER SECTION -->
        <div style="width: 48.5%;
                    height: 760px;
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
                    left: 25px;">
                SEARCH REGISTERED OFFICE USER
            </p>

            <!-- HELP - MORE INFORMATION POPOVER -->
            <button class="btn btn-light" style="border-radius: 25px;
                                                        height: 40px;
                                                        width: 40px;
                                                        position: absolute;
                                                        right: 2%;
                                                        top: 10px;"
            data-toggle="popover" data-trigger="hover" data-placement="top" title="HELP" 
            data-content="How to search registered office user?<br>
                        Enter Office User's CER Email Address and click on 'SEARCH' button"
            data-html="true">
                <i class="fas fa-question-circle" style="position: relative;
                                                        left: 50%;
                                                        transform: translateX(-50%);
                                                        font-size: 22px;"></i>
            </button>

            <!-- SEARCH REGISTERED OFFICE USER FORM -->
            <form name="searchRegisteredOfficerForm" method="POST" action="../Admin/SearchRegisteredOfficeUserServlet">
                <input type="email" placeholder="Enter Office User's CER Email Address" style="width: 74%;
                                                                            height: 45px;
                                                                            position: relative;
                                                                            left: 4%;
                                                                            border-radius: 5px;
                                                                            border: #ccc solid 1px;
                                                                            padding-left: 18px;
                                                                            font-size: 18px;"
                data-toggle="tooltip" data-placement="bottom" title="MANDATORY, Enter CER Email Address" required 
                name="officerCEREmailAddress" class="form-control"
                value="<% 
                    if(request.getAttribute("enteredEmailAddress") != null){
                        out.print(request.getAttribute("enteredEmailAddress"));
                    }
                %>"
                />
                <button style="width: 16%;
                                height: 45px;
                                position: absolute;
                                right: 4%;
                                top: 63px;" class="btn" id="searchButton">
                    <p style="letter-spacing: 1px;
                            margin-top: 1px;
                            font-size: 18px;">SEARCH</p>
                </button>
            </form>
            <div style="border-top: #ccc solid 1px;
                        width: 92%;
                        margin-top: 10px;
                        position: relative;
                        left: 50%;
                        transform: translateX(-50%);"></div>
                        
            <!-- SEARCH REGISTERED OFFICE USER - SEARCH RESULT -->
            <style>
                .searchResultHeadings{
                    letter-spacing: 1px;
                    font-size: 20px;
                    font-weight: 500;
                    position: relative;
                    left: 20%;
                }
                .searchResultValue{
                    letter-spacing: 1px;
                    font-size: 20px;
                    font-weight: 400;
                    position: relative;
                    left: 0%;
                }
                .searchResultButtons{
                    width: 75%;
                    height: 45px;
                    border-radius: 5px;
                }
                #searchResultDisableButton{
                    position: absolute;
                    left: 90px;
                    border-color: rgb(247, 24, 24);
                    background-color: rgb(247, 24, 24);
                    color: #ffffff;
                }
                #searchResultDisableButton:hover{
                    border-color: rgb(247, 24, 24);
                    background-color: #ffffff;
                    color: rgb(247, 24, 24);
                }
                #searchResultActivateButton{
                    position: absolute;
                    left: 90px;
                    border-color: rgb(0, 177, 53);
                    background-color: rgb(0, 177, 53);
                    color: #ffffff;
                }
                #searchResultActivateButton:hover{
                    border-color: rgb(0, 177, 53);
                    background-color: #ffffff;
                    color: rgb(0, 177, 53);
                }
                .searchResultsButtonsText{
                    letter-spacing: 1px;
                    font-size: 18px;
                    position: absolute;
                    top: 50%;
                    left: 50%;
                    transform: translate(-50%,-50%);
                }
            </style>
            <% 
                String recordFound = null;
                recordFound = (String)request.getAttribute("recordFound");
                if(recordFound != null){
            %>
                <p style="letter-spacing: 1px;
                        font-size: 18px;
                        margin-left: 40px;
                        margin-top: 20px;">SEARCH RESULTS -</p>
            
                <form method="POST" action="../Admin/UpdateOfficeUserAccountStatusServlet">
                    <div style="width: 90%;
                                height: 60%;
                                border-radius: 5px;
                                position: relative;
                                left: 50%;
                                top: -5px;
                                transform: translateX(-50%);
                                box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2), 0 6px 20px 0 rgba(0, 0, 0, 0.19);">
                        <div class="row" style="padding-top: 10px;">
                            <div class="col-sm-12">
                                <p style="font-size: 25px;
                                        font-weight: 600;
                                        position: relative;
                                        left: 9.6%;
                                        top: 10px;
                                        letter-spacing: 0.5px;">
                                    <% out.print((String)request.getAttribute("prefix")); %> 
                                    <% out.print((String)request.getAttribute("firstName")); %> 
                                    <% out.print((String)request.getAttribute("middleName")); %> 
                                    <% out.print((String)request.getAttribute("lastName")); %>
                                </p>
                            </div>
                        </div>
                        <div class="row" style="margin-top: 30px;">
                            <div class="col-sm-6">
                                <p class="searchResultHeadings">ACCOUNT STATUS</p>
                            </div>
                            <div class="col-sm-6">
                                <p class="searchResultValue">
                                    <%
                                        String accountStatusActive = null;
                                        accountStatusActive = (String)request.getAttribute("accountStatusActive");
                                        String accountStatusDisabled = null;
                                        accountStatusDisabled = (String)request.getAttribute("accountStatusDisabled");
                                        if(accountStatusActive != null){
                                            out.print(accountStatusActive);
                                        }
                                        else if(accountStatusDisabled != null){
                                            out.print(accountStatusDisabled);
                                        }  
                                    %>
                                </p>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-sm-6">
                                <p class="searchResultHeadings">CER ID</p>
                            </div>
                            <div class="col-sm-6">
                                <p class="searchResultValue">
                                    <%
                                        out.print((String)request.getAttribute("cerId"));
                                    %>
                                </p>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-sm-6">
                                <p class="searchResultHeadings">CER Email Address</p>
                            </div>
                            <div class="col-sm-6">
                                <p class="searchResultValue" name="emailAddress" value="">
                                    <%
                                        String emailAddress = (String)request.getAttribute("emailAddress");
                                        out.print(emailAddress);
                                    %>
                                    <!-- Hidden input used to pass email address to the UpdateOfficeUserAccountStatusServlet servlet -->
                                    <input type="hidden" name="passedEmailAddress" 
                                    value ="<%= emailAddress %>" />
                                </p>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-sm-6">
                                <p class="searchResultHeadings">NIC</p>
                            </div>
                            <div class="col-sm-6">
                                <p class="searchResultValue">
                                    <%
                                        out.print((String)request.getAttribute("nic"));
                                    %>
                                </p>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-sm-6">
                                <p class="searchResultHeadings">Registration Date Time</p>
                            </div>
                            <div class="col-sm-6">
                                <p class="searchResultValue">
                                    <%
                                        out.print((String)request.getAttribute("registrationDateTime"));
                                    %>
                                </p>
                            </div>
                        </div>
                        <div class="row" style="margin-top: 20px;">
                            <div class="col-sm-12">
                                <%
                                    if(accountStatusActive != null){
                                %>
                                <button class="searchResultButtons btn" id="searchResultDisableButton" value="DisableButton"
                                name="searchResultDisableButton" type="submit">
                                    <i class="fas fa-user-lock" style="position: absolute;
                                                                left: 132px;
                                                                top: 13px;"></i>
                                    <p class="searchResultsButtonsText" style="margin-left: 22px;">DISABLE ACCOUNT</p>
                                </button>
                                <%}
                                    else if(accountStatusDisabled != null){
                                %>
                                <button class="searchResultButtons btn" id="searchResultActivateButton" value="ActivateButton" 
                                name="searchResultActivateButton" type="submit">
                                    <i class="fas fa-unlock-alt" style="position: absolute;
                                                                left: 130px;
                                                                top: 13px;"></i>
                                    <p class="searchResultsButtonsText" style="margin-left: 20px;">ACTIVATE ACCOUNT</p>
                                </button>
                                <%}%>
                            </div>
                        </div>
                    </div>
                </form>
                <form method="POST" action="../Admin/ResetSearchOfficeUserServlet">
                    <!-- FORM RESET BUTTON STYLES -->
                    <style>
                        #resetButton{
                            border: rgb(7, 86, 122);
                            background-color: rgb(3, 119, 173);
                            color: #ffffff;
                        }

                        #resetButton:hover{
                            border: rgb(7, 75, 107);
                            background-color: rgb(2, 95, 138);
                        }
                    </style>

                    <!-- FORM RESET BUTTON -->
                    <button style="height: 45px;
                            width: 110px;
                            position: absolute;
                            bottom: 10px;
                            left: 10px;" class="btn" id="resetButton" type="submit" onClick="return confirm('On screen items will be removed, do you want to continue?');">
                        <i class="fas fa-undo-alt" style="position: absolute;
                           left: 15px;
                           margin-top: 8px;"></i>
                        <p style="letter-spacing: 1px;
                           font-size: 18px;
                           margin-left: 25px;
                           margin-top: 2px;">RESET</p>
                    </button>
                </form>
                
            <%
                }
                
                String recordNotFound = null;
                recordNotFound = (String)request.getAttribute("recordNotFound");
                if(recordNotFound != null){
            %>
                <p style="letter-spacing: 1px;
                        font-size: 18px;
                        margin-left: 40px;
                        margin-top: 20px;">SEARCH RESULTS -</p>
                
                <p style="letter-spacing: 1px;
                           font-size: 18px;
                           position: relative;
                           left: 27%;
                           top: 20px;">No Office User Record in Available</p>
                <form method="POST" action="../Admin/ResetSearchOfficeUserServlet">
                    <!-- FORM RESET BUTTON STYLES -->
                    <style>
                        #resetButton{
                            border: rgb(7, 86, 122);
                            background-color: rgb(3, 119, 173);
                            color: #ffffff;
                        }

                        #resetButton:hover{
                            border: rgb(7, 75, 107);
                            background-color: rgb(2, 95, 138);
                        }
                    </style>

                    <!-- FORM RESET BUTTON -->
                    <button style="height: 45px;
                            width: 110px;
                            position: absolute;
                            bottom: 10px;
                            left: 10px;" class="btn" id="resetButton" type="submit" onClick="return confirm('On screen items will be removed, do you want to continue?');">
                        <i class="fas fa-undo-alt" style="position: absolute;
                           left: 15px;
                           margin-top: 8px;"></i>
                        <p style="letter-spacing: 1px;
                           font-size: 18px;
                           margin-left: 25px;
                           margin-top: 2px;">RESET</p>
                    </button>
                </form>
            <%}%>
            
                  

                   
        </div>
        <!-- REGISTER NEW OFFICE USERS SECTION -->
        <div style="width: 48.5%;
                    height: 760px;
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
                    left: 25px;">
                REGISTER NEW OFFICE USER
            </p>

            <!-- HELP - MORE INFORMATION POPOVER -->
            <button class="btn btn-light" style="border-radius: 25px;
                                                        height: 40px;
                                                        width: 40px;
                                                        position: absolute;
                                                        right: 2%;
                                                        top: 10px;"
            data-toggle="popover" data-trigger="hover" data-placement="top" title="HELP" 
            data-content="How to register?<br>
                        Enter accurate details to all the fields below and click on 'REGISTER' button."
            data-html="true">
                <i class="fas fa-question-circle" style="position: relative;
                                                        left: 50%;
                                                        transform: translateX(-50%);
                                                        font-size: 22px;"></i>
            </button>

            <!-- REGISTER NEW OFFICE USER FORM -->
            <form name="officerRegistrationForm" method="POST" action="../OfficeUserRegistrationServlet" onSubmit="return validateUserData()" >
                <div class="row">
                    <div class="col-sm-5">
                        <p style="position: relative;
                                top: 10px;
                                left: 30%;
                                letter-spacing: 1px;
                                font-size: 18px;">NAME</p>
                    </div>
                    <div class="col-sm-7">
                        <div class="row">
                            <div class="col-sm-12">
                                <select class="form-control" name="prefixName" style="padding: 0px;
                                                                                                width: 80%;
                                                                                                height: 45px;
                                                                                                padding-left: 8px;" 
                                data-toggle="tooltip" data-placement="top" title="MANDATORY, Select Prefix" required>
                                    <option value="" selected>Select Prefix</option>
                                    <option value="Mr.">Mr.</option>
                                    <option value="Sir.">Sir.</option>
                                    <option value="Dr.">Dr.</option>
                                    <option value="Mrs.">Mrs.</option>
                                    <option value="Miss.">Miss.</option>
                                    <option value="Ms.">Ms.</option>
                                </select>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-sm-12">
                                <input type="text" placeholder="Enter First Name" name="firstName" style="width: 80%;
                                                                                                        height: 45px;
                                                                                                        margin-top: 10px;" class="form-control"
                                data-toggle="tooltip" data-placement="top" title="MANDATORY, Enter First Name" required> 
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-sm-12">
                                <input type="text" placeholder="Enter Middle Name" name="middleName" style="width: 80%;
                                                                                                        height: 45px;
                                                                                                        margin-top: 10px;" class="form-control"
                                data-toggle="tooltip" data-placement="top" title="MANDATORY, Select Middle Name" required> 
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-sm-12">
                                <input type="text" placeholder="Enter Last Name" name="lastName" style="width: 80%;
                                                                                                        height: 45px;
                                                                                                        margin-top: 10px;" class="form-control"
                                data-toggle="tooltip" data-placement="top" title="MANDATORY, Select Last Name" required> 
                            </div>
                        </div>
                    </div>
                </div>
                <div class="row" style="margin-top: 15px;">
                    <div class="col-sm-5">
                        <p style="position: relative;
                                top: 20px;
                                left: 30%;
                                letter-spacing: 1px;
                                font-size: 18px;">NIC</p>
                    </div>
                    <div class="col-sm-7">
                        <div class="row">
                            <div class="col-sm-12">
                                <input type="text" placeholder="Enter NIC Number" name="nicNumber" style="width: 80%;
                                                                                                        height: 45px;
                                                                                                        margin-top: 10px;" class="form-control"
                                data-toggle="tooltip" data-placement="top" title="MANDATORY, Enter NIC Number" required> 
                            </div>
                        </div>
                    </div>
                </div>
                <div class="row" style="margin-top: 15px;">
                    <div class="col-sm-5">
                        <p style="position: relative;
                                top: 20px;
                                left: 30%;
                                letter-spacing: 1px;
                                font-size: 18px;">CER ID</p>
                    </div>
                    <div class="col-sm-7">
                        <div class="row">
                            <div class="col-sm-12">
                                <input type="text" placeholder="Enter CER ID" name="cerId" style="width: 80%;
                                                                                                        height: 45px;
                                                                                                        margin-top: 10px;" class="form-control"
                                data-toggle="tooltip" data-placement="top" title="MANDATORY, Enter CER ID" required> 
                            </div>
                        </div>
                    </div>
                </div>
                <div class="row" style="margin-top: 15px;">
                    <div class="col-sm-5">
                        <p style="position: relative;
                                top: 20px;
                                left: 30%;
                                letter-spacing: 1px;
                                font-size: 18px;">CER EMAIL ADDRESS</p>
                    </div>
                    <div class="col-sm-7">
                        <div class="row">
                            <div class="col-sm-12">
                                <input type="email" placeholder="Enter CER Email Address" name="cerEmailAddress" style="width: 80%;
                                                                                                        height: 45px;
                                                                                                        margin-top: 10px;" class="form-control"
                                data-toggle="tooltip" data-placement="top" title="MANDATORY, Enter CER Email Address" required> 
                            </div>
                        </div>
                    </div>
                </div>
                <div class="row" style="margin-top: 15px;">
                    <div class="col-sm-5">
                        <p style="position: relative;
                                top: 20px;
                                left: 30%;
                                letter-spacing: 1px;
                                font-size: 18px;">PASSWORD</p>
                    </div>
                    <div class="col-sm-7">
                        <div class="row">
                            <div class="col-sm-12">
                                <input type="password" placeholder="Enter Password" name="password" style="width: 80%;
                                                                                                        height: 45px;
                                                                                                        margin-top: 10px;" class="form-control" 
                                data-toggle="popover" data-trigger="hover" data-placement="top" title="MANDATORY, Password Guidelines:" data-html="true"
                                data-content="Minimum 10 characters<br />
                                Maximum 25 characters<br />
                                At least ONE uppercase letter<br />
                                At least ONE numeric character<br />
                                At least ONE special character" required/> 
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-sm-12">
                                <input type="password" placeholder="Re-Enter Password" name="reenterPassword" style="width: 80%;
                                                                                                        height: 45px;
                                                                                                        margin-top: 10px;" class="form-control"
                                data-toggle="popover" data-trigger="hover" data-placement="top" title="MANDATORY, Password Guidelines:" data-html="true"
                                data-content="Minimum 10 characters<br />
                                Maximum 25 characters<br />
                                At least ONE uppercase letter<br />
                                At least ONE numeric character<br />
                                At least ONE special character" required /> 
                            </div>
                        </div>
                    </div>
                </div>
                <div style="width: 75%;
                            height: 40px;
                            border: #ccc solid 1px;
                            position: relative;
                            left: 50%;
                            top: 20px;
                            transform: translateX(-50%);
                            border-radius: 5px;">
                    <p style="position: relative;
                            top: 8px;
                            left: 10px;
                            font-size: 14px;">
                        By registering new office user, you would agreeing to the <a href=""><span>Terms & Conditions</span></a>
                    </p>
                </div>
                <button type="submit" class="btn" style="width: 80%;
                                                    height: 40px;
                                                    position: relative;
                                                    top: 45px;
                                                    left: 50%;
                                                    transform: translateX(-50%);" id="registerButton">
                    <p>REGISTER</p>
                </button>
            </form>
            
        </div>
    </div>
 
    <script src="../assets/externalLibraries/bootstrap-v4.4.1/js/jquery.min.js"></script>
    <script src="../assets/externalLibraries/bootstrap-v4.4.1/js/popper.min.js"></script>
    <script src="../assets/externalLibraries/bootstrap-v4.4.1/js/bootstrap.min.js"></script>

    <script>
        /* Executed upon page load */
        $(document).ready(function () {
            // jQuery for BOOTSTRAP TOOLTIP
            $('[data-toggle="tooltip"]').tooltip();
            // jQuery for BOOTSTRAP POPOVER
            $('[data-toggle="popover"]').popover();
        });
        /* OFFICE USER REGISTRATION FORM USER DATA VALIDATION */
        function validateUserData() {
            
            // Checking if the user entered passwords characters length in greater than or equal to 10
            if (document.officerRegistrationForm.password.value.length < 10 || document.officerRegistrationForm.password.value.length < 10) {
                alert("ERROR: Rechecked Entered Password, Password length is below 10 characters");
                return false;
            }

            // Checking if the user entered passwords characters length in lower than or equal to 25
            if (document.officerRegistrationForm.reenterPassword.value.length > 25 || document.officerRegistrationForm.reenterPassword.value.length > 25) {
                alert("ERROR: Rechecked Entered Password, Password length is above 25 characters");
                return false;
            }
            
            // Checking if the user entered similar password in the password field and confirm password field
            if (document.officerRegistrationForm.password.value != document.officerRegistrationForm.reenterPassword.value) {
                alert("ERROR: Entered Passwords Mismatch, Please Recheck");
                return false;
            }

            // Showing the user the registration process will continue and verifying the entered values
            var confirmContinueRegisterNewUser = confirm("New officer user will be registered. Check if all the entered details correct. Do you want to continue?");
            if(confirmContinueRegisterNewUser == true){
                return true;
            }
            else if(confirmContinueRegisterNewUser == false){
                return false;
            }
        }
    </script>
    
    <script src="https://unpkg.com/feather-icons/dist/feather.min.js"></script>
    <script>feather.replace()</script>
   
</body>

</html>
