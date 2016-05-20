package com.yc.votelmybatis.mapper;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.yc.votelmybatis.entity.OptionUserNumBean;

@Service("itemMapper")
public interface ItemMapper {
	/**
	 * 添加用户投票信息
	 * @param params
	 * @return
	 */
	public int addItem(Map<String,Integer> params);
	
	/**
	 * 查看投票的结果信息
	 * @param subjectId
	 * @return
	 */
	public List<OptionUserNumBean> getSubjectResult(int subjectId);
}
