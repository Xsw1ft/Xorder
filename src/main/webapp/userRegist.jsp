<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

	<head>
		<meta charset="utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
		<link rel="stylesheet" type="text/css" href="css/index.css">
		<script src="js/jquery-3.2.1.js"></script>
		<script src="js/bootstrap.min.js"></script>
		<script src="js/check.js"></script>
		<title></title>
	</head>

	<body>
		<div class="container">
			<div class="row clearfix">
				<div class="col-md-12 column">
					<nav class="navbar navbar-default" role="navigation">
						<div class="navbar-header">
							<button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1"> <span class="sr-only">Toggle navigation</span><span class="icon-bar"></span><span class="icon-bar"></span><span class="icon-bar"></span></button>
							<a class="navbar-brand" href="order.mvc">在线点菜</a>
						</div>

						<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
							<ul class="nav navbar-nav">
								<li class="active">
									<a href="#">新品推出</a>
								</li>
								<li>
									<a href="#">火爆热销</a>
								</li>
								<li class="dropdown">
									<a href="#" class="dropdown-toggle" data-toggle="dropdown">会员<strong class="caret"></strong></a>
									<ul class="dropdown-menu">
										<li>
											<a href="userLogin.mvc">登录</a>
										</li>
										<li>
											<a href="userRegist.mvc">注册</a>
										</li>
									</ul>
								</li>
								<li>
									<a href="insideLogin.mvc">员工入口</a>
								</li>
							</ul>
							<ul class="nav navbar-nav navbar-right">
								<form class="navbar-form navbar-left" role="search">
									<div class="form-group">
										<input type="text" class="form-control" />
									</div> <button type="submit" class="btn btn-default">搜索</button>
								</form>

							</ul>
						</div>

					</nav>
					
					<div class="col-md-3 column">
					</div>
					<div class="col-md-6 column">
						<form action="successfulRegist.mvc" method="post">
						<div class="form-control" style="height: 330px;">
							<table border="0" cellspacing="0" cellpadding="0" width="100%" colspan="2" >
								<tr><th><font color="red">会员注册</font></th></tr>
								<tr><td>&nbsp;</td></tr><tr><td>&nbsp;</td></tr>
								<tr><td width="30%">会员名：</td><td width="70%"><input name="name" type="text" class="form-control"/></td></tr>
								<tr><td width="30%">密&nbsp;&nbsp;码：</td><td width="70%"><input name="pwd" id="pw1" type="password" class="form-control" onchange="checkPwd()"/></td></tr>
								<tr><td width="30%">确认密码：</td><td width="70%"><input id="pw2" type="password" class="form-control" onchange="checkPwd()"/></td></tr>
								<tr><td width="30%">手机号：</td><td width="70%"><input id="tel" type="text" class="form-control" onchange="checkTel()"/></td></tr>
							</table>
							<br/><span style="color: red;" id="status">${status }</span><br/><br/>
							<input type="submit" class="btn btn-lg btn-block btn-primary" value="注册"/>
						</div>
						</form>
					</div>
					<div class="col-md-3 column">
					</div>
				</div>
				
			</div>
		</div>
		
	</body>

</html>