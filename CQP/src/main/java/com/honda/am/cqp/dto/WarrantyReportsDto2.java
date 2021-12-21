package com.honda.am.cqp.dto;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class WarrantyReportsDto2 {

	BigInteger rowID;
	String part;
	String shortPartname;
	String factory;
	String modName;
	Integer rplQuantity;
	Integer Quantity;
	String modelfactory;
	private Map<String, List<Integer>> options;
	List<Integer> data = new ArrayList<Integer>();
	List<String> label = new ArrayList<String>();

	public List<String> getLabel() {
		return label;
	}

	public void setLabel(List<String> label) {
		this.label = label;
	}

	public BigInteger getRowID() {
		return rowID;
	}

	public void setRowID(BigInteger rowID) {
		this.rowID = rowID;
	}

	public String getPart() {
		return part;
	}

	public void setPart(String shortPartNo) {
		this.part = shortPartNo;
	}

	public String getShortPartname() {
		return shortPartname;
	}

	public void setShortPartname(String shortPartname) {
		this.shortPartname = shortPartname;
	}

	public String getFactory() {
		return factory;
	}

	public void setFactory(String factory) {
		this.factory = factory;
	}

	public String getModName() {
		return modName;
	}

	public void setModName(String modName) {
		this.modName = modName;
	}

	public Integer getRplQuantity() {
		return rplQuantity;
	}

	public void setRplQuantity(Integer rplQuantity) {
		this.rplQuantity = rplQuantity;
	}

	public Integer getQuantity() {
		return Quantity;
	}

	public void setQuantity(Integer quantity) {
		Quantity = quantity;
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

	public Map<String, List<Integer>> getOptions() {
		return options;
	}

	public void setOptions(Map<String, List<Integer>> options) {
		this.options = options;
	}

}
