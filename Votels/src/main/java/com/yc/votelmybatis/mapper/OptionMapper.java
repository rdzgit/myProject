package com.yc.votelmybatis.mapper;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.yc.votelmybatis.entity.Option;

@Service("optionMapper")
public interface OptionMapper {
	/**
	 * 添加主题的选项(多)
	 * @param options
	 * @return
	 */
	public int addOptions(List<Option> options);
	
	/**
	 * 更新option信息
	 * @param params
	 * @return
	 */
	public int updateOptionBySid(Map<String,Object> params);
	
	/**
	 * 添加主题的选项(单)
	 * @param option
	 * @return
	 */
	public int addOption(Option option);
	
	/**
	 * 找到主题的选项数
	 * @param id
	 * @return
	 */
	public int getOptionNum(int id);
}
