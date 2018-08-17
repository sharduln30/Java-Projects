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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hadoop
 */
public class InsertVisitorInfo {
    
    static Connection con;
    
    static{
    
    con = GetConnection.getConnection();
    }
    
    public static int insertInfo(String s[]){
    
        int a=0;
        try {
            PreparedStatement ps = con.prepareStatement("insert into visitor_info values(?,?,?,?,?,?,?,?,?)");
            
            
            ps.setString(1, s[4]);
            ps.setString(2,String.valueOf(System.currentTimeMillis()).subSequence(9, 13).toString());
            
            for(int i=0;i<s.length-1;i++){
            
                ps.setString(i+3, s[i]);
            }
            
            ps.setBytes(9, setImage(s[6]));
            
           a=ps.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(InsertVisitorInfo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
    
    return a;
    }

    private static byte[] setImage(String string) {
    
        byte b[];
        
        File f = new File(string);
        b = new byte[(int)f.length()];
        try {
            FileInputStream fis = new FileInputStream(f);
            
            fis.read(b);
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(InsertVisitorInfo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(InsertVisitorInfo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    return b;
    }
    
    
}
