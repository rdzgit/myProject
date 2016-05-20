<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>投票列表</title>
<link type="text/css" rel="stylesheet" href="css/style.css" />
<script type="text/javascript" src="js/jquery-2.1.1.js"></script>
<script type="text/javascript">
	var obj="${sessionScope.subjects }";
	if(obj!=null && !obj.length>0){
		location.href="subject_findAllSubject";
	}
</script>
<script type="text/javascript" src="js/update.js"></script>
</head>
<body>
	<div id="header" class="wrap">
		<img src="images/logo.gif" />
	</div>
	<div id="navbar" class="wrap">
		<div class="profile">
			您好，${sessionScope.currentUser.userName } <span class="return">
			<a href="#">返回列表</a></span> <span class="addnew">
			<a href="add.jsp">添加新投票</a></span> <span class="modify">
			<a href="javascript:showUpdate()">维护</a></span>
		</div>
		<div class="search">
			<form method="post" action="subject_search.action">
				<input type="text" name="keywords" class="input-text" value="" />
				<input type="submit" name="submit" class="input-button" value="" />
			</form>
		</div>
	</div>

	<div id="vote" class="wrap">
		<h2>投票列表</h2>
		<ul class="list">
 			<c:forEach items="${sessionScope.subjects}" var="item">
				<li class="odd">
					<h4>
						<!-- Subject [id=16, title=aa, type=1, version=1, options=[Option [name=aa], Option [name= aaa]]] -->
						<a href="subject_gotoSubject.action?id=${item.id }">
							${item.title }
						</a>
					</h4>
					<div class="join">
						<a class="joina" href="subject_gotoSubject.action?id=${item.id }">我要参与</a>
						<a class="update" href="subject_gotoUpdate.action?id=${item.id }">维护</a>
					</div>
					<p class="info">共有 ${item.optionsSize } 个选项，已有${item.usersSize }个网友参与了投票。</p>
				</li>
			</c:forEach>

		</ul>
	</div>
	<div id="footer" class="wrap">源辰信息 &copy; 版权所有</div>
</body>
</html>
