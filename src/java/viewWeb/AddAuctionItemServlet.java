/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viewWeb;

import controller.AuctionItemObj;
import java.io.IOException;
import java.io.PrintWriter;
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
            throws ServletException, IOException {
            System.out.println("SS*****************");
            
        
            //get the information from the form
            String auctionTitle = request.getParameter("auctionTitle");
            String auctionDescription = request.getParameter("auctionDescription");
            String auctionPictureLocation = request.getParameter("auctionPictureLocation");
            String auctionSpecificationURL = request.getParameter("auctionPictureLocationinfoURL");
            String auctionItemLocation = request.getParameter("auctionItemLocation");
            int auctionID = Integer.parseInt(String.valueOf(request.getParameter("auctionID")));
            int auctionReservePrice = Integer.parseInt(String.valueOf(request.getParameter("auctionReservePrice")));
            
            //next, update the auction for users to see with input information
            
           AuctionItemObj a = new AuctionItemObj(auctionTitle, auctionPictureLocation, auctionDescription, auctionID, auctionSpecificationURL, auctionItemLocation, auctionReservePrice);
            //place the auction object in the request
           request.setAttribute("auctionObj", a);
          //C:\Users\James\Documents\NetBeansProjects\assignment001\web\admin.jsp
          //set the page to go to
          String jspPage = "/web/admin.jsp";
          //make it go to that page
          RequestDispatcher rd = getServletContext().getRequestDispatcher(jspPage);
          rd.forward(request, response);
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
        processRequest(request, response);
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
        processRequest(request, response);
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
