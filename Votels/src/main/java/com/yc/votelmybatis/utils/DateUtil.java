package com.yc.votelmybatis.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
	private Date date;
	private SimpleDateFormat sdf;
	
	public String getDate(){
		date=new Date();
		sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		return sdf.format(date);
	}
}
