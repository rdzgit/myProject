package com.yc.votelmybatis.serviceimpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yc.votelmybatis.entity.Option;
import com.yc.votelmybatis.mapper.OptionMapper;
import com.yc.votelmybatis.service.OptionService;

@Service("optionService")
public class OptionServiceImpl implements OptionService {
	@Autowired
	private OptionMapper optionMapper;
	
	public int addOptions(List<Option> options) {
		return optionMapper.addOptions(options);
	}

	public int updateOptionBySid(Map<String, Object> params) {
		return optionMapper.updateOptionBySid(params);
	}

	public int addOption(Option option) {
		return optionMapper.addOption(option);
	}

	public int getOptionNum(int id) {
		return optionMapper.getOptionNum(id);
	}

}
