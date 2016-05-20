package com.yc.cloud.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ModelDriven;
import com.yc.cloud.entity.Favorite;
import com.yc.cloud.service.FavoriteService;

@Controller("favoriteAction")
public class FavoriteAction implements ModelDriven<Favorite>{
	
	private Favorite favorite;
	private List<Favorite> favorites;
	@Autowired
	private FavoriteService favoriteService;
	
	
	public List<Favorite> getFavorites() {
		return favorites;
	}
	public Favorite getModel() {
		favorite=new Favorite();
		return favorite;
	}

	public String getAllFav(){
		favorites=favoriteService.getAllFav();
		System.out.println(favorites);
		return "success";
	}
	
	public String findFavByTagNull(){
		favorites=favoriteService.findFavByTagNull();
		System.out.println(favorites);
		return "success";
	}
	
	public String findFavByTag(){
		System.out.println(favorite.getTags());
		favorites=favoriteService.findFavByTag(favorite.getTags());
		System.out.println(favorites);
		return "success";
	}
	
	public String addFav(){
		favoriteService.addFav(favorite);
		return "success";
	}
}
