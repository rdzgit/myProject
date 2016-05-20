package com.yc.cloud.service;

import java.util.List;

import com.yc.cloud.entity.Favorite;

public interface FavoriteService {
	
	/**
	 * 获取所有未分类的网址信息
	 * @return
	 */
	public List<Favorite> findFavByTagNull();
	
	/**
	 * 根据标签获取所有的网址信息
	 * @param ftags
	 * @return
	 */
	public List<Favorite> findFavByTag(String ftags);
	
	/**
	 * 获取所有的网址信息
	 * @return
	 */
	public List<Favorite> getAllFav();
	
	/**
	 * 添加网址信息
	 * @param cloudFavorite
	 * @return
	 */
	public int addFav(Favorite favorite);
}
