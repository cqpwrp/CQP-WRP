package com.honda.am.common.controller;

import java.io.IOException;
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.honda.am.common.util.LoggerInfo;

@EnableWebMvc
@RestController
public class LoggerController{
	static Logger logger = LogManager.getLogger(LoggerController.class.getName());
	

//	@ExceptionHandler(value = Exception.class)
//	public ResponseEntity<LoggerInfo> apiExceptionHandle(Exception ex, WebRequest request) {
//		logger.info("Exception Handler for: " + request.getDescription(true));
//		logger.error("Failed by: " + ex.toString().replaceAll("'",""));
//		
//		LoggerInfo error = new LoggerInfo("NOT_FOUND_ERROR", ex.getMessage());
//
//		error.setTimeStamp(LocalDateTime.now());
//
//		error.setStatus((HttpStatus.NOT_FOUND.value()));
//
//		return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
//
//	}
	
	@PostMapping("/logs")
	public boolean insertClientLogs(@RequestBody LoggerInfo log) throws IOException, SQLException {
		Logger logger = LogManager.getLogger(LoggerController.class);
		System.out.println("Logs controller");
		logger.info("Error occured in "+log.getMessage());
		logger.error("Failed by: "+log.getError());
		return true;
	}


}
