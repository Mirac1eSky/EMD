$(function() {

$("#hospitalname").blur(
		function() {
			$("#hospitalname_msg").empty();
			var name = $(this).val();
			if (name == "" || name == null) {
				$("#hospitalname").after("<span id='hospitalname_msg' style='color: red'>医院名称不能为空</span>");
			}
	});

$("#address").blur(
		function() {
			$("#address_msg").empty();
			var name = $(this).val();
			if (name == "" || name == null) {
				$("#address").after("<span id='address_msg' style='color: red'>联系地址不能为空</span>");
			}
	});

$("#contact").blur(
		function() {
			$("#contact_msg").empty();
			var name = $(this).val();
			if (name == "" || name == null) {
				$("#contact").after("<span id='contact_msg' style='color: red'>联系方式不能为空</span>");
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
var hospitalname = $("#hospitalname").val();
var address = $("#address").val();
var contact = $("#contact").val();
var memo = $("#memo").val();
$("#hospitalname_msg").empty();
$("#address_msg").empty();
$("#contact_msg").empty();
$("#memo_msg").empty();
if (hospitalname == "" || hospitalname == null) {
	$("#hospitalname").after("<span id='hospitalname_msg' style='color: red'>医院名称不能为空</span>");
	return false;
}
if (address == "" || address == null) {
	$("#address").after("<span id='address_msg' style='color: red'>联系地址不能为空</span>");
	return false;
}
if (contact == "" || contact == null) {
	$("#contact").after("<span id='contact_msg' style='color: red'>联系方式不能为空</span>");
	return false;
}
if (memo == "" || memo == null) {
	$("#memo").after("<span id='memo_msg' style='color: red'>备注不能为空</span>");
	return false;
}
});
$('#res').click(function() {
$("#hospitalname_msg").empty();
$("#address_msg").empty();
$("#contact_msg").empty();
$("#memo_msg").empty();
});

});
