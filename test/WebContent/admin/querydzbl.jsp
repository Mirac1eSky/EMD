<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%><%@ taglib prefix="c"
	uri="http://java.sun.com/jsp/jstl/core"%><jsp:include page="check_logstate.jsp"></jsp:include>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%><!doctype html>
<html lang="zh_CN">
<head>
<base href="<%=basePath%>" />
<title>欢迎使用后台管理系统</title>
<link rel="stylesheet" type="text/css" href="lib/bootstrap/css/bootstrap.css">
<link rel="stylesheet" href="lib/font-awesome/css/font-awesome.css">
<script src="lib/jquery-1.11.1.min.js" type="text/javascript"></script>
<link rel="stylesheet" type="text/css" href="stylesheets/theme.css">
<link rel="stylesheet" type="text/css" href="stylesheets/premium.css">
</head>
<body class=" theme-blue">
	<jsp:include page="top.jsp"></jsp:include>
	<jsp:include page="menu.jsp"></jsp:include>
	<div class="content">
		<div class="header">
			<h1 class="page-title">电子病历信息列表</h1>
		</div>
		<div class="main-content">
			<table class="table">
				<thead>
					<tr>
						<th class="text-center">病历号</th>
						<th class="text-center">患者姓名</th>
						<th class="text-center">住院日期</th>
						<th class="text-center">出院日期</th>
						<th class="text-center">主治医生</th>
						<th class="text-center">CT</th>
						<th class="text-center">手术记录</th>
						<th class="text-center">护理记录</th>
						<th class="text-center">血液检查</th>
						<th class="text-center">过敏药物</th>
						<th class="text-center">医嘱</th>
						<th class="text-center">病房</th>
					</tr>
				</thead>
				<c:forEach items="${dzblList}" var="dzbl">
					<tr align="center">
						<td class="center">${dzbl.dzblid}</td>
						<td class="center">${dzbl.usersid}</td>
						<td class="center">${dzbl.hospitalization date}</td>
						<td class="center">${dzbl.discharge date}</td>
						<td class="center">${dzbl.doctersid}</td>
						<td class="center">${dzbl.CT}</td>
						<td class="center">${dzbl.operation records}</td>
						<td class="center">${dzbl.nursing records}</td>
						<td class="center">${dzbl.blood test}</td>
						<td class="center">${dzbl.allergy drugs}</td>
						<td class="center">${dzbl.advice}</td>
						<td class="center">${dzbl.ward}</td>
					</tr>
				</c:forEach>
			</table>
			<ul class="pagination">
				<li>
					<form action="dzbl/queryDzblByCond.action" name="myform" method="post">
						<label>查询条件: <select name="cond" style="width: 100px">
								<option value="dzblid">按病历号查询</option>
								<option value="usersid">按患者姓名查询</option>
								<option value="hospitalization date">按住院日期查询</option>
								<option value="discharge date">按出院日期查询</option>
								<option value="doctersid">按主治医生查询</option>
								<option value="ward">按病房查询</option>
						</select>
						</label>&nbsp;&nbsp;&nbsp; <label>关键字: <input type="text" name="name" required style="width: 100px" /></label>&nbsp;&nbsp;&nbsp;
						<label><input type="submit" value="查询" class="mws-button green" /> </label>${html }
					</form>
				</li>
			</ul>
		</div>
	</div>
</body>
</html>
