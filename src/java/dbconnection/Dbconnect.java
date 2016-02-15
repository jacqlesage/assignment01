/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbconnection;
import java.sql.*;

/**
 *
 * @author James
 */
public class Dbconnect {
    public static Connection conn;
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";
    private static final String CONNECTION = 
            "jdbc:mysql://localhost:3306/dollarlogindb";
    
    


public static void main(String[]args){

    connectToDb();
}

public static void connectToDb(){
    conn = null;
    
    try {
        conn = DriverManager.getConnection(CONNECTION,USERNAME,PASSWORD);
        System.out.println("COnnected !!");
        
        
        
        
    }catch(SQLException e){
        System.err.println(e);
    }
    }



}
