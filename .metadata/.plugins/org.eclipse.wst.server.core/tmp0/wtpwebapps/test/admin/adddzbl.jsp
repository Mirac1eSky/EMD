<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="check_logstate.jsp"></jsp:include>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
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
<script type="text/javascript" src="js/dzbl.js" charset="utf-8"></script>
<script type="text/javascript" src="js/selimage.js" charset="utf-8"></script>
<script type="text/javascript" src="<%=basePath%>My97DatePicker/WdatePicker.js" charset="utf-8"></script>
</head>
<body class=" theme-blue">
	<jsp:include page="top.jsp"></jsp:include>
	<jsp:include page="menu.jsp"></jsp:include>
	<div class="content">
		<div class="header">
			<h1 class="page-title">新增电子病历信息</h1>
		</div>
		<div class="main-content">
			<div class="row">
				<div class="col-md-6 col-md-offset-3">
					<div id="myTabContent" class="tab-content">
						<form action="electronicmd/addElectronicMD.action" name="myform" method="post" onsubmit="return check()" class="form">
							<div class="tab-pane active in" id="home">
								<div class="form-group">
									<label>病历号</label> <input type="text" name="dzblid" class="form-control" id="dzblid" placeholder="请输入病历号" />
								</div>
							</div>
							<div class="tab-pane active in" id="home">
								<div class="form-group">
									<label>患者姓名</label> <input type="text" name="usersid" class="form-control" id="usersid" placeholder="请输入患者姓名" />
								</div>
							</div>
							<div class="tab-pane active in" id="home">
								<div class="form-group">
									<label>住院日期</label> <input type="text" name="hospitalization_date" class="form-control" id="hospitalization_date" placeholder="请输入住院日期" />
								</div>
							</div>
							<div class="tab-pane active in" id="home">
								<div class="form-group">
									<label>出院日期</label> <input type="text" name="discharge_date" class="form-control" id="discharge_date" placeholder="请输入出院日期" />
								</div>
							</div>
							<div class="tab-pane active in" id="home">
								<div class="form-group">
									<label>主治医生</label> <input type="text" name="doctersid" class="form-control" id="doctersid" placeholder="请输入主治医生"/>
								</div>
							</div>
							<div class="tab-pane active in" id="home">
								<div class="form-group">
								<label>CT</label> 
								<script type="text/javascript" src="js/selimage.js"></script>
								<input   class="form-control" type="text" name="image" id="image" onclick="selimage();"
										placeholder="请选择图片" readonly="readonly" />
								</div>
							</div>
							<div class="tab-pane active in" id="home">
								<div class="form-group">
									<label>手术记录</label> <input name="operationrecords" class="form-control" id="operationrecords" placeholder="请输入手术记录"/>
								</div>
							</div>
							<div class="tab-pane active in" id="home">
								<div class="form-group">
									<label>护理记录</label> <input type="text" name="nursingrecords" class="form-control" id="nursingrecords" placeholder="请输入护理记录" />
								</div>
							</div>
							<div class="tab-pane active in" id="home">
								<div class="form-group">
									<label>血液检查</label> <input type="text" name="bloodtest" class="form-control" id="bloodtest" placeholder="请输入血液检查"/>
								</div>
							</div>
							<div class="tab-pane active in" id="home">
								<div class="form-group">
									<label>过敏药物</label> <input type="text" name="allergydrugs" class="form-control" id="allergydrugs" placeholder="请输入过敏药物" />
								</div>
							</div>
							<div class="tab-pane active in" id="home">
								<div class="form-group">
									<label>医嘱</label> <input type="text" name="advice" class="form-control" id="advice" placeholder="请输入医嘱" />
								</div>
							</div>
							<div class="tab-pane active in" id="home">
								<div class="form-group">
									<label>病房</label> <input type="text" name="ward" class="form-control" id="ward" placeholder="请输入病房" />
								</div>
							</div>

 							
							<div>
								<button type="submit" id="sub" class="btn btn-primary">提交保存</button>
								&nbsp;&nbsp;&nbsp;
								<button type="reset" id="res" class="btn btn-primary">取消重置</button>
							 </div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>
