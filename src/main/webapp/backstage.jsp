<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

	<head>
	<meta name="viewport" content="width=device-width, initial-scale=1">
		<meta charset="utf-8" />
		<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
		<link rel="stylesheet" type="text/css" href="css/index.css">
		<script src="js/jquery-3.2.1.js"></script>
		<script src="js/bootstrap.min.js"></script>
		<title></title>
	</head>

	<body>
		<div class="container">
			<div class="row clearfix">
				<div class="col-md-12 column">
					<nav class="navbar navbar-default" role="navigation">
						<div class="navbar-header">
							<button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1"> <span class="sr-only">Toggle navigation</span><span class="icon-bar"></span><span class="icon-bar"></span><span class="icon-bar"></span></button>
							<a class="navbar-brand" href="order.mvc">在线点菜--<font color="red">后台</font></a>
						</div>

						<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
							<ul class="nav navbar-nav">
								<li class="dropdown">
									<a href="#" class="dropdown-toggle" data-toggle="dropdown">操作<strong class="caret"></strong></a>
									<ul class="dropdown-menu">
										<li>
											<a href="ordersDetail.mvc">查看未完成订单</a>
										</li>
										<li>
											<a href="ordersDetailAll.mvc">查看所有订单</a>
										</li>
										<li>
											<a href="putOnSale.mvc">新品上架</a>
										</li>
										<li>
											<a href="pullOffShelves.mvc">菜品下架</a>
										</li>
									</ul>
								</li>
								<li >
									<a href="index.mvc">退出后台</a>
								</li>
								
							</ul>
							
						</div>

					</nav>
					
					<div class="col-md-12 column" style="text-align: center;">
						<div heigth="300px">
							<span class="text-success" style="font-size: 18px;">欢迎进入后台。</span><br/>
							<span class="text-success" style="font-size: 18px;">请在上方导航栏进行操作。</span>
						</div>
					</div>
				</div>
				
			</div>
		</div>
		
	</body>

</html>