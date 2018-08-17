<?php
$servername = "localhost";
$username = "root";
$password = "";
$dbname = "housing";




$city=$_REQUEST["city"];
$table=$_REQUEST["table"];
$id=$_REQUEST["id"];


$conn = new mysqli($servername, $username, $password, $dbname);


$response["success"]=1;

$sql = "SELECT * FROM $table where city='$city' and id=$id";

$result = $conn->query($sql);

$response[$table]=array();


     if ($result->num_rows > 0) {	
 
    if($row = $result->fetch_assoc()) {
       
    $post=array("id"=>$row["id"],"title"=>$row["title"],"area"=>$row["area"],"address"=>$row["address"],"city"=>$row["city"],"created_at"=>$row["created_at"],"main_image"=>$row["main_image"],"price"=>$row["price"],"short_tag"=>$row["short_tag"],"description"=>$row["description"],"contact_no"=>$row["contact_no"]);

    array_push($response[$table],$post);
  

	   }

	  
	   
	  
} 

 echo json_encode($response);
$conn->close();
?>

