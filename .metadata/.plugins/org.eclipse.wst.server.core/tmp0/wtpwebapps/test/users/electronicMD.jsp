<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">
<title>${title}</title>
<link href="css/css.css" rel="stylesheet" type="text/css" />
<link href="css/css_2.css" rel="stylesheet" type="text/css" />
<link href="css/nzcms_top.css" rel="stylesheet" type="text/css">
</head>

<body>
	<jsp:include page="header.jsp"></jsp:include>
	<table width="1004" border="0" align="center" cellpadding="1"
		cellspacing="10" bordercolor="#FFFFFF" bgcolor="#FFFFFF">
		<tr>
			<td align="center" valign="top" bgcolor="#FFFFFF" class="bg_qc">
				<table width="100%" height="27" border="0" cellpadding="8"
					cellspacing="0" bgcolor="#F6F6F6">
					<tr>
						<td align="left" class="p12">您的位置： <a href="<%=basePath%>">首页</a>&nbsp;&gt;&gt;&nbsp;我的电子病历
						</td>
					</tr>
				</table>
				<table width="95%" border="0" cellpadding="0" cellspacing="0">
					<tr>
						<td align="left">
							<div class="z" id="z">
								<table width="99%" border="0" cellpadding="5" cellspacing="1"
									bgcolor="#E0EDB7">
									<tr>
										<td height="30" colspan="13" align="left"
											background="images/nzcms/list_bg.gif" class="white14B">
											我的电子病历</td>
									</tr>
									<tr>
										<td align="center" bgcolor="#FFFFFF">病历号</td>
										<td align="center" bgcolor="#FFFFFF">患者姓名</td>										
										<td align="center" bgcolor="#FFFFFF">住院日期</td>
										<td align="center" bgcolor="#FFFFFF">出院日期</td>
										<td align="center" bgcolor="#FFFFFF">主治医生</td>
										<td align="center" bgcolor="#FFFFFF">CT</td>
										<td align="center" bgcolor="#FFFFFF">手术记录</td>
										<td align="center" bgcolor="#FFFFFF">血液检查</td>
										<td align="center" bgcolor="#FFFFFF">过敏药物</td>
										<td align="center" bgcolor="#FFFFFF">护理记录</td>
										<td align="center" bgcolor="#FFFFFF">病房</td>
										<td align="center" bgcolor="#FFFFFF">医嘱</td>
									</tr>
									<c:forEach items="${emdList}" var="emd">
										<tr align="center" bgcolor="#FFFFFF">
											<td align="center">${emd.dzblid}</td>
											<td align="center">${emd.usersid}</td>
											<td align="center">${emd.hospitalization_date}</td>
											<td align="center">${emd.discharge_date}</td>
											<td align="center">${emd.doctersid}</td>
											<td align="center"><image width=100 height=100 src="${emd.image}"></image> </td>
											<td align="center">${emd.operationrecords}</td>
											<td align="center">${emd.bloodtest}</td>
											<td align="center">${emd.allergydrugs}</td>
											<td align="center">${emd.nursingrecords}</td>
											<td align="center">${emd.ward}</td>
											<td align="center">${emd.advice}</td>
										</tr>
									</c:forEach>
								</table>
							</div>
						</td>
					</tr>
				</table>
			</td>
		</tr>
	</table>
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>
