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
    
    public static String url =  "jdbc:mysql://localhost:3306/dollarlogindb";

    public AuctionItemObj(String auctionTitle, String auctionPicture, String auctionDescription, int auctionID, String specsURL, String itemLocation, int auctionReservePrice, boolean auctionActive) {
        this.auctionTitle = auctionTitle;
        this.auctionPicture = auctionPicture;
        this.auctionDescription = auctionDescription;
        this.auctionID = auctionID;
        this.specsURL = specsURL;
        this.itemLocation = itemLocation;
        this.auctionReservePrice = auctionReservePrice;
        this.auctionActive = false;
    }
    
    public AuctionItemObj(){
        
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
    
    
            
}
