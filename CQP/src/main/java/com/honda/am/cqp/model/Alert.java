package com.honda.am.cqp.model;

import java.io.Serializable;
import javax.persistence.*;
/**
 * The persistent class for the alerts database table.
 * 
 */
@Entity
@Table(name = "alerts")
@NamedQuery(name = "Alert.findAll", query = "SELECT a FROM Alert a")
public class Alert implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	@Column(name = "alert_test")
	private String alertTest;

	private String status;

	private String supplier;

	public Alert() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAlertTest() {
		return this.alertTest;
	}

	public void setAlertTest(String alertTest) {
		this.alertTest = alertTest;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getSupplier() {
		return this.supplier;
	}

	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}

}