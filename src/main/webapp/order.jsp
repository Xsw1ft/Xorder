<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
		<meta charset="utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
		<link rel="stylesheet" type="text/css" href="css/index.css">
		<script src="js/jquery-3.2.1.js"></script>
		<script src="js/bootstrap.min.js"></script>
		<script src="js/count.js"></script>
		<title>点菜</title>
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
					<div class="panel-group" id="panel-419797">
						<div class="panel panel-default">
							<div class="panel-heading">
								<a class="panel-title collapsed" data-toggle="collapse" data-parent="#panel-419797" href="#panel-element-308496">家常菜</a>
							</div>
							<div id="panel-element-308496" class="panel-collapse in">
								<div class="panel-body">
									<c:forEach items="${jiachang}" var="j">
									<div class="my_foods">
										<img src="<%=request.getContextPath()%>${j.img}" width="100%" height="80%" class="my_photos">
										<span class="my_describe" id="<%="A" %>${j.id }<%="N" %>">${j.name }</span>
										<span class="my_price" id="<%="A" %>${j.id }<%="P" %>">${j.price }</span>
										<span class="my_yuan">￥</span>
										<div class="my_btn">
											<button type="button" class="btn btn-primary" name="A01" style="width:34px;height: 34;" onclick="plus('<%="A" %>${j.id }')" ;>+</button>
											<span class="my_count" id="<%="A" %>${j.id }">0</span>
											<button type="button" class="btn btn-primary" name="A01" style="width:34px;height: 34;" onclick="minus('<%="A" %>${j.id }')">-</button>
										</div>
									</div>
									</c:forEach>
								</div>
							</div>
						</div>
						<div class="panel panel-default">
							<div class="panel-heading">
								<a class="panel-title" data-toggle="collapse" data-parent="#panel-419797" href="#panel-element-953760">主食</a>
							</div>
							<div id="panel-element-953760" class="panel-collapse collapse">
								<div class="panel-body">
									<c:forEach items="${zhushi}" var="z">
									<div class="my_foods">
										<img src="<%=request.getContextPath()%>${z.img}" width="100%" height="80%" class="my_photos">
										<span class="my_describe" id="<%="A" %>${z.id }<%="N" %>">${z.name }</span>
										<span class="my_price" id="<%="A" %>${z.id }<%="P" %>">${z.price }</span>
										<span class="my_yuan">￥</span>
										<div class="my_btn">
											<button type="button" class="btn btn-primary" name="A01" style="width:34px;height: 34;" onclick="plus('<%="A" %>${z.id }')" ;>+</button>
											<span class="my_count" id="<%="A" %>${z.id }">0</span>
											<button type="button" class="btn btn-primary" name="A01" style="width:34px;height: 34;" onclick="minus('<%="A" %>${z.id }')">-</button>
										</div>
									</div>
									</c:forEach>
								</div>
							</div>
						</div>
						<div class="panel panel-default">
							<div class="panel-heading">
								<a class="panel-title collapsed" data-toggle="collapse" data-parent="#panel-419797" href="#panel-element-956256">饮品</a>
							</div>
							<div id="panel-element-956256" class="panel-collapse collapse">
								<div class="panel-body">
									<c:forEach items="${yinliao}" var="y">
									<div class="my_foods">
										<img src="<%=request.getContextPath()%>${y.img}" width="100%" height="80%" class="my_photos">
										<span class="my_describe" id="<%="A" %>${y.id }<%="N" %>">${y.name }</span>
										<span class="my_price" id="<%="A" %>${y.id }<%="P" %>">${y.price }</span>
										<span class="my_yuan">￥</span>
										<div class="my_btn">
											<button type="button" class="btn btn-primary" name="A01" style="width:34px;height: 34;" onclick="plus('<%="A" %>${y.id }')" ;>+</button>
											<span class="my_count" id="<%="A" %>${y.id }">0</span>
											<button type="button" class="btn btn-primary" name="A01" style="width:34px;height: 34;" onclick="minus('<%="A" %>${y.id }')">-</button>
										</div>
									</div>
									</c:forEach>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
			<div class="footer">
			</div>
			<div class="row clearfix">

				<div class="col-md-3 column">
					<select class="form-control" id="deskid">
						<option>请选择桌号</option>
						<option>A1</option>
						<option>A2</option>
						<option>A3</option>
						<option>A4</option>
						<option>A5</option>
						<option>A6</option>
						<option>A7</option>
						<option>A8</option>
						<option>A9</option>
						<option>A10</option>
					</select>
				</div>
				<div class="col-md-3 column">
					<select class="form-control" id="peoplenum">
						<option>请选择用餐人数</option>
						<option>1</option>
						<option>2</option>
						<option>3</option>
						<option>4</option>
						<option>5</option>
						<option>6</option>
						<option>7</option>
						<option>8</option>
						<option>9</option>
						<option>10</option>
					</select>
				</div>
				<div class="col-md-6 column">
					<input type="text" placeholder="备注..." class="form-control" id="beizhu">
				</div>
			</div>
			<br/>
			<div class="row clearfix">

				<div class="col-md-12 column">
					<button type="button" class="btn btn-block btn-lg btn-primary" onclick="countMenu()">提交菜单</button>
				</div>
			</div>
		</div>
		</div>
		<form action="userOrder.mvc" method="post" id="myform">
			<input type="hidden" name="content" value="" id="dingdan">
			<input type="submit" hidden="1">
		</form>
	</body>

</html>