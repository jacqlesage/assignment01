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
    String user_age; //should be int
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
     
      public CustomerObj(String emailAddress) {
          this.user_email = emailAddress;
    }
    

    public String getUser_first_name() throws ClassNotFoundException, MalformedURLException, IOException {
        String email = CustomerObj.this.user_email;
        String firstName = "";
        
        //System.out.println(email + " *****************   ** * *email in user first name");
        
        String sql = "select customerFirstName from customertable where customerEmail = ?";

        try (Connection con = DriverManager.getConnection(url, "root", "");
            PreparedStatement stmt = con.prepareStatement(sql);
              ){
            //had to add this to register driver for some reason. 
            Class.forName("com.mysql.jdbc.Driver");

            //connect to DB
            //Connection con = DriverManager.getConnection(url, "root", "");

            //create the statement that you want to find from the string
            //PreparedStatement stmt = con.prepareStatement(sql);

                 stmt.setString(1, email);
            //stmt.setString(2, password);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                firstName = rs.getString("customerFirstName");
                //print out to test if somthing is found
                System.out.println("found customer " + firstName);

          
            }

        } catch (SQLException ex) {
            System.out.println("no customer found");
            Logger.getLogger(CustomerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return firstName;
        
       
      
    }

   

    public String getUser_last_name() throws ClassNotFoundException {
        //using the constructor where I passed the email address
         String email = CustomerObj.this.user_email;
        String user_last_name = "";
        
        //System.out.println(email + " *****************   ** * *email in user first name");
        
        String sql = "select customerLastName from customertable where customerEmail = ?";

        try (Connection con = DriverManager.getConnection(url, "root", "");
            PreparedStatement stmt = con.prepareStatement(sql);
              ){
            //had to add this to register driver for some reason. 
            Class.forName("com.mysql.jdbc.Driver");

            //connect to DB
            //Connection con = DriverManager.getConnection(url, "root", "");

            //create the statement that you want to find from the string
            //PreparedStatement stmt = con.prepareStatement(sql);

                 stmt.setString(1, email);
            //stmt.setString(2, password);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                user_last_name = rs.getString("customerLastName");
                //print out to test if somthing is found
                System.out.println("found customer " + user_last_name);

          
            }

        } catch (SQLException ex) {
            System.out.println("no customer found");
            Logger.getLogger(CustomerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

               
        return user_last_name;
    }

    public String getUser_age() throws ClassNotFoundException {
        
        //using the constructor where I passed the email address
         String email = CustomerObj.this.user_email;
         String user_age ="";
        
        //System.out.println(email + " *****************   ** * *email in user first name");
        
        String sql = "select customerAge from customertable where customerEmail = ?";

        try (Connection con = DriverManager.getConnection(url, "root", "");
            PreparedStatement stmt = con.prepareStatement(sql);
              ){
            //had to add this to register driver for some reason. 
            Class.forName("com.mysql.jdbc.Driver");

            //connect to DB
            //Connection con = DriverManager.getConnection(url, "root", "");

            //create the statement that you want to find from the string
            //PreparedStatement stmt = con.prepareStatement(sql);

                 stmt.setString(1, email);
            //stmt.setString(2, password);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                user_age = rs.getString("customerAge");
                //print out to test if somthing is found
                System.out.println("found customer " + user_age);

          
            }

        } catch (SQLException ex) {
            System.out.println("no customer found");
            Logger.getLogger(CustomerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return user_age;
    }

    public String getUser_address_1() throws ClassNotFoundException, MalformedURLException, IOException {
        
        //using the constructor where I passed the email address
         String email = CustomerObj.this.user_email;
        String user_address_1 = "";
        
        //System.out.println(email + " *****************   ** * *email in user first name");
        
        String sql = "select customerStAdd1 from customertable where customerEmail = ?";

        try (Connection con = DriverManager.getConnection(url, "root", "");
            PreparedStatement stmt = con.prepareStatement(sql);
               ){
            //had to add this to register driver for some reason. 
            Class.forName("com.mysql.jdbc.Driver");

            //connect to DB
            //Connection con = DriverManager.getConnection(url, "root", "");

            //create the statement that you want to find from the string
            //PreparedStatement stmt = con.prepareStatement(sql);

                 stmt.setString(1, email);
            //stmt.setString(2, password);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                user_address_1 = rs.getString("customerStAdd1");
                //print out to test if somthing is found
                System.out.println("found customer " + user_address_1);

          
            }

        } catch (SQLException ex) {
            System.out.println("no customer found");
            Logger.getLogger(CustomerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return user_address_1;
    }

    public String getUser_address_2() throws ClassNotFoundException {
        
        //using the constructor where I passed the email address
         String email = CustomerObj.this.user_email;
        String user_address_2 = "";
        
        //System.out.println(email + " *****************   ** * *email in user first name");
        
        String sql = "select customerStAdd2 from customertable where customerEmail = ?";

        try (Connection con = DriverManager.getConnection(url, "root", "");
            PreparedStatement stmt = con.prepareStatement(sql);
              ){
            //had to add this to register driver for some reason. 
            Class.forName("com.mysql.jdbc.Driver");

            //connect to DB
            //Connection con = DriverManager.getConnection(url, "root", "");

            //create the statement that you want to find from the string
            //PreparedStatement stmt = con.prepareStatement(sql);

                 stmt.setString(1, email);
            //stmt.setString(2, password);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                user_address_2 = rs.getString("customerStAdd2");
                //print out to test if somthing is found
                System.out.println("found customer " + user_address_2);

          
            }

        } catch (SQLException ex) {
            System.out.println("no customer found");
            Logger.getLogger(CustomerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return user_address_2;
    }

    public String getUser_suburb() throws ClassNotFoundException {
        
        //using the constructor where I passed the email address
         String email = CustomerObj.this.user_email;
        String user_suburb = "";
        
        //System.out.println(email + " *****************   ** * *email in user first name");
        
        String sql = "select customerSuburb from customertable where customerEmail = ?";

        try (Connection con = DriverManager.getConnection(url, "root", "");
            PreparedStatement stmt = con.prepareStatement(sql);
             ){
            //had to add this to register driver for some reason. 
            Class.forName("com.mysql.jdbc.Driver");

            //connect to DB
            //Connection con = DriverManager.getConnection(url, "root", "");

            //create the statement that you want to find from the string
            //PreparedStatement stmt = con.prepareStatement(sql);

                 stmt.setString(1, email);
            //stmt.setString(2, password);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                user_suburb = rs.getString("customerSuburb");
                //print out to test if somthing is found
                System.out.println("found customer " + user_suburb);

          
            }

        } catch (SQLException ex) {
            System.out.println("no customer found");
            Logger.getLogger(CustomerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return user_suburb;
    }

    public String getUser_city() throws ClassNotFoundException {
        
        
        //using the constructor where I passed the email address
         String email = CustomerObj.this.user_email;
        String user_city = "";
        
        //System.out.println(email + " *****************   ** * *email in user first name");
        
        String sql = "select customerCity from customertable where customerEmail = ?";

        try (Connection con = DriverManager.getConnection(url, "root", "");
            PreparedStatement stmt = con.prepareStatement(sql);
            ){
            //had to add this to register driver for some reason. 
            Class.forName("com.mysql.jdbc.Driver");

            //connect to DB
            //Connection con = DriverManager.getConnection(url, "root", "");

            //create the statement that you want to find from the string
            //PreparedStatement stmt = con.prepareStatement(sql);

                 stmt.setString(1, email);
            //stmt.setString(2, password);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                user_city = rs.getString("customerCity");
                //print out to test if somthing is found
                System.out.println("found customer " + user_city);

          
            }

        } catch (SQLException ex) {
            System.out.println("no customer found");
            Logger.getLogger(CustomerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return user_city;
    }

    public int getUser_post_code() throws ClassNotFoundException {
                   
        //using the constructor where I passed the email address
         String email = CustomerObj.this.user_email;
        int user_post_code = 0;
        
        //System.out.println(email + " *****************   ** * *email in user first name");
        
        String sql = "select customerPostCode from customertable where customerEmail = ?";

        try (Connection con = DriverManager.getConnection(url, "root", "");
            PreparedStatement stmt = con.prepareStatement(sql);
             ){
            //had to add this to register driver for some reason. 
            Class.forName("com.mysql.jdbc.Driver");

            //connect to DB
//            Connection con = DriverManager.getConnection(url, "root", "");

            //create the statement that you want to find from the string
//            PreparedStatement stmt = con.prepareStatement(sql);

                 stmt.setString(1, email);
            //stmt.setString(2, password);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                user_post_code = Integer.valueOf(rs.getString("CustomerPostCode"));
                //print out to test if somthing is found
                System.out.println("found customer " + user_post_code);

          
            }

        } catch (SQLException ex) {
            System.out.println("no customer found");
            Logger.getLogger(CustomerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return user_post_code;
    }

    public int getUser_phone() throws ClassNotFoundException {
        
        //using the constructor where I passed the email address
         String email = CustomerObj.this.user_email;
         int user_phone = 0;
        
        //System.out.println(email + " *****************   ** * *email in user first name");
        
        String sql = "select customerPhone from customertable where customerEmail = ?";

        try(Connection con = DriverManager.getConnection(url, "root", "");
            PreparedStatement stmt = con.prepareStatement(sql);
              ) {
            //had to add this to register driver for some reason. 
            Class.forName("com.mysql.jdbc.Driver");

            //connect to DB
            //Connection con = DriverManager.getConnection(url, "root", "");

            //create the statement that you want to find from the string
            //PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setString(1, email);
            //stmt.setString(2, password);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                user_phone = Integer.valueOf(rs.getString("customerPhone"));
                //print out to test if somthing is found
                System.out.println("found customer " + user_phone);

          
            }

             } catch (SQLException ex) {
            System.out.println("no customer found");
            Logger.getLogger(CustomerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return user_phone;
    }

    public String getUser_email() throws ClassNotFoundException {
        
        //using the constructor where I passed the email address
         String email = CustomerObj.this.user_email;
         String user_email = "";
        
        //System.out.println(email + " *****************   ** * *email in user first name");
        
        String sql = "select customerEmail from customertable where customerEmail = ?";

        try (Connection con = DriverManager.getConnection(url, "root", "");
            PreparedStatement stmt = con.prepareStatement(sql);
              ){
            //had to add this to register driver for some reason. 
            Class.forName("com.mysql.jdbc.Driver");

            //connect to DB
            //Connection con = DriverManager.getConnection(url, "root", "");

            //create the statement that you want to find from the string
            //PreparedStatement stmt = con.prepareStatement(sql);

                 stmt.setString(1, email);
            //stmt.setString(2, password);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                user_email = rs.getString("customerEmail");
                //print out to test if somthing is found
                System.out.println("found customer " + user_email);

          
            }

        } catch (SQLException ex) {
            System.out.println("no customer found");
            Logger.getLogger(CustomerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return user_email;
    }

    //this one is not working properly
    public String getUser_password() throws ClassNotFoundException {
        
        //using the constructor where I passed the email address
         String email = CustomerObj.this.user_email;
         String user_password = "";
        
        //System.out.println(email + " *****************   ** * *email in user first name");
        
        String sql = "select customerCity from customertable where customerEmail = ?";

        try (Connection con = DriverManager.getConnection(url, "root", "");
            PreparedStatement stmt = con.prepareStatement(sql);
              ){
            //had to add this to register driver for some reason. 
            Class.forName("com.mysql.jdbc.Driver");

            //connect to DB
            //Connection con = DriverManager.getConnection(url, "root", "");

            //create the statement that you want to find from the string
            //PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setString(1, email);
            //stmt.setString(2, password);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                user_password = rs.getString("CustomerPostCode");
                //print out to test if somthing is found
                System.out.println("found customer " + user_password);

          
            }

        } catch (SQLException ex) {
            System.out.println("no customer found");
            Logger.getLogger(CustomerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return user_password;
    }

    public String getUser_confirm_password() {
        return user_confirm_password;
    }

    public void setUser_first_name(String user_first_name) {
        
        this.user_first_name = user_first_name;
    }

    public void setUser_last_name(String user_last_name) {
        this.user_last_name = user_last_name;
    }

    public void setUser_age(String user_age) {
        this.user_age = user_age;
    }

    public void setUser_address_1(String user_address_1, String email) throws ClassNotFoundException {
        
          
        this.user_address_1 = user_address_1;
        System.out.println(user_address_1 + " *****************   ** * *email in user first name in set user");
        System.out.println(email + " *****************   ** * *email in user first name in set user");
         //String sql = "UPDATE Employees set age=? WHERE id=?";
        String sql = "UPDATE customertable set customerStAdd1=? WHERE customerEmail=?";
          //create the statement that you want to find from the string
        try (Connection con = DriverManager.getConnection(url, "root", "");
            PreparedStatement stmt = con.prepareStatement(sql);
               ){
            //had to add this to register driver for some reason. 
            Class.forName("com.mysql.jdbc.Driver");

          
          
             stmt.setString(1, user_address_1);
             stmt.setString(2, email);
             stmt.executeUpdate();
             
             System.out.println("found customer " + user_address_1 + " in set user address");

//            while (rs.next()) {
//                user_address_1 = rs.getString("user_address_1");
//                //print out to test if somthing is found
//                System.out.println("found customer " + user_address_1 + "in set user address");
//
//          
//            }

        } catch (SQLException ex) {
            System.out.println("no customer found in set user");
            Logger.getLogger(CustomerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }

    public void setUser_address_2(String user_address_2, String email) throws ClassNotFoundException {
        this.user_address_2 = user_address_2;
        
        String sql = "UPDATE customertable set customerStAdd1=? WHERE customerEmail=?";
          //create the statement that you want to find from the string
        try (Connection con = DriverManager.getConnection(url, "root", "");
            PreparedStatement stmt = con.prepareStatement(sql);
               ){
            //had to add this to register driver for some reason. 
            Class.forName("com.mysql.jdbc.Driver");

          
          
             stmt.setString(1, user_address_1);
             stmt.setString(2, email);
             stmt.executeUpdate();
             
             //System.out.println("found customer " + user_address_1 + " in set user address");

//            while (rs.next()) {
//                user_address_1 = rs.getString("user_address_1");
//                //print out to test if somthing is found
//                System.out.println("found customer " + user_address_1 + "in set user address");
//
//          
//            }

        } catch (SQLException ex) {
            System.out.println("no customer found in set user");
            Logger.getLogger(CustomerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void setUser_suburb(String user_suburb, String email) throws ClassNotFoundException {
        this.user_suburb = user_suburb;
        
        String sql = "UPDATE customertable set customerStAdd1=? WHERE customerEmail=?";
          //create the statement that you want to find from the string
        try (Connection con = DriverManager.getConnection(url, "root", "");
            PreparedStatement stmt = con.prepareStatement(sql);
               ){
            //had to add this to register driver for some reason. 
            Class.forName("com.mysql.jdbc.Driver");

          
          
             stmt.setString(1, user_suburb);
             stmt.setString(2, email);
             stmt.executeUpdate();
             
             System.out.println("found customer " + user_suburb + " in set user address");

//            while (rs.next()) {
//                user_address_1 = rs.getString("user_address_1");
//                //print out to test if somthing is found
//                System.out.println("found customer " + user_address_1 + "in set user address");
//
//          
//            }

        } catch (SQLException ex) {
            System.out.println("no customer found in set user");
            Logger.getLogger(CustomerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void setUser_city(String user_city, String email) throws ClassNotFoundException {
        this.user_city = user_city;
        
        String sql = "UPDATE customertable set customerStAdd1=? WHERE customerEmail=?";
          //create the statement that you want to find from the string
        try (Connection con = DriverManager.getConnection(url, "root", "");
            PreparedStatement stmt = con.prepareStatement(sql);
               ){
            //had to add this to register driver for some reason. 
            Class.forName("com.mysql.jdbc.Driver");

          
          
             stmt.setString(1, user_city);
             stmt.setString(2, email);
             stmt.executeUpdate();
             
             System.out.println("found customer " + user_city + " in set user address");

//            while (rs.next()) {
//                user_address_1 = rs.getString("user_address_1");
//                //print out to test if somthing is found
//                System.out.println("found customer " + user_address_1 + "in set user address");
//
//          
//            }

        } catch (SQLException ex) {
            System.out.println("no customer found in set user");
            Logger.getLogger(CustomerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }

    public void setUser_post_code(int user_post_code, String email) throws ClassNotFoundException {
        this.user_post_code = user_post_code;
        
        String sql = "UPDATE customertable set customerStAdd1=? WHERE customerEmail=?";
          //create the statement that you want to find from the string
        try (Connection con = DriverManager.getConnection(url, "root", "");
            PreparedStatement stmt = con.prepareStatement(sql);
               ){
            //had to add this to register driver for some reason. 
            Class.forName("com.mysql.jdbc.Driver");

          
          
             stmt.setInt(1, user_post_code);
             stmt.setString(2, email);
             stmt.executeUpdate();
             
             System.out.println("found customer " + user_post_code + " in set user address");

//            while (rs.next()) {
//                user_address_1 = rs.getString("user_address_1");
//                //print out to test if somthing is found
//                System.out.println("found customer " + user_address_1 + "in set user address");
//
//          
//            }

        } catch (SQLException ex) {
            System.out.println("no customer found in set user");
            Logger.getLogger(CustomerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void setUser_phone(int user_phone, String email) throws ClassNotFoundException {
        this.user_phone = user_phone;
        
        String sql = "UPDATE customertable set customerStAdd1=? WHERE customerEmail=?";
          //create the statement that you want to find from the string
        try (Connection con = DriverManager.getConnection(url, "root", "");
            PreparedStatement stmt = con.prepareStatement(sql);
               ){
            //had to add this to register driver for some reason. 
            Class.forName("com.mysql.jdbc.Driver");

          
          
             stmt.setInt(1, user_phone);
             stmt.setString(2, email);
             stmt.executeUpdate();
             
             System.out.println("found customer " + user_phone + " in set user address");

//            while (rs.next()) {
//                user_address_1 = rs.getString("user_address_1");
//                //print out to test if somthing is found
//                System.out.println("found customer " + user_address_1 + "in set user address");
//
//          
//            }

        } catch (SQLException ex) {
            System.out.println("no customer found in set user");
            Logger.getLogger(CustomerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void setUser_email(String user_email) throws ClassNotFoundException {
        this.user_email = user_email;
        
        String sql = "UPDATE customertable set customerStAdd1=? WHERE customerEmail=?";
          //create the statement that you want to find from the string
        try (Connection con = DriverManager.getConnection(url, "root", "");
            PreparedStatement stmt = con.prepareStatement(sql);
               ){
            //had to add this to register driver for some reason. 
            Class.forName("com.mysql.jdbc.Driver");

          
          
             
             stmt.setString(1, user_email);
             stmt.executeUpdate();
             
             System.out.println("found customer " + user_email + " in set user address");

//            while (rs.next()) {
//                user_address_1 = rs.getString("user_address_1");
//                //print out to test if somthing is found
//                System.out.println("found customer " + user_address_1 + "in set user address");
//
//          
//            }

        } catch (SQLException ex) {
            System.out.println("no customer found in set user");
            Logger.getLogger(CustomerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void setUser_password(String user_password, String email) throws ClassNotFoundException {
        this.user_password = user_password;
        
        String sql = "UPDATE customertable set customerStAdd1=? WHERE customerEmail=?";
          //create the statement that you want to find from the string
        try (Connection con = DriverManager.getConnection(url, "root", "");
            PreparedStatement stmt = con.prepareStatement(sql);
               ){
            //had to add this to register driver for some reason. 
            Class.forName("com.mysql.jdbc.Driver");

          
          
             stmt.setString(1, user_password);
             stmt.setString(2, email);
             stmt.executeUpdate();
             
             System.out.println("found customer " + user_password + " in set user address");

//            while (rs.next()) {
//                user_address_1 = rs.getString("user_address_1");
//                //print out to test if somthing is found
//                System.out.println("found customer " + user_address_1 + "in set user address");
//
//          
//            }

        } catch (SQLException ex) {
            System.out.println("no customer found in set user");
            Logger.getLogger(CustomerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void setUser_confirm_password(String user_confirm_password) {
        this.user_confirm_password = user_confirm_password;
    }

    
    
     @Override
    public String toString() {
        return "CustomerObj{" + "user_first_name=" + user_first_name + ", user_last_name=" + user_last_name + ", user_age=" + user_age + ", user_address_1=" + user_address_1 + ", user_address_2=" + user_address_2 + ", user_suburb=" + user_suburb + ", user_city=" + user_city + ", user_post_code=" + user_post_code + ", user_phone=" + user_phone + ", user_email=" + user_email + ", user_password=" + user_password + ", user_confirm_password=" + user_confirm_password + ", url=" + url + '}';
    }
}
