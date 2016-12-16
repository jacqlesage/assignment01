/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import static controller.CustomerDAO.customerFound;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.Cookie;

/**
 *
 * @author James
 */
public class CustomerObj {
    int user_customer_number;
    String user_first_name;
    String user_last_name;
    String user_age; //should be int
    String user_address_1;
    String user_address_2;
    String user_suburb;
    String user_city;
    int user_post_code;
    String user_phone;
    String user_email;
    int user_balance;
    String user_password;
    String user_confirm_password;
    String url = "jdbc:mysql://localhost:3306/dollarlogindb";

  
    

    /**
     *
     * @param user_first_name
     * @param user_last_name
     * @param user_age
     * @param user_address_1
     * @param user_address_2
     * @param user_suburb
     * @param user_city
     * @param user_post_code
     * @param user_phone
     * @param user_email
     * @param user_password
     * @param user_confirm_password
     */

      public CustomerObj() {
    }

    public CustomerObj(String user_email) {
        this.user_email = user_email;
    }

    public CustomerObj(int user_customer_number, String user_first_name, String user_last_name, String user_age, String user_address_1, String user_address_2, String user_suburb, String user_city, int user_post_code, String user_phone, String user_email) {
        this.user_customer_number = user_customer_number;
        this.user_first_name = user_first_name;
        this.user_last_name = user_last_name;
        this.user_age = user_age;
        this.user_address_1 = user_address_1;
        this.user_address_2 = user_address_2;
        this.user_suburb = user_suburb;
        this.user_city = user_city;
        this.user_post_code = user_post_code;
        this.user_phone = user_phone;
        this.user_email = user_email;
    }
    
    
    
    //to deal with the handle auction table info needed
    public CustomerObj(String user_first_name, String user_last_name, String user_email) {
        
        this.user_first_name = user_first_name;
        this.user_last_name = user_last_name;
        this.user_email = user_email;
        
    }

    public int getUser_customer_number() {
        return user_customer_number;
    }

    public String getUser_first_name() {
        return user_first_name;
    }

    public String getUser_last_name() {
        return user_last_name;
    }

    public String getUser_age() {
        return user_age;
    }

    public String getUser_address_1() {
        return user_address_1;
    }

    public String getUser_address_2() {
        return user_address_2;
    }

    public String getUser_suburb() {
        return user_suburb;
    }

    public String getUser_city() {
        return user_city;
    }

    public int getUser_post_code() {
        return user_post_code;
    }

    public String getUser_phone() {
        return user_phone;
    }

    public String getUser_email() {
        return user_email;
    }

    public String getUser_password() {
        return user_password;
    }

    public String getUser_confirm_password() {
        return user_confirm_password;
    }
    
     
        /**
         * A method to get the customer object/all customer details from the table.
         * 
         * @param o = customer object
         * @return returns the customer object
         * @throws ClassNotFoundException 
         */
        public CustomerObj getCustomer(CustomerObj o) throws ClassNotFoundException{
        
        int cusID = 0;
        String cusFname = null;
        String cusLname = null;
        String cusAge = null;
        String cusStAdd1 = null;
        String cusStAdd2 = null;
        String cusSuburb = null;
        String cusCity = null;
        Integer cusPostCode = null;
        String cusPhone = null;
        String cusEmail = o.getUser_email();; 
        String cusBalance = null; 
        
                
        Class.forName("com.mysql.jdbc.Driver");        
        //only should be one auction active at a time...
        String sql = "SELECT * FROM customertable WHERE customerEmail = ?";
          //create the statement that you want to find from the string
        try (Connection con = DriverManager.getConnection(url, "root", "");
            PreparedStatement stmt = con.prepareStatement(sql);
               ){
            //had to add this to register driver for some reason. 
            //Class.forName("com.mysql.jdbc.Driver");
            stmt.setString(1, cusEmail);
            
           ResultSet rs =  stmt.executeQuery();
          
              while (rs.next()) {
               cusID =  rs.getInt("customerNumber");
               cusFname = rs.getString("customerFirstName");
               cusLname = rs.getString("customerLastName");
               cusAge = rs.getString("customerAge");
               cusStAdd1 = rs.getString("customerStAdd1");
               cusStAdd2 = rs.getString("customerStAdd2");
               cusSuburb = rs.getString("customerSuburb");
               cusCity = rs.getString("customerCity");
               cusPostCode = rs.getInt(String.valueOf("customerPostCode"));
               cusPhone = rs.getString("customerPhone");
               cusEmail = rs.getString("customerEmail");
               cusBalance = rs.getString("customerBalance");
               

               }
             //do I need customer balance to follow araound also ?
              o = new CustomerObj(cusID, cusFname, cusLname, cusAge, cusStAdd1, cusStAdd2, cusSuburb, cusCity, cusPostCode, cusPhone, cusEmail);
              System.out.println("in customer object class " + o.toString());
        } catch (SQLException ex) {
            System.out.println("no customer found in get auction description");
            Logger.getLogger(CustomerDAO.class.getName()).log(Level.SEVERE, null, ex);
            
        
    }
        return o;
        }
    
     @Override
    public String toString() {
        return "CustomerObj{" + "user_first_name=" + user_first_name + ", user_last_name=" + user_last_name + ", user_age=" + user_age + ", user_address_1=" + user_address_1 + ", user_address_2=" + user_address_2 + ", user_suburb=" + user_suburb + ", user_city=" + user_city + ", user_post_code=" + user_post_code + ", user_phone=" + user_phone + ", user_email=" + user_email + ", user_password=" + user_password + ", user_confirm_password=" + user_confirm_password + ", url=" + url + '}';
    }
}
