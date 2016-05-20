package com.yc.votelmybatis.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ModelDriven;
import com.yc.votelmybatis.entity.Option;
import com.yc.votelmybatis.entity.SubjectBean;
import com.yc.votelmybatis.service.OptionService;
import com.yc.votelmybatis.service.SubjectService;

/**
 * 投票主题
 * @author Administrator
 *
 */
@Controller("subjectAction")
public class SubjectAction implements ModelDriven<SubjectBean>,SessionAware {
	private SubjectBean subjectBean;
	private Map<String, Object> session;
	private String keywords;
	@Autowired
	private SubjectService subjectService;
	@Autowired
	private OptionService optionService;

	public String getKeywords() {
		return keywords;
	}
	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

	public void setSession(Map<String, Object> session) {
		this.session=session;
	}
	
	public SubjectBean getModel() {
		subjectBean=new SubjectBean();
		return subjectBean;
	}
	
	/**
	 * 添加投票主题
	 * @return
	 */
	public String addSubject(){
		int result=subjectService.addSubject(subjectBean);
		subjectBean.setOptionSubject(subjectBean.getId());
		int result2=optionService.addOptions(subjectBean.getOptions());
		if(result>0 && result2>0){
			return findAllSubject();
		}
		return "addSubjectFailed";
	}
	
	/**
	 * 获取全部的投票
	 * @return
	 */
	public String findAllSubject(){
		List<SubjectBean> subjects=subjectService.findAllSubject();
		if(subjects!=null && subjects.size()>=0){
			session.put("subjects", subjects);
			return "manage";
		}
		return "failed";
	}
	
	/**
	 * 跳转到投票界面
	 * @return
	 */
	public String gotoSubject(){
		int id=subjectBean.getId();
		SubjectBean currentSubject=subjectService.findSubjectById(id);
		if(currentSubject!=null){
			session.put("currentSubject", currentSubject);
			return "vote";
		}
		return "failed";
	}
	
	/**
	 * 模糊查询
	 * @return
	 */
	public String search(){
		System.out.println(keywords);
		if(!"".equals(keywords)){
			List<SubjectBean> subjects=subjectService.fingSubjectLike(keywords);
			System.out.println(subjects);
			if(subjects!=null && subjects.size()>0){
				session.put("subjects", subjects);
				return "manage";
			}
		}else if("".equals(keywords)){
			return findAllSubject();
		}
		return "failed";
	}
	
	/**
	 * 跳转到更新界面
	 * @return
	 */
	public String gotoUpdate(){
		SubjectBean updateSubject=subjectService.findSubjectById(subjectBean.getId());
		if (updateSubject!=null) {
			session.put("updateSubject", updateSubject);
			return "update";
		}
		return "failed";
	}
	
	/**
	 * 更新suject
	 * @return
	 */
	public String updateSubject(){
		System.out.println("\n"+subjectBean);
		
		subjectService.updateSubject(subjectBean);
		
		int oldNum=optionService.getOptionNum(subjectBean.getId());
		Map<String, Object> params;
		
		for(int i=0;i<oldNum;i++){
			params=new HashMap<String, Object>();
			params.put("name", subjectBean.getOptions().get(i).getName());
			params.put("sid", subjectBean.getId());
			params.put("order", i);
			optionService.updateOptionBySid(params);
		}
		
		Option option;
		for(int i=oldNum;i<subjectBean.getOptions().size();i++){
			option=new Option(subjectBean.getOptions().get(i).getName(), i, subjectBean.getId());
			optionService.addOption(option);
		}
		
		return findAllSubject();
	}
}
