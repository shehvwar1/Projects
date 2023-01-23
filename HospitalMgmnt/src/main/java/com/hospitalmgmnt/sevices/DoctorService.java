package com.hospitalmgmnt.sevices;

import java.util.List;

import com.hospitalmgmnt.dto.DoctorDto;
import com.hospitalmgmnt.entities.Doctor;

public interface DoctorService {
	public Doctor addDoctorRecord(DoctorDto doctordto);
	public Doctor getDoctorDetailsById(Long doctorId);
	public List<Doctor> displayAll();
	public String updateDoctorRecord(Long doctorId, DoctorDto params);
	public String deleteDoctorRecordById(Long doctorId);
	public String deleteAllDoctors();

}
