package com.honda.am.cqp.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface WarrantyStackReportRepository {

	List<Object[]> getSupplierNameNo();

	List<Object[]> getReportValuesBySupplier(String supplierNo);

}
