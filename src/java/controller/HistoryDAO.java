/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import static controller.AuctionItemObj.url;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author James
 */
public class HistoryDAO {
    //things that need to be in table to keep a track of winners for each auction.
    private int aucNumber;
    private String aucTitle;
    private int cusNumber;
    private String cusName;
    private String cusEmail;
    private int totalBidsForAuction;
    private Date timeStamp;

    public HistoryDAO(int aucNumber, String aucTitle, int cusNumber, String cusName, String cusEmail, int totalBidsForAuction) {
        this.aucNumber = aucNumber;
        this.aucTitle = aucTitle;
        this.cusNumber = cusNumber;
        this.cusName = cusName;
        this.cusEmail = cusEmail;
        this.totalBidsForAuction = totalBidsForAuction;
        
    }

    public int getAucNumber() {
        return aucNumber;
    }

    public String getAucTitle() {
        return aucTitle;
    }

    public int getCusNumber() {
        return cusNumber;
    }

    public String getCusName() {
        return cusName;
    }

    public String getCusEmail() {
        return cusEmail;
    }

    public int getTotalBidsForAuction() {
        return totalBidsForAuction;
    }

    public Date getTimeStamp() {
        return timeStamp;
    }
    
    /**
        A method to insert who one into a history table
        @param hDAO - object being inserted into the table
    **/
    private void insertAuctionWinHistory(HistoryDAO hDAO) throws ClassNotFoundException{
        
          Class.forName("com.mysql.jdbc.Driver");        
        //only should be one auction active at a time...
        String sql = "INSERT INTO winnershistorytable " +
        "VALUES (?,?,?,?,?,?)";
       
    
         //create the statement that you want to find from the string
        try (Connection con = DriverManager.getConnection(url, "root", "");
            PreparedStatement stmt = con.prepareStatement(sql);
               ){
           
           stmt.setInt(1, hDAO.getAucNumber());
           stmt.setString(2, hDAO.getAucTitle());
           stmt.setInt(3, hDAO.getCusNumber());
           stmt.setString(4, hDAO.getCusName());
           stmt.setInt(5, hDAO.getTotalBidsForAuction());
    
              
        } catch (SQLException ex) {
            System.out.println("no customer found in get auction description");
            Logger.getLogger(CustomerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }            
    
}
