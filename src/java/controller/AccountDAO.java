/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;


/**
 *
 * @author James
 */
public class AccountDAO {
    
    private int customerNumber;
    private double currentAccountBalance;
    String url =  "jdbc:mysql://localhost:3306/dollarlogindb";

      public double getCurrentAccountBalance() {
          
        return currentAccountBalance;
    }

    //only for test run purposes ??
    public void setCurrentAccountBalance(double currentAccountBalance) {

           String sql = "INSERT INTO customerAccountTable(deposit)"
                + "values(?)";
        
        try{
        
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, "root", "");
         
            
        }catch{
            
        }
        
        this.currentAccountBalance = currentAccountBalance;
    }
    
}
