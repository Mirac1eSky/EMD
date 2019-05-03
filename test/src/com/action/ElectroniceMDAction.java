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

	// 根据ID查找数据
	@RequestMapping("getElectronicMDByCond.action")
	public String getElectronicMDByCond(String number) {
		System.out.print("getElectronicMDByCond run =============");
		System.out.print("");
		System.out.print("number = "+number);
		List<ElectronicMD> emdList = this.electronicmdService.getAllElectronicMD();
		PageHelper.getPage(emdList, "electronicmd", null, null, 10, number, this.getRequest(), null);
		return "admin/editdzbl";
	}
	// 模糊查找数据
	@RequestMapping("queryElectronicMDByCond.action")
	public String queryElectronicMDByCond(String cond, String name, String number) {
		System.out.print("queryElectronicMDByCond run =============");
			ElectronicMD emd = new ElectronicMD();
		if (cond != null) {
			if ("doctersid".equals(cond)) {
				emd.setDoctersid(name);
			}

		}

		List<String> nameList = new ArrayList<String>();
		List<String> valueList = new ArrayList<String>();
		nameList.add(cond);
		valueList.add(name);
		PageHelper.getPage(this.electronicmdService.getElectronicMDByLike(emd), "emd", nameList, valueList, 10, number, this.getRequest(), "query");
		name = null;
		cond = null;
		return "admin/querydzbl";
	}

	@RequestMapping("getElectronicMD.action")
	public String getElectronicMD(String number) {
		String usersid = this.getRequest().getParameter("id");
		ElectronicMD emd = new ElectronicMD();
		emd.setUsersid(usersid);
		System.out.print("getElectronicMD run =============");
		System.out.print(usersid);
		List<ElectronicMD> emdList = this.electronicmdService.getElectronicMDByCond(emd);
		PageHelper.getUserPage(emdList, "electronicmd", "getElectronicMD", 10, number, this.getRequest());
		System.out.print("length===");
		System.out.print(emdList.size());
		return "admin/listdzbl";
	}


	// 显示全部数据
	@RequestMapping("getAllElectronicMD.action")
	public String getAllElectronicMD(String number) {
		System.out.print("getAllElectronicMD run =============");
		System.out.println(number);
		List<ElectronicMD> emdList = this.electronicmdService.getAllElectronicMD();
		PageHelper.getPage(emdList, "electronicmd", null, null, 10, number, this.getRequest(), null);
		return "users/electronicMD";
	}
}
