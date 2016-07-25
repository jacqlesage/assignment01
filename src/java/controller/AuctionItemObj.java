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
    private String url;
    private String itemLocation;
    private int auctionReservePrice;

    public AuctionItemObj(String auctionTitle, String auctionPicture, String auctionDescription, int auctionID, String specsURL, String itemLocation, int auctionReservePrice) {
        this.auctionTitle = auctionTitle;
        this.auctionPicture = auctionPicture;
        this.auctionDescription = auctionDescription;
        this.auctionID = auctionID;
        this.url = specsURL;
        this.itemLocation = itemLocation;
        this.auctionReservePrice = auctionReservePrice;
    }

    public String getAuctionTitle() {
        return auctionTitle;
    }

    public void setAuctionTitle(String auctionTitle, int auctionID) throws ClassNotFoundException {
        
        this.auctionTitle = auctionTitle;
        this.auctionID = auctionID;
        
        String sql = "select auctionTitle from auctionItemTable where auctionID = ?";

        try (Connection con = DriverManager.getConnection(url, "root", "");
            PreparedStatement stmt = con.prepareStatement(sql);
              ){
            //had to add this to register driver for some reason. 
            Class.forName("com.mysql.jdbc.Driver");

            //connect to DB
            //Connection con = DriverManager.getConnection(url, "root", "");

            //create the statement that you want to find from the string
            //PreparedStatement stmt = con.prepareStatement(sql);

                 stmt.setString(1, auctionTitle);
            //stmt.setString(2, password);
            ResultSet rs = stmt.executeQuery();

//            while (rs.next()) {
//                firstName = rs.getString("customerFirstName");
//                //print out to test if somthing is found
//                System.out.println("found customer " + firstName);
//
//          
//            }

        } catch (SQLException ex) {
            System.out.println("no customer found");
            Logger.getLogger(CustomerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

          
    }

    public String getAuctionPicture() {
        return auctionPicture;
    }

    public void setAuctionPicture(String auctionPicture) {
        this.auctionPicture = auctionPicture;
    }

    public String getAuctionDescription() {
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
