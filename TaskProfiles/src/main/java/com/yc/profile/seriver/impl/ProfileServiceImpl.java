package com.yc.profile.seriver.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yc.profile.entity.Profile;
import com.yc.profile.mapper.ProfileMapper;
import com.yc.profile.seriver.ProfileService;

@Service("profileService")
public class ProfileServiceImpl implements ProfileService {
	@Autowired
	private ProfileMapper profileMapper;

	public List<Profile> findAllProfiles() {
		return profileMapper.findAllProfiles();
	}

	public Profile findProfileById(int id) {
		return profileMapper.findProfileById(id);
	}

	public int updateProfile(Profile profile) {
		return profileMapper.updateProfile(profile);
	}

}
