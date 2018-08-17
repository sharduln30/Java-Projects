<?php
$servername = "localhost";
$username = "root";
$password = "";
$dbname = "housing";




$user_id=$_REQUEST["user_id"];



$conn = new mysqli($servername, $username, $password, $dbname);


$response["success"]=1;

$sql = "SELECT * FROM messages join user_reg on messages.user_to=user_reg.id where user_from=$user_id  order by message_id desc";

$result = $conn->query($sql);

$response["inbox"]=array();


     if ($result->num_rows > 0) {	
 
    while($row = $result->fetch_assoc()) {
       
    $post=array("mid"=>$row["message_id"],"ufrom"=>$row["user_from"],"uto"=>$row["user_to"],"message"=>$row["message"],"category"=>$row["category"],"product_id"=>$row["product_id"],"created_at"=>$row["created_at"],"name"=>$row["name"]);

    array_push($response["inbox"],$post);
  

	   }

	  
	   
	  
} 

 echo json_encode($response);
$conn->close();
?>

