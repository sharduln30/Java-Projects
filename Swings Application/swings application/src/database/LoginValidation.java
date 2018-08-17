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
public class LoginValidation {
    
    public static boolean loginValidation(String loginId,String password){
    
        boolean isLogin=false;
        try {    
            String sql="select * from user_signup where login_id=? and password=?";
            
            PreparedStatement ps = ConnectionManager.openConnection().prepareStatement(sql);
       
            ps.setString(1, loginId);
            ps.setString(2,password);
            
            ResultSet rs =ps.executeQuery();
        
            if(rs.next()){
                isLogin = true;
            }
        
        } catch (SQLException ex) {
            Logger.getLogger(LoginValidation.class.getName()).log(Level.SEVERE, null, ex);
        }
    
        return isLogin;  
    }
}
