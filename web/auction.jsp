<%-- 
    Document   : auction
    Created on : Apr 4, 2016, 9:49:31 PM
    Author     : James
--%>

<%@page import="controller.AuctionItemObj"%>
<%@page import="controller.CustomerDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file = "headerWebPageSegment.jspf" %>
    <!-- Top Nav end-->


    <!-- Header / Banner -->

    <header class="header">

    </header>

    <!-- Header / Banner ends -->


    <!-- Top Content Nav Buttons -->
 <%@include file = "auctionDashboardWebPageSegment.jspf"%>
 <!--Script for loading heading description-->
 <script src="js/loadProductDescription.js" type="text/javascript"></script>
      
 <% 
     //need to deal with an auction not being in here*******
    //AuctionItemObj a = (AuctionItemObj)request.getAttribute("auctionObj");
     //System.out.println(a.getAuctionDescription());
     //a.getAuctionItemObject();
     String temp = "";
  %>


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
                    
        
                     
<!--                  //<h2 id="auctionHeading"> </h2>-->
                    <!-- get the title description from the database -->
                    <h2><%  if(a.getAuctionID() != 0){ %>
                            <%out.print(a.getAuctionTitle());%>
                        <%}else{ %>
                           <% out.print("Please be patient while we get our next auction ready, we have a winner to congratulate first");%>
                                <%out.print(a.getAuctionTitle());                   
                        }%>
                        
                    </h2>
                    <!--//Get the picture file location.-->
                    <img src="<%out.print(a.getAuctionPicture());%>">
                      
                     <!--get auction description paragraph-->
                    <p> <%  out.print(a.getAuctionDescription());%> 
<!--                        Brand new, in box, iPhone 6s Plus - 128gb. The latest and greatest in smart phone technology.
                        This phone could be your for just $1, assuming you have already <a href="index.jsp#signup">Signed Up</a> and are <a href="login.html">logged in</a>
                        use the bid button below to get started.-->
                    </p>
                    <form method = "post"  action = "dashboard.jsp">
                        <% if(CustomerDAO.customerFound == true){ %>
                    <button class="button auction-buttons expanded" type="submit">Bid on this auction</button>
                   
                            <%}else{ %>
                            <button class="button auction-buttons expanded" disabled>Log in to bid on this auction</button>
                         
                            <%}%>
                          
                    </form>
                    <button class="button auction-buttons expanded"><a href="index.jsp#signup">Sign Up</a></button>
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