<%-- 
    Document   : index
    Created on : Jan 31, 2016, 1:59:06 PM
    Author     : James
--%>

<%@page import="controller.CustomerDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
       <meta http-equiv="x-ua-compatible" content="ie=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Dollar Luxury | Welcome</title>
    <link rel="stylesheet" href="css/foundation.css" />
    <link rel="stylesheet" href="css/app.css" />
    <link rel="stylesheet" href="foundation-icons/foundation-icons.css" />
    <link rel="stylesheet" type="text/css" href="slick/slick.css"/>
    <link rel="stylesheet" type="text/css" href="slick/slick-theme.css"/>
</head>

<body>

    <!-- Top Nav / Title Bar -->
    <div class="title-bar" data-responsive-toggle="main-menu" data-hide-for="medium">
        <button class="menu-icon" type="button" data-toggle></button>
        <div class="title-bar-title">Menu</div>
    </div> 

    <div class="top-bar" id="main-menu">
        <div class="top-bar-left">
            <ul class="dropdown menu" data-dropdown-menu>
                <li class="menu-text"><a href="#">DOLLAR LUXURY</a></li>
            </ul>
        </div>
        <% if (CustomerDAO.customerFound == false) { %>
        <div class="top-bar-right">
            <ul class="menu vertical medium-horizontal" data-responsive-menu="drilldown medium-dropdown">
                <li class="has-submenu">
                    <a href="login.html">Login</a>
                    <ul class="submenu menu vertical" data-submenu>
                        <div class="submenu-form">
                            <form method="post" action="LogInServlet">
                                <li><p>Email:</p><input type="text" name="Email"></input></li>
                                <li><p>Password:</p><input type="text" name="Password"></input></li>
                                <li><button class="button">Submit</button></li>
                            </form>
                        </div>
                                      <%  }else if(CustomerDAO.customerFound){ %>
                                      
             <%--Change the below , should just show the customers name and blank out login.--%>       
             <div class="top-bar-right">
            <ul class="menu vertical medium-horizontal" data-responsive-menu="drilldown medium-dropdown">
                <%-- <li class="has-submenu"> --%>
                <form method="post" action="LogOutServlet">    
                    <a href="logOut"><button type="submit" id="logOut">Logout</button> </a>
                </form>
                    <%--<ul class="submenu menu vertical" data-submenu--%>
                        <%--<div class="submenu-form"> --%>
                        <%--
                            <form method="post" action="LogOutServlet">
                                <li><p>Email:</p><input type="text" name="Email"></input></li>
                                <li><p>Password:</p><input type="text" name="Password"></input></li>
                                <li><button class="button">Submit</button></li>
                            </form>
                        --%>
                        </div>
                                      
                                      <%} %>
                    </ul>
                </li>
                <li class="has-submenu">
                    <a href="about.html">About Us</a>
                    <ul class="submenu menu vertical" data-submenu>
                        <li><a href="faq.html">FAQ</a></li>
                        <li><a href="termsandconditions.html">Terms &amp; Conditions</a></li>
                        <li><a href="about.html">About Us</a></li>
                    </ul>
                </li>
                <li><a href="signup.html">Sign Up</a></li>
            </ul>
        </div>
    </div>
    <!-- Top Nav end-->


    <!-- Header / Banner -->

    <header class="header">

    </header>

    <!-- Header / Banner ends -->


    <!-- Top Content Nav Buttons -->
    <div class="header-subnav">
        <div class="row collapse">
            <div clas="small-12 columns">
                <div class="small-6 columns end">
                    <a href="auction.html" class="button content-top-nav expanded">AUCTION</a>
                </div>
                <div class="small-6 columns end">
                    <a href="dashboard.html" class="button content-top-nav expanded">DASHBOARD</a>
                </div>
            </div>
        </div>
    </div>


    <!-- Main Page Content -->
    <div class="content-wrapper-main">
        <!-- Start slider -->
        <div class="content-header">
            <div class="slide-this">
                <div id="1">
                    <div class="row">
                        <div class=content-header-text>
                            <div class="large-9 columns">
                                </br>
                                </br>
                                <h3>Would you like a brand new iPhone 6s for $1?</h3>
                                <p>
                                    Welcome to Dollar Luxury! Head down below and follow the 3 steps. Welcome to Dollar Luxury! Head down below and follow the 3 steps. Welcome to Dollar Luxury! Head down below and follow the 3 steps.
                                </p>
                            </div>
                        </div>
                        <div class="large-3 columns">
                            <img src="img/iphoneblue.jpg">
                        </div>
                    </div>
                </div>
                <div id="2">
                    <div class="row">
                        <div class="large-6 columns">
                            <img src="img/smartTVDisplay.jpg">
                        </div>
                        <div class=content-header-text>
                            <div class="large-6 columns">
                                </br>
                                <h3>What about a new big screen for $1? or some thing for the kids?</h3>
                                <p>
                                    Welcome to Dollar Luxury! Head down below and follow the 3 steps. Welcome to Dollar Luxury! Head down below and follow the 3 steps. Welcome to Dollar Luxury! Head down below and follow the 3 steps.
                                </p>
                            </div>
                        </div>

                    </div>
                </div>
                <div id="2">
                    <div class="row">
                        <div class=content-header-text>
                            <div class="large-9 columns">
                                </br>
                                </br>
                                <h3>How about a an iPad? Have you got a spare dollar?</h3>
                                <p>
                                    Welcome to Dollar Luxury! Head down below and follow the 3 steps. Welcome to Dollar Luxury! Head down below and follow the 3 steps. Welcome to Dollar Luxury! Head down below and follow the 3 steps.
                                </p>
                            </div>
                        </div>
                        <div class="large-3 columns">
                            <img src="img/ipadblue.jpg">
                        </div>
                    </div>
                </div>
            </div>
        </div>



        <div class="row">
            <div class="large-12 small-12 columns">
                <div class="main-content">
                    <div class="content-iframe">
                        <!-- <iframe width="560" height="315" src="https://www.youtube.com/embed/lX2SMUPUvv8?list=PLeZpIFb_5oAz1nC0O_dDcP4AipM50kmoY" frameborder="0" allowfullscreen></iframe> -->
                        <i class="fi-play-circle"></i>
                        <p>
                            instruction video here
                        </p>
                    </div>
                </div>
            </div>
        </div>


        <div class="row">
            <div class="content-box-special">
                <h2>Getting Started</h2>
                <div class="box-special-item">
                    <div class="large-4 small-12 columns">
                        <i class="fi-home"></i>
                        <h3>Step 1</h3>
                        <p>
                            Watch the "how it works" above. If you have any questions they can usually be answered by looking at the <a href="faq.html">FAQ</a> page. If not <a href="contact.html">contact us here</a>. Once you've finished the video and
                            are confident with the process you can move onto the next step.
                        </p>
                    </div>
                </div>
                <div class="box-special-item">
                    <div class="large-4 small-12 columns">
                        <i class="fi-wrench"></i>
                        <h3>Step 2</h3>
                        <p>
                            Use the Sign Up form below this to create an account, remember you don't have to add any money to your account to get started but you will need to if you want to proceed to the next step.
                            </br>
                            </br>
                        </p>
                    </div>
                </div>
                <div class="box-special-item">
                    <div class="large-4 small-12 columns">
                        <i class="fi-like"></i>
                        <h3>Step 3</h3>
                        <p>
                            Once you have an account, add some money to it via the <a href="dashboard.html">dashboard</a>. Then you're ready to make your first bid! Its as easy as that!!
                            </br>
                            </br>
                            </br>
                            </br>
                        </p>
                    </div>
                </div>
            </div>
        </div>
    </div>



    <div class="content-wrapper-2">
        <div class="row">
            <div class="large-4 small-11 small centered columns">
                    <div class="content-side-mobile-bottom">
                        <div class="content-side-item">
                            <h3>Current Auction</h3>
                            <h4>iPhone 6s - Any Color!</h4>
                            <a href="auction.html">
                                <img src="img/iphone.jpg">
                            </a>
                        </div>
                        <div class="content-side-item">
                            <h3>Upcoming Auctions</h3>
                            <h4>Smart TV</h4>
                            <a href="auction.html">
                                <img src="img/LG_smart_TV.jpg">
                            </a>
                        </div>
                    </div>
                </div>

            <div class="large-7 large-centered small-11 small centered columns">
                <div class="form-wrapper">
                    <p>
                        <i class="fi-check"></i>
                    </p>

                    <h2>Enter your details to get started</h2>
                    <form id="sign-up" action="dashboard.html" method="post">
                        <div class="row">
                            <div class="large-6 columns">
                                <label>First Name:</label>
                                <input type="text" id="name" name="user_first_name" data-parsley-required="true">
                            </div>
                            <div class="large-6 columns">
                                <label>Last Name:</label>
                                <input type="text" id="name" name="user_last_name" data-parsley-required="true">
                            </div>
                        </div>
                        <div class="row">
                            <div class="large-4 columns">
                                <label>Email:</label>
                                <input type="email" id="mail" name="user_email" data-parsley-required="true" data-parsley-type="email">
                            </div>
                            <div class="large-4 columns">
                                <label>Phone Number:</label>
                                <input type="number" id="phone" name="user_phone" data-parsley-required="true" data-parsley-type="number">
                            </div>
                            <div class="large-4 columns">
                                <label>Age (optional)</label>
                                <select>
                                    <option value="18-25">18-25</option>
                                    <option value="26-35">26-35</option>
                                    <option value="35-50">35-50</option>
                                    <option value="50+">50+</option>
                                </select>
                            </div>
                        </div>
                        <div class="row">
                            <div class="large-12 columns">
                                <label>Address Line 1:</label>
                                <input type="text" id="address1" name="user_address_1" data-parsley-required="true">
                            </div>
                        </div>
                        <div class="row">
                            <div class="large-12 columns">
                                <label>Address Line 2:</label>
                                <input type="text" id="address2" name="user_address_2" data-parsley-required="true">
                            </div>
                        </div>
                        <div class="row">
                            <div class="large-6 columns">
                                <label>City/Region:</label>
                                <input type="text" id="region" name="user_region" data-parsley-required="true">
                            </div>
                            <div class="large-6 columns">
                                <label>Postcode:</label>
                                <input type="number" id="postcode" name="user_post_code" data-parsley-required="true" data-parsley-type="number" data-parsley-maxlength="4" data-parsley-minlength="4">
                            </div>
                        </div>
                        <div class="row">
                            <div class="large-6 columns">
                                <label>Password:</label>
                                <input type="password" id="password" name="user_password" data-parsley-required="true" data-parsley-length="[8, 16]">
                            </div>
                            <div class="large-6 columns">
                                <label>Confirm Password:</label>
                                <input type="password" id="confirmPassword" name="user_confirm_password" data-parsley-required="true" data-parsley-length="[8, 16]">
                            </div>
                        </div>

                        <div class="row">
                            <div class="large-centered large-9 columns">
                                <button type="submit" class="button expanded">Sign Up</button>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>


    <!-- Main Page Content ends-->

    <!-- Footer -->

    <footer class="footer">
        <div class="row">
            <div class="small-12 columns">
                <p class="slogan">Finger-lickin' good</p>
                <p class="links">
                    <a href="index.html">Home</a>
                    <a href="auction.html">Auction</a>
                    <a href="about.html">About</a>
                    <a href="faq.html">Faq</a>
                    <a href="dashboard.html">Dashboard</a>
                    <a href="contact.html">Contact</a>
                </p>
                <p class="copywrite"><a href="http://conciseit.co.nz">Concise IT Collective, Dunedin, New Zealand.</a></p>
            </div>
        </div>
    </footer>
    <!-- Footer ends -->

    <script src="//code.jquery.com/jquery-1.11.3.min.js"></script>
    <script src="//code.jquery.com/jquery-migrate-1.2.1.min.js"></script>
    <script src="js/vendor/what-input.min.js"></script>
    <script src="js/foundation.min.js"></script>
    <script src="js/app.js"></script>
    <script src="js/vendor/parsley.min.js"></script>
     <script type="text/javascript">
        $('#sign-up').parsley();
    </script>
    <script type="text/javascript" src="slick/slick.min.js"></script>
    <script>
        $(document).ready(function(){
            $('.slide-this').slick({
                autoplay: true,
                autoplaySpeed: 3500,
                dots: true,
                fade: true,
                pauseOnHover: true,
                speed: 1400,
            });
        });
    </script>
</body>

</html>

