/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viewWeb;

import controller.CustomerObj;
import controller.HandleAuction;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.Enumeration;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

/**
 *
 * @author James
 */
@WebServlet(name = "handleAuctionServlet", urlPatterns = {"/handleAuctionServlet"})
public class handleAuctionServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     * @throws java.lang.ClassNotFoundException
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ClassNotFoundException {
        response.setContentType("text/html;charset=UTF-8");

        Integer bidAmount = Integer.valueOf(request.getParameter("bidAmount"));

        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet handleAuctionServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet handleAuctionServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");

            //String myObjectId = request.getParameter("myObjectId");
            CustomerObj myObject = (CustomerObj) request.getSession().getAttribute("customer");
            //request.getSession().removeAttribute(myObjectId);
            out.println("<h1>attribs " + myObject.toString() + "</h1>");
            //HandleAuction h = new HandleAuction(bidAmount, myObject.getUser_first_name(), myObject.getUser_last_name(), myObject.getUser_email());
           out.println("<h1>number " + myObject.getUser_customer_number() + "</h1>");
           out.println("<h1>auction number " + request.getParameter("auctionNumber") + "</h1>");
           out.println("<h1>bid amount " + bidAmount + "</h1>");
           
           int bid = Integer.valueOf(request.getParameter("bidAmount"));
           int auctionID = Integer.valueOf(request.getParameter("auctionNumber"));
           
            //System.out.println("********* " + auctionID);
            //out.println("<h1>handle " + h.toString() + "</h1>");
            HttpSession session = request.getSession();

            if (session != null) {
                out.println(": " + "<br>");
            }

            Enumeration keys = request.getAttributeNames();

            boolean key = keys.hasMoreElements();
            out.println(key + ":more elemenet? " + key + "<br>");

            while (keys.hasMoreElements()) {
                //key = (String)keys.nextElement();
                out.println(key + ": " + key + "<br>");
            }

            //get the customer object details 
            CustomerObj co = (CustomerObj) request.getSession().getAttribute("customer");
            //put together a handleAuction object
            HandleAuction ho = new HandleAuction(bid,co.getUser_first_name(), co.getUser_last_name(), co.getUser_email(),co.getUser_customer_number(), auctionID);
            //h.setCustomer_table_ID(myObject.getUser_customer_number());
            //h.setBidder_email(myObject.getUser_email());
            ho.setHAuctionObj(ho);
           
            
        }    }

    

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
            Logger.getLogger(handleAuctionServlet.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(handleAuctionServlet.class.getName()).log(Level.SEVERE, null, ex);
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
