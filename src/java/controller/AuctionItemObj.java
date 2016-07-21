/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

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

    public AuctionItemObj(String auctionTitle, String auctionPicture, String auctionDescription, int auctionID, String url, String itemLocation, int auctionReservePrice) {
        this.auctionTitle = auctionTitle;
        this.auctionPicture = auctionPicture;
        this.auctionDescription = auctionDescription;
        this.auctionID = auctionID;
        this.url = url;
        this.itemLocation = itemLocation;
        this.auctionReservePrice = auctionReservePrice;
    }

    public String getAuctionTitle() {
        return auctionTitle;
    }

    public void setAuctionTitle(String auctionTitle) {
        this.auctionTitle = auctionTitle;
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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
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
