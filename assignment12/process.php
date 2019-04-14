<?php
         if(isset($_POST["submit"])){
            $servername = "localhost:3306";
            $username = "root";
            $password = "1234";
            $dbname = "studentDb";

            // Create connection
            $conn = new mysqli($servername, $username, $password, $dbname);

            // Check connection
            if ($conn->connect_error) {
               die("Connection failed: " . $conn->connect_error);
            } 
            $sql = "INSERT INTO student(rollno,name,dept)VALUES ('".$_POST["rollNo"]."','".$_POST["name"]."','".$_POST["dept"]."')";

            if (mysqli_query($conn, $sql)) {
               echo "New record created successfully";
            } else {
               echo "Error: " . $sql . "" . mysqli_error($conn);
            }
            $conn->close();
         }
      ?>
