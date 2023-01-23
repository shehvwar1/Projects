package com.hospitalmgmnt.sevices;

import java.util.List;

import com.hospitalmgmnt.dto.HospitalDto;
import com.hospitalmgmnt.entities.Hospital;

public interface HospitalService {
	//public Hospital addHospitalAndDoctorRecord(HospitalDto hospitalDto);
	public Hospital addHospitalRecord(HospitalDto hospitalDto);
	public Hospital getHospitalDetailsById(Long hospitalId);
	public List<Hospital> displayAll();
	public String updateHospitalRecord(Long hospitalId, HospitalDto params);
	public String deleteHospitalRecordById(Long hospitalId);
	public String deleteAllHospitalRecords();

}
