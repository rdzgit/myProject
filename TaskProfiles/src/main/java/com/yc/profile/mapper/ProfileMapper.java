package com.yc.profile.mapper;

import java.util.List;

import org.springframework.stereotype.Service;

import com.yc.profile.entity.Profile;

@Service("profileMapper")
public interface ProfileMapper {
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
