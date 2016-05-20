package com.yc.profile.seriver;

import java.util.List;

import com.yc.profile.entity.Profile;

public interface ProfileService {
	/**
	 * 获取所有的人员信息
	 * @return
	 */
	public List<Profile> findAllProfiles();
	
	/**
	 * 根据id找到人员信息
	 * @param id
	 * @return
	 */
	public Profile findProfileById(int id);
	
	/**
	 * 更新人员信息
	 * @param profile
	 * @return
	 */
	public int updateProfile(Profile profile);
}
