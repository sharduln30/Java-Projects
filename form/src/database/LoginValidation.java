/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hadoop
 */
public class LoginValidation {

    static Connection con;
    
    static{
    
        con = GetConnection.getConnection();
      
    }
    
    public static boolean loginValidate(String email,String password){
    
        boolean b=false;
        try {
            PreparedStatement ps =con.prepareStatement("select * from register where email =? and password=?");
            
            ps.setString(1, email);
            ps.setString(2, password);
            
            ResultSet rs =ps.executeQuery();
            
            b= rs.next();
            
            
        } catch (SQLException ex) {
            Logger.getLogger(LoginValidation.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    return b;
    
    }
    
}
