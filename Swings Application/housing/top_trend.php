<?php
$servername = "localhost";
$username = "root";
$password = "";
$dbname = "housing";




$city=$_REQUEST["city"];


$conn = new mysqli($servername, $username, $password, $dbname);


$response["success"]=1;

$sql = "SELECT * FROM hostelpg where city='$city' order by id desc limit 10";

$result = $conn->query($sql);

$response["hostelpg"]=array();


     if ($result->num_rows > 0) {	
 
    while($row = $result->fetch_assoc()) {
       
    $post=array("id"=>$row["id"],"title"=>$row["title"],"area"=>$row["area"],"address"=>$row["address"],"city"=>$row["city"],"created_at"=>$row["created_at"],"main_image"=>$row["main_image"],"price"=>$row["price"]);

    array_push($response["hostelpg"],$post);
  

	   }

	  
	   
	  
} 


$sql = "SELECT * FROM hostelpg where city='$city' order by id desc limit 10";

$result = $conn->query($sql);


$response["project"]=array();


     if ($result->num_rows > 0) {	
 
    while($row = $result->fetch_assoc()) {
       
    $post=array("id"=>$row["id"],"title"=>$row["title"],"area"=>$row["area"],"address"=>$row["address"],"city"=>$row["city"],"created_at"=>$row["created_at"],"main_image"=>$row["main_image"],"price"=>$row["price"]);

    array_push($response["project"],$post);
  

	   }

	
	   
	  
} 

$sql = "SELECT * FROM house where city='$city' order by id desc limit 10";

$result = $conn->query($sql);


$response["house"]=array();


     if ($result->num_rows > 0) {	
 
    while($row = $result->fetch_assoc()) {
       
    $post=array("id"=>$row["id"],"title"=>$row["title"],"area"=>$row["area"],"address"=>$row["address"],"city"=>$row["city"],"created_at"=>$row["created_at"],"main_image"=>$row["main_image"],"price"=>$row["price"]);

    array_push($response["house"],$post);
  

	   }	
	   
	  
} 

$sql = "SELECT * FROM rentlease where city='$city' order by id desc limit 10";

$result = $conn->query($sql);


$response["rentlease"]=array();


     if ($result->num_rows > 0) {	
 
    while($row = $result->fetch_assoc()) {
       
    $post=array("id"=>$row["id"],"title"=>$row["title"],"area"=>$row["area"],"address"=>$row["address"],"city"=>$row["city"],"created_at"=>$row["created_at"],"main_image"=>$row["main_image"],"price"=>$row["price"]);

    array_push($response["rentlease"],$post);
  

	   }

	
	   
	  
} 

 echo json_encode($response);
$conn->close();
?>