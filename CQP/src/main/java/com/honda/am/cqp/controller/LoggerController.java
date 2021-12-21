package com.honda.am.cqp.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.honda.am.cqp.util.LoggerInfo;

@EnableWebMvc
@RestControllerAdvice
public class LoggerController{
	static Logger logger = LogManager.getLogger(LoggerController.class.getName());
	
	@Value("${common.serviceurl}")
	private String commonUrl;

	@ExceptionHandler(value = Exception.class)
	public ResponseEntity<RestTemplate> apiExceptionHandle(Exception ex, WebRequest request) {
		
		RestTemplate restTemplate = new RestTemplate();
		StackTraceElement[] elements = ex.getStackTrace();
		HttpEntity<LoggerInfo> req = new HttpEntity<>(new LoggerInfo("Failed by: " + ex.toString().replaceAll("'",""),"Exception Handler for: " + request.getDescription(true)+" | "+elements[0].toString()));
		restTemplate.exchange(commonUrl, HttpMethod.POST, req, LoggerInfo.class);

		return new ResponseEntity<>(restTemplate, HttpStatus.NOT_FOUND);

	}
}
