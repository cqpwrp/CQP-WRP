package com.honda.am.cqp.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the tblHONDA_HOLIDAY database table.
 * 
 */
@Entity
@Table(name="tblHONDA_HOLIDAY")
@NamedQuery(name="TblHONDA_HOLIDAY.findAll", query="SELECT t FROM TblHONDA_HOLIDAY t")
public class TblHONDA_HOLIDAY implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="HOLIDAY_ID")
	private int holidayId;

	@Column(name="HOLIDAY_DATE")
	private Timestamp holidayDate;

	public TblHONDA_HOLIDAY() {
	}

	public int getHolidayId() {
		return this.holidayId;
	}

	public void setHolidayId(int holidayId) {
		this.holidayId = holidayId;
	}

	public Timestamp getHolidayDate() {
		return this.holidayDate;
	}

	public void setHolidayDate(Timestamp holidayDate) {
		this.holidayDate = holidayDate;
	}

}