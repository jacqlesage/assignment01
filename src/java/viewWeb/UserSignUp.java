/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viewWeb;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author James
 */
@WebServlet(name = "UserSignUp", urlPatterns = {"/UserSignUp"})
public class UserSignUp extends HttpServlet {

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
            throws ServletException, IOException{
              /* TODO output your page here. You may use following sample code. */
        System.out.println("User signup servlet");
        String user_first_name = request.getParameter("user_first_name");
        String user_last_name = request.getParameter("user_last_name");
        String user_email = request.getParameter("user_email");
        String user_phone = request.getParameter("user_phone");
        String user_address_1 = request.getParameter("user_address_1");
        String user_address_2 = request.getParameter("user_address_2");
        String user_region = request.getParameter("user_region");
        String user_post_code = request.getParameter("user_post_code");
        String user_password = request.getParameter("user_password");
        String user_confirm_password = request.getParameter("user_confirm_password");
        String user_age = request.getParameter("user_age");
        
        
        try {
            //cda.findCustomer(emailAddress, password);
            
            //if the
            //if(CustomerDAO.customerFound == true){
                
                response.sendRedirect("http://localhost:9999/index.jsp");
            
          //read up on what errors I need and which exceptions I should be using here  
        } catch (Exception ex) {
            Logger.getLogger(LogInServlet.class.getName()).log(Level.SEVERE, null, ex);
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
