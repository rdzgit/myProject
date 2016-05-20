package com.yc.votelmybatis.service;

import java.util.List;
import java.util.Map;

import com.yc.votelmybatis.entity.OptionUserNumBean;

public interface ItemService {
	/**
	 * 添加用户投票信息s
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
