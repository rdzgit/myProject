package com.yc.controllers;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/mvc")
public class ShowController{

	/*	@RequestMapping("/show")
	public String show(HttpServletRequest request){
		//获取参数的方式	1.直接根据HttpServletRequest来获取参数
		try {
			request.setCharacterEncoding("utf-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		System.out.println(request.getParameter("uname"));
		return "show";
	}*/

	/*	@RequestMapping("/show")  
	public String login(String uname, @RequestParam("pwd")String password){ 
		//获取参数的方式	2.@RequestParam 和  @PathVariabl
		//如果表单的name与形参名相同则直接写
		//如果表单的name与形参名不同用@RequestParam("pwd")修饰形参 ()中为表单的name名
		//或者用@PathVariabl来获取路径中的参数
		System.out.println(uname);  
		System.out.println(password);
		return "show"; 
	} */

	/*	@RequestMapping("/show")
	public String show(User user) {
		//获取参数的方式	3.自动注入bean的方式 
		//在形参直接写实体类 (可以加注解@ModelAttribute("user")) 在jsp页面可以用${user.uname}来获取uname
		System.out.println(user.getUname()+" "+user.getPwd());
		return "show" ;
	}*/


	//将响应 XXXX:8080/mvc/show的请求
	@RequestMapping("/show")
	public String show(){
		//将跳转回show.jsp页面(具体如何跳转在springMVC.xml中配置)
		return "show";
	}

	@RequestMapping("/view")
	public String show2(){
		return "view";
	}

	@ResponseBody
	@RequestMapping("/json")
	public Map<String,Object> jsonTest(){
		Map<String,Object> map=new HashMap<String, Object>();
		List<String> list=new ArrayList<String>();

		for (int i=0; i<10; i++) {
			list.add("aa"+i);
		}

		map.put("string", "字符串");
		map.put("list", list);
		return map;
	}

	@RequestMapping("/file")
	public String fileUpload(@RequestParam MultipartFile myfile){
		//getOriginalFilename()得到上传的文件名
		String path="G:/"+myfile.getOriginalFilename();

		File newFile=new File(path);
		//通过CommonsMultipartFile的方法直接写文件
		try {
			myfile.transferTo(newFile);
		} catch (IllegalStateException | IOException e) {
			e.printStackTrace();
		}
		return "view";
	}
}
