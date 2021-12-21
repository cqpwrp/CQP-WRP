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
@Table(name = "tblCQ_SUPPLIER_MAPPING")
public class SupplierMapping implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private String CQ_USER_LOGIN;
	@Id
	private String SUPP_NO;
	/**
	 * @return the cQ_USER_LOGIN
	 */
	public String getCQ_USER_LOGIN() {
		return CQ_USER_LOGIN;
	}
	/**
	 * @param cQ_USER_LOGIN the cQ_USER_LOGIN to set
	 */
	public void setCQ_USER_LOGIN(String cQ_USER_LOGIN) {
		CQ_USER_LOGIN = cQ_USER_LOGIN;
	}
	/**
	 * @return the sUPP_NO
	 */
	public String getSUPP_NO() {
		return SUPP_NO;
	}
	/**
	 * @param sUPP_NO the sUPP_NO to set
	 */
	public void setSUPP_NO(String sUPP_NO) {
		SUPP_NO = sUPP_NO;
	}
	

}
