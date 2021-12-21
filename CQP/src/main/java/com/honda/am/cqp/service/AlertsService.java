/**
 * 
 */
package com.honda.am.cqp.service;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.honda.am.cqp.dto.AlertDto;
import com.honda.am.cqp.model.TblMESSAGE_CENTER;
import com.honda.am.cqp.repository.AlertRepository;
import com.honda.am.cqp.repository.MessageCenterRepository;

/**
 * @author Shrirang Kadale
 *
 */
@Service
public class AlertsService {

	@Autowired
	private MessageCenterRepository messageRepository;

	@Autowired
	AlertRepository alertRepository;

	public List<TblMESSAGE_CENTER> getMessage() {
		try {
			List<Object[]> inbox = messageRepository.getMessage();

			List<TblMESSAGE_CENTER> list = new ArrayList<>();

			for (Object[] dto : inbox) {
				TblMESSAGE_CENTER msg = new TblMESSAGE_CENTER();
				msg.setMessageId((int) dto[0]);
				msg.setMessage((String) dto[1]);
				msg.setCreatedBy((String) dto[2]);
				msg.setCreatedTs((Timestamp) dto[3]);
				msg.setUserType((char) dto[4]);
				msg.setSuppNo((String) dto[5]);
				msg.setExpiryDate((Timestamp) dto[6]);

				list.add(msg);
			}
			if(true) {
				int x = 1/0;
			}
			return list;
		} finally {
			// TODO: handle finally clause
		}
	}

	public List<AlertDto> getAlerts() {
		List<Object[]> alerts = alertRepository.getAlerts();
		List<AlertDto> list = new ArrayList<>();
		for (Object[] dto : alerts) {
			AlertDto alertDto = new AlertDto();
			alertDto.setItemType((String) dto[0]);
			alertDto.setSuppNo((String) dto[1]);
			alertDto.setStatus((String) dto[2]);
			alertDto.setItemText((String) dto[3]);
			list.add(alertDto);
		}
		return list;
	}

}
