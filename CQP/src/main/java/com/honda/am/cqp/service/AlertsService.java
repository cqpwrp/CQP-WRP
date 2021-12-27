package com.honda.am.cqp.service;

import java.util.List;

import com.honda.am.cqp.dto.AlertDto;
import com.honda.am.cqp.model.TblMESSAGE_CENTER;

public interface AlertsService {
	public List<TblMESSAGE_CENTER> getMessage();
	
	public List<AlertDto> getAlerts();
}
