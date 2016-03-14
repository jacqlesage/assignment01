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
import javax.servlet.http.HttpServletResponse;



/**
 *
 * @author James
 */
public class CustomerDAO {

    //Dbconnect cDAO = new Dbconnect();
      public static boolean customerFound = false;
    
    
    
    String url =  "jdbc:mysql://localhost:3306/dollarlogindb";
    
    public void findCustomer(String email, String password) throws ClassNotFoundException{
        
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
                 customerFound = true;
                 //print out to test if somthing is found
                 System.out.println("found customer");
                 //customer has been found so we need to now pull out the customer info
                 //and change the main page to say hello customer name
                 //also need to make the dash board information available
                 //else direct the customer back to either a / signup ir b/back to login option
                 //with some information to show that the user name is incorrect.
                 }
                
                 
             } catch (SQLException ex) {
                 System.out.println("no customer found");
                 Logger.getLogger(CustomerDAO.class.getName()).log(Level.SEVERE, null, ex);
             }
        
         }   
    
    /**
     * This method is for the setup of the new customer
     *
     * @param customerNumber
     * @param user_first_name
     * @param user_last_name
     * @param user_email
     * @param user_phone
     * @param user_address_1
     * @param user_suburb
     * @param user_city
     * @param user_address_2
     * @param user_post_code
     * @param user_password
     * @param user_confirm_password
     * @param user_age
     * @throws java.lang.ClassNotFoundException
     */
    public void newCustomerSetup(int customerNumber, String user_first_name, String user_last_name, String user_age,
     String user_address_1, String user_address_2, String user_suburb, String user_city, String user_post_code,
     String user_phone, String user_email, String user_password, String user_confirm_password) throws ClassNotFoundException
    {
        //I need to find out how to add a customer number automatically with every sign up and deal with pass hash#
        //also need to deal with putting the password into another table //logintable
        String sql = "INSERT INTO customertable(customerFirstName, customerLastName, customerAge, customerStAdd1"
                + "customerStAdd2, customerSuburb, customerCity, customerPostCode, customerPhone, customerEmail)"
                + "values(?,?,?,?,?,?,?,?,?,?)";
        
          
             try {
                 //change this code to meet new signup code. <- copied from above
                 //had to add this to register driver for some reason. 
                 Class.forName("com.mysql.jdbc.Driver");
       
                 //connect to DB
                 Connection con = DriverManager.getConnection(url, "root", "");
              
                 //create the statement that you want to find from the string
               PreparedStatement stmt = con.prepareStatement(sql);
  //               stmt.setString(1, "1");
                 stmt.setString(1, user_first_name);
                 stmt.setString(2, user_last_name);
                 stmt.setString(3, user_age);
                 stmt.setString(4, user_address_1);
                 stmt.setString(5, user_address_2);
                 stmt.setString(6, user_suburb);
                 stmt.setString(7, user_city);
                 stmt.setString(8, user_post_code);
                 stmt.setString(9, user_phone);
                 stmt.setString(10, user_email);
                 
                // stmt.setString(11, user_password);
                 //stmt.setString(12, user_confirm_password);
                 
                 //int rs;
               stmt.executeUpdate();
                int x = 0;
//                 while(0 < rs){
//                 
//                 //print out to test if somthing is found
//                 System.out.println("new  customer setup");
//                 //customer has been found so we need to now pull out the customer info
//                 //and change the main page to say hello customer name
//                 //also need to make the dash board information available
//                 //else direct the customer back to either a / signup ir b/back to login option
//                 //with some information to show that the user name is incorrect.
//                 }
                
                 
             } catch (SQLException ex) {
                 System.out.println("no customer found***");
                 Logger.getLogger(CustomerDAO.class.getName()).log(Level.SEVERE, null, ex);
             }
        
    }
        
    
    }
    
