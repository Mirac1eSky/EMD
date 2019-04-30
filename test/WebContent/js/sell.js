$(function() {

$("#sno").blur(
		function() {
			$("#sno_msg").empty();
			var name = $(this).val();
			if (name == "" || name == null) {
				$("#sno").after("<span id='sno_msg' style='color: red'>处方单号不能为空</span>");
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

$("#drugsid").blur(
		function() {
			$("#drugsid_msg").empty();
			var name = $(this).val();
			if (name == "" || name == null) {
				$("#drugsid").after("<span id='drugsid_msg' style='color: red'>药品不能为空</span>");
			}
	});

$("#num").blur(
		function() {
			$("#num_msg").empty();
			var name = $(this).val();
			if (name == "" || name == null) {
				$("#num").after("<span id='num_msg' style='color: red'>数量不能为空</span>");
			}
	});

$("#total").blur(
		function() {
			$("#total_msg").empty();
			var name = $(this).val();
			if (name == "" || name == null) {
				$("#total").after("<span id='total_msg' style='color: red'>总计不能为空</span>");
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
var sno = $("#sno").val();
var doctorid = $("#doctorid").val();
var drugsid = $("#drugsid").val();
var num = $("#num").val();
var total = $("#total").val();
var addtime = $("#addtime").val();
$("#sno_msg").empty();
$("#doctorid_msg").empty();
$("#drugsid_msg").empty();
$("#num_msg").empty();
$("#total_msg").empty();
$("#addtime_msg").empty();
if (sno == "" || sno == null) {
	$("#sno").after("<span id='sno_msg' style='color: red'>处方单号不能为空</span>");
	return false;
}
if (doctorid == "" || doctorid == null) {
	$("#doctorid").after("<span id='doctorid_msg' style='color: red'>医生不能为空</span>");
	return false;
}
if (drugsid == "" || drugsid == null) {
	$("#drugsid").after("<span id='drugsid_msg' style='color: red'>药品不能为空</span>");
	return false;
}
if (num == "" || num == null) {
	$("#num").after("<span id='num_msg' style='color: red'>数量不能为空</span>");
	return false;
}
if (total == "" || total == null) {
	$("#total").after("<span id='total_msg' style='color: red'>总计不能为空</span>");
	return false;
}
if (addtime == "" || addtime == null) {
	$("#addtime").after("<span id='addtime_msg' style='color: red'>日期不能为空</span>");
	return false;
}
});
$('#res').click(function() {
$("#sno_msg").empty();
$("#doctorid_msg").empty();
$("#drugsid_msg").empty();
$("#num_msg").empty();
$("#total_msg").empty();
$("#addtime_msg").empty();
});

});
