package com.hospitalmgmnt.servicesimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospitalmgmnt.dto.DoctorDto;
import com.hospitalmgmnt.entities.Doctor;
import com.hospitalmgmnt.repositories.DoctorRepository;
import com.hospitalmgmnt.sevices.DoctorService;

@Service
public class DoctorServiceImpl implements DoctorService{
	//Doctor doctor;
	@Autowired
	DoctorRepository doctorRepository;

	@Override
	public Doctor addDoctorRecord(DoctorDto doctordto) {
	  Doctor doctor = Doctor.builder()
				.doctorId(doctordto.getDoctorId())
				.doctorName(doctordto.getDoctorName())
				.contactNumber(doctordto.getContactNumber())
				.email(doctordto.getEmail())
				.address(doctordto.getAddress())
				.build();
		return doctorRepository.save(doctor);
	}

	@Override
	public Doctor getDoctorDetailsById(Long doctorId) {
		return doctorRepository.findById(doctorId).get();
	}

	@Override
	public List<Doctor> displayAll() {
		return doctorRepository.findAll();
	}

	@Override
	public String updateDoctorRecord(Long doctorId, DoctorDto params) {
		Doctor doctor;
		doctor= doctorRepository.findById(doctorId).get();
		doctor.setDoctorName(params.getDoctorName());
		doctor.setContactNumber(params.getContactNumber());
		doctor.setEmail(params.getEmail());
		doctor.setAddress(params.getAddress());
		doctorRepository.save(doctor);
		return "Doctor records Updated Successfully";
	}

	@Override
	public String deleteDoctorRecordById(Long doctorId) {
		doctorRepository.deleteById(doctorId);
		return "Doctor Record With Id " + doctorId + " is deleted siccessfully";
	}

	@Override
	public String deleteAllDoctors() {
		doctorRepository.deleteAll();
		return "All Doctor Records Deleted successfully";
	}

}
