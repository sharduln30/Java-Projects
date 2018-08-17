package com.database;

public interface DatabaseInfo {
	
	public static final String USER_NAME="system";
	String PASSWORD="qwerty1234";
	String DIRVER_CLASS="oracle.jdbc.driver.OracleDriver";
	String URL="jdbc:oracle:thin:@localhost:1521:xe";
// interface hai to hr variable public static final hoga
//mtlb constant hoga n constant ko capital mei likhte hai
//url ke case mei pehle jdbc then oracle compulsory hai
	//uske baad driver likhte hai usually thin ,then local host ki ip address
	//ya @localhost ,uske baad listener port and xe stands for xntended version
	//optional hai ye 
	//port for oracle database listener is 1521 
}
