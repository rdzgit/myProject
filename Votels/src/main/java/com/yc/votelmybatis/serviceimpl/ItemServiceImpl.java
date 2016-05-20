package com.yc.votelmybatis.serviceimpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yc.votelmybatis.entity.OptionUserNumBean;
import com.yc.votelmybatis.mapper.ItemMapper;
import com.yc.votelmybatis.service.ItemService;

@Service("itemService")
public class ItemServiceImpl implements ItemService {
	@Autowired
	private ItemMapper itemMapper;

	public int addItem(Map<String, Integer> params) {
		return itemMapper.addItem(params);
	}

	public List<OptionUserNumBean> getSubjectResult(int subjectId) {
		return itemMapper.getSubjectResult(subjectId);
	}

}
