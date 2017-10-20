<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
							<span style="color: red;font-size: 16px;">菜品详情：</span>
							<hr/>
							<table style="width: 100%;">
								<tr>
									<th style="width: 20%;">菜品id</th>
									<th style="width: 20%;">菜品名</th>
									<th style="width: 20%;">菜品价格(元)</th>
									<th style="width: 20%;">菜品图片</th>
									<th>操作</th>
								</tr>
								<tr>
									<td></td>
									<td></td>
									<td></td>
									<td></td>
									<td></td>
								</tr>
								<c:forEach items="${f}" var="food">
								<tr>
									<td>${food.id }</td>
									<td>${food.name }</td>
									<td>${food.price }</td>
									<td><img src="<%=request.getContextPath()%>${food.img}" width="80px" height="80px" class="my_photos"></td>
									<td><a class="btn btn-info" href="editFood.mvc?fid=${food.id }");">编辑</a><a class="btn btn-info" href="doPullOffShelves.mvc?fid=${food.id }");">下架</a></td>
								</tr>
								</c:forEach>
							</table>
						</div>
					</div>
				</div>
				
			</div>
		</div>
		
	</body>

</html>