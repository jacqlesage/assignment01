
<%-- 
    Document   : dashboard
    Created on : Apr 6, 2016, 8:58:58 PM
    Author     : James
--%>

<%@page import="viewWeb.EditDetailsServlet"%>
<%@page import="controller.CustomerObj"%>
<%@page import="controller.AccountDAO"%>
<%@page import="controller.AuctionItemObj"%>
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
   
   <!--<script src="js/editDetails.js" type="text/javascript"></script> -->
   
   <!--Script for loading heading description-->
 <script src="js/loadProductDescription.js" type="text/javascript"></script>
  
 <% AuctionItemObj ao = new AuctionItemObj();
    
    if(CustomerDAO.customerFound){ 
   ao = a.getAuctionItemObject();
   
}
    Integer name = (Integer)request.getAttribute("value");
    System.out.println(name + "))))))");
%>
    
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
                        <h4>Current pool of money:(highlighted when you bid only)</h4>
                        <p id="showWhenBid"><6***<%out.print(name); %></p>
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
                            <form action="handleAuctionServlet" method="post">
                                <% if(ao.getAuctionID() != 0){ %>
                                <% System.out.println(ao.toString()+ " *********"); %>
                                <!-- no need for id="auctionHeading" any more - auction set from admin page -->
                                <li>Auction number: <input type="text" value="<% out.print(ao.getAuctionID()); %>" id="auctionNumber" name="auctionNumber" readonly></li>
                                <li>  What's on auction: <input id="auctionTitle" name="auctionTitle" value="<% out.print(" " + ao.getAuctionTitle()); %>" > </li>
                                <li id="auctionDescription" name="auctionDescription"> Details of the product: <% out.print(" " + ao.getAuctionDescription()); %> </li>
                                <li id="auctionItemLocation" name="auctionItemLocation"> If you win it where do you need to ship it from?: <% out.print(" " + ao.getItemLocation()); %> </li>
                                <li id="auctionSpecInformation" name="auctionSpecInformation"> Here would be a link to the specs of the item: <% out.print(" " + ao.getspecsUrl()); %> </li>
                                <li id="auctionPicThumbnail" name="auctionPicThumbnail"> Here would insert the picture of the item <% out.print(" " + ao.getAuctionPicture()); %> </li>
                            <li>Bid amount. (In whole dollars only)  <input type="number" name="bidAmount" id="bidAmount" max="10"></li>
                            <li>Bid Percentage: 18% need to work out a graph for this - not hard code</li>
                            
                            <li><button class="button" type="submit">Bid on this auction</button></li>
                            <li><button class="button">Go to auction page</button></li>
                            
                           
                            
                            <%}else{%>
                                <li>We have a winner! <input type="text" value="Please wait while we congratulate our latest winner" readonly></li>
<!--                                <li>  What's on auction: <input id="auctionTitle" name="auctionTitle" value="Please wait while we congratulate our latest winner" > </li>
                                <li id="auctionDescription" name="auctionDescription" value="Please wait while we congratulate our latest winner" >  </li>
                                <li id="auctionItemLocation" name="auctionItemLocation" value="Please wait while we congratulate our latest winner" > </li>
                                <li id="auctionSpecInformation" name="auctionSpecInformation" value="Please wait while we congratulate our latest winner" > </li>
                                <li id="auctionPicThumbnail" name="auctionPicThumbnail" value="Please wait while we congratulate our latest winner" ></li>-->
                            <!--<li>Bid amount. (In whole dollars only)  <input type="number" name="bidAmount" id="bidAmount" max="10"></li>-->
                            <!--<li>Bid Percentage: 18% need to work out a graph for this - not hard code</li>-->
                            
                            <%}%>
<!--                            <li><button class="button" type="submit">Bid on this auction</button></li>
                            <li><button class="button">Go to auction page</button></li>-->
                            </form>


                        </ul>

                    </div>
                </div>
                
                
                <div class="large-6 small-9 small-centered">
                    <div class="dash-inner-item">
                        <h3>Your Details</h3>
                        <ul>
                            <form action="EditDetailsServlet" method="post">
                           
                            Click here to make details editable: <input type="checkbox" name="diffPayeeAddrFlag" id="checkedBox" value="checked" onClick="makeDetailsEditable()"/> <br/>
  
                            <!-- Setup a edit servlet to edit details-->
                            <!-- Use customer DAO to get personal info and place here-->
                            
                            <li>Age: <input type="text" name="age" id ="age" value="<%out.print(c.getUser_age()); %>" readonly></li>
                            <li>Name: <input type="text" name="name" id ="name" value="<%out.print(c.getUser_first_name() + " " + c.getUser_last_name()); %>" readonly></li>
                            <li>Email: <input type="text" name="email" id ="email" value="<%out.print(c.getUser_email()); %>" readonly></li>
                            <li>Phone: <input type="text" name="phone" id ="phone" value="<%out.print(c.getUser_phone()); %>" readonly></li>
                            <li>Address: <input type="text" name="address" id ="address" value="<%out.print(c.getUser_address_1()); %>" readonly></li>
                            <li>Address 2: <input type="text" name="address2" id ="address2" value="<%out.print(c.getUser_address_2()); %>" readonly></li>
                            <li>Postcode <input type="text" name="postcode" id="postcode" value="<%out.print(c.getUser_post_code()); %>" readonly></li>
                            <li>Suburb: <input type="text" name="suburb" id="suburb" value="<%out.print(c.getUser_suburb()); %>" readonly></li>
                            <li>City: <input type="text" name="city" id="city" value="<%out.print(c.getUser_city()); %>" readonly></li>
                            
                             <% //CustomerObj cus = new CustomerObj(c.getUser_first_name(), c.getUser_last_name(), c.getUser_email()); %>
                             <% //request.setAttribute("customer", cus); %>
                             <% ServletContext sc = this.getServletContext(); %>
                             <% RequestDispatcher rd = sc.getRequestDispatcher("/handleAuctionServlet"); %>
                             
                                <button class="button" type="submit">Edit These Details</button>
                            </form>
                            
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
