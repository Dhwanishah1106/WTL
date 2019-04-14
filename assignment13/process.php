<?php
         if(isset($_POST["submit"])){
            $servername = "localhost:3306";
            $username = "root";
            $password = "1234";
            $dbname = "assign13Db";

            // Create connection
            $conn = new mysqli($servername, $username, $password, $dbname);

            // Check connection
            if ($conn->connect_error) {
               die("Connection failed: " . $conn->connect_error);
            } 
            $sql = "INSERT INTO student(rollno,name,dept,class,perc)VALUES ('".$_POST["rollNo"]."','".$_POST["name"]."','".$_POST["dept"]."','".$_POST["class"]."','".$_POST["perc"]."')";

            if (mysqli_query($conn, $sql)) {
               echo "New record created successfully";
            } else {
               echo "Error: " . $sql . "" . mysqli_error($conn);
            }

		$query = "select * from student order by perc";

		$result = mysqli_query($conn, $query);
         }
?>
<table><tr><th>Roll No</th><th>Name</th><th>Department</th><th>Class</th><th>Percentage</th></tr>
<?php
	if(mysqli_num_rows($result)>0) {
		while($row = mysqli_fetch_assoc($result) ) {
			echo "<tr><td>".$row["rollno"]."</td><td>".$row["name"]."</td><td>".$row["dept"]."</td><td>".$row["class"]."</td><td>".$row["perc"]."</td></tr>";
		}
	}
	echo "</table>";
?>
