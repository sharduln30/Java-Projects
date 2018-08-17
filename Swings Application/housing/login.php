<?php	
$servername = "localhost";
$username = "root";
$pass = "";
$dbname = "housing";
  
$email=$_REQUEST['emailid'];
$password=$_REQUEST['password'];

$conn = new mysqli($servername, $username, $pass, $dbname);

$sql = "select * from user_reg where emailid='$email' and password='$password'";

$result = $conn->query($sql);

$response["success"]=0;
$response["message"]="Error in login user";

if ($result->num_rows > 0) {
	  if($row = $result->fetch_assoc()) {
$response["success"]=1;
$response["message"]="Successfully login";
$response["userid"]=$row["id"];
}
} 
 echo json_encode($response);
$conn->close();
?>