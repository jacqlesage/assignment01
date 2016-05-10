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

    String user_first_name;
    String user_last_name;
    int user_age;
    String user_address_1;
    String user_address_2;
    String user_suburb;
    String user_city;
    int user_post_code;
    int user_phone;
    String user_email;
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
    public CustomerObj(String user_first_name, String user_last_name, int user_age,
            String user_address_1, String user_address_2, String user_suburb, String user_city, int user_post_code, int user_phone, String user_email,
            String user_password, String user_confirm_password) {

    }
     public CustomerObj() {

    }
    

    public String getUser_first_name() {
        return user_first_name;
    }

    public String getUser_last_name() {
        return user_last_name;
    }

    public int getUser_age() {
        return user_age;
    }

    public String getUser_address_1() throws ClassNotFoundException, MalformedURLException, IOException {
        
        Cookie c = null;
        System.out.println(c.getValue());
        
        URLConnection connection = new URL("jdbc:mysql://localhost:3306/dollarlogindb").openConnection();
    List<String> cookies = connection.getHeaderFields().get("Set-Cookie");
    for(String x: cookies){
        System.out.println(cookies);
    }
        
        String sql = "select customerStAdd1 from customertable where email = ?";

        try {
            //had to add this to register driver for some reason. 
            Class.forName("com.mysql.jdbc.Driver");

            //connect to DB
            Connection con = DriverManager.getConnection(url, "root", "");

            //create the statement that you want to find from the string
            PreparedStatement stmt = con.prepareStatement(sql);

//                 stmt.setString(1, email);
            //stmt.setString(2, password);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {

                //print out to test if somthing is found
                System.out.println("found customer");

          
            }

        } catch (SQLException ex) {
            System.out.println("no customer found");
            Logger.getLogger(CustomerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

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

    public int getUser_phone() {
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

}
