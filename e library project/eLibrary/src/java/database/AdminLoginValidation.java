/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mukesh Arya
 */
public class AdminLoginValidation {
    
    public static boolean isAdminExists(String email, String password){
    
        boolean b =false;
        
        String sql="select * from admin where email=? and password=?";
        try {
            PreparedStatement ps = ConnectionManager.openConnection().prepareStatement(sql);
      
            ps.setString(1,email);
            ps.setString(2,password);
            
            ResultSet rs = ps.executeQuery();
        
            b= rs.next();
            
        } catch (SQLException ex) {
            Logger.getLogger(AdminLoginValidation.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
        
            ConnectionManager.closeConnection();
        }
        
        
        
        
        return b;
    }
}
