package com.maven.demo;

import org.apache.log4j.Logger;

public class LogTest {
	
	private final static Logger LOGGER = Logger.getLogger(LogTest.class);
	
	public void testLog() {
		 // 记录debug级别的信息    
		LOGGER.debug("This is debug message.");    
	    // 记录info级别的信息    
		LOGGER.info("This is info message.");    
	    // 记录error级别的信息    
		LOGGER.error("This is error message."); 
	}
	
	public static void main(String[] args) {
		
		LogTest logTest = new LogTest();
		logTest.testLog();
		
	}
	

}
