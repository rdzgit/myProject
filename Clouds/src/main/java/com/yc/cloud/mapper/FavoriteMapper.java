package com.yc.cloud.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.yc.cloud.entity.Favorite;

@Repository("favotiteMapper")
public interface FavoriteMapper {
	
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
	public List<Favorite> findFavByTag(String tags);
	
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
