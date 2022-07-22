package com.phone.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.phone.bean.Users;

/**
 * 
 * @author 豪华版大番薯
 *完成用户模块对数据库的相关操作
 */
@Mapper
public interface UsersDao {
    //用户注册
	public int save(Users users); //快速导包 Ctrl+shift+o
	
//	//用户删除
//	public void del(int id);
//	
	//用户修改
	public Users update(Users users);
	
	//用户登录
	public Users findByName(Users users);
	
	//查询所有用户对象
	public List<Users>list();
	
}
