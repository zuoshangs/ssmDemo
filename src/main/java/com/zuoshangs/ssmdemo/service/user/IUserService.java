package com.zuoshangs.ssmdemo.service.user;

import java.util.List;

import com.zuoshangs.ssmdemo.pojo.user.User;

public interface IUserService {
	public User getUserById(int userId);

	public List<User> selectAll();
	
	public int update(User user);
	
	public int insert(User user);

	public User findByUserName(String userName);
}
