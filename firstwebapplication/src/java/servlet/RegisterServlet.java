/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import database.UserRegister;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Mukesh Arya
 */
public class RegisterServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
   
        String name =req.getParameter("name");
        String email =req.getParameter("email");
        String password =req.getParameter("password");
        String contact = req.getParameter("contact");
        String address = req.getParameter("address");
        String gender = req.getParameter("gender");
        
        String userInfo[]={name,email,password,contact,address,gender};
        
        int a = UserRegister.userRegister(userInfo);
        
        PrintWriter pw = resp.getWriter();
             
    
        if(a>0){
        
            RequestDispatcher rd=  req.getRequestDispatcher("index.html");
            rd.forward(req, resp);
        }else{
        RequestDispatcher rd =req.getRequestDispatcher("register.html");
        rd.include(req, resp);
        pw.print("Plz try Again");
        
        }
        
        
       // PrintWriter pw =resp.getWriter();
    /*
        pw.print("Welcome :-"+name);
        pw.print("<br>");
        pw.print("Email :-"+email);
        pw.print("<br>");
        pw.print("Password :-"+password);
         pw.print("<br>");
        pw.print("contact :-"+contact);
         pw.print("<br>");
        pw.print("ADdress :-"+address);
         pw.print("<br>");
        pw.print("Gender :-"+gender);
     
      */
      
    }

    
    
    
}
