/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mukesh Arya
 */
public class AddLibrarian {
    
    public static int addLibrarian(String librarainDetails[]){
    
        int a=0;
    
        String sql="insert into librarian values(?,?,?,?)";
        
        try {
            PreparedStatement ps = ConnectionManager.openConnection().prepareStatement(sql);
        
            for(int i=0;i<librarainDetails.length;i++){
            
                ps.setString(i+1, librarainDetails[i]);
            
            }
            
           a= ps.executeUpdate();
        
        
        } catch (SQLException ex) {
            Logger.getLogger(AddLibrarian.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
        
            ConnectionManager.closeConnection();
        }
        
        
        return a;
    }
}
