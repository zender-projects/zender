package com.zender.web.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

public class WebUtils {

	/**
	 * 记录一个PV
	 * */
	public static Map<String, String> getAgentInfo(String key, HttpServletRequest request){
		
		Map<String, String>  pv = new HashMap<String, String>();
		String agentType = request.getHeader("User-Agent");
		String requestTime = getCurrentTime();
		
		pv.put("key", key);
		pv.put("agent_type", agentType);
		pv.put("request_time", requestTime);
		pv.put("request_count", "1");
		
		return pv;
	}
	
	
	/**
	 * 获取当前时间
	 * */
	public static String getCurrentTime(){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Calendar calendar = Calendar.getInstance();
		return sdf.format(calendar.getTime());
	}
}
