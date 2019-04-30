package com.action;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.entity.Hospital;
import com.service.HospitalService;
import com.util.PageHelper;

//定义为控制器
@Controller
// 设置路径
@RequestMapping(value = "/hospital", produces = "text/plain;charset=utf-8")
public class HospitalAction extends BaseAction {
	// 注入Service 由于标签的存在 所以不需要getter setter
	@Autowired
	@Resource
	private HospitalService hospitalService;

	// 准备添加数据
	@RequestMapping("createHospital.action")
	public String createHospital() {
		return "admin/addhospital";
	}

	// 添加数据
	@RequestMapping("addHospital.action")
	public String addHospital(Hospital hospital) {
		this.hospitalService.insertHospital(hospital);
		return "redirect:/hospital/createHospital.action";
	}

	// 通过主键删除数据
	@RequestMapping("deleteHospital.action")
	public String deleteHospital(String id) {
		this.hospitalService.deleteHospital(id);
		return "redirect:/hospital/getAllHospital.action";
	}

	// 批量删除数据
	@RequestMapping("deleteHospitalByIds.action")
	public String deleteHospitalByIds() {
		String[] ids = this.getRequest().getParameterValues("hospitalid");
		for (String hospitalid : ids) {
			this.hospitalService.deleteHospital(hospitalid);
		}
		return "redirect:/hospital/getAllHospital.action";
	}

	// 更新数据
	@RequestMapping("updateHospital.action")
	public String updateHospital(Hospital hospital) {
		this.hospitalService.updateHospital(hospital);
		return "redirect:/hospital/getAllHospital.action";
	}

	// 显示全部数据
	@RequestMapping("getAllHospital.action")
	public String getAllHospital(String number) {
		List<Hospital> hospitalList = this.hospitalService.getAllHospital();
		PageHelper.getPage(hospitalList, "hospital", null, null, 10, number, this.getRequest(), null);
		return "admin/listhospital";
	}

	// 按条件查询数据 (模糊查询)
	@RequestMapping("queryHospitalByCond.action")
	public String queryHospitalByCond(String cond, String name, String number) {
		Hospital hospital = new Hospital();
		if (cond != null) {
			if ("hospitalname".equals(cond)) {
				hospital.setHospitalname(name);
			}
			if ("address".equals(cond)) {
				hospital.setAddress(name);
			}
			if ("contact".equals(cond)) {
				hospital.setContact(name);
			}
			if ("memo".equals(cond)) {
				hospital.setMemo(name);
			}
		}

		List<String> nameList = new ArrayList<String>();
		List<String> valueList = new ArrayList<String>();
		nameList.add(cond);
		valueList.add(name);
		PageHelper.getPage(this.hospitalService.getHospitalByLike(hospital), "hospital", nameList, valueList, 10, number, this.getRequest(),
				"query");
		name = null;
		cond = null;
		return "admin/queryhospital";
	}

	// 按主键查询数据
	@RequestMapping("getHospitalById.action")
	public String getHospitalById(String id) {
		Hospital hospital = this.hospitalService.getHospitalById(id);
		this.getRequest().setAttribute("hospital", hospital);
		return "admin/edithospital";
	}

	public HospitalService getHospitalService() {
		return hospitalService;
	}

	public void setHospitalService(HospitalService hospitalService) {
		this.hospitalService = hospitalService;
	}

}
