/**
 * 
 */
package com.honda.am.cqp.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Shrirang Kadale
 *
 */
@Entity
@Table(name = "tblUSER_ROLE_MAPPING")
public class UserRole implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private String USER_LOGIN;
	@Id
	private Integer ROLE_ID;
	private Integer APPROVER_ROLE_ID;
	/**
	 * @return the uSER_LOGIN
	 */
	public String getUSER_LOGIN() {
		return USER_LOGIN;
	}
	/**
	 * @param uSER_LOGIN the uSER_LOGIN to set
	 */
	public void setUSER_LOGIN(String uSER_LOGIN) {
		USER_LOGIN = uSER_LOGIN;
	}
	/**
	 * @return the rOLE_ID
	 */
	public Integer getROLE_ID() {
		return ROLE_ID;
	}
	/**
	 * @param rOLE_ID the rOLE_ID to set
	 */
	public void setROLE_ID(Integer rOLE_ID) {
		ROLE_ID = rOLE_ID;
	}
	/**
	 * @return the aPPROVER_ROLE_ID
	 */
	public Integer getAPPROVER_ROLE_ID() {
		return APPROVER_ROLE_ID;
	}
	/**
	 * @param aPPROVER_ROLE_ID the aPPROVER_ROLE_ID to set
	 */
	public void setAPPROVER_ROLE_ID(Integer aPPROVER_ROLE_ID) {
		APPROVER_ROLE_ID = aPPROVER_ROLE_ID;
	}
	

}
