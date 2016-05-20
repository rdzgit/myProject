package com.yc.votelmybatis.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ModelDriven;
import com.yc.votelmybatis.entity.ItemBean;
import com.yc.votelmybatis.entity.OptionUserNumBean;
import com.yc.votelmybatis.service.ItemService;

@Controller("itemAction")
public class ItemAction implements ModelDriven<ItemBean>,SessionAware{
	private ItemBean itemBean;
	private Map<String, Object> session;
	@Autowired
	private ItemService itemService;

	public ItemBean getModel() {
		itemBean=new ItemBean();
		return itemBean;
	}
	
	public void setSession(Map<String, Object> session) {
		this.session=session;
	}
	
	//添加用户选的选项
	public String addItem(){
		Map<String, Integer> params=new HashMap<String, Integer>();
		int result = 0;
		for (Integer i : itemBean.getOid()) {
			params.put("sid", itemBean.getSid());
			params.put("oid", i);
			params.put("uid", itemBean.getUid());
			result=itemService.addItem(params);
		}
		
		if(result>0){
			return showDetail();
		}
		return "failed";
	}
	
	public String showDetail(){
		List<OptionUserNumBean> viewInfo=itemService.getSubjectResult(itemBean.getSid());
		session.put("viewInfo", viewInfo);
		session.put("oNum", viewInfo.size());
		return "view";
	}
}
