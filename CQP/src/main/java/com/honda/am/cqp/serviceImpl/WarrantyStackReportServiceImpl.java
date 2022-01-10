
package com.honda.am.cqp.serviceImpl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.honda.am.cqp.dao.WarrantyStackReportRepository;
import com.honda.am.cqp.dto.SupplierInfoDto;
import com.honda.am.cqp.dto.WarrantyReportsDto;
import com.honda.am.cqp.service.WarrantyStackReportService;

@Service
public class WarrantyStackReportServiceImpl implements WarrantyStackReportService {

	@Autowired
	private WarrantyStackReportRepository warantyStackReportRepository;

	/*
	 * public List<TblCQ_SUPPLIER_INFO> getAllValues() { //return
	 * warantyStackReportRepository.findAll(); }
	 */

	public List<SupplierInfoDto> getSupplierNoName() {
		List<Object[]> tblcqSupplierInfo = warantyStackReportRepository.getSupplierNameNo();
		List<SupplierInfoDto> supplierInfoDtoList = new ArrayList<SupplierInfoDto>();

		for (Object[] dto : tblcqSupplierInfo) {
			;

			SupplierInfoDto supplierInfoDTO = new SupplierInfoDto();
			supplierInfoDTO.setSupplierNameNo((String) dto[0]);
			supplierInfoDTO.setSuppNo((String) dto[1]);

			supplierInfoDtoList.add(supplierInfoDTO);

		}

		return supplierInfoDtoList;
	}

	public List<WarrantyReportsDto> getvaluesBySuppNo(String supplierNo) {
		List<Object[]> tblOverallReplSummary = warantyStackReportRepository.getReportValuesBySupplier(supplierNo);
		ArrayList<WarrantyReportsDto> warrantyInfoDtoList = new ArrayList<WarrantyReportsDto>();
		List<WarrantyReportsDto> newWarrantyList = new ArrayList<WarrantyReportsDto>();

		List<Integer> dataListKA1 = new ArrayList<Integer>();
		List<Integer> dataListKC1 = new ArrayList<Integer>();
		List<Integer> dataListKA2 = new ArrayList<Integer>();
		List<Integer> dataListKC2 = new ArrayList<Integer>();
		List<Integer> dataListKA3 = new ArrayList<Integer>();
		List<Integer> dataListKC3 = new ArrayList<Integer>();

		WarrantyReportsDto warrantyReportsDTO = new WarrantyReportsDto();

		for (Object[] dto : tblOverallReplSummary) {
			String[] ShortPartNo = ((String) dto[1]).split("_", 0);
			System.out.println((String) dto[7]);
			if (dto[7].equals("HMA ODYSSEY")) {

				if (ShortPartNo[1].equals("KA")) {

					warrantyReportsDTO = new WarrantyReportsDto();
					dataListKA1.add((Integer) dto[5]);
					warrantyReportsDTO.setPart("KA");
					warrantyReportsDTO.setCheck("ody_kA");
					warrantyReportsDTO.setPart("KA");
					warrantyReportsDTO.setData(dataListKA1);
					warrantyReportsDTO.setModelfactory((String) dto[7]);
					warrantyInfoDtoList.add(warrantyReportsDTO);
					newWarrantyList = removeDuplicates(warrantyInfoDtoList);
				} else {

					warrantyReportsDTO = new WarrantyReportsDto();
					dataListKC1.add((Integer) dto[5]);
					warrantyReportsDTO.setCheck("ody_kC");
					warrantyReportsDTO.setPart("KC");
					warrantyReportsDTO.setData(dataListKC1);
					warrantyReportsDTO.setModelfactory((String) dto[7]);
					warrantyInfoDtoList.add(warrantyReportsDTO);
					newWarrantyList = removeDuplicates(warrantyInfoDtoList);
				}
			} else if (dto[7].equals("HMA PASSPORT")) {
				if (ShortPartNo[1].equals("KA")) {

					warrantyReportsDTO = new WarrantyReportsDto();
					dataListKA2.add((Integer) dto[5]);
					warrantyReportsDTO.setCheck("pass_kA");
					warrantyReportsDTO.setData(dataListKA2);
					warrantyReportsDTO.setPart("KA");
					warrantyReportsDTO.setModelfactory((String) dto[7]);
					warrantyInfoDtoList.add(warrantyReportsDTO);
					newWarrantyList = removeDuplicates(warrantyInfoDtoList);
				} else {
					warrantyReportsDTO = new WarrantyReportsDto();
					dataListKC2.add((Integer) dto[5]);
					warrantyReportsDTO.setPart("KC");
					warrantyReportsDTO.setCheck("pass_kC");
					warrantyReportsDTO.setData(dataListKC2);
					warrantyReportsDTO.setModelfactory((String) dto[7]);
					warrantyInfoDtoList.add(warrantyReportsDTO);
					newWarrantyList = removeDuplicates(warrantyInfoDtoList);
				}

			} else if (dto[7].equals("MAP TLX")) {
				if (ShortPartNo[1].equals("KA")) {
					warrantyReportsDTO = new WarrantyReportsDto();
					dataListKA3.add((Integer) dto[5]);
					warrantyReportsDTO.setCheck("map_kA");
					warrantyReportsDTO.setData(dataListKA3);
					warrantyReportsDTO.setPart("KA");
					warrantyReportsDTO.setModelfactory((String) dto[7]);
					warrantyInfoDtoList.add(warrantyReportsDTO);
					newWarrantyList = removeDuplicates(warrantyInfoDtoList);
				} else {
					warrantyReportsDTO = new WarrantyReportsDto();
					dataListKC3.add((Integer) dto[5]);
					warrantyReportsDTO.setPart("KC");
					warrantyReportsDTO.setCheck("map_kC");
					warrantyReportsDTO.setData(dataListKC3);
					warrantyReportsDTO.setModelfactory((String) dto[7]);
					warrantyInfoDtoList.add(warrantyReportsDTO);
					newWarrantyList = removeDuplicates(warrantyInfoDtoList);
				}

			} else if (dto[7].equals("ELP MDX")) {
				if (ShortPartNo[1].equals("KA")) {
					warrantyReportsDTO = new WarrantyReportsDto();
					dataListKA3.add((Integer) dto[5]);
					warrantyReportsDTO.setCheck("elp_kA");
					warrantyReportsDTO.setData(dataListKA3);
					warrantyReportsDTO.setPart("KA");
					warrantyReportsDTO.setModelfactory((String) dto[7]);
					warrantyInfoDtoList.add(warrantyReportsDTO);
					newWarrantyList = removeDuplicates(warrantyInfoDtoList);
				} else {
					warrantyReportsDTO = new WarrantyReportsDto();
					dataListKC3.add((Integer) dto[5]);
					warrantyReportsDTO.setPart("KC");
					warrantyReportsDTO.setCheck("elp_kC");
					warrantyReportsDTO.setData(dataListKC3);
					warrantyReportsDTO.setModelfactory((String) dto[7]);
					warrantyInfoDtoList.add(warrantyReportsDTO);
					newWarrantyList = removeDuplicates(warrantyInfoDtoList);
				}
			}
		}
		return newWarrantyList;

	}

	public static <T> List<WarrantyReportsDto> removeDuplicates(ArrayList<WarrantyReportsDto> list) {
		Set<String> deptSet = new HashSet<>();
		for (WarrantyReportsDto employee : list) {
			System.out.println(employee.getModelfactory());
		}
		list.removeIf(p -> !deptSet.add(p.getCheck()));

		list.forEach(dept -> System.out.println(dept.getModelfactory()));
		return list;
	}

}
