package com.honda.am.cqp.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.honda.am.cqp.model.TblMESSAGE_CENTER;

@Repository
public interface MessageCenterRepository {
	public List<TblMESSAGE_CENTER> getMessage();
}
