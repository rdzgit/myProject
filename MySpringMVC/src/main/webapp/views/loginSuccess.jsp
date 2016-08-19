<%@ page contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html >
<html>
<head>
<meta charset="utf-8">
<title>成功</title>
</head>
<body>
	<h1>${sessionScope.user.uname }登录成功!!!</h1>
	<h2>欢迎您,${sessionScope.uname }</h2>
</body>
</html>