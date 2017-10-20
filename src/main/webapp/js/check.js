function checkRegi(){
	
}
function checkPwd(){
	var pw1 = document.getElementById("pw1").value;
	var pw2 = document.getElementById("pw2").value;
	var status = document.getElementById("status");
	if (pw1 != pw2){
		status.innerHTML = "两次输入的密码不一样";
		return false;
	}
	else{
		status.innerHTML = "";
		return true;
	}
}
function checkTel(){
	var status = document.getElementById("status");
	var tel = document.getElementById("tel").value;
	if( tel.length != 11 ){
		status.innerHTML = "手机号长度不对，应为11位"	;
		return false;
	}
	else{
		status.innerHTML = "";
		return true;
	}
}
