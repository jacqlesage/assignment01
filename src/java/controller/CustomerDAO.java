/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;



import dbconnection.Dbconnect;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.*;



/**
 *
 * @author James
 */
public class CustomerDAO {

    //Dbconnect cDAO = new Dbconnect();
      
    
    
    
    String url =  "jdbc:mysql://localhost:3306/dollarlogindb";
    
    public void findCustomer(String email, String password) throws ClassNotFoundException{
        System.out.println("CCCCCCCCCxxxCCCCC");
         String sql = "select * from dollarlogintable where email = ? and password = ?";
        
          
             try {
                 //had to add this to register driver for some reason. 
                 Class.forName("com.mysql.jdbc.Driver");
       
                 //connect to DB
                 Connection con = DriverManager.getConnection(url, "root", "");
              
                 //create the statement that you want to find from the string
                 PreparedStatement stmt = con.prepareStatement(sql);
                 
                 stmt.setString(1, email);
                 stmt.setString(2, password);
                 ResultSet rs =stmt.executeQuery();
                
                 while(rs.next()){
                 
                 //print out to test if somthing is found
                 System.out.println("found customer");
                 
                 }
                
                 
             } catch (SQLException ex) {
                 System.out.println("no customer found");
                 Logger.getLogger(CustomerDAO.class.getName()).log(Level.SEVERE, null, ex);
             }
        
         }   
        
    
    }
    
