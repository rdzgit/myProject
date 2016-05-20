<%@ page contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title></title>
<link type="text/css" rel="stylesheet" href="css/style.css" />
</head>
<body>
 
<div id="header" class="wrap">
	<img src="images/logo.gif" />
</div>
<div id="navbar" class="wrap">
	<div class="profile">
		<span>您好，${sessionScope.currentUser.userName }</span>
		<span class="return"><a href="subject_findAllSubject">返回列表</a></span>
		<span class="addnew"><a href="add.jsp">添加新投票</a></span>
		<span class="modify"><a href="subject_gotoUpdate.action?id=${sessionScope.currentSubject.id }">维护</a></span>
		
	</div>
	<div class="search">
		<form method="post" action="Subject!search.action">
			<input type="text" name="keywords" class="input-text" value=""/><input type="submit" name="submit" class="input-button" value="" />
		</form>
	</div>
</div>

<div id="vote" class="wrap">
	<h2>查看投票</h2>
	<ul class="list">
		<li>
			<h4>${sessionScope.viewInfo[0].subject.title }</h4>
			<p class="info">共有 ${sessionScope.oNum } 个选项，已有${sessionScope.viewInfo[0].sumNum } 个网友参与了投票。</p>
				<ol>
				  	<c:forEach items="${sessionScope.viewInfo }" var="item">
						<li>
							<div class="rate">
 								<div class="ratebg"><div class="percent" style="width:${item.proportion }%"></div></div>
								<p>${item.num }票<span>(${item.proportion }%)</span></p> 
							</div>
						</li>
				  	</c:forEach>
				</ol>
				<div class="goback"><a href="subject_getAllSubject">返回投票列表</a></div>
		</li>
	</ul>
</div>
<div id="footer" class="wrap">
	源辰信息 &copy; 版权所有
</div>
</body>
</html>
