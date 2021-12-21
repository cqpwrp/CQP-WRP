package com.honda.am.cqp.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

@Repository
public class MessageCenterRepository {

	@PersistenceContext
	EntityManager em;

	public List<Object[]> getMessage() {
		@SuppressWarnings("unchecked")
		List<Object[]> q = em.createNativeQuery(
				"SELECT MESSAGE_ID, MESSAGE, CREATED_BY ,CREATED_TS, USER_TYPE ,SUPP_NO, EXPIRY_DATE FROM cqp.dbo.tblMESSAGE_CENTER")
				.getResultList();

		return q;
	}
}