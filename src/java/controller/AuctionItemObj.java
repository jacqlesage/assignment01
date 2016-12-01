/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author James
 */
public class AuctionItemObj {
    private String auctionTitle;
    private String auctionPicture;
    private String auctionDescription;
    //auction ID auto generated? connects via an admin HTML page? 
    private int auctionID; //autogenerate via database
    private String specsURL;
    private String itemLocation;
    private int auctionReservePrice;
    boolean auctionActive;
    private int auctionPoolOfFunds;
    
    public static String url =  "jdbc:mysql://localhost:3306/dollarlogindb";

    public AuctionItemObj(String auctionTitle, String auctionPicture, String auctionDescription, int auctionID, String specsURL, String itemLocation, int auctionReservePrice, boolean auctionActive,int auctionPoolOfFunds) {
        this.auctionTitle = auctionTitle;
        this.auctionPicture = auctionPicture;
        this.auctionDescription = auctionDescription;
        this.auctionID = auctionID;
        this.specsURL = specsURL;
        this.itemLocation = itemLocation;
        this.auctionReservePrice = auctionReservePrice;
        this.auctionActive = false;
        this.auctionPoolOfFunds = auctionPoolOfFunds;
    }
    
    public AuctionItemObj(){
        
    }

    //correct constructer - with no reserve price going in ...??
    public AuctionItemObj(String auctionTitle, String auctionPicture, String auctionDescription, int auctionID, String specsURL, String itemLocation, boolean auctionActive, int auctionPoolOfFunds) {
        this.auctionTitle = auctionTitle;
        this.auctionPicture = auctionPicture;
        this.auctionDescription = auctionDescription;
        this.auctionID = auctionID;
        this.specsURL = specsURL;
        this.itemLocation = itemLocation;
        this.auctionActive = auctionActive;
        this.auctionPoolOfFunds = auctionPoolOfFunds;
    }

