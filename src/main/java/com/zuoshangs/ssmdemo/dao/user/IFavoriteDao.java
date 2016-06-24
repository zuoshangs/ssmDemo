package com.zuoshangs.ssmdemo.dao.user;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zuoshangs.ssmdemo.pojo.user.Favorite;
public interface IFavoriteDao {
    
    List<Favorite> selectAll();
    
    List<Favorite> selectByCodes(@Param("codeList") List<String> codeList);
    
    
}