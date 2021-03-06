package com.zuoshangs.ssmdemo.service.user.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zuoshangs.ssmdemo.dao.user.IUserDao;
import com.zuoshangs.ssmdemo.pojo.user.User;
import com.zuoshangs.ssmdemo.service.user.IUserService;

@Service("userService")
public class UserServiceImpl implements IUserService {
	@Resource
	private IUserDao userDao;
	@Override
	public User getUserById(int userId) {
		return this.userDao.selectByPrimaryKey(userId);
	}
	@Override
	public List<User> selectAll() {
		return userDao.selectAll();
	}
	@Override
	public int update(User user) {
		return userDao.updateByPrimaryKeySelective(user);
	}
	@Override
	public int insert(User user) {
		return userDao.insert(user);
	}
	@Override
	public User findByUserName(String userName) {
		return userDao.selectByUserName(userName);
	}

}
