<?php
	
	if(!empty($_REQUEST))
	{
$servername = "localhost";
$username = "root";
$pass = "";
$dbname = "housing";


	$email=$_REQUEST['emailid'];
	$name=$_REQUEST['name'];
	$password=$_REQUEST['password'];
	
	
	
// Create connection
$conn = new mysqli($servername, $username, $pass, $dbname);

// Check connection
if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
} 

$sql = "insert into user_reg (name,emailid,password) values('$name','$email','$password')";

$result = $conn->query($sql);


$response["success"]=0;
$response["message"]="Error in registering user";

if ($result===true) {
	
$response["success"]=1;
$response["message"]="Successfully registered";
} 
 echo json_encode($response);
$conn->close();
}
?>