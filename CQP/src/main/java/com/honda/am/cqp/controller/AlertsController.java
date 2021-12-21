package com.honda.am.cqp.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.honda.am.cqp.dto.AlertDto;
import com.honda.am.cqp.model.TblMESSAGE_CENTER;
import com.honda.am.cqp.service.AlertsService;

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

}