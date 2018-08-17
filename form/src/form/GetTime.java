/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author vishu
 */
public class GetTime {
    
    public static void main(String[] args) {
        
        Date d = new Date();
        
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm");
        
       System.out.println(sdf.format(d));
       
        System.out.println(System.currentTimeMillis());
        System.out.println("a "+String.valueOf(System.currentTimeMillis()).subSequence(9, 13).toString());
        
    }
    
}
