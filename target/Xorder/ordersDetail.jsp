<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
							<span style="color: red;font-size: 16px;">订单详情：</span>
							<a href="" class="btn btn-info" style="">刷新</a>
							<hr/>
							<table style="width: 100%;" class="table">
								<tr>
									<th style="width: 10%;">订单号</th>
									<th style="width: 50%;">订单详情</th>
									<th style="width: 20%;">开始时间</th>
									<th>操作</th>
								</tr>
								<tr>
									<td></td>
									<td></td>
									<td></td>
									<td></td>
								</tr>
								<c:forEach items="${orders }" var="o">
								<tr>
									<td>${o.id }</td>
									<td>${o.content }</td>
									<td>${o.starttime }</td>
									<td><a class="btn btn-info" href="finishOrder.mvc?oid=${o.id }");">完成</a><button class="btn btn-info">取消</button></td>
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