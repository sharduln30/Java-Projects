/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import database.AddLibrarian;
import database.AdminLoginValidation;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Mukesh Arya
 */
public class Controller extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    
        String request = req.getParameter("no");
        
        if(request.equals("1")){
        
            resp.sendRedirect("Add Librarian Form.html");
        }else if(request.equals("2")){
        
        
            resp.sendRedirect("ViewLibrarian.jsp");
        
        }
        
    }
    
    

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    
        String request = req.getParameter("no");
        
        if(request.equals("admin-login")){
        
            String email =req.getParameter("email");
            String password = req.getParameter("password");
            
            //resp.getWriter().print(email);
            //resp.getWriter().print(password);
            
            //resp.sendRedirect("AdminLogin?email="+email+"&password="+password);
            //resp.getWriter().print(request);
        
            boolean isAdminExists = AdminLoginValidation.isAdminExists(email, password);
            
            if(isAdminExists){
            
                //resp.getWriter().print("Login");
                
                req.getRequestDispatcher("afadmin.html").forward(req, resp);
            }else{
                           
                req.getRequestDispatcher("index.html").include(req, resp);
                resp.getWriter().print("Invalid Credentails");
            }
        
        
        }else if(request.equals("add-librarian")){
        
            String name = req.getParameter("name");
            String email = req.getParameter("email");
            String password = req.getParameter("password");
            String contact = req.getParameter("contact");
            
            String librarianDetails[]={name,email,password,contact};
            
            int b = AddLibrarian.addLibrarian(librarianDetails);
            
            if(b>0){
            
               // req.getRequestDispatcher("Add Librarian Form.html").forward(req, resp);
            
                resp.sendRedirect("Add Librarian Form.html");
            }else{
            
             req.getRequestDispatcher("Add Librarian Form.html").include(req, resp);
  
             resp.getWriter().print("Plz try again");
            }
            
            
           /* for(int i=0;i<librarianDetails.length;i++){
            
                resp.getWriter().print("<html><body><p>");
                resp.getWriter().print("Name :-"+name);
                resp.getWriter().print("Name :-"+email);
                resp.getWriter().print("Name :-"+password);
                resp.getWriter().print("Name :-"+contact);
            }*/
            
            
            
            //resp.getWriter().print("d");
        }
        
    }

  
}
