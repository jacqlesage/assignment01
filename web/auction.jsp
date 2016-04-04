<%-- 
    Document   : auction
    Created on : Apr 4, 2016, 9:49:31 PM
    Author     : James
--%>

<%@page import="controller.CustomerDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>
<html class="no-js" lang="en">

<head>
    <meta charset="utf-8" />
    <meta http-equiv="x-ua-compatible" content="ie=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Dollar Luxury | Auction</title>
    <link rel="stylesheet" href="css/foundation.css" />
    <link rel="stylesheet" href="css/app.css" />
    <link rel="stylesheet" href="foundation-icons/foundation-icons.css" />
</head>

<body>

    <!-- Top Nav / Title Bar -->
    <div class="top-bar" id="main-menu">
        <div class="top-bar-left">
            <ul class="dropdown menu" data-dropdown-menu>
                <li class="menu-text"><a href="index.html">DOLLAR LUXURY</a></li>
            </ul>
        </div>
        <div class="top-bar-right">
            <ul class="menu vertical medium-horizontal" data-responsive-menu="drilldown medium-dropdown">
                <li class="has-submenu">
                    <a href="login.html">Login</a>
                    <ul class="submenu menu vertical" data-submenu>
                        <div class="submenu-form">
                            <form method="post" action="dashboard.html">
                                <li>Email: <input type="text"></input></li>
                                <li>Password: <input type="text"></input></li>
                                <li><button class="button">Submit</button></li>
                            </form>
                        </div>
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
                    <a href="auction.html" class="button content-top-nav-active expanded">AUCTION</a>
                </div>
                <div class="small-6 columns end">
                    <a href="dashboard.html" class="button content-top-nav expanded">DASHBOARD</a>
                </div>
            </div>
        </div>
    </div>


    <!-- Main Page Content -->
    <div class="content-wrapper-main">
        <div class="content-header">
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

        <div class="auction-content-wrapper">
            <div class="row">
                <div class="large-9 large-centered columns">
                    <h2>iPhone 6s Plus - 128gb</h2>
                    <img src="img/iphone.jpg">
                    <p>
                        Brand new, in box, iPhone 6s Plus - 128gb. The latest and greatest in smart phone technology.
                        This phone could be your for just $1, assuming you have already <a href="sigup.html">Signed Up</a> and are <a href="login.html">logged in</a>
                        use the bid button below to get started.
                    </p>
                    <form method = "post"  action = "BiddingServlet">
                        <% if(CustomerDAO.customerFound == true){ %>
                    <button class="button auction-buttons expanded" disabled>Bid on this auction</button>
                            <%}else{ %>
                            <button class="button auction-buttons expanded" disabled>Bid on this auction</button>
                            <%}%>
                          
                    </form>
                    <button class="button auction-buttons expanded"><a href="signup.html">Sign Up</a></button>
                    <h3>Product Specs and extra Product info</h3>
                    <p>
                        Info: <a href="http://www.apple.com/nz/iphone-6s">iPhone New Zealand Website</a>
                    </p>
                    <p>
                        Specs: <a href="http://www.apple.com/nz/iphone-6s/specs/">iPhone New Zealand Website</a>
                    </p>
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

    <script src="js/vendor/jquery.min.js"></script>
    <script src="js/vendor/what-input.min.js"></script>
    <script src="js/foundation.min.js"></script>
    <script src="js/app.js"></script>
    <script src="js/vendor/parsley.min.js"></script>
    <script type="text/javascript">
        $('#sign-up').parsley();
    </script>
</body>

</html>

