package com.yc.profile.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ModelDriven;
import com.yc.profile.entity.Profile;
import com.yc.profile.seriver.ProfileService;

@Controller("profileAction")
public class ProfileAction implements ModelDriven<Profile>,SessionAware{
	private Profile profile;
	private Map<String, Object> session;
	
	@Autowired
	private ProfileService profileService;
	
	public Profile getModel() {
		profile=new Profile();
		return profile;
	}

	public void setSession(Map<String, Object> session) {
		this.session=session;
	}

	public String getAllProfiles(){
		List<Profile> profiles=profileService.findAllProfiles();
		session.put("profiles", profiles);
		return "UserList";
	}
	
	public String detail(){
		Profile p=profileService.findProfileById(profile.getId());
		session.put("profile", p);
		return "oneInfo";
	}
	
	public String gotoUpdate(){
		Profile p=profileService.findProfileById(profile.getId());
		session.put("profile", p);
		return "update";
	}
	
	public String update(){
		int result=profileService.updateProfile(profile);
		Profile p=profileService.findProfileById(profile.getId());
		session.put("profile", p);
		if(result>0){
			return "uSuccess";
		}
		return "uFailed";
	}
}
