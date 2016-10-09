/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package viewWeb;

import controller.CustomerDAO;
import controller.CustomerObj;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author James
 */
@WebServlet(name = "LogInServlet", urlPatterns = {"/LogInServlet"})
public class LogInServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String emailAddress = request.getParameter("Email");
        String password = request.getParameter("Password");
        HttpSession s = request.getSession();

        System.out.println(password);
        System.out.println(emailAddress);

        //check database for email address
     
        try {

            CustomerObj cus  = new CustomerDAO().findCustomer(emailAddress, password);
            
            //if the
            if (CustomerDAO.customerFound == true) {
                System.out.println("in here in try catch log in servlet");
                Cookie cusSessionCookie = new Cookie("Dollar", emailAddress);
                cusSessionCookie.setMaxAge(-1);
                response.addCookie(cusSessionCookie);
                response.sendRedirect("http://localhost:9999/index.jsp");
                //place a new object into the session which holds a few more details.
                CustomerObj co = new CustomerObj(cus.getUser_first_name(), cus.getUser_last_name(), emailAddress);
                CustomerObj c =  co.getCustomer(co);
                System.out.println(c.toString());
                s.setAttribute("customer", c);
                
                       
                
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
