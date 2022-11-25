<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<meta http-equiv="X-UA-Compatible" content="ie=edge">
	<title>Login With Us</title>
	<link
		href="<c:url value='template/web/loginPage/fonts/material-icon/css/material-design-iconic-font.min.css' />"
		rel="stylesheet" type="text/css" media="all" />
	<!-- Font Icon -->
	<link href="<c:url value='template/web/loginPage/css/style.css' />"
		rel="stylesheet" type="text/css" media="all" />
	<link
	href="<c:url value='template/web/loginPage/images/motorcycle.png' />"
	rel="shortcut icon" type="image/png" />

</head>
<body>
	<input type="hidden" id="status" value="<%=request.getAttribute("status")%>">

	<div class="main">

		<!-- Sing in  Form -->
		<section class="sign-in">
			<div class="container">
				<div class="signin-content">
					<div class="signin-image">
						<figure>
							<img src="template/web/registPage/images/signin-image.png" alt="sign in image">
						</figure>
						<a href="regist" class="signup-image-link">Create an
							account</a>
					</div>

					<div class="signin-form">
						<h2 class="form-title">WELCOME TO SIGN IN</h2>
						<form method="post" action="login" class="login-form" id="login-form">
							<div class="form-group">
								<label for="email"><i
									class="zmdi zmdi-account material-icons-name"></i></label> <input
									type="text" name="email" id="email"
									placeholder="Your Email" required="required"/>  <!-- required="required": tb khung nhap trong -->
							</div>
							<div class="form-group">
								<label for="password"><i class="zmdi zmdi-lock"></i></label> <input
									type="password" name="password" id="password"
									placeholder="Password" required="required" />
							</div>
							<div class="form-group">
								<a href="forgot">Forgot Password?</a>
							</div>
							<div class="form-group form-button">
								<input type="submit" name="signin" id="signin"
									class="form-submit" value="Log in" />
							</div>
						</form>
						<div class="social-login">
							<span class="social-label">Or</span>
							<ul class="socials">
								<li><a href="#"><i
										class="display-flex-center zmdi zmdi-facebook"></i></a></li>
								<li><a href="#"><i
										class="display-flex-center zmdi zmdi-twitter"></i></a></li>
								<li><a href="#"><i
										class="display-flex-center zmdi zmdi-google"></i></a></li>
							</ul>
						</div>
					</div>
				</div>
			</div>
		</section>

	</div>

	<!-- JS -->
	<script src="template/web/loginPage/vendor/jquery/jquery.min.js"></script>
	<script src="template/web/loginPage/js/main.js"></script>
	<script src = "https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
	<link rel="stysheet" href="alert/dist/sweetalert.css">

	<script type="text/javascript">
		var status = document.getElementById("status").value;
		if (status == "failed") {
			swal("Oh No", "Please check your Email and Password again!", "error");
		}
	</script>
</body>

</html>