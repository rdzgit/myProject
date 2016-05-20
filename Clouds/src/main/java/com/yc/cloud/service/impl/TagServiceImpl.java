package com.yc.cloud.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yc.cloud.entity.Tag;
import com.yc.cloud.mapper.TagMapper;
import com.yc.cloud.service.TagService;

@Service("tagService")
public class TagServiceImpl implements TagService{
	@Autowired
	private TagMapper tagmapper;

	public List<Tag> getAllTag() {
		return tagmapper.getAllTag();
	}

	public Tag findTagByTname(String tname) {
		return null;
	}

	public int addTag(Tag cloudTag) {
		return 0;
	}
}
