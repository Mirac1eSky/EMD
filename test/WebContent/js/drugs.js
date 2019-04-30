$(function() {

$("#dno").blur(
		function() {
			$("#dno_msg").empty();
			var name = $(this).val();
			if (name == "" || name == null) {
				$("#dno").after("<span id='dno_msg' style='color: red'>药品准字号不能为空</span>");
			}
	});

$("#drugsname").blur(
		function() {
			$("#drugsname_msg").empty();
			var name = $(this).val();
			if (name == "" || name == null) {
				$("#drugsname").after("<span id='drugsname_msg' style='color: red'>药品名称不能为空</span>");
			}
	});

$("#price").blur(
		function() {
			$("#price_msg").empty();
			var name = $(this).val();
			if (name == "" || name == null) {
				$("#price").after("<span id='price_msg' style='color: red'>单价不能为空</span>");
			}
	});

$("#productor").blur(
		function() {
			$("#productor_msg").empty();
			var name = $(this).val();
			if (name == "" || name == null) {
				$("#productor").after("<span id='productor_msg' style='color: red'>生产厂商不能为空</span>");
			}
	});

$("#memo").blur(
		function() {
			$("#memo_msg").empty();
			var name = $(this).val();
			if (name == "" || name == null) {
				$("#memo").after("<span id='memo_msg' style='color: red'>备注不能为空</span>");
			}
	});







$('#sub').click(function(){
var dno = $("#dno").val();
var drugsname = $("#drugsname").val();
var price = $("#price").val();
var productor = $("#productor").val();
var memo = $("#memo").val();
$("#dno_msg").empty();
$("#drugsname_msg").empty();
$("#price_msg").empty();
$("#productor_msg").empty();
$("#memo_msg").empty();
if (dno == "" || dno == null) {
	$("#dno").after("<span id='dno_msg' style='color: red'>药品准字号不能为空</span>");
	return false;
}
if (drugsname == "" || drugsname == null) {
	$("#drugsname").after("<span id='drugsname_msg' style='color: red'>药品名称不能为空</span>");
	return false;
}
if (price == "" || price == null) {
	$("#price").after("<span id='price_msg' style='color: red'>单价不能为空</span>");
	return false;
}
if (productor == "" || productor == null) {
	$("#productor").after("<span id='productor_msg' style='color: red'>生产厂商不能为空</span>");
	return false;
}
if (memo == "" || memo == null) {
	$("#memo").after("<span id='memo_msg' style='color: red'>备注不能为空</span>");
	return false;
}
});
$('#res').click(function() {
$("#dno_msg").empty();
$("#drugsname_msg").empty();
$("#price_msg").empty();
$("#productor_msg").empty();
$("#memo_msg").empty();
});

});
