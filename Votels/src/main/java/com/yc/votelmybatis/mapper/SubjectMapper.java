package com.yc.votelmybatis.mapper;

import java.util.List;

import org.springframework.stereotype.Service;

import com.yc.votelmybatis.entity.Subject;
import com.yc.votelmybatis.entity.SubjectBean;

@Service("subjectMapper")
public interface SubjectMapper {
	/**
	 * 添加投票主题
	 * @param subject
	 * @return
	 */
	public int addSubject(SubjectBean subjectBean);
	
	/**
	 * 查询所有投票主题
	 * @return
	 */
	public List<SubjectBean> findAllSubject();
	
	/**
	 * 根据id查询到Subject
	 * @param id
	 * @return
	 */
	public SubjectBean findSubjectById(int id);
	
	/**
	 * 根据title模糊查询subject
	 * @param title
	 * @return
	 */
	public List<SubjectBean> fingSubjectLike(String title);
	
	/**
	 * 更新subject
	 * @param subject
	 * @return
	 */
	public int updateSubject(SubjectBean subjectBean);
}
