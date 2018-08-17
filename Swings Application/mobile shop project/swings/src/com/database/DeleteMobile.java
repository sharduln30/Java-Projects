/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ACER
 */
public class DeleteMobile {
    
     
    public static int deleteMobile(String k){
        
        int b=0;
        
         try {
        Connection con = GetConnection.openConnection();
        
        String sql="delete from mobile_data where imei=?";
        
        
        
        PreparedStatement ps;
        
      
       
            ps = con.prepareStatement(sql);
              ps.setString(1,k);
            b=ps.executeUpdate();
        
        
        
       
        }
          catch (SQLException ex) {
            Logger.getLogger(AddMobile.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
             GetConnection.closeConnection();
         }
         
        return b;
    }
}
