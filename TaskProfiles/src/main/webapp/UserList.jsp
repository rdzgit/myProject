<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html >
<html>
<head>
<meta charset="utf-8">
<title>用户列表</title>
<style type="text/css">
	td{
		min-width: 120px;
	}
	
	a{
		text-decoration: none;
	}
</style>
<script type="text/javascript" src="js/jquery-2.1.1.js"></script>
</head>
<body>
	<s:action name="profile_getAllProfiles" namespace="/" />
	<table border="1" style="text-align: center;">
		<thead>
			<tr bgcolor="yellow">
	    		<th>编号</th>
	    		<th>姓名</th>
	    		<th>生日</th>
	    		<th>性别</th>
	    		<th>职业</th>
	    		<th>住所</th>
	    		<th>电话</th>
	    		<th>操作</th>
	  		</tr>
	  	</thead>
	  	<tbody>
	  		<c:choose>
	  			<c:when test="${not empty sessionScope.profiles }">
	  				 <c:forEach items="${ sessionScope.profiles}" var="item">
				  		<tr>
				    		<td>${item.id }</td>
				    		<td>${item.name }</td>
				    		<td>${item.birthday }</td>
				    		<td>${item.gender }</td>
				    		<td>${item.career }</td>
				    		<td>${item.address }</td>
				    		<td>${item.mobile }</td>
				    		<td>
				    			<a href="profile_detail.action?id=${item.id }"><input type="button" value="明细" /></a>
				    			<a href="profile_gotoUpdate.action?id=${item.id }"><input type="button" value="操作" /></a>
				    		</td>
				  		</tr>
			  		</c:forEach>
	  			</c:when>
	  			<c:otherwise>
	  				<span>暂无数据</span>
	  			</c:otherwise>
	  		</c:choose>
	  	</tbody>
	</table>
</body>
</html>