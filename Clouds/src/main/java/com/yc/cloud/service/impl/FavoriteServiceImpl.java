package com.yc.cloud.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.yc.cloud.entity.Favorite;
import com.yc.cloud.entity.Tag;
import com.yc.cloud.mapper.FavoriteMapper;
import com.yc.cloud.mapper.TagMapper;
import com.yc.cloud.service.FavoriteService;

@Service("favoriteService")
public class FavoriteServiceImpl implements FavoriteService {
	@Autowired
	private FavoriteMapper favoriteMapper;
	@Autowired
	private TagMapper tagMapper;

	public List<Favorite> findFavByTagNull() {
		return favoriteMapper.findFavByTagNull();
	}

	public List<Favorite> findFavByTag(String ftags) {
		return favoriteMapper.findFavByTag(ftags);
	}

	public List<Favorite> getAllFav() {
		return favoriteMapper.getAllFav();
	}

	@Transactional(propagation=Propagation.REQUIRED)
	public int addFav(Favorite favorite) {
		String ftags="";
		Tag tag;
		for (Tag t : favorite.getTagsList()) {
			tag=new Tag(0, t.getTname(), 0);
			if(tagMapper.findTagByTname(t.getTname())==null){
				tagMapper.addTag(tag);
			}
			ftags+=t.getTname()+",";
		}
		ftags=ftags.substring(0, ftags.lastIndexOf(","));
		favorite.setFtags(ftags);
		return favoriteMapper.addFav(favorite);
	}

}
