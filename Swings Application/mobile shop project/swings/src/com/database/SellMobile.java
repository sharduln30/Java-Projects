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
 * @author Danish
 */
public class SellMobile {
    public static int sellMobile(ArrayList<String> k){
        
        int r = 0;
         try {
        Connection con = GetConnection.openConnection();
        
        String sql="insert into sellmobile_data values(?,?,?,?,?)";
        
        PreparedStatement ps;
       
            ps = con.prepareStatement(sql);
        
        
        for(int i = 0;i<k.size();i++){
            ps.setString(i+1,k.get(i));
        }
        r=ps.executeUpdate();
        }
          catch (SQLException ex) {
          //  Logger.getLogger(AddMobile.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
             GetConnection.closeConnection();
         }
         
        return r;
    }
    
}
    

