/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import database.LoginValidation;
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
public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
   
        String email = req.getParameter("email");
        String password= req.getParameter("password");
        
        boolean b= LoginValidation.loginValidation(email, password);
        
        
        PrintWriter pw =resp.getWriter();
    
        if(b){
            pw.print("Welcome :-"+email);
            //RequestDispatcher rd = req.getRequestDispatcher("welcome.html");
            //rd.forward(req, resp);
        
        }else{
        
            RequestDispatcher rd =req.getRequestDispatcher("index.html");
            rd.include(req, resp);
            pw.print("enter currect email and password");
        
        
        }
        
        
       // pw.print("Email :-"+email+"  Password :- "+password);
    }

   
}
