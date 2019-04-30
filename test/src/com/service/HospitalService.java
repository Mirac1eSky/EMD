package com.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.entity.Hospital;

@Service("hospitalService")
public interface HospitalService {
	// 插入数据 调用hospitalDAO里的insertHospital配置
	public int insertHospital(Hospital hospital);

	// 更新数据 调用hospitalDAO里的updateHospital配置
	public int updateHospital(Hospital hospital);

	// 删除数据 调用hospitalDAO里的deleteHospital配置
	public int deleteHospital(String hospitalid);

	// 查询全部数据 调用hospitalDAO里的getAllHospital配置
	public List<Hospital> getAllHospital();

	// 按照Hospital类里面的字段名称精确查询 调用hospitalDAO里的getHospitalByCond配置
	public List<Hospital> getHospitalByCond(Hospital hospital);

	// 按照Hospital类里面的字段名称模糊查询 调用hospitalDAO里的getHospitalByLike配置
	public List<Hospital> getHospitalByLike(Hospital hospital);

	// 按主键查询表返回单一的Hospital实例 调用hospitalDAO里的getHospitalById配置
	public Hospital getHospitalById(String hospitalid);

}
