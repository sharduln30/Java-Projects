/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import beans.Librarian;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mukesh Arya
 */
public class GetLibrarian {
  
    public static ArrayList<Librarian> getLibrarian(){
    
        ArrayList<Librarian>list = new ArrayList<>();
        
        String sql="select * from librarian order by name";
        
        try {
            PreparedStatement ps = ConnectionManager.openConnection().prepareStatement(sql);
        
            ResultSet rs = ps.executeQuery();
        
            while(rs.next()){
            
                Librarian l = new Librarian();
                
                l.setName(rs.getString(1));
                l.setEmail(rs.getString(2));
                l.setPassword(rs.getString(3));
                l.setContact(rs.getString(4));
                
                list.add(l);
            }
        
        
        } catch (SQLException ex) {
            Logger.getLogger(GetLibrarian.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
        
            ConnectionManager.closeConnection();
        }
        
    
    return list;
    }
}
