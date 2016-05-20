<%@ page contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html >
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
<style type="text/css">
	a{
		text-decoration: none;
	}
</style>
<script type="text/javascript" src="js/jquery-2.1.1.js"></script>
<script type="text/javascript">
	var result="${param.result}";
	result=parseInt(result);
	if(result==1){
		alert("修改成功");
	} else if(result==0){
		alert("修改失败");
	} else{
		
	}
</script>
</head>
<body>
	<form action="profile_update.action?id=${sessionScope.profile.id }" method="post">
		<table border="1">
			<tr>
				<td>编号</td>
				<td><input type="text" disabled="disabled" placeholder="${sessionScope.profile.id }" /></td>
			</tr>
			<tr>
				<td>姓名</td>
				<td><input type="text" name="name" placeholder="${sessionScope.profile.name }" /></td>
			</tr>
			<tr>
				<td>生日</td>
				<td><input type="text" name="birthday" placeholder="${sessionScope.profile.birthday }" /></td>
			</tr>
			<tr>
				<td>性别</td>
				<td>
					<select id="sexSel" name="gender" >
						<option value="男">男</option>
						<option value="女">女</option>
						<script>
							var sex = "${sessionScope.profile.gender }";
							$("#sexSel option[value='"+sex+"']").attr("selected",true);
						</script>
					</select>
				</td>
			</tr>
			<tr>
				<td>职位</td>
				<td><input type="text" name="career" placeholder="${sessionScope.profile.career }" /></td>
			</tr>
			<tr>
				<td>地址</td>
				<td><input type="text" name="address" placeholder="${sessionScope.profile.address }" /></td>
			</tr>
			<tr>
				<td>电话</td>
				<td><input type="text" name="mobile" placeholder="${sessionScope.profile.mobile }" /></td>
			</tr>
		</table>
		<a href="profile_getAllProfiles.action"><input style="margin-top:20px;" type="button" value="返回" /></a>
		<input style="margin-top:20px;" type="submit" value="修改" />
	</form>
</body>
</html>