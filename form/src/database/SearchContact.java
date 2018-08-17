/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package database;

import form.GatePass;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mukesh_arya
 */
public class SearchContact {
    
    
    static Connection con;
    
    static {
    
    
    con = GetConnection.getConnection();
    
    }
    
    public static void searchContact(String contact){
    
    
        String info[] = null;
        
        try {
            PreparedStatement ps = con.prepareStatement("select * from visitor_info where phoneno=?");
            
            ps.setString(1, contact);
            
            ResultSet rs =  ps.executeQuery();
            
            info =new String[9];
            
            if(rs.next()){
        
                info[0]=rs.getString(1);
                info[1]=rs.getString(2);
                info[2]=rs.getString(3);
                info[3]=rs.getString(4);
                info[4]=rs.getString(5);
                info[5]=rs.getString(6);
                info[6]=rs.getString(7);
                info[7]=rs.getString(8);
                
                
                //info[8]=rs.getByte(9);
              
            }
            
           
            
        } catch (SQLException ex) {
            Logger.getLogger(SearchContact.class.getName()).log(Level.SEVERE, null, ex);
        }
        
      
    }
    
    
 
}
