package com.zender.task;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


@Component
public class ScheduledTest {

	private static final Log logger = LogFactory.getLog(ScheduledTest.class);
	private static int taskOne = 0;
	private static int taskTwo = 0;
	/**
	 * 每隔五秒钟触发一次
	 * */
	@Scheduled(fixedRate=5000)
	public void test(){
		logger.info("run / 5 second : " + taskOne);
		taskOne ++;
	}
	
	
	/**
	 * 制定每次调用的时间间隔
	 * */
	
	@Scheduled(fixedDelay=10)
	public void testTwo(){
		logger.info("run / 10 second : " + taskTwo);
		taskTwo ++;
	}
	
	/**
	 * 用 cron 表达式执行具体的执行时间
	 * */
	//@Scheduled(cron = "45 5 9 7 7 2016")
	public void taskThree(){
		logger.info("task schedule icon runed");
	}
}
 