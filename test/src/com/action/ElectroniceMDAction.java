package com.action;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.entity.ElectronicMD;
import com.service.ElectronicMDService;

import com.entity.Banner;
import com.service.BannerService;
import com.util.PageHelper;
import com.util.VeDate;
//定义为控制器
@Controller
//设置路径
@RequestMapping(value = "/electronicmd", produces = "text/plain;charset=utf-8")
public class ElectroniceMDAction extends BaseAction{
	@Autowired
	@Resource
	private ElectronicMDService electronicmdService;

	@RequestMapping("createElectronicMD.action")
	public String createElectronicMD(String number) {
		List<ElectronicMD> emdList = this.electronicmdService.getAllElectronicMD();
		PageHelper.getPage(emdList, "electronicmd", null, null, 10, number, this.getRequest(), null);
		return "admin/adddzbl";
	}

		// 添加数据
	@RequestMapping("addElectronicMD.action")
	public String addElectronicMD(ElectronicMD elecmd) {
		System.out.println("addElectronicMD.action ==============");
		this.electronicmdService.insertElectronicMD(elecmd);
		return "redirect:/electronicmd/createElectronicMD.action";
	}


	// 显示全部数据
	@RequestMapping("getAllElectronicMD.action")
	public String getAllElectronicMD(String number) {
		System.out.print("action run =============");
		List<ElectronicMD> emdList = this.electronicmdService.getAllElectronicMD();
		PageHelper.getPage(emdList, "electronicmd", null, null, 10, number, this.getRequest(), null);
		return "users/electronicMD";
	}
}
