package com.yc.votelmybatis.service;

import java.util.List;

import com.yc.votelmybatis.entity.Subject;
import com.yc.votelmybatis.entity.SubjectBean;

public interface SubjectService {
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
	 * 添加投票主题
	 * @param subject
	 * @return
	 */
	public int addSubject(SubjectBean subjectBean);
	
	/**
	 * 更新subject
	 * @param subject
	 * @return
	 */
	public int updateSubject(SubjectBean subjectBean);
	
	/**
	 * 根据title模糊查询subject
	 * @param title
	 * @return
	 */
	public List<SubjectBean> fingSubjectLike(String title);
}
