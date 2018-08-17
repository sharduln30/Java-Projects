<?php
	
	if(!empty($_REQUEST))
	{
$servername = "localhost";
$username = "root";
$pass = "";
$dbname = "housing";


	$from=$_REQUEST['userid'];
	$to=$_REQUEST['userto'];
		$message=$_REQUEST['message'];
			$category=$_REQUEST['category'];
				$productid=$_REQUEST['productid'];
	
	
	
// Create connection
$conn = new mysqli($servername, $username, $pass, $dbname);

// Check connection
if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
} 

$sql = "insert into messages (user_from,user_to,message,category,product_id) values($from,$to,'$message','$category',$productid)";

$result = $conn->query($sql);


$response["success"]=0;
$response["message"]="Error in posting message";

if ($result===true) {
	
$response["success"]=1;
$response["message"]="Successfully post message";
} 
 echo json_encode($response);
$conn->close();
}
?>