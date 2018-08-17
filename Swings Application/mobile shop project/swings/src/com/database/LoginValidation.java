/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Danish
 */
public class LoginValidation {
    
    static Connection con;
    
        
    public static boolean isUserExists(HashMap<String,String>loginInfo){
    
         con = GetConnection.openConnection();
        
        boolean b = false;
    
        String sql="select * from user_register where login_id=? and password=?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
        
            ps.setString(1,loginInfo.get("login-id"));
            ps.setString(2,loginInfo.get("password"));
        
            ResultSet rs =ps.executeQuery();
            
            b =rs.next();
            
        } catch (SQLException ex) {
            Logger.getLogger(LoginValidation.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
        
            GetConnection.closeConnection();
        }
        
    return b;
    }
}
