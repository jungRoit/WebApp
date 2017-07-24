/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Roit.WebApp.Servlet;
import com.Roit.WebApp.DAO.UserDAO;
import com.Roit.WebApp.DAO.impl.UserDAOimpl;
import com.Roit.WebApp.Entity.User;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author User
 */
public class DefaultServlet extends HttpServlet{
    private UserDAO userDAO=new UserDAOimpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        User user=new User(1, "sumit", "sumit@gmail.com", "sumit", true);
        try{
        request.setAttribute("users", userDAO.getAll());
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/servlet_mvc", "root", "");
            String sql="INSERT INTO `tbl_users`(`username`, `password`, `email`, `status`) VALUES (?,?,?,?)";
            for(User u:userDAO.getAll()){
                PreparedStatement stmt=conn.prepareStatement(sql);
                stmt.setString(1, u.getUserName());
                stmt.setString(2, u.getPassword());
                stmt.setString(3, u.getEmail());
                stmt.setBoolean(4, u.isStatus());
                stmt.executeUpdate();
            }
            conn.close();
        
        }catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
        RequestDispatcher rd=request.getRequestDispatcher("WEB-INF/views/index.jsp");
        rd.forward(request, response);
        
        
         }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out=response.getWriter();
        out.println("<h1>hello world</h1> ");
    }
    
    
    
}
