$(function() {

$("#dzblid").blur(
		function() {
			$("#dzblid_msg").empty();
			var name = $(this).val();
			if (name == "" || name == null) {
				$("#dzblid").after("<span id='dzblid_msg' style='color: red'>病历号不能为空</span>");
			}
	});

$("#usersid").blur(
		function() {
			$("#usersid_msg").empty();
			var name = $(this).val();
			if (name == "" || name == null) {
				$("#usersid").after("<span id='usersid_msg' style='color: red'>用户名不能为空</span>");
			}
	});

$("#hospitalization_date").blur(
		function() {
			$("#hospitalization_date_msg").empty();
			var name = $(this).val();
			if (name == "" || name == null) {
				$("#hospitalization_date").after("<span id='hospitalization_date_msg' style='color: red'>住院日期不能为空</span>");
			}
	});

$("#discharge_date").blur(
		function() {
			$("#discharge_date_msg").empty();
			var name = $(this).val();
			if (name == "" || name == null) {
				$("#discharge_date").after("<span id='discharge_date_msg' style='color: red'>出生日期不能为空</span>");
			}
	});

$("#doctersid").blur(
		function() {
			$("#doctersid_msg").empty();
			var name = $(this).val();
			if (name == "" || name == null) {
				$("#doctersid").after("<span id='doctersid_msg' style='color: red'>所在医院不能为空</span>");
			}
	});

$("#operationrecords").blur(
		function() {
			$("#operationrecords_msg").empty();
			var name = $(this).val();
			if (name == "" || name == null) {
				$("#operationrecords").after("<span id='operationrecords_msg' style='color: red'>科室不能为空</span>");
			}
	});

$("#nursingrecords").blur(
		function() {
			$("#nursingrecords_msg").empty();
			var name = $(this).val();
			if (name == "" || name == null) {
				$("#nursingrecords").after("<span id='nursingrecords_msg' style='color: red'>学历不能为空</span>");
			}
	});

$("#bloodtest").blur(
		function() {
			$("#bloodtest_msg").empty();
			var name = $(this).val();
			if (name == "" || name == null) {
				$("#bloodtest").after("<span id='bloodtest_msg' style='color: red'>毕业院校不能为空</span>");
			}
	});

$("#image").blur(
		function() {
			$("#image_msg").empty();
			var name = $(this).val();
			if (name == "" || name == null) {
				$("#image").after("<span id='image_msg' style='color: red'>照片不能为空</span>");
			}
	});

$("#allergydrugs").blur(
		function() {
			$("#allergydrugs_msg").empty();
			var name = $(this).val();
			if (name == "" || name == null) {
				$("#allergydrugs").after("<span id='allergydrugs_msg' style='color: red'>医生介绍不能为空</span>");
			}
	});
$("#advice").blur(
		function() {
			$("#advice_msg").empty();
			var name = $(this).val();
			if (name == "" || name == null) {
				$("#advice").after("<span id='advice_msg' style='color: red'>医嘱不能为空</span>");
			}
	});
$("#ward").blur(
		function() {
			$("#ward_msg").empty();
			var name = $(this).val();
			if (name == "" || name == null) {
				$("#ward").after("<span id='ward_msg' style='color: red'>病房不能为空</span>");
			}
	});






$('#sub').click(function(){
var dzblid = $("#dzblid").val();
var usersid = $("#usersid").val();
var hospitalization_date = $("#hospitalization_date").val();
var discharge_date = $("#discharge_date").val();
var doctersid = $("#doctersid").val();
var operationrecords = $("#operationrecords").val();
var nursingrecords = $("#nursingrecords").val();
var bloodtest = $("#bloodtest").val();
var image = $("#image").val();
var allergydrugs = $("#allergydrugs").val();
var advice = $("#advice").val();
var ward = $("#ward").val();
$("#dzblid_msg").empty();
$("#usersid_msg").empty();
$("#hospitalization_date_msg").empty();
$("#discharge_date_msg").empty();
$("#doctersid_msg").empty();
$("#operationrecords_msg").empty();
$("#nursingrecords_msg").empty();
$("#bloodtest_msg").empty();
$("#image_msg").empty();
$("#allergydrugs_msg").empty();
$("#advice_msg").empty();
$("#ward_msg").empty();
if (dzblid == "" || dzblid == null) {
	$("#dzblid").after("<span id='dzblid_msg' style='color: red'>用户名不能为空</span>");
	return false;
}
if (usersid == "" || usersid == null) {
	$("#usersid").after("<span id='usersid_msg' style='color: red'>密码不能为空</span>");
	return false;
}
if (hospitalization_date == "" || hospitalization_date == null) {
	$("#hospitalization_date").after("<span id='hospitalization_date_msg' style='color: red'>姓名不能为空</span>");
	return false;
}
if (discharge_date == "" || discharge_date == null) {
	$("#discharge_date").after("<span id='discharge_date_msg' style='color: red'>出生日期不能为空</span>");
	return false;
}
if (doctersid == "" || doctersid == null) {
	$("#doctersid").after("<span id='doctersid_msg' style='color: red'>所在医院不能为空</span>");
	return false;
}
if (operationrecords == "" || operationrecords == null) {
	$("#operationrecords").after("<span id='operationrecords_msg' style='color: red'>科室不能为空</span>");
	return false;
}
if (nursingrecords == "" || nursingrecords == null) {
	$("#nursingrecords").after("<span id='nursingrecords_msg' style='color: red'>学历不能为空</span>");
	return false;
}
if (bloodtest == "" || bloodtest == null) {
	$("#bloodtest").after("<span id='bloodtest_msg' style='color: red'>毕业院校不能为空</span>");
	return false;
}
if (image == "" || image == null) {
	$("#image").after("<span id='image_msg' style='color: red'>照片不能为空</span>");
	return false;
}
if (allergydrugs == "" || allergydrugs == null) {
	$("#allergydrugs").after("<span id='allergydrugs_msg' style='color: red'>医生介绍不能为空</span>");
	return false;
}
if (advice == "" || advice == null) {
	$("#advice").after("<span id='advice_msg' style='color: red'>医嘱不能为空</span>");
	return false;
}
if (ward == "" || ward == null) {
	$("#ward").after("<span id='ward_msg' style='color: red'>病房能为空</span>");
	return false;
}
});
$('#res').click(function() {
$("#dzblid_msg").empty();
$("#usersid_msg").empty();
$("#hospitalization_date_msg").empty();
$("#discharge_date_msg").empty();
$("#doctersid_msg").empty();
$("#operationrecords_msg").empty();
$("#nursingrecords_msg").empty();
$("#bloodtest_msg").empty();
$("#image_msg").empty();
$("#allergydrugs_msg").empty();
$("#advice_msg").empty();
$("#ward_msg").empty();

});

});
