package com.honda.am.cqp.daoImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.honda.am.cqp.dao.MessageCenterRepository;
import com.honda.am.cqp.model.TblMESSAGE_CENTER;
import com.honda.am.cqp.util.BaseRepo;

@Repository
public class MessageCenterRepositoryImpl extends BaseRepo<TblMESSAGE_CENTER,Integer> implements MessageCenterRepository{

	@PersistenceContext
	EntityManager em;

	public List<TblMESSAGE_CENTER> getMessage() {
		@SuppressWarnings("unchecked")
		List<TblMESSAGE_CENTER> q = em.createNativeQuery(
				"SELECT MESSAGE_ID, MESSAGE, CREATED_BY ,CREATED_TS, USER_TYPE ,SUPP_NO, EXPIRY_DATE FROM cqp.dbo.tblMESSAGE_CENTER",TblMESSAGE_CENTER.class)
				.getResultList();

		return q;
	}
}