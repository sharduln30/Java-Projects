/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

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
public class FecthData extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    
        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String contact = req.getParameter("contact");
        String gender = req.getParameter("gender");
        String branch = req.getParameter("Branch");
        String collegeName = req.getParameter("college");
        String sem = req.getParameter("Sem");
        
        PrintWriter pw= resp.getWriter();
        
        
        pw.print("<html><body><h2><p>");
        pw.print("Name :- "+name);
        pw.print("</p>");
        pw.print("<p>Email :- "+email);
        pw.print("</p>");
        pw.print("<p>Contact :- "+contact);
        pw.print("</p>");
        pw.print("<p>Gender :- "+gender);
        pw.print("</p>");
        pw.print("<p>Branch :- "+branch);
        pw.print("</p>");
        pw.print("<p>College :- "+collegeName);
        pw.print("</p>");
        pw.print("<p>Sem :- "+sem);
        pw.print("</p>");
        
        
        
        
        pw.print("</h2></body></html>");
        
        
    
    
    }

    
}
