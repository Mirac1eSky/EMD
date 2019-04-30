package com.dao;

import java.util.List;
import org.springframework.stereotype.Repository;
import com.entity.ElectronicMD;

@Repository("electronicmdDAO") // Repository标签定义数据库连接的访问 Spring中直接
public interface ElectronicmdDAO {

	/**
	 * ElectronicmdDAO 接口 可以按名称直接调用ElectronicmdDAO.xml配置文件的SQL语句
	 */

	// 插入数据 调用entity包users.xml里的insertUsers配置 返回值0(失败),1(成功)
	public int insertElectronicMD(ElectronicMD electronicmd);

	// 更新数据 调用entity包users.xml里的updateUsers配置 返回值0(失败),1(成功)
	public int updateElectronicMD(ElectronicMD electronicmd);

	// 删除数据 调用entity包users.xml里的deleteUsers配置 返回值0(失败),1(成功)
	public int deleteElectronicMD(String electronicmdid);

	// 查询全部数据 调用entity包users.xml里的getAllUsers配置 返回List类型的数据
	public List<ElectronicMD> getAllElectronicMD();

	// 按照Users类里面的值精确查询 调用entity包users.xml里的getUsersByCond配置 返回List类型的数据
	public List<ElectronicMD> getElectronicMDByCond(ElectronicMD electronicmd);

	// 按照Users类里面的值模糊查询 调用entity包users.xml里的getUsersByLike配置 返回List类型的数据
	public List<ElectronicMD> getAdviceByLike(ElectronicMD electronicmd);

	// 按主键查询表返回单一的Users实例 调用entity包users.xml里的getUsersById配置
	public ElectronicMD getAdviceById(String electronicmdid);

}
