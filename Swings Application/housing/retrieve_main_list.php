<?php
$servername = "localhost";
$username = "root";
$password = "";
$dbname = "housing";




$city=$_REQUEST["city"];
$table=$_REQUEST["table"];


$conn = new mysqli($servername, $username, $password, $dbname);


$response["success"]=1;

$sql = "SELECT * FROM $table where city='$city' order by id desc";

$result = $conn->query($sql);

$response[$table]=array();


     if ($result->num_rows > 0) {	
 
    while($row = $result->fetch_assoc()) {
       
    $post=array("id"=>$row["id"],"title"=>$row["title"],"area"=>$row["area"],"address"=>$row["address"],"city"=>$row["city"],"created_at"=>$row["created_at"],"main_image"=>$row["main_image"],"price"=>$row["price"],"short_tag"=>$row["short_tag"],"description"=>$row["description"],"contact_no"=>$row["contact_no"],"user_id"=>$row["user_id"]);

    array_push($response[$table],$post);
  

	   }

	  
	   
	  
} 

 echo json_encode($response);
$conn->close();
?>

