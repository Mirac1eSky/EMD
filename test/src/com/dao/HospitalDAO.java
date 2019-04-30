package com.dao;

import java.util.List;
import org.springframework.stereotype.Repository;
import com.entity.Hospital;

@Repository("hospitalDAO") // Repository标签定义数据库连接的访问 Spring中直接
public interface HospitalDAO {

	/**
	 * HospitalDAO 接口 可以按名称直接调用hospital.xml配置文件的SQL语句
	 */

	// 插入数据 调用entity包hospital.xml里的insertHospital配置 返回值0(失败),1(成功)
	public int insertHospital(Hospital hospital);

	// 更新数据 调用entity包hospital.xml里的updateHospital配置 返回值0(失败),1(成功)
	public int updateHospital(Hospital hospital);

	// 删除数据 调用entity包hospital.xml里的deleteHospital配置 返回值0(失败),1(成功)
	public int deleteHospital(String hospitalid);

	// 查询全部数据 调用entity包hospital.xml里的getAllHospital配置 返回List类型的数据
	public List<Hospital> getAllHospital();

	// 按照Hospital类里面的值精确查询 调用entity包hospital.xml里的getHospitalByCond配置
	// 返回List类型的数据
	public List<Hospital> getHospitalByCond(Hospital hospital);

	// 按照Hospital类里面的值模糊查询 调用entity包hospital.xml里的getHospitalByLike配置
	// 返回List类型的数据
	public List<Hospital> getHospitalByLike(Hospital hospital);

	// 按主键查询表返回单一的Hospital实例 调用entity包hospital.xml里的getHospitalById配置
	public Hospital getHospitalById(String hospitalid);

}
