<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

	<head>
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
							<a class="navbar-brand" href="#">在线点菜--<font color="red">后台</font></a>
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
					
					<div class="col-md-12 column">
						<div class="form-control" style="height: 100%;">
							<span style="color: red;font-size: 16px;">新品上架：</span>
							<hr/>
							<form action="checkPutOnSale.mvc" method="post">
							<table style="width: 100%;">
								<tr>
									<th style="width: 20%;"></th>
									<th style="width: 80%;"></th>
								</tr>
								<tr>
									<td></td>
									<td></td>
								</tr>
								<tr>
									<td>菜名：</td>
									<td><input type="text" name="name" class="form-control" placeholder="16位字符"></td>
								</tr>
								<tr>
									<td>价格：</td>
									<td><input type="text" name="price" class="form-control" placeholder="最高9999.99"></td>
								</tr>
								<tr>
									<td>种类：</td>
									<td><input type="text" name="kind" class="form-control" placeholder="请输入c or z or y （c表示菜，z表示主食，y表示饮料）"></td>
								</tr>
								<tr>
									<td>图片：</td>
									<td><input type="file" disabled/></td>
								</tr>
								<tr>
									<td></td>
									<td>图片上传暂未开发</td>
								</tr>
							</table>
							<hr/>
							<input type="submit" class="btn btn-block btn-success" value="新品上架">
							</form>
						</div>
					</div>
				</div>
				
			</div>
		</div>
		
	</body>

</html>