/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 *
 * @author admin
 */
public class ValidateUser1 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter printOut = response.getWriter();
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        Connection con = null;
        PreparedStatement st = null;
        ResultSet rs = null;
           
            // check if username or password or both have empty value
            if (password.isEmpty() || username.isEmpty() ) {
                // if empty, redirect user to login page
                request.setAttribute("error", "username or password empty");
                request.getRequestDispatcher("/Login.jsp").forward(request, response);
            }
            else {
               // trim username and password
               username = username.trim();
               password = password.trim();
               if (username == null || password == null){
                   // if null, redirect user to login page
                   request.setAttribute("error", "null value is prohibited");
                   request.getRequestDispatcher("/Login.jsp").forward(request, response);
               }else {
                   
                // verify username and password
                try {
                    // create connection to mysql db
                    con = DBConnection.initializeDatabase();
                       
                    // check user and validate credential in db
                    st = con.prepareStatement("select * from customer where display_name='"+username+"' and password='"+password+"'");
                    rs = st.executeQuery();
                    if(rs.next()){
                        // if username and password valid
                        //request.getRequestDispatcher("http://localhost:8080/BookLandMainPage/MainBookLand.jsp").forward(request, response);
                        //response.sendRedirect("http://localhost:8080/BookLandMainPage/MainBookLand.jsp");
                        response.sendRedirect("http://appsmainpage:8082/BookLandMainPage/MainBookLand.jsp");
                    }else {
                        request.setAttribute("error", "invalid username/password");
                        request.getRequestDispatcher("/Login.jsp").forward(request, response);
                    }
                }
                catch (ClassNotFoundException | SQLException err){
                    printOut.println(err.getMessage());
                }
                finally{
                            try{
                                // close result set object
                                if (rs != null){
                                    rs.close();
                                }
                           
                                // close prepared statement object
                                if (st != null){
                                        st.close();
                                }
                           
                                // close db connection
                                if (con != null){
                                    con.close();
                                }
                            }
                            catch (SQLException err){
                                printOut.println(err.getMessage());
                            }
                }
               }
               
                
            }
        }
    
}
