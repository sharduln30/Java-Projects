/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.database;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Danish
 */
public class InsertUserInfo {
    
    static Connection con;
    
    static{
    
        con = GetConnection.openConnection();
    }
    
    public static int insertUserInfo(HashMap<String,String> userInfo){
     int a=0;
        try {
           
            
            String sql="insert into user_register values(?,?,?,?,?,?,?,?,?)";
            
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setString(1, userInfo.get("first-name"));
            ps.setString(2,userInfo.get("last-name"));
            ps.setString(3, userInfo.get("contact"));
            ps.setString(4,userInfo.get("gender"));
            ps.setString(5, userInfo.get("email"));
            ps.setString(6,userInfo.get("country"));
            ps.setString(7,userInfo.get("login-id"));
            ps.setString(8, userInfo.get("password"));
            //ps.setString(9,userInfo.get("image"));
            
            ps.setBytes(9, setImage(userInfo.get("image-path")));
            
            
            
           a= ps.executeUpdate();
            
           
        } catch (SQLException ex) {
            Logger.getLogger(InsertUserInfo.class.getName()).log(Level.SEVERE, null, ex);
        }
     return a;
    }

    private static byte[] setImage(String get) {
        
        File file = new File(get);
        
        byte b[]= new byte[(int)file.length()];
    
        try {
            BufferedInputStream bis  = new BufferedInputStream(new FileInputStream(file));
       
            bis.read(b);
        } catch (Exception ex) {
            Logger.getLogger(InsertUserInfo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return b;
    }
}
