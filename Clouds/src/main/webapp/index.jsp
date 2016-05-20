<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@ taglib uri="/struts-tags" prefix="s"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>

<title>搜藏</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">

<link rel="stylesheet" type="text/css" href="css/styles.css">
<script type="text/javascript" src="js/jquery-2.1.1.js"></script>
<script type="text/javascript" src="js/index.js"></script>
<script type="text/javascript">
	var newWin;

	function ifwindwoclose(){
		if (newWin.closed == true) { 
			location.reload();
		} 
	}

	function add() {
		newWin = window.open(
			'add.jsp',
			'newwindow',
			'height=300, width=400, toolbar=no, menubar=no, scrollbars=no, resizable=no,location=no, status=no'
		);
		timer = window.setInterval("ifwindwoclose()",500);
	}
</script>
</head>
<body>
	<%-- <s:action name="fav_getAllFav" namespace="/" /> --%>
	<form name="favForm" method="post" action="">
		<input type="hidden" name="op" value="toList" />

		<div class="banner" valign="top">搜藏</div>

		<table cellspacing="0" cellpadding="0" border="0">
			<tr>
				<td style="text-align: right;" valign="top">
					<!-- 左边Tag列表 -->
					<div class="left_labels">
						<table id="tags" class="labels_table" cellspacing="0" cellpadding="0" border="0">
							<%-- <c:forEach items="${sessionScope.tags }" var="item">
								<tr>
									<td><a href="javascript:getFav('findFavByTag.action','${item.tname }')">${item.tname }</a></td>
								</tr>
							</c:forEach> --%>
						</table>
					</div>
				</td>
				<td>
					<!-- 右边fav内容 -->
					<div id="myfav" class="content_links">
					
						<%-- <c:forEach items="${sessionScope.allFav }" var="item">
							<div style="padding: 6px 10px;">
								<div>
									<a href="http://www.apache.org/struts/" style="color: blue; font-size: 18px;" target="_blank">
										${item.flabel}
									</a>
								</div>
								<div style="color: black; font-size: 16px;">${item.fdesc }</div>
								<div style="color: green; font-size: 14px;">${item.furl }</div>
							</div> 
						</c:forEach> --%>

					</div>
				</td>
			</tr>
		</table>

	</form>
</body>
</html>