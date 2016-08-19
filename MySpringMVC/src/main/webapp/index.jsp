<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html >
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-2.1.1.min.js"></script>
<script type="text/javascript">
	function jsonTest() {
		$.post("mvc/json", function(data) {
			console.info(data.list);
			$.each(data,function(index,item){
				console.info(item);
			});
		});
	}
</script>
</head>
<body>
	<form method="post" action="mvc/show">
		<input type="text" name="uname" /> <br />
		<br /> <input type="password" name="pwd" /> <br />
		<br /> <input type="submit" value="传参测试" />
	</form>
	<br />
	<br />

	<a href="mvc/view">来试试springMVC的控制粒度</a>
	<br />
	<br />

	<button onclick="jsonTest()">json测试</button>
	<br />
	<br />
	
	<form action="mvc/file" method="post" enctype="multipart/form-data">
		<input type="file" name="myfile"/>
		<input type="submit" value="上传文件" />
	</form>
</body>
</html>