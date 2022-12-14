<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    
   <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto:400,700">
    <!-- https://fonts.google.com/specimen/Roboto -->
    <link href="<c:url value='/template/admin/css/fontawesome.min.css' />" rel="stylesheet" />
    
    <!-- https://fontawesome.com/ -->
    <link href="<c:url value='/template/admin/css/bootstrap.min.css' />" rel="stylesheet" />
    
    <!-- https://getbootstrap.com/ -->
    <link href="<c:url value='/template/admin/css/templatemo-style.css' />" rel="stylesheet" />
    

</head>
<body>

	<nav class="navbar navbar-expand-xl">
	<div class="container h-100">
		<a class="navbar-brand" href="admin-home">
			<h1 class="tm-site-title mb-0">Product Admin</h1>
		</a>
		<button class="navbar-toggler ml-auto mr-0" type="button"
			data-toggle="collapse" data-target="#navbarSupportedContent"
			aria-controls="navbarSupportedContent" aria-expanded="false"
			aria-label="Toggle navigation">
			<i class="fas fa-bars tm-nav-icon"></i>
		</button>

		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav mx-auto h-100">
				<li class="nav-item"><a class="nav-link active" href="admin-home"> <i
						class="fas fa-tachometer-alt"></i> Dashboard <span class="sr-only">(current)</span>
				</a></li>
				<li class="nav-item dropdown"><a
					class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
					role="button" data-toggle="dropdown" aria-haspopup="true"
					aria-expanded="false"> <i class="far fa-file-alt"></i> <span>
							Reports <i class="fas fa-angle-down"></i>
					</span>
				</a>
					<div class="dropdown-menu" aria-labelledby="navbarDropdown">
						<a class="dropdown-item" href="#">Daily Report</a> <a
							class="dropdown-item" href="#">Weekly Report</a> <a
							class="dropdown-item" href="#">Yearly Report</a>
					</div></li>
				<li class="nav-item"><a class="nav-link" href="admin-products">
						<i class="fas fa-shopping-cart"></i> Products
				</a></li>

				<li class="nav-item"><a class="nav-link" href="admin-accounts">
						<i class="far fa-user"></i> Accounts
				</a></li>
				<li class="nav-item dropdown"><a
					class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
					role="button" data-toggle="dropdown" aria-haspopup="true"
					aria-expanded="false"> <i class="fas fa-cog"></i> <span>
							Settings <i class="fas fa-angle-down"></i>
					</span>
				</a>
					<div class="dropdown-menu" aria-labelledby="navbarDropdown">
						<a class="dropdown-item" href="#">Profile</a> <a
							class="dropdown-item" href="#">Billing</a> <a
							class="dropdown-item" href="#">Customize</a>
					</div></li>
			</ul>
			<ul class="navbar-nav">
				<li class="nav-item"><a class="nav-link d-block"
					href="login"> Admin, <b>Logout</b>
				</a></li>
			</ul>
		</div>
	</div>

	</nav>
</body>
</html>
