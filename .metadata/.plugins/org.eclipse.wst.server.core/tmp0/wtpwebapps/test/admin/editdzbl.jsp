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
<script type="text/javascript" src="js/doctor.js" charset="utf-8"></script>
<script type="text/javascript" src="js/selimage.js" charset="utf-8"></script>
<script type="text/javascript" src="<%=basePath%>My97DatePicker/WdatePicker.js" charset="utf-8"></script>
</head>
<body class=" theme-blue">
	<jsp:include page="top.jsp"></jsp:include>
	<jsp:include page="menu.jsp"></jsp:include>
	<div class="content">
		<div class="header">
			<h1 class="page-title">编辑电子病历信息</h1>
		</div>
		<div class="main-content">
			<div class="row">
				<div class="col-md-6 col-md-offset-3">
					<div id="myTabContent" class="tab-content">
						<form action="dzbl/updateDzbl.action" name="myform" method="post" onsubmit="return check()" class="form">

							<div class="tab-pane active in" id="home">
								<div class="form-group">
									<label>病历号</label> <input type="text" name="dzblid" class="form-control" id="dzblid"
										value="${dzbl.dzblid}" />
								</div>
							</div>
							<div class="tab-pane active in" id="home">
							  <div class="form-group">
							      <label>患者姓名</label> <input type="text" name="usersid" class="form-control" id="usersid"
							          value="${dzbl.usersid }"/>
							</div>
							    </div>
							<div class="tab-pane active in" id="home">
								<div class="form-group">
									<label>住院日期</label> <input type="text" name=" hospitalization date" class="form-control" id=" hospitalization date"
										value="${dzbl. hospitalization date}" />
								</div>
							</div>
							<div class="tab-pane active in" id="home">
								<div class="form-group">
									<label>出院日期</label> <input type="text" name=" discharge date" class="from-control" id=" discharge date"
									   value="${dzbl.discharge date }" />
								</div>
							</div>
							<div class="tab-pane active in" id="home">
								<div class="form-group">
									<label>主治医生</label> <input type="text" name="doctersid" class="form-control" id="doctersid"
										value="${dzbl.doctersid}" />
								</div>
							</div>
							<div class="tab-pane active in" id="home">
								<div class="form-group">
									 <label>CT</label>
									<script type="text/javascript" src="js/selimage.js"></script>
									<input class="form-control" type="text" name="CT" value="${dzbl.CT}" id="CT" onclick="selimage();"
										readonly="readonly" />
								</div>
							</div>
							<div class="tab-pane active in" id="home">
								<div class="form-group">
									<label>手术记录</label> <input type="text" name="operation records" class="form-control" id="operation records"
									    value="${dzbl.operation records }"/>
								</div>
							</div>
							<div class="tab-pane active in" id="home">
							    <div class="form-group">
							       <label>护理记录</label> <input type="text" name="nursing records" class="form-control" id="nursing records"
							            value="${dzbl.nursing records }"/>
							    </div>
							</div>
							<div class="tab-pane active in" id="home">
								<div class="form-group">
									<label>血液检查</label> <input type="text" name="blood test" class="form-control" id="blood test" value="${dzbl.blood test}" />
								</div>
							</div>
							<div class="tab-pane active in" id="home">
								<div class="form-group">
									<label>过敏药物</label> <input type="text" name="allergy drugs" class="form-control" id="allergy drugs" value="${dzbl.allergy drugs}" />
								</div>
							</div>
							<div class="tab-pane active in" id="home">
								<div class="form-group">
									<label>医嘱</label> <input type="text" name="advice" class="form-control" id="advice" value="${dzbl.advice }"/>	 
								</div>
							</div>
							<div class="tab-pane active in" id="home">
								<div class="form-group">
									<label>病房</label> <input type="text" name="ward" class="form-control" id="ward" value="${dzbl.ward }"/> 
									<script type="text/javascript">
										CKEDITOR.replace('contents', {
											language : 'zh-cn'
										});
									</script>
								</div>
							</div>
							<div>
								<input type="hidden" name="dzblid" id="dzblid" value="${dzbl.dzblid}" /><input type="hidden"
									name="password" id="password" value="${dzbl.password}" />

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

