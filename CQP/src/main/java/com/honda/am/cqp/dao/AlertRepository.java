package com.honda.am.cqp.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.honda.am.cqp.model.Alert;
import com.honda.am.cqp.util.BaseRepoInterface;

@Repository
public interface AlertRepository extends BaseRepoInterface<Alert, Long>{

	List<Object[]> getAlerts();
	
	public List<Object[]> getCallInAlerts();
	
	public List<Object[]> getVoucherAlerts();
	
	public List<Object[]> getTPLAlerts();
	
	public List<Object[]> getUserAlerts();
	
	public List<Object[]> getVoucherCostAlerts();
}
