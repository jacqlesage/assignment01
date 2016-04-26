/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author James
 */
public class AccountDAO {
    
   
    private int currentAccountBalance;
    String url =  "jdbc:mysql://localhost:3306/dollarlogindb";

      public int getCurrentAccountBalance() throws ClassNotFoundException {
          String temp;
          ResultSet r;
          int rs =0;
           //this.currentAccountBalance = currentAccountBalance;
        //System.out.println(this.currentAccountBalance + " llkjlkjl");
           String sql = "SELECT customerBalance FROM customerTable";
        
        try{
        
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, "root", "");
            
            PreparedStatement stmt = con.prepareStatement(sql);
                                               
            r = stmt.executeQuery(); 
            
            while(r.next()){
                rs = r.getInt("customerBalance");
            }
            
        }  catch (SQLException ex) {
                 System.out.println("account issues");
                 Logger.getLogger(CustomerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
          System.out.println(rs);
        return rs;
    }

    //only for test run purposes ??
    public void setCurrentAccountBalance(int currentAccountBalance) throws ClassNotFoundException {

        this.currentAccountBalance = currentAccountBalance;
        //System.out.println(this.currentAccountBalance + " llkjlkjl");
           String sql = "UPDATE customertable SET customerBalance =?";
        
        try{
        
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, "root", "");
            
            PreparedStatement stmt = con.prepareStatement(sql);
            
            stmt.setInt(1, currentAccountBalance+getCurrentAccountBalance());
                        
            stmt.executeUpdate(); 
            
        }  catch (SQLException ex) {
                 System.out.println("account issues");
                 Logger.getLogger(CustomerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
}
