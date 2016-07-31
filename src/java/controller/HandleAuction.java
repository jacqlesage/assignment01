/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.Calendar;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author James
 */
public class HandleAuction {
    
    private int aucitonID;
    private AuctionItemObj aItem; //probably need to add an AuctionItemObj class which will contain details.
    private double auctionReserve;
    private boolean finalBid;
    private boolean isActive;
    private Map customersWhoHaveBid; //should be able to add their bids under their customer ID here this way : Hashmap
    private List biddingHistory; //linked list as I am not sure of the size needed : Could use Array list here too ?
    private Calendar calendar; //get timeStamp
    private Double totalBids;

    public HandleAuction(int aucitonID, AuctionItemObj aItem, double auctionReserve, boolean finalBid, Calendar calendar, Double totalBids) {
        this.aucitonID = aucitonID;
        this.aItem = aItem;
        this.auctionReserve = auctionReserve;
        this.finalBid = finalBid;
        this.calendar = calendar;
        this.totalBids = totalBids;
        
        customersWhoHaveBid = new HashMap();
        biddingHistory = new LinkedList();
        isActive = true;
        
    }

    public int getAucitonID() {
        return aucitonID;
    }

    public void setAucitonID(int aucitonID) {
        this.aucitonID = aucitonID;
    }

    public AuctionItemObj getaItem() {
        return aItem;
    }

    public void setaItem(AuctionItemObj aItem) {
        this.aItem = aItem;
    }

    public double getAuctionReserve() {
        return auctionReserve;
    }

    public void setAuctionReserve(double auctionReserve) {
        this.auctionReserve = auctionReserve;
    }

    public boolean isFinalBid() {
        return finalBid;
    }

    public void setFinalBid(boolean finalBid) {
        this.finalBid = finalBid;
    }

    public boolean isIsActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    public Map getCustomersWhoHaveBid() {
        return customersWhoHaveBid;
    }

    public void setCustomersWhoHaveBid(Map customersWhoHaveBid) {
        this.customersWhoHaveBid = customersWhoHaveBid;
    }

    public List getBiddingHistory() {
        return biddingHistory;
    }

    public void setBiddingHistory(List biddingHistory) {
        this.biddingHistory = biddingHistory;
    }

    public Calendar getCalendar() {
        return calendar;
    }

    public void setCalendar(Calendar calendar) {
        this.calendar = calendar;
    }

    public Double getTotalBids() {
        return totalBids;
    }

    public void setTotalBids(Double totalBids) {
        this.totalBids = totalBids;
    }
    

    
}
