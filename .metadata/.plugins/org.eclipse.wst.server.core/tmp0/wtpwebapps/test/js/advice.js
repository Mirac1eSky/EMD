$(function() {

$("#ano").blur(
		function() {
			$("#ano_msg").empty();
			var name = $(this).val();
			if (name == "" || name == null) {
				$("#ano").after("<span id='ano_msg' style='color: red'>病历号不能为空</span>");
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







$('#sub').click(function(){
var ano = $("#ano").val();
var contents = $("#contents").val();
$("#ano_msg").empty();
$("#contents_msg").empty();
if (ano == "" || ano == null) {
	$("#ano").after("<span id='ano_msg' style='color: red'>病历号不能为空</span>");
	return false;
}
if (contents == "" || contents == null) {
	$("#contents").after("<span id='contents_msg' style='color: red'>内容不能为空</span>");
	return false;
}
});
$('#res').click(function() {
$("#ano_msg").empty();
$("#contents_msg").empty();
});

});
