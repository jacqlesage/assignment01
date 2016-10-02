/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author James
 */
public class HandleAuction {
    
    private int handleAucitonID;
    private AuctionItemObj aItem; //probably need to add an AuctionItemObj class which will contain details.
    private double auctionReserve;
    private boolean finalBid;
    private boolean isActive;
    private Map customersWhoHaveBid; //should be able to add their bids under their customer ID here this way : Hashmap
    private List biddingHistory; //linked list as I am not sure of the size needed : Could use Array list here too ?
    private Date timeStamp; //get date/timeStamp
    private Integer bidAmount;
    private Integer totalBidsOnThisAuction; // for one customer
    private String bidder_Fname;
    private String bidder_Lname;
    private String bidder_email;
    private int customer_table_ID; //from the customers table (the customers ID on the customers table)
    private int auctionItem_ID; //get this from the auctionItemTable
    
    String url =  "jdbc:mysql://localhost:3306/dollarlogindb";

    public HandleAuction(Date timeStamp, Integer bidAmount, Integer totalBidsOnThisAuction, String bidder_Fname, String bidder_Lname, String bidder_email, int customer_table_ID, int auctionItem_ID) {
        this.timeStamp = timeStamp;
        this.bidAmount = bidAmount;
        this.totalBidsOnThisAuction = totalBidsOnThisAuction;
        this.bidder_Fname = bidder_Fname;
        this.bidder_Lname = bidder_Lname;
        this.bidder_email = bidder_email;
        this.customer_table_ID = customer_table_ID;
        this.auctionItem_ID = auctionItem_ID;
    }

    public int getHandleAucitonID() {
        return handleAucitonID;
    }

    public AuctionItemObj getaItem() {
        return aItem;
    }

     public boolean isIsActive() {
        return isActive;
    }

    public Date getTimeStamp() {
        return timeStamp;
    }

    public Integer getBidAmount() {
        return bidAmount;
    }

    public String getBidder_Fname() {
        return bidder_Fname;
    }

    public String getBidder_Lname() {
        return bidder_Lname;
    }

    public String getBidder_email() {
        return bidder_email;
    }

    public int getCustomer_table_ID() {
        return customer_table_ID;
    }

    public int getAuctionItem_ID() {
        return auctionItem_ID;
    }

    
    //here is where we can process the inserting of the handle auction table 
    public HandleAuction getHAuctionObj(HandleAuction obj){
        
        return obj;
    }
    

    
}
