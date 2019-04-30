package com.service.impl;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dao.ElectronicmdDAO;
import com.entity.ElectronicMD;
import com.service.ElectronicMDService;

@Service("electronicmdService")
public class ElectronicMDServiceImpl implements ElectronicMDService{
	@Autowired
	@Resource
	private ElectronicmdDAO electronicmdDAO;
	@Override
	public int insertElectronicMD(ElectronicMD electronicmd) {
		// TODO Auto-generated method stub
		System.out.println("======insertElectronicMD===========");
		return this.electronicmdDAO.insertElectronicMD(electronicmd);
	}

	@Override
	public int updateElectronicMD(ElectronicMD electronicmd) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteElectronicMD(String electronicmd) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<ElectronicMD> getAllElectronicMD() {
		// TODO Auto-generated method stub
		System.out.println("getAllElectronicMD --------------");
		return this.electronicmdDAO.getAllElectronicMD();
	}

	@Override
	public List<ElectronicMD> getElectronicMDByCond(ElectronicMD electronicmd) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ElectronicMD> getAdviceByLike(ElectronicMD electronicmd) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ElectronicMD getAdviceById(String electronicmdid) {
		// TODO Auto-generated method stub
		return null;
	}


}