    /**
     *
     * @return
     * @throws ClassNotFoundException
     */
    public String getAuctionTitle() throws ClassNotFoundException {
        //System.out.println("auctionTitle");
        Class.forName("com.mysql.jdbc.Driver");
        String temp ="";
        
        String sql = "SELECT auctionTitle FROM auctionitemtable WHERE auctionActive = true";
          //create the statement that you want to find from the string
        try (Connection con = DriverManager.getConnection(url, "root", "");
            PreparedStatement stmt = con.prepareStatement(sql);
               ){

               ResultSet rs =  stmt.executeQuery();
      
            while (rs.next()) {
               temp =  rs.getString("auctionTitle");
               System.out.println(temp + " %%%%%");

               }

        } catch (SQLException ex) {
            System.out.println("no customer found in set user");
            Logger.getLogger(CustomerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        auctionTitle = temp;
        
        return auctionTitle;
    }

    public void setAuctionTitle(String auctionTitle) throws ClassNotFoundException {
                 
    }

    public String getAuctionPicture() throws ClassNotFoundException {
        
        Class.forName("com.mysql.jdbc.Driver");
        String temp ="";
        
        String sql = "SELECT auctionPicture FROM auctionitemtable WHERE auctionActive = true";
          //create the statement that you want to find from the string
        try (Connection con = DriverManager.getConnection(url, "root", "");
            PreparedStatement stmt = con.prepareStatement(sql);
               ){

               ResultSet rs =  stmt.executeQuery();
      
            while (rs.next()) {
               temp =  rs.getString("auctionPicture");
               System.out.println(temp + " %%%%%");

               }

        } catch (SQLException ex) {
            System.out.println("no customer found in set picture");
            Logger.getLogger(CustomerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        auctionPicture = temp;
        
              
        return auctionPicture;
    }

    public void setAuctionPicture(String auctionPicture) {
        this.auctionPicture = auctionPicture;
    }

    public String getAuctionDescription() throws ClassNotFoundException {
        
        //System.out.println("auctionTitle");
        Class.forName("com.mysql.jdbc.Driver");
        String temp ="";
        
        String sql = "SELECT auctionDescription FROM auctionitemTable WHERE auctionActive = true";
          //create the statement that you want to find from the string
        try (Connection con = DriverManager.getConnection(url, "root", "");
            PreparedStatement stmt = con.prepareStatement(sql);
               ){
            //had to add this to register driver for some reason. 
            //Class.forName("com.mysql.jdbc.Driver");

           ResultSet rs =  stmt.executeQuery();
          
              while (rs.next()) {
               temp =  rs.getString("auctionDescription");
               System.out.println(temp + " %%%%%");

               }
             

        } catch (SQLException ex) {
            System.out.println("no customer found in get auction description");
            Logger.getLogger(CustomerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    
        auctionDescription = temp;
          
        return auctionDescription;
    }

    public void setAuctionDescription(String auctionDescription) {
        this.auctionDescription = auctionDescription;
    }

    public int getAuctionID() {
        return auctionID;
    }

    public void setAuctionID(int auctionID) {
        this.auctionID = auctionID;
    }

    public String getspecsUrl() {
        return url;
    }

    public void setspecsUrl(String url) {
        this.url = url;
    }

    public String getItemLocation() {
        return itemLocation;
    }

    public void setItemLocation(String itemLocation) {
        this.itemLocation = itemLocation;
    }

    public int getAuctionReservePrice() {
        return auctionReservePrice;
    }

    public void setAuctionReservePrice(int auctionReservePrice) {
        this.auctionReservePrice = auctionReservePrice;
    }
    
    public AuctionItemObj getAuctionItemObject() throws ClassNotFoundException{
        //need to create a object to get all of the information about the auction Object
        //use the getters and setters for the object from there.
        int aucID = 0;
        String aucTitle = null;
        String aucDescription = null;
        String aucPicture = null;
        String aucSpecURL = null;
        String aucItemLocation = null;
        String aucReserve;
        boolean aucActive = false; 
        int aucTotalBidsPool = 0;
        
                
        Class.forName("com.mysql.jdbc.Driver");        
        //only should be one auction active at a time...
        String sql = "SELECT * FROM auctionitemtable WHERE auctionActive = true";
          //create the statement that you want to find from the string
        try (Connection con = DriverManager.getConnection(url, "root", "");
            PreparedStatement stmt = con.prepareStatement(sql);
               ){
            //had to add this to register driver for some reason. 
            //Class.forName("com.mysql.jdbc.Driver");

           ResultSet rs =  stmt.executeQuery();
          
              while (rs.next()) {
               aucID =  rs.getInt("auctionID");
               aucTitle = rs.getString("auctionTitle");
               aucDescription = rs.getString("auctionDescription");
               aucPicture = rs.getString("auctionPicture");
               aucSpecURL = rs.getString("auctionSpecURL");
               aucItemLocation = rs.getString("auctionItemLocation");
               aucActive = rs.getBoolean("auctionActive");
               aucTotalBidsPool = rs.getInt("auctionTotalBidsPool");
               

               }
             
              
        } catch (SQLException ex) {
            System.out.println("no customer found in get auction description");
            Logger.getLogger(CustomerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    
        AuctionItemObj ao = new AuctionItemObj(aucPicture,aucTitle,aucDescription,aucID,aucSpecURL,aucItemLocation,aucActive,aucTotalBidsPool);
          
        return ao;
    }
    
    public void updateTotalBids(int bid) throws ClassNotFoundException{
        int aucTotalBidsPool = 0;
        
        boolean x = false;
        
        Class.forName("com.mysql.jdbc.Driver");        
        //only should be one auction active at a time...
        String sql = "SELECT auctionTotalBidsPool " +
        "FROM auctionitemtable " +
        "WHERE auctionActive = '1'";//true setup as tinyint
    
         //create the statement that you want to find from the string
        try (Connection con = DriverManager.getConnection(url, "root", "");
            PreparedStatement stmt = con.prepareStatement(sql);
               ){
           
                          

           ResultSet rs =  stmt.executeQuery();
          
              while (rs.next()) {
             
               aucTotalBidsPool = rs.getInt("auctionTotalBidsPool");
  
               }
    
              
        } catch (SQLException ex) {
            System.out.println("no customer found in get auction description");
            Logger.getLogger(CustomerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
           
            String sql2 = "UPDATE auctionitemtable " +
            "SET auctionTotalBidsPool = ? " +
            "WHERE auctionActive = ?";
        
            //update with the new value 
           try (Connection con = DriverManager.getConnection(url, "root", "");
            PreparedStatement stmt2 = con.prepareStatement(sql2);
               ){
               //add to current value 
               aucTotalBidsPool += bid;
               //got to complete this  - adding values and updating old / this is a new method also
               //stmt.setBoolean(1, obj.isIsActive());//making sure the auction is active might be able to derrive this also
               stmt2.setInt(1, aucTotalBidsPool);
               stmt2.setBoolean(2, true);
               System.out.println("((((((( " + aucTotalBidsPool);
               stmt2.executeUpdate();
                
              
        } catch (SQLException ex) {
            System.out.println("no customer found in get auction description");
            Logger.getLogger(CustomerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
           if(checkAuctionWon(aucTotalBidsPool)){
               
               //turn auction active to not 
              //display a please wait while we congratulate the winner page ?
              //rezally need to get another auciton up to bid on asap - another table to load future auctions in ?
              //or do I want the unknown down time ??
               
           }
           
    }
    
    private boolean checkAuctionWon(int auctionBidAmount) throws ClassNotFoundException{
        
        int auctionReserve = 0;
        boolean returnVal = false;
        
         Class.forName("com.mysql.jdbc.Driver");        
        //only should be one auction active at a time...
        String sql = "SELECT auctionReserve " +
        "FROM auctionitemtable ";
       
    
         //create the statement that you want to find from the string
        try (Connection con = DriverManager.getConnection(url, "root", "");
            PreparedStatement stmt = con.prepareStatement(sql);
               ){
           
           ResultSet rs =  stmt.executeQuery();
          
              while (rs.next()) {
             
               auctionReserve = rs.getInt("auctionReserve");
  
               }
    
              
        } catch (SQLException ex) {
            System.out.println("no customer found in get auction description");
            Logger.getLogger(CustomerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if(auctionBidAmount == auctionReserve){
            returnVal = true;
              System.out.println("Auction won = true");
              System.out.println("Need to finish up auction - auction has won what needs to happen next close auction, sort out winner");
              
        }
        
        return returnVal;
    }
            
}
