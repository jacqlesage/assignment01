<%-- 
    Document   : dashboard
    Created on : Apr 6, 2016, 8:58:58 PM
    Author     : James
--%>

<%@page import="controller.CustomerObj"%>
<%@page import="controller.AccountDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file = "headerWebPageSegment.jspf" %>

    <!-- Top Nav end-->

    
    <!-- Header / Banner -->

    <header class="header-dash">

        <!-- back groud image via css line 82 - 94 in app.css -->

    </header>

    <!-- Header / Banner ends -->


    <!-- Top Content Nav Buttons -->
   <%@include file = "auctionDashboardWebPageSegment.jspf"%>


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
                            <form method="post" action="EditDetailsServlet">
                           
                            <!-- Setup a edit servlet to edit details-->
                            <!-- Use custoemr DAO to get personal info and place here-->
                            <li>Age: <input type="text" name="age" value="getage" readonly></li>
                            <li>Name: <input type="text" name="name" value="getname" readonly></li>
                            <li>Address: <input type="text" name="address" value="<>" readonly></li>
                            <li>Address 2: <input type="text" name="address2" value="getaddress2" readonly></li>
                            <li>City: <input type="text" name="city" value="getcity" readonly></li>
                            <li>
                                
                                <button class="button">Edit These Details</button>
                            </form>
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
                        <p>Simply type how much you would like to add to your account (in whole dollars)</p>
                        <form method="post" action="BiddingServlet">
                        <div class="medium-6 medium-centered small-9 small-centered columns">
                        <input type="number" name="deposit" min="1" max="9999">
                        </div>
                        <button class="button expanded" type="submit">Click Here</button>
                        </form>
                        <h3>Current account balance<h3>
                    <div class="medium-6 large-centered small-9 small-centered columns">
                        <%AccountDAO y = new AccountDAO();  %>
                        
                        <% System.out.println(y.getCurrentAccountBalance());%>
                        <p> <%out.println("$"+y.getCurrentAccountBalance());%> </p>
                    </div>
                </div>
            </div>
        </div>
            
            <% String empcode = (String)request.getParameter("img");%>
            <% out.println(empcode);%>
            <img src='<%=request.getParameter("empcode")%>'>
            
      
        
            
    </div>


    <script src="js/vendor/jquery.min.js"></script>
    <script src="js/vendor/what-input.min.js"></script>
    <script src="js/foundation.min.js"></script>
    <script src="js/app.js"></script>
</body>

</html>
