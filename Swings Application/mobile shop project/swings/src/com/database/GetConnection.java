package com.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static com.database.DatabaseInfo.*;

public class GetConnection {
	
	private static Connection con;
	//netbeans wala import ni krna
	//connection private rkhna compulsory
	//static block so that connection main se phle bn jaye
	

	public static Connection openConnection(){
                
            try {
				
				Class.forName(DIRVER_CLASS);
				//creating object
				con = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
			} catch (SQLException | ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
            return con;}
	
	public static boolean closeConnection(){

		try {
			con.close();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			return false;
		}
		
	}
}
