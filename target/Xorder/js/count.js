function plus(foodsid){
	var nowCount = parseInt(document.getElementById(foodsid).innerHTML);
	document.getElementById(foodsid).innerHTML = nowCount + 1;
}


function minus(foodsid){
	var nowCount = parseInt(document.getElementById(foodsid).innerHTML);
	if( nowCount != 0)
		document.getElementById(foodsid).innerHTML = nowCount - 1;
	else
		document.getElementById(foodsid).innerHTML = 0;
}



function countMenu(){
	var total = 0;//总价
	var x = new Array();//客人订单列表
	var totalnum = 0;//总商品个数
	var beizhu = document.getElementById("beizhu").value;
	//构建二维数组
	for( var i=1 ; i<=50 ; i++){
		x[i]=new Array(3);
	}
	
	for( var i=1 ; i<= 50 ;i++){
		var foodsid = "A" + i.toString();
		var price;
		var num;
		var thistotal;
		if (document.getElementById(foodsid) == null) {
			continue;
		} else{
			price = parseInt(document.getElementById(foodsid+"P").innerHTML);//获取单价
			num = parseInt(document.getElementById(foodsid).innerHTML)//获取个数
			thistotal = price * num ;//计算单个商品价格
			total = total + thistotal;//单个商品计入总价
		}
			//如果客人有点，则加入订单列表
		if(num==0){
			continue;
		}
		else{
			//生成订单
			x[i][0]=document.getElementById(foodsid+"N").innerHTML;//获取商品名
			x[i][1]=num;//获取商品个数
			x[i][2]=thistotal+"￥";//获取商品总价
		}
	}

	//打印订单
	var dingdan="订单详情：\n";
	dingdan = dingdan + "-----------\n";
	for( var i=1 ; i<=50 ; i++ ){
		if(x[i][0]==null)
			continue;
		else{
			dingdan=dingdan+x[i][0]+"x"+x[i][1]+ "   "+x[i][2]+"\n";
		}
	}
	dingdan = dingdan + "-----------\n";
	dingdan = dingdan + "桌号："+ document.getElementById("deskid").value + "\n";
	dingdan = dingdan + "人数："+ document.getElementById("peoplenum").value + "\n";
	dingdan = dingdan + "备注："+ beizhu + "\n";
	dingdan = dingdan + "-----------\n";
	dingdan = dingdan + "总计："+ total + "￥";
	if(total==0){
		alert("您还未点任何菜品！");
	}
	else if(document.getElementById("deskid").value=="请选择桌号"){
		alert("您还为选择餐桌！");
	}
	else if(document.getElementById("peoplenum").value=="请选择用餐人数"){
		alert("您还为选择用餐人数！");
	}
	else if(confirm(dingdan)){
		document.getElementById("dingdan").value = dingdan;
		document.getElementById("myform").submit();
	}
}
