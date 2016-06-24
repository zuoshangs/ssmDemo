package com.zuoshangs.ssmdemo.service.user;

import java.util.List;

import com.zuoshangs.ssmdemo.pojo.user.Favorite;

public interface IFavoriteService{
	public List<Favorite> selectAll();

	public List<Favorite> selectByCodes(List<String> codeList);

}
