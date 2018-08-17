/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swings;

import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;

/**
 *
 * @author Danish
 */
public class A extends JFrame{

    public static void main(String[] args) {
        
       
        JTabbedPane t  = new JTabbedPane();
        
        
        
        A a= new A();
        a.setSize(Toolkit.getDefaultToolkit().getScreenSize());
        a.setUndecorated(true);
        a.setVisible(true);
        
    }
}
