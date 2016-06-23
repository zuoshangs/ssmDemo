package com.zuoshangs.ssmdemo.dao.user;

import java.util.List;

import com.zuoshangs.ssmdemo.pojo.user.User;
public interface IUserDao {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);
    
    List<User> selectAll();
    
    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
    
}