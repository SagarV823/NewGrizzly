<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<!-- <head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="login.html" method="post" >
  <div class="imgcontainer">
  
  </div>

  <div class="container">
    <label for="uname"><b>Username</b></label>
    <input type="text" placeholder="Enter Username" name="userName" required>
	<br>
    <label for="psw"><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="password" required>
<br>
    <button type="submit">Submit</button>
   
  </div>

  <div class="container" style="background-color:#f1f1f1">
    <button type="button" class="cancelbtn">Reset</button>
  </div>
</form>
</body> -->

<head><title>Admin-Login</title>
                
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css">
        <link rel="stylesheet" href="styles/styles.css">
    </head>


    <body>
    
       <br><br><br><br>
        <center><img src="images/logo.png" alt="Grizzly Logo" />
  
    <br><br>
    <form name="loginForm" action="login.html" method="POST">
            <div class="form-group row topnav1 ">
                    <label for="fname" class="col-sm-5 col-form-label"></label>
                    <div class="col-sm-2">
        <input type="text" name="userName" placeholder="Username" class="form-control form-rounded" id="userId" required > 
    </div>
   </div>
            <div class="form-group row topnav1 ">
                    <label for="fname" class="col-sm-5 col-form-label"></label>
                    <div class="col-sm-2">
        <input type="password" name="password" placeholder="Password" class="form-control form-rounded" id="password" required > 
    </div>
   </div>

<div class="form-group row">
        <label for="zip" class="col-sm-5 col-form-label"></label>
        <div class="col-sm-2">
                <input type="submit" class="btn btn-secondary form-rounded" value="Login">
            </div>
</div>
  

    </form>
    </body>
</html>