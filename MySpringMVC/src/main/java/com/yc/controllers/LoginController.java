package com.yc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.yc.entity.User;

@Controller
@SessionAttributes({"user","uname"})
public class LoginController {

	private User user;

	@ModelAttribute
	public void getUser(User user){
		//类似于struts2的getModel()
		this.user=user;
	}

	/*	@RequestMapping("/login")
	//在此时通过ModelAttribute会自动将user类中的信息写入map中的u中
	public String login(@ModelAttribute("u")User user,ModelMap map) {
		//前台通过${u.uname}获取名字
		//将uname放入session作用域中，这样转发页面也可以取到这个数据。
		map.addAttribute("uname",user.getUname()); 
		System.out.println(map);
		return "loginSuccess";
	}
	 */

	/*	@RequestMapping("/login")
	public String login(ModelMap map) {
		//将uname放入session作用域中，这样转发页面也可以取到这个数据。
		map.addAttribute("user", user);
		map.addAttribute("uname", user.getUname());
		System.out.println(map);
		return "loginSuccess";
	}*/
	
	@RequestMapping("/login")
	public String login(User user,ModelMap map) {
		//user会自己注入session中
		//将uname放入session作用域中，这样转发页面也可以取到这个数据。
		map.addAttribute("uname", user.getUname());
		return "loginSuccess";
	}

	/*	return "redirect:user.do?method=reg5";  //重定向    
		return "redirect:http://www.baidu.com";   //重定向   
		return "forward:index.jsp";  //内部转发
		return "forward:user.do?method=reg5"; //内部转发 */  
}
