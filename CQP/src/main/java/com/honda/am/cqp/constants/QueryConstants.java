package com.honda.am.cqp.constants;

public class QueryConstants {

	public static final String SELECT_USER_ALERTS_DTLS = new StringBuffer()
			.append("SELECT count(*) USER_PROFILE.USER_LOGIN, USER_TYPE, USER_FIRST_NAME, ")
			.append("USER_LAST_NAME,  USER_PROFILE.SUPP_NO as SUPP_SUPP_NO, ")
			.append("CONVERT(VARCHAR,USER_LAST_LOGIN,101) AS USER_LAST_LOGIN,").append("SUPP_MAP.SUPP_NO AS CQ_SUPP_NO")
			.append(" FROM ").append("dbo.tblUSER_PROFILE").append(" USER_PROFILE ").append(" LEFT OUTER JOIN ")
			.append("dbo.tblUSER_ROLE_MAPPING").append(" USER_ROLE_MAP ")
			.append(" ON USER_PROFILE.USER_LOGIN = USER_ROLE_MAP.USER_LOGIN ").append(" LEFT OUTER JOIN ")
			.append("dbo.tblCQ_SUPPLIER_MAPPING").append(" SUPP_MAP")
			.append(" ON USER_PROFILE.USER_LOGIN = SUPP_MAP.CQ_USER_LOGIN")
			.append(" WHERE USER_ROLE_MAP.ROLE_ID IS NULL").toString();

}
