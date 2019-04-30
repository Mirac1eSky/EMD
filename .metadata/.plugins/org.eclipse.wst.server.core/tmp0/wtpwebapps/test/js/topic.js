$(function() {

$("#tno").blur(
		function() {
			$("#tno_msg").empty();
			var name = $(this).val();
			if (name == "" || name == null) {
				$("#tno").after("<span id='tno_msg' style='color: red'>单号不能为空</span>");
			}
	});

$("#usersid").blur(
		function() {
			$("#usersid_msg").empty();
			var name = $(this).val();
			if (name == "" || name == null) {
				$("#usersid").after("<span id='usersid_msg' style='color: red'>用户不能为空</span>");
			}
	});

$("#doctorid").blur(
		function() {
			$("#doctorid_msg").empty();
			var name = $(this).val();
			if (name == "" || name == null) {
				$("#doctorid").after("<span id='doctorid_msg' style='color: red'>医生不能为空</span>");
			}
	});

$("#num").blur(
		function() {
			$("#num_msg").empty();
			var name = $(this).val();
			if (name == "" || name == null) {
				$("#num").after("<span id='num_msg' style='color: red'>评分不能为空</span>");
			}
	});

$("#contents").blur(
		function() {
			$("#contents_msg").empty();
			var name = $(this).val();
			if (name == "" || name == null) {
				$("#contents").after("<span id='contents_msg' style='color: red'>内容不能为空</span>");
			}
	});

$("#addtime").blur(
		function() {
			$("#addtime_msg").empty();
			var name = $(this).val();
			if (name == "" || name == null) {
				$("#addtime").after("<span id='addtime_msg' style='color: red'>日期不能为空</span>");
			}
	});







$('#sub').click(function(){
var tno = $("#tno").val();
var usersid = $("#usersid").val();
var doctorid = $("#doctorid").val();
var num = $("#num").val();
var contents = $("#contents").val();
var addtime = $("#addtime").val();
$("#tno_msg").empty();
$("#usersid_msg").empty();
$("#doctorid_msg").empty();
$("#num_msg").empty();
$("#contents_msg").empty();
$("#addtime_msg").empty();
if (tno == "" || tno == null) {
	$("#tno").after("<span id='tno_msg' style='color: red'>单号不能为空</span>");
	return false;
}
if (usersid == "" || usersid == null) {
	$("#usersid").after("<span id='usersid_msg' style='color: red'>用户不能为空</span>");
	return false;
}
if (doctorid == "" || doctorid == null) {
	$("#doctorid").after("<span id='doctorid_msg' style='color: red'>医生不能为空</span>");
	return false;
}
if (num == "" || num == null) {
	$("#num").after("<span id='num_msg' style='color: red'>评分不能为空</span>");
	return false;
}
if (contents == "" || contents == null) {
	$("#contents").after("<span id='contents_msg' style='color: red'>内容不能为空</span>");
	return false;
}
if (addtime == "" || addtime == null) {
	$("#addtime").after("<span id='addtime_msg' style='color: red'>日期不能为空</span>");
	return false;
}
});
$('#res').click(function() {
$("#tno_msg").empty();
$("#usersid_msg").empty();
$("#doctorid_msg").empty();
$("#num_msg").empty();
$("#contents_msg").empty();
$("#addtime_msg").empty();
});

});
