package com.hospitalmgmnt.servicesimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospitalmgmnt.dto.HospitalDto;
import com.hospitalmgmnt.entities.Hospital;
import com.hospitalmgmnt.repositories.HospitalRepository;
import com.hospitalmgmnt.sevices.HospitalService;

@Service
public class HospitalServiceImpl implements HospitalService{
	
	@Autowired
	HospitalRepository hospitalRepository;

	@Override
	public Hospital addHospitalRecord(HospitalDto hospitalDto) {
		Hospital hospital = Hospital.builder()
				.hospitalId(hospitalDto.getHospitalId())
				.hospitalName(hospitalDto.getHospitalName())
				.location(hospitalDto.getLocation())
				.pincode(hospitalDto.getPincode())
				.doctors(hospitalDto.getDoctors())
				.build();
		return hospitalRepository.save(hospital);
	}

	@Override
	public Hospital getHospitalDetailsById(Long hospitalId) {
		return hospitalRepository.findById(hospitalId).get();
	}

	@Override
	public List<Hospital> displayAll() {
		return hospitalRepository.findAll();
	}

	@Override
	public String updateHospitalRecord(Long hospitalId, HospitalDto params) {
		Hospital hospital = hospitalRepository.findById(hospitalId).get();
		hospital.setHospitalName(params.getHospitalName());
		hospital.setLocation(params.getLocation());
		hospital.setPincode(params.getPincode());
		hospitalRepository.save(hospital);
		return "Hospital Records Updated Successfully";
	}

	@Override
	public String deleteHospitalRecordById(Long hospitalId) {
			hospitalRepository.deleteById(hospitalId);
		return "Hospital details with id " + hospitalId + " is deleted successfully";
	}

	@Override
	public String deleteAllHospitalRecords() {
		hospitalRepository.deleteAll();
		return "All hospital records deleted successfully";
	}
	

}
