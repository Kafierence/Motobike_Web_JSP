<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<meta http-equiv="X-UA-Compatible" content="ie=edge">
	<title>Be A Member</title>
	<link
		href="<c:url value='template/web/registPage/fonts/material-icon/css/material-design-iconic-font.min.css' />"
		rel="stylesheet" type="text/css" media="all" />
	<!-- Font Icon -->
	<link href="<c:url value='template/web/registPage/css/style.css' />"
		rel="stylesheet" type="text/css" media="all" />
	<link
	href="<c:url value='template/web/registPage/images/motorcycle.png' />"
	rel="shortcut icon" type="image/png" />
		
</head>
<body>

	<input type = "hidden" id="status" value = "<%=request.getAttribute("status") %>">
	<div class="main">

		<!-- Sign up form -->
		<section class="signup">
			<div class="container">
				<div class="signup-content">
					<div class="signup-form">
						<h2 class="form-title">SIGN UP</h2>
					
						<form method="post" action="regist" class="register-form"
							id="register-form">
							<div class="form-group">
								<label for="name"><i
									class="zmdi zmdi-account material-icons-name"></i></label> <input
									type="text" name="name" id="name" placeholder="Your Name" required ="required"/>
							</div>
							<div class="form-group">
								<label for="email"><i class="zmdi zmdi-email"></i></label> <input
									type="email" name="email" id="email" placeholder="Your Email"  required ="required"/>
							</div>
							<div class="form-group">
								<label for="pass"><i class="zmdi zmdi-lock"></i></label> 
								<input type="password" name="pass" id="pass" placeholder="Password"  required ="required"/>
							</div>
							<div class="form-group">
								<label for="re-pass"><i class="zmdi zmdi-lock-outline"></i></label>
								<input type="password" name="re_pass" id="re_pass"
									placeholder="Repeat your password"  required ="required"/>
							</div>
							<div class="form-group">
								<label for="contact"><i class="zmdi zmdi-lock-outline"></i></label>
								<input type="text" name="contact" id="contact"
									placeholder="Contact no"  required ="required"/>
							</div>

							<div class="form-group">
								<label for="cccd"><i class="zmdi zmdi-lock-outline"></i></label>
								<input type="text" name="cccd" id="cccd"
									placeholder="Citizen Identity"  required ="required"/>
							</div>
							
							<div class="form-group">
								<input type="checkbox" name="agree-term" id="agree-term"
									class="agree-term" required="checked" /> <label for="agree-term"
									class="label-agree-term"><span><span></span></span>I
									agree all statements in <a href="#" class="term-service">Terms
										of service</a></label>
							</div>
							<div class="form-group form-button">
								<input type="submit" name="signup" id="signup"
									class="form-submit" value="Register" />
							</div>
						</form>
					</div>
					<div class="signup-image">
						<figure class = "frame-image-regis">							
							<img src="template/web/registPage/images/signup-image(2).jpg" 
							alt="sign up image">
						</figure>
						<a href="login" class="signup-image-link">I am already member</a>
					</div>
				</div>
			</div>
		</section>


	</div>
	<!-- JS -->
	<script src="template/web/registPage/vendor/jquery/jquery.min.js"></script>
	<script src="template/web/registPage/js/main.js"></script>
	
	<script src = "https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
	<link rel="stysheet" href="alert/dist/sweetalert.css">
	<script type="text/javascript">
		var status = document.getElementById("status").value;
		if(status == "success")
		{
			swal("Congratulations","Account Created Successfully","success");
		}
		if(status == "failed")
		{
			swal("Information","Unregistered Account","error");
		}
		

	</script>


</body>

</html>