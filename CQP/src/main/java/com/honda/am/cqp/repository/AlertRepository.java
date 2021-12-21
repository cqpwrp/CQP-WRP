package com.honda.am.cqp.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;

import org.springframework.stereotype.Repository;

@Repository
public class AlertRepository {

	@PersistenceContext
	EntityManager em;

	public List<Object[]> getAlerts() {
		String login = "VC037857";
		String suppNo = "140290";
		StoredProcedureQuery query = em.createStoredProcedureQuery("USP_ALERTS");
		query.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
		query.registerStoredProcedureParameter(2, String.class, ParameterMode.IN);
		query.setParameter(1, login);
		query.setParameter(2, suppNo);
		query.execute();
		@SuppressWarnings("unchecked")
		List<Object[]> result = query.getResultList();
		return result;

	}
}