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
    
    private int customerNumber;
    private double currentAccountBalance;
    String url =  "jdbc:mysql://localhost:3306/dollarlogindb";

      public double getCurrentAccountBalance() {
          
        return currentAccountBalance;
    }

    //only for test run purposes ??
    public void setCurrentAccountBalance(double currentAccountBalance) throws ClassNotFoundException {

        this.currentAccountBalance = currentAccountBalance;
        
           String sql = "INSERT INTO customeraccountinfo(transaction_id,cusAccBalance)"
                + "values(?,?)";
        
        try{
        
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, "root", "");
            
            PreparedStatement stmt = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            stmt.setInt(1, Types.INTEGER);
            stmt.setDouble(2, currentAccountBalance);
            
             stmt.executeUpdate(); 
            
        }  catch (SQLException ex) {
                 System.out.println("account issues");
                 Logger.getLogger(CustomerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
}
