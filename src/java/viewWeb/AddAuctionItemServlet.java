/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viewWeb;

import controller.AuctionItemObj;
import controller.CustomerDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author James
 */
@WebServlet(name = "AddAuctionItemServlet", urlPatterns = {"/AddAuctionItemServlet"})
public class AddAuctionItemServlet extends HttpServlet {

    
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ClassNotFoundException {
          
            String url =  "jdbc:mysql://localhost:3306/dollarlogindb";
            
        
            //get the information from the form
            String auctionTitle = request.getParameter("auctionTitle");
            String auctionDescription = request.getParameter("auctionDescription");
            String auctionPictureFilePath = request.getParameter("auctionPicture");
            String auctionSpecificationURL = request.getParameter("itemSpecs");
            String auctionItemLocation = request.getParameter("auctionLocation");
                        System.out.println(auctionItemLocation + "***********");
//            int auctionID = Integer.parseInt(String.valueOf(request.getParameter("auctionID")));
            int auctionID = 0; //pass it a number that means nothing but will be generated over by sql
            int auctionReservePrice = Integer.parseInt(String.valueOf(request.getParameter("auctionReservePrice")));
            
             System.out.println("All done no errors");
            //next, update the auction for users to see with input information
            
           AuctionItemObj a = new AuctionItemObj(auctionTitle, auctionPictureFilePath, auctionDescription, auctionID, auctionSpecificationURL, auctionItemLocation, auctionReservePrice,true);
            //place the auction object in the request
           request.setAttribute("auctionObj", a);
           
              String sql = "insert into auctionitemtable (auctionTitle, auctionDescription, auctionPicture, auctionSpecURL, auctionItemLocation, auctionReserve, auctionActive)"
                + "Values(?,?,?,?,?,?,?)";

        try {
            //had to add this to register driver for some reason. 
            Class.forName("com.mysql.jdbc.Driver");

            //connect to DB
            Connection con = DriverManager.getConnection(url, "root", "");

            //create the statement that you want to find from the string
            PreparedStatement stmt = con.prepareStatement(sql);

                 stmt.setString(1, auctionTitle);
                 stmt.setString(2, auctionDescription);
                 stmt.setString(3, auctionPictureFilePath);
                 stmt.setString(4, auctionSpecificationURL);
                 stmt.setString(5, auctionItemLocation);
                 stmt.setInt(6, auctionReservePrice);
                 stmt.setBoolean(7, true);
            //stmt.setString(2, password);
            stmt.executeUpdate();
        System.out.print("exe query?.");
//            while (rs.next()) {
//                firstName = rs.getString("customerFirstName");
//                //print out to test if somthing is found
//                System.out.println("found customer " + firstName);
//
//          
//            }

        } catch (SQLException ex) {
            System.out.println("no customer found");
            Logger.getLogger(CustomerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AddAuctionItemServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AddAuctionItemServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
