<%@ page contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html >
<html>
<head>
<meta charset="utf-8">
<title>用户明细</title>
<style type="text/css">
	a{
		text-decoration: none;
	}
</style>
</head>
<body>
	<table border="1">
		<tr>
			<td>编号</td>
			<td>${sessionScope.profile.id }</td>
		</tr>
		<tr>
			<td>姓名</td>
			<td>${sessionScope.profile.name }</td>
		</tr>
		<tr>
			<td>生日</td>
			<td>${sessionScope.profile.birthday }</td>
		</tr>
		<tr>
			<td>性别</td>
			<td>${sessionScope.profile.gender }</td>
		</tr>
		<tr>
			<td>职位</td>
			<td>${sessionScope.profile.career }</td>
		</tr>
		<tr>
			<td>地址</td>
			<td>${sessionScope.profile.address }</td>
		</tr>
		<tr>
			<td>电话</td>
			<td>${sessionScope.profile.mobile }</td>
		</tr>
	</table>
	<a href="profile_getAllProfiles.action"><input style="margin-top:20px;" type="button" value="返回" /></a>
</body>
</html>