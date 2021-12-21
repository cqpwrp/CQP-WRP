package com.honda.am.cqp.dto;

import java.util.ArrayList;
import java.util.List;

public class WarrantyReportsDto {

	String modelfactory;
	String check;
	Integer rplQuantity;

	public String getCheck() {
		return check;
	}

	public void setCheck(String check) {
		this.check = check;
	}

	public Integer getRplQuantity() {
		return rplQuantity;
	}

	public void setRplQuantity(Integer rplQuantity) {
		this.rplQuantity = rplQuantity;
	}

	List<Integer> data = new ArrayList<Integer>();
	List<String> label = new ArrayList<String>();
	String part;

	public String getPart() {
		return part;
	}

	public void setPart(String part) {
		this.part = part;
	}

	public List<String> getLabel() {
		return label;
	}

	public void setLabel(List<String> label) {
		this.label = label;
	}

	public String getModelfactory() {
		return modelfactory;
	}

	public void setModelfactory(String modelfactory) {
		this.modelfactory = modelfactory;
	}

	public List<Integer> getData() {
		return data;
	}

	public void setData(List<Integer> data) {
		this.data = data;
	}

}
