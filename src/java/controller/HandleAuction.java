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
import java.sql.Statement;
import java.sql.Types;
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
//timestamp can be added by sql on insert and the total bids can be derrived from bid + total bids so no need for them in constructor
    public HandleAuction(Integer bidAmount,String bidder_Fname, String bidder_Lname, String bidder_email, int customer_table_ID, int auctionItem_ID) {
       
        this.bidAmount = bidAmount;
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
    
    public void setHAuctionObj(HandleAuction obj) throws ClassNotFoundException{
            boolean win = false;
           //total bids needs to be derrived from all bids so far 
            String sql = "INSERT INTO handleauctiontable(auctionItem_ID, customerTable_ID, ha_bidder_FName, ha_bidder_LName, ha_bidder_email, ha_totalCurrentBids,ha_isActive)"
            + "values(?,?,?,?,?,?,?)";
               
             try (Connection con = DriverManager.getConnection(url, "root", "");
            PreparedStatement stmt = con.prepareStatement(sql);
               ){
                 //change this code to meet new signup code. <- copied from above
                 //had to add this to register driver for some reason. 
                 Class.forName("com.mysql.jdbc.Driver");
       
                 //connect to DB
//                 Connection con = DriverManager.getConnection(url, "root", "");
                 System.out.println("inserting into handle auction");
          
                 //create the statement that you want to find from the string
//               PreparedStatement stmt = con.prepareStatement(sql);
               
               //add into the handle auction - need to derrive total bids col and also check the is active boolean - what to do with that.
                 stmt.setInt(1, obj.getAuctionItem_ID());
                 stmt.setInt(2, obj.getCustomer_table_ID());
                 stmt.setString(3, obj.getBidder_Fname());
                 stmt.setString(4, obj.getBidder_Lname());
                 stmt.setString(5, obj.getBidder_email());
                 stmt.setInt(6, obj.getBidAmount()); //this is going into a column which name I need to change to current bid 
                 stmt.setBoolean(7, obj.isIsActive());//making sure the auction is active might be able to derrive this also
            
  
               stmt.executeUpdate();
                
                 
             } catch (SQLException ex) {
                 System.out.println("no customer found in handleAuction class***");
                 Logger.getLogger(CustomerDAO.class.getName()).log(Level.SEVERE, null, ex);
             }
             
             //access update of totalbids 
             AuctionItemObj aio = new AuctionItemObj();
             //call update bid method
             int x = obj.getBidAmount();
             System.out.println("x = ***** " +x);
             
             //see if the bid has hit the reserve price
             win = aio.updateTotalBids(x);
             
             if(win){
             //deactivate auction
             
             //add to backup table
             
             //display sorting out the winner page while I sort out what to do about upcoming auctions.
             }
        
    }
    
  

    
}
