<%@ page contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>参与投票</title>
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
	<h2>参与投票</h2>
	<ul class="list">
		<li>
			<h4>${sessionScope.currentSubject.title }</h4>
 			<p class="info">共有${sessionScope.currentSubject.optionsSize }个选项，已有 ${sessionScope.currentSubject.usersSize }个网友参与了投票。</p>
			<form method="post" action="item_addItem">
			    <input type="hidden" name="sid" value="${sessionScope.currentSubject.id }"/> 
			    <input type="hidden" name="uid" value="${sessionScope.currentUser.userId }"/> 
				<ol>
					<c:if test="${1==sessionScope.currentSubject.type }">
						<c:forEach items="${sessionScope.currentSubject.options }" var="item">
							<li>
								<input type="radio" name="oid" value="${item.id }"/>${item.name }
							</li>
						</c:forEach>
					</c:if>
					
					<c:if test="${2==sessionScope.currentSubject.type }">
						<c:forEach items="${sessionScope.currentSubject.options }" var="item">
							<li>
								<input type="checkbox" name="oid" value="${item.id }"/>${item.name }
							</li>
						</c:forEach>
					</c:if>
					
				</ol>
				<p class="voteView">
					<input type="image" src="images/button_vote.gif" />
					<a href="item_showDetail.action?sid=${sessionScope.currentSubject.id }">
						<img src="images/button_view.gif" />
					</a>
				</p>
			</form>
		</li>
	</ul>
</div>
<div id="footer" class="wrap">
	源辰信息 &copy; 版权所有
</div>
</body>
</html>
