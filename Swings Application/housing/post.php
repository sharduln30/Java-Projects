<?php
	
	if(!empty($_REQUEST))
	{
$servername = "localhost";
$username = "root";
$pass = "";
$dbname = "housing";


	$userid=$_REQUEST['userid'];
	$category=$_REQUEST["category"];
	$title=$_REQUEST["title"];
	$city=$_REQUEST["city"];
	$area=$_REQUEST["area"];
	$address=$_REQUEST["address"];
	$shorttags=$_REQUEST["shorttags"];
	$description=$_REQUEST["description"];
		$price=$_REQUEST["price"];
			$contact=$_REQUEST["contact"];

	
	
	
// Create connection
$conn = new mysqli($servername, $username, $pass, $dbname);

// Check connection
if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
} 

$sql = "insert into $category (user_id,title,area,address,city,price,short_tag,description,contact_no) 
values($userid,'$title','$area','$address','$city','$price','$shorttags','$description','$contact')";

$result = $conn->query($sql);


$response["success"]=0;
$response["message"]="Error in posting";

if ($result===true) {
	
$response["success"]=1;
$response["message"]="Successfully post";
} 
 echo json_encode($response);
$conn->close();
}
?>