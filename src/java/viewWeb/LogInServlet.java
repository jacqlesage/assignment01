/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package viewWeb;

import controller.CustomerDAO;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author James
 */
@WebServlet(name = "LogInServlet", urlPatterns = {"/LogInServlet"})
public class LogInServlet extends HttpServlet{
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
        System.out.println("hhhhhhhhhh");
        String emailAddress = request.getParameter("Email");
        String password = request.getParameter("Password");
        
        System.out.println(password);
        System.out.println(emailAddress);
         
        //check database for email address
        //
        CustomerDAO cda = new CustomerDAO();
        try {
             
            cda.findCustomer(emailAddress, password);
            
            //if the
            if(CustomerDAO.customerFound == true){
                
                response.sendRedirect("http://localhost:9999/index.jsp");
            }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LogInServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
       
    @Override
protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
    System.out.println("herereer"); 
    processRequest(request, response);
    
    
        
}
    
}

