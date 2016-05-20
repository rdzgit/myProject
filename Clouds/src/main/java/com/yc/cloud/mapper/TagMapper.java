package com.yc.cloud.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.yc.cloud.entity.Tag;

@Repository("tagMapper")
public interface TagMapper {
	/**
	 * 获取所有的标签
	 * @return
	 */
	public List<Tag> getAllTag();
	
	/**
	 * 根据名字获取的标签
	 * @return
	 */
	public Tag findTagByTname(String tname);
	
	/**
	 * 添加标签
	 * @param cloudTag
	 * @return
	 */
	public int addTag(Tag cloudTag);
}
