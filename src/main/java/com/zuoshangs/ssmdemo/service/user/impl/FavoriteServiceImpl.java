package com.zuoshangs.ssmdemo.service.user.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zuoshangs.ssmdemo.dao.user.IFavoriteDao;
import com.zuoshangs.ssmdemo.pojo.user.Favorite;
import com.zuoshangs.ssmdemo.service.user.IFavoriteService;

@Service("favoriteService")
public class FavoriteServiceImpl implements IFavoriteService {
	@Resource
	private IFavoriteDao favoriteDao;
	@Override
	public List<Favorite> selectAll() {
		return favoriteDao.selectAll();
	}
	@Override
	public List<Favorite> selectByCodes(List<String> codeList) {
		return favoriteDao.selectByCodes(codeList);
	}

}
