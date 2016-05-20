<%@ page contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>注   册</title>
<link type="text/css" rel="stylesheet" href="css/style.css" />
<script type="text/javascript" src="../js/jquery-2.1.1.js"></script>
<script type="text/javascript">
	function checkPwd(){
		var upwd=$("#upwd").val();
		var cupwd=$("#cupwd").val();
		var prompt=$("#prompt");
		if(upwd!=cupwd){
			prompt.show();
		} else{
			prompt.hide();
		}
	}
</script>
</head>
<body>
<div id="header" class="wrap">
	<img src="images/logo.gif" />
</div>
<div id="navbar" class="wrap">
	<div class="search">
	<!--  
		<form method="get" action="index.html">
			<input type="text" name="keywords" class="input-text" /><input type="submit" name="submit" class="input-button" value="" />
		</form>
	-->	
	</div>
</div>
<div id="register" class="box">
	<h2>新用户注册</h2>
	<div class="content">
	   <form method="post" action="User_register">
			<dl>
				<dt>用户ID：</dt>
				<dd>
					<input type="text" class="input-text" name="userId" placeholder="请输入ID"/>
				</dd>
				<dt>用户名：</dt>
				<dd>
					<input type="text" class="input-text" name="userName" placeholder="请输入用户名"/>
				</dd>
				<dt>密码：</dt>
				<dd>
					<input type="password" id="upwd" class="input-text" name="password" placeholder="请输入密码"/>
				</dd>
				<dt>确认密码：</dt>
				<dd>
					<input onblur="checkPwd()" type="password" id="cupwd" class="input-text" name="confirmPassword" placeholder="确认密码"/>
					<span hidden="hidden" style="margin-left:10px; color: red; font-size: 12px;" id="prompt">密码不一致</span>
				</dd>
				<dt></dt>
				<dd><input type="submit" class="input-button" value="" /></dd>
			</dl>
		</form>
		<div hidden="hidden" id="error" style="margin-left: 100px;color: red;font-size: 16px;" class="error">注册失败</div>
		<div class="error"></div>
	</div>
</div>
<div id="footer" class="wrap">
	源辰信息 &copy; 版权所有
</div>
</body>
</html>
