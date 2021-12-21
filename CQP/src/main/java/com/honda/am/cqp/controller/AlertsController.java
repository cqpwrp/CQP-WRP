package com.honda.am.cqp.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.honda.am.cqp.dto.AlertDto;
import com.honda.am.cqp.model.TblMESSAGE_CENTER;
import com.honda.am.cqp.service.AlertsService;
import com.honda.am.cqp.util.LoggerInfo;

@RestController
@CrossOrigin
@RequestMapping("/api/alerts")
public class AlertsController {

	@Autowired
	private AlertsService alertsService;
	
	@GetMapping("/inbox")
	public List<TblMESSAGE_CENTER> getMessage() {
		List<TblMESSAGE_CENTER> list = alertsService.getMessage();
		System.out.println(list);
		return list;
	}

	@GetMapping("/data")
	public List<AlertDto> getAlerts() throws IOException, SQLException {
		System.out.println("In controller");
		return alertsService.getAlerts();
	}
	
	@PostMapping("/logs")
	public boolean insertClientLogs(@RequestBody LoggerInfo log) throws IOException, SQLException {
		Logger logger = LogManager.getLogger(LoggerController.class);
		System.out.println("Logs controller");
		logger.info("Error occured in "+log.getMessage());
		logger.error("Failed by: "+log.getError());
		return true;
	}

}