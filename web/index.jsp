<%-- 
    Document   : index.jsp
    Created on : Apr 5, 2016, 9:58:22 PM
    Author     : James
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file = "headerWebPageSegment.jspf" %>


 <header class="header">

    </header>

    <!-- Header / Banner ends -->


    <!-- Top Content Nav Buttons -->
    <%@include file = "auctionDashboardWebPageSegment.jspf"%>


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
                            <div id="results"></div>
                            <h3>Current Auction <div id="results"></div> </h3>
                            <h4>iPhone 6s - Any Color!</h4>
                            <a href="auction.jsp">
                                <img src="img/iphone.jpg">
                            </a>
                        </div>
                        <div class="content-side-item">
                            <h3>Upcoming Auctions</h3>
                            <h4>Smart TV</h4>
                            <a href="auction.jsp">
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

                    <h2><a name = "signup">Enter your details to get started</a></h2>
                    <form id="sign-up" action="UserSignUpServlet" method="post">
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
                            <div class="large-4 columns" >
                                <label>Age (optional)</label>
                                <select name="user_age">
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
<%@include file = "footerWebPageSegment.jspf" %>
   