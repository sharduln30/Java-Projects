/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mukesh Arya
 */
public class UserRegister {
    
    static Connection con;
    
    static{
    
        con = GetConnection.getConnection();
    }
    
    public static int userRegister(String userInfo[]){
    
        int a=0;
        
        try {
            PreparedStatement ps =con.prepareStatement("insert into user_register values(?,?,?,?,?,?)");
        
            for(int i=0;i<userInfo.length;i++){
            
                ps.setString(i+1,userInfo[i]);
            }
        
            a=ps.executeUpdate();
        
        } catch (SQLException ex) {
            Logger.getLogger(UserRegister.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        return a;
    }
}
