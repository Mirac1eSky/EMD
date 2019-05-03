<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="check_logstate.jsp"></jsp:include>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!doctype html>
<html lang="zh_CN">
<head>
<base href="<%=basePath%>" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
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
			<h1 class="page-title">病例信息列表</h1>
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
						<th class="text-center">操作</th>
					</tr>
				</thead>
				<c:forEach items="${emdList}" var="emd">
					<tr align="center">
						<td>${emd.dzblid}</td>
						<td>${emd.usersid}</td>
						<td>${emd.hospitalization_date}</td>
						<td>${emd.discharge_date}</td>
						<td>${emd.doctersid}</td>
						<td>${emd.ct}</td>
						<td>${emd.operationrecords}</td>
						<td>${emd.nursingrecords}</td>
						<td>${emd.bloodtest}</td>
						<td>${emd.allergydrugs}</td>
						<td>${emd.advice}</td>
						<td>${emd.ward}</td>
						<td><a href="dzbl/getDzblById.action?id=${emd.dzblid}"><i class="fa fa-pencil"></i></a>&nbsp;&nbsp;<a
							href="dzbl/deleteDzbl.action?id=${emd.dzblid}"
							onclick="{if(confirm('确定要删除吗?')){return true;}return false;}"><i class="fa fa-trash-o"></i></a></td>
					</tr>
				</c:forEach>
			</table>
			<div class="pagination">${html }</div>
		</div>
	</div>
</body>
</html>

