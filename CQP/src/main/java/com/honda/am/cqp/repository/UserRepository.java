package com.honda.am.cqp.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {

	@PersistenceContext
	EntityManager em;

	public List<Object[]> getUserAlerts() {
		@SuppressWarnings("unchecked")
		List<Object[]> q = em.createNativeQuery("  SELECT USER_PROFILE.USER_LOGIN, USER_TYPE, USER_FIRST_NAME,\r\n"
				+ "	  USER_LAST_NAME, USER_PROFILE.SUPP_NO as SUPP_SUPP_NO,\r\n" + "	  \r\n"
				+ "	  CONVERT(VARCHAR,USER_LAST_LOGIN,101) AS USER_LAST_LOGIN, SUPP_MAP.SUPP_NO AS\r\n"
				+ "	  CQ_SUPP_NO FROM dbo.tblUSER_PROFILE\r\n" + "	  \r\n"
				+ "	  USER_PROFILE LEFT OUTER JOIN dbo.tblUSER_ROLE_MAPPING USER_ROLE_MAP ON\r\n"
				+ "	  USER_PROFILE.USER_LOGIN = USER_ROLE_MAP.USER_LOGIN\r\n" + "	  \r\n"
				+ "	  LEFT OUTER JOIN dbo.tblCQ_SUPPLIER_MAPPING SUPP_MAP ON\r\n"
				+ "	  USER_PROFILE.USER_LOGIN = SUPP_MAP.CQ_USER_LOGIN\r\n" + "	  \r\n"
				+ "	  WHERE USER_ROLE_MAP.ROLE_ID IS NULL").getResultList();
		return q;
	}
}