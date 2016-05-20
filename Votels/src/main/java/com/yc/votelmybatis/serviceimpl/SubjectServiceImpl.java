package com.yc.votelmybatis.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yc.votelmybatis.entity.Subject;
import com.yc.votelmybatis.entity.SubjectBean;
import com.yc.votelmybatis.mapper.SubjectMapper;
import com.yc.votelmybatis.service.SubjectService;

@Service("subjectService")
public class SubjectServiceImpl implements SubjectService {
	@Autowired
	private SubjectMapper subjectMapper;
	
	public List<SubjectBean> findAllSubject() {
		return subjectMapper.findAllSubject();
	}

	public SubjectBean findSubjectById(int id) {
		return subjectMapper.findSubjectById(id);
	}

	public int addSubject(SubjectBean subjectBean) {
		return subjectMapper.addSubject(subjectBean);
	}

	public int updateSubject(SubjectBean subjectBean) {
		return subjectMapper.updateSubject(subjectBean);
	}

	public List<SubjectBean> fingSubjectLike(String title) {
		return subjectMapper.fingSubjectLike(title);
	}

}
