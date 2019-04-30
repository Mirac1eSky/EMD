package com.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.entity.Doctor;
import com.entity.Drugs;
import com.entity.Sell;
import com.service.DoctorService;
import com.service.DrugsService;
import com.service.SellService;
import com.util.VeDate;

//定义为控制器
@Controller
// 设置路径
@RequestMapping(value = "/ajax", produces = "text/plain;charset=utf-8")
public class AjaxAction extends BaseAction {
	@Autowired
	@Resource
	private SellService sellService;
	@Autowired
	@Resource
	private DrugsService drugsService;
	@Autowired
	@Resource
	private DoctorService doctorService;

	@RequestMapping("save.action")
	public void save(HttpServletResponse response) {
		String str = this.getRequest().getParameter("str");
		String[] s = str.split(",");// 接收参数并转化成数组
		PrintWriter out = null;
		Drugs drugs = this.drugsService.getDrugsById(s[0]);
		String doctorid = (String) this.getSession().getAttribute("adminid");
		Sell sell = new Sell();
		sell.setSellid("S" + VeDate.getStringId());
		sell.setDrugsid(s[0]);
		sell.setNum(s[1]);
		sell.setSno(s[2]);
		sell.setTotal("" + VeDate.getDouble((Double.parseDouble(sell.getNum()) * Double.parseDouble(drugs.getPrice()))));
		sell.setAddtime(VeDate.getStringDateShort());
		sell.setDoctorid(doctorid);
		this.sellService.insertSell(sell);
		try {
			response.setCharacterEncoding("UTF-8");
			out = response.getWriter();
		} catch (IOException ex) {
		}
		out.write(sell.getSellid());
		out.close();
	}

	@RequestMapping("getDoctor.action")
	@ResponseBody
	public String getDoctor() throws JSONException {
		String str = this.getRequest().getParameter("str");
		String[] s = str.split(",");// 接收参数并转化成数组
		Doctor doctor = new Doctor();
		doctor.setHospitalid(s[0]);
		doctor.setDeptid(s[1]);
		List<Doctor> list = this.doctorService.getDoctorByCond(doctor);
		JSONArray did = new JSONArray();
		JSONArray dname = new JSONArray();// 定义count存放数值
		for (Doctor d : list) {
			did.put(d.getDoctorid());
			dname.put(d.getRealname());
		}
		JSONObject json = new JSONObject();
		json.put("did", did.toString().replaceAll("\"", ""));
		json.put("dname", dname.toString().replaceAll("\"", ""));
		return json.toString();
	}
}
