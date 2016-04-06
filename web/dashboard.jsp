<%-- 
    Document   : dashboard
    Created on : Apr 6, 2016, 8:58:58 PM
    Author     : James
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file = "headerWebPageSegment.jspf" %>

    <!-- Top Nav end-->


    <!-- Header / Banner -->

    <header class="header-dash">

        <!-- back groud image via css line 82 - 94 in app.css -->

    </header>

    <!-- Header / Banner ends -->


    <!-- Top Content Nav Buttons -->
    <div class="header-subnav">
        <div class="row collapse">
            <div clas="small-12 columns">
                <div class="small-6 columns end">
                    <a href="auction.jsp" class="button content-top-nav expanded">AUCTION</a>
                </div>
                <div class="small-6 columns end">
                    <a href="dashboard.jsp" class="button content-top-nav-active expanded">DASHBOARD</a>
                </div>
            </div>
        </div>
    </div>


    <div class="dash-inner">
        <h1>DashBoard</h1>
        <div class="dash-inner-top-bar">
            <div class="row">
                <div class="dash-inner-top-bar-item">
                    <div class="large-1 large-pull-1 columns">
                        <i class="fi-home"></i>
                        <p>
                            Home
                        </p>
                    </div>
                </div>
                <div class="dash-inner-top-bar-item">
                    <div class="large-1 large-pull-1 columns">
                        <i class="fi-mail"></i>
                        <p>
                            Mail
                        </p>
                    </div>
                </div>
                <div class="dash-inner-top-bar-item">
                    <div class="large-1 large-pull-1 columns">
                        <i class="fi-check"></i>
                        <p>
                            Notifications
                        </p>
                    </div>
                </div>
                <div class="large-8 columns">

                </div>
            </div>
        </div>
        <div class="dash-auction-stats">
            <h3>Stats</h3>
            <div class="row">
                <div class="large-4 small-6 columns">
                    <div class="dash-inner-item">
                        <h4>Number of bids made:</h4>
                        <p>6</p>
                    </div>
                </div>
                <div class="large-4 small-6 columns">
                    <div class="dash-inner-item">
                        <h4>Auctions Won:</h4>
                        <p>2</p>
                    </div>
                </div>
                <div class="large-4 small-9 small-centered columns">
                    <div class="dash-inner-item">
                        <h4>Number of bids made:</h4>
                        <p>9</p>
                    </div>
                </div>
            </div>
        </div>
        <div class="dash-cust-details">
            <div class="row">
                <div class="large-6 small-9 small-centered">
                    <div class="dash-inner-item">
                        <h3>Current Auction Details</h3>
                        <i class="fi-check"></i>
                        <ul>
                            <li>Bid on current auction: Yes</li>
                            <li>Bid Percentage: 18%</li>
                            <li><button class="button">Bid on this auction</button></li>
                            <li><button class="button">Go to auction page</button></li>
                        </ul>

                    </div>
                </div>
                <div class="large-6 small-9 small-centered">
                    <div class="dash-inner-item">
                        <h3>Your Details</h3>
                        <ul>
                            <li>Age: 18</li>
                            <li>Name: John Johnston</li>
                            <li>Address: 18 Fake Pl</li>
                            <li>Address 2: none</li>
                            <li>City: FakeVille</li>
                            <li>
                                <button class="button">Edit These Details</button>
                            </li>
                        </ul>
                    </div>
                </div>
            </div>
        </div>
        <div class="dash-add-cash">
            <div class="row">
                <div class="dash-inner-item">
                    <div class="large-12 large-centered small-9 small-centered columns">
                        <h2>Add Money to your Account</h2>
                        <button class="button expanded">Click Here</button>
                    </div>
                </div>
            </div>
        </div>

    </div>


    <script src="js/vendor/jquery.min.js"></script>
    <script src="js/vendor/what-input.min.js"></script>
    <script src="js/foundation.min.js"></script>
    <script src="js/app.js"></script>
</body>

</html>
