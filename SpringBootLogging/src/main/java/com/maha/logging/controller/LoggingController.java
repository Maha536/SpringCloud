package com.maha.logging.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoggingController {
	
	//Creating an instance for Logger
	Logger logger = LoggerFactory.getLogger(LoggingController.class);
	
	@RequestMapping("/")
	public String home() {
		logger.error("Error occured");
		logger.info("Home invoked");
		logger.trace("controller method accessed");
		return "This is an example for Logging ";
	}
}
