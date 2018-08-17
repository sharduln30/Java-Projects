/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

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
 * @author Mukesh Arya
 */
public class InsertUserInfo {
    
    public static int inserUserInfo(HashMap<String, String> userDetails){
    
        int a=0;
    
        Connection con =ConnectionManager.openConnection();
        
        String sql="insert into user_signup values(?,?,?,?,?,?,?,?)";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setString(1, userDetails.get("name"));
            ps.setString(2, userDetails.get("email"));
            ps.setString(3, userDetails.get("contact"));
            ps.setString(4, userDetails.get("gender"));
            ps.setString(5, userDetails.get("address"));
            ps.setString(6, userDetails.get("login-id"));
            ps.setString(7, userDetails.get("password"));
            
            ps.setBytes(8, setImage(userDetails.get("image")));
            
            a =ps.executeUpdate();
            
            
        } catch (SQLException ex) {
            Logger.getLogger(InsertUserInfo.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
        
            ConnectionManager.closeConnection();
        }
        
        return a;
    }

    private static byte[] setImage(String get) {
        
        File file = new File(get);
        
        byte b[]= new byte[(int)file.length()];
        
        try {
            FileInputStream fis = new FileInputStream(file);
            
            fis.read(b);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(InsertUserInfo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(InsertUserInfo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return b;
     }
    
}
