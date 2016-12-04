/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.Date;
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

    public HistoryDAO(int aucNumber, String aucTitle, int cusNumber, String cusName, String cusEmail, int totalBidsForAuction, Date timeStamp) {
        this.aucNumber = aucNumber;
        this.aucTitle = aucTitle;
        this.cusNumber = cusNumber;
        this.cusName = cusName;
        this.cusEmail = cusEmail;
        this.totalBidsForAuction = totalBidsForAuction;
        this.timeStamp = timeStamp;
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
    private void insertAuctionWinHistory(HistoryDAO hDAO){
        
        
        
    }            
    
}
