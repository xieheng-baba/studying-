package com.dao;

import java.util.List;
import java.util.Map;

import com.entity.User;
import com.util.DbUtil;


public class UserDao {
	/**
	 * 根据id查询用户详情
	 * @param id
	 * @return
	 */
	public User find(String id) {
		User user =null;
		String sql ="select * from user where USER_ID=?";
		List<Map<String,Object>> list= DbUtil.query(sql,id);
		if(list.size()>0) {
			user =new User();
			Map<String,Object> map=list.get(0);
			user.setUserId(map.get("USER_ID")==null?null:map.get("USER_ID").toString());
			user.setUserName(map.get("USER_USER_NAME")==null?null:map.get("USER_USER_NAME").toString());
			user.setUserPassword(map.get("USER_PASSWORD")==null?null:map.get("USER_PASSWORD").toString());
		}
		DbUtil.close();
		return user;
	}
}
