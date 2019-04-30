package com.service.impl;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dao.HospitalDAO;
import com.entity.Hospital;
import com.service.HospitalService;

@Service("hospitalService")
public class HospitalServiceImpl implements HospitalService {
	@Autowired
	@Resource
	private HospitalDAO hospitalDAO;

	@Override // 继承接口的新增 返回值0(失败),1(成功)
	public int insertHospital(Hospital hospital) {
		return this.hospitalDAO.insertHospital(hospital);
	}

	@Override // 继承接口的更新 返回值0(失败),1(成功)
	public int updateHospital(Hospital hospital) {
		return this.hospitalDAO.updateHospital(hospital);
	}

	@Override // 继承接口的删除 返回值0(失败),1(成功)
	public int deleteHospital(String hospitalid) {
		return this.hospitalDAO.deleteHospital(hospitalid);
	}

	@Override // 继承接口的查询全部
	public List<Hospital> getAllHospital() {
		return this.hospitalDAO.getAllHospital();
	}

	@Override // 继承接口的按条件精确查询
	public List<Hospital> getHospitalByCond(Hospital hospital) {
		return this.hospitalDAO.getHospitalByCond(hospital);
	}

	@Override // 继承接口的按条件模糊查询
	public List<Hospital> getHospitalByLike(Hospital hospital) {
		return this.hospitalDAO.getHospitalByLike(hospital);
	}

	@Override // 继承接口的按主键查询 返回Entity实例
	public Hospital getHospitalById(String hospitalid) {
		return this.hospitalDAO.getHospitalById(hospitalid);
	}

}
