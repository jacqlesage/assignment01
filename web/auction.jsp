<%-- 
    Document   : auction
    Created on : Apr 4, 2016, 9:49:31 PM
    Author     : James
--%>

<%@page import="controller.CustomerDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file = "headerWebPageSegment.jspf" %>
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
                    <a href="auction.jsp" class="button content-top-nav-active expanded">AUCTION</a>
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

 <%@include file = "footerWebPageSegment.jspf" %>