<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html >
<html>
<head>
<meta charset="utf-8">
<title>添加</title>
<script type="text/javascript" src="js/jquery-2.1.1.js"></script>
<script type="text/javascript">
	$(function(){
		var op="${param.op}";
		if(op==1){
			window.close();
		}
	});
	
	function closeWindow(){
		window.close();
	}
</script>
</head>
<body>
	<form action="addFav.action" method="post">
		<p>名称:<input type="text" name="flabel" /></p>
		<p>链接:<input type="text" name="furl" /></p>
		<p>
			Tag:<input type="text" name="tags" /><br/>
			<span style="color: green; font-size: 12px; margin-left: 32px;">可以多个，用","分开</span>
		</p>
		<p>描述:<textarea name="fdesc" rows="" cols=""></textarea> </p>
		<input onclick="closeWindow()" type="button" value="取消" />&nbsp;&nbsp;
		<input type="submit" value="提交" />
	</form>
</body>
</html>