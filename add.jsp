<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="sty.css">
<link href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//netdna.bootstrapcdn.com/bootstrap/3.0.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
</head>
<body>
<div class="container">
    <div class="row">
        <div class="col-sm-6 col-md-4 col-md-offset-4">
            <h1 class="text-center login-title">Sign in</h1>
            <div class="account-wall">
               <!--  <img class="profile-img" src="images1.png" align="center" alt=""> -->
                <form class="form-signin" method="post" action="UserLoginController">
                <input type="text" name="uid" class="form-control" placeholder="Customer Code" required autofocus>
                <input type="text" name="uid" class="form-control" placeholder="Customer Name" required autofocus>
                <input type="text" name="uid" class="form-control" placeholder="Customer Address1" required autofocus>
                <input type="text" name="uid" class="form-control" placeholder="Customer Address2" required autofocus>
                <input type="text" name="uid" class="form-control" placeholder="pin" required autofocus>
                <input type="text" name="uid" class="form-control" placeholder="Email" required autofocus>
                <input type="text" name="uid" class="form-control" placeholder="Contact no" required autofocus>
                <input type="text" name="uid" class="form-control" placeholder="Contact person" required autofocus>
                <input type="password" name="pwd" class="form-control" placeholder="Password" required>
                <span>ROLE:</span>
                <select class="form-control" name="role">
                 <option></option>
                 <option value="maker" >MAKER</option>
                   <option value="checker" >CHECKER</option>
                         
                    </select>
                <button class="btn btn-lg btn-primary btn-block" type="submit">
                    Sign in</button>
                <!-- <label class="checkbox pull-left">
                    <input type="checkbox" value="remember-me">
                    Remember me
                </label> -->
               <!--  <a href="#" class="pull-right need-help">Need help? </a><span class="clearfix"></span> -->
                </form>
            <!-- </div>
            <a href="#" class="text-center new-account">Create an account </a>
        </div> -->
    </div>
</div>

</body>
</html>