<%-- 
    Document   : admin
    Created on : Jul 20, 2016, 5:37:24 PM
    Author     : James
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file = "headerWebPageSegment.jspf" %>

<header class="header">

    </header>

    <!-- Header / Banner ends -->


    <!-- Top Content Nav Buttons -->
        <div class="large-7 large-centered small-11 small centered columns">
                <div class="form-wrapper">
                    <p>
                        <i class="fi-check"></i>
                    </p>

                    <h2><a name = "signup">Add a new auction</a></h2>
                    <form id="sign-up" action="AddAuctionItemServlet" method="post">
                        <div class="row">
                            <div class="large-6 columns">
                                <label>Auction title:</label>
                                <input type="text" id="auctionTitle" name="auctionTitle" data-parsley-required="true">
                            </div>
                            <div class="large-6 columns">
                                <label>Auction description:</label>
                                <textarea id="auctionDescription" rows="5" name="auctionDescription" data-parsley-required="true">
                                
                                </textarea>
                            </div>
                        </div>
                        <div class="row">
                            <div class="large-4 columns">
                                <label>Auction picture file location/path:</label>
                                <input type="text" id="auctionPicture" name="auctionPicture" data-parsley-required="true">
                            </div>
<!--                            <div class="large-4 columns">
                                <label>Auction ID</label>
                                <input type="number" id="auctionID" name="auctionID" data-parsley-required="true" data-parsley-type="number">
                            </div>-->
                            
                        </div>
                        <div class="row">
                            <div class="large-4 columns">
                                <label>Auction item location:</label>
                                <input type="text" id="auctionLocation" name="auctionLocation" data-parsley-required="true">
                            </div>
                        </div>
                        <div class="row">
                            <div class="large-12 columns">
                                <label>Auction item specifications link/URL:</label>
                                <input type="text" id="itemSpecs" name="itemSpecs" data-parsley-required="true">
                            </div>
                        </div>
                       
                        <div class="row">
                            <div class="large-4 columns">
                                <label>Set reserve price</label>
                                <input type="number" id="auctionReservePrice" name="auctionReservePrice" data-parsley-required="true" data-parsley-type="number">
                            </div>
                            
                        </div>
                        
                         <div class="row">
                            <div class="large-4 columns">
                                <label>Current pool of funds:</label>
                                <input type="number" value="0" id="defaultPool" name="defaultPool" data-parsley-required="true" data-parsley-type="number" readonly>
                            </div>
                            
                        </div>

                        <div class="row">
                            <div class="large-centered large-9 columns">
                                <button type="submit" class="button expanded">Start new auction</button>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>



    <!-- Main Page Content ends-->
<%@include file = "footerWebPageSegment.jspf" %>
