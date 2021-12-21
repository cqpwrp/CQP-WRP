package com.honda.am.cqp.controller;

import java.time.LocalDateTime;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.honda.am.cqp.util.LoggerInfo;

@EnableWebMvc
@RestControllerAdvice
public class LoggerController{
	static Logger logger = LogManager.getLogger(LoggerController.class.getName());
	

	@ExceptionHandler(value = Exception.class)
	public ResponseEntity<LoggerInfo> apiExceptionHandle(Exception ex, WebRequest request) {
		logger.info("Exception Handler for: " + request.getDescription(true));
		logger.error("Failed by: " + ex.toString().replaceAll("'",""));
		
		LoggerInfo error = new LoggerInfo("NOT_FOUND_ERROR", ex.getMessage());

		error.setTimeStamp(LocalDateTime.now());

		error.setStatus((HttpStatus.NOT_FOUND.value()));

		return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);

	}


}
