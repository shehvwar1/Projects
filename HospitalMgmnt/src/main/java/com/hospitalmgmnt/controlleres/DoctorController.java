package com.hospitalmgmnt.controlleres;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hospitalmgmnt.dto.DoctorDto;
import com.hospitalmgmnt.dto.HospitalDto;
import com.hospitalmgmnt.entities.Doctor;
import com.hospitalmgmnt.entities.Hospital;
import com.hospitalmgmnt.exceptionhandler.DataNotFoundException;
import com.hospitalmgmnt.exceptionhandler.DataNotHandledException;
import com.hospitalmgmnt.servicesimpl.DoctorServiceImpl;

@RestController
public class DoctorController {
	@Autowired
	DoctorServiceImpl doctorServiceImpl;
	
	@PostMapping("/addDoctor")
	ResponseEntity<Doctor> addDoctorRecord(@RequestBody @Valid  DoctorDto doctorDto){
		try
		{
			Doctor doctor = doctorServiceImpl.addDoctorRecord(doctorDto);
			 if(doctor!=null) {
					return new ResponseEntity<Doctor>(doctor,HttpStatus.CREATED);
				}
		}
		catch(Exception ex)
		{
			throw new DataNotFoundException("Unable to handle Doctor Request");
		}
		return new ResponseEntity<Doctor>(HttpStatus.BAD_REQUEST);
	}
	//getting Dcotor details by Its id
	
		@GetMapping(path="/getDoctorById/{doctorId}")
		public ResponseEntity<Doctor> getDoctorById(@PathVariable("doctorId") Long doctorId)
		{
			try {
				Doctor doctor = doctorServiceImpl.getDoctorDetailsById(doctorId);
				if(doctor!=null) {
					return new ResponseEntity<Doctor>(doctor,HttpStatus.FOUND);
				}
			}
			catch(Exception e)
			{
				throw new DataNotFoundException("No Such Doctor with id " + doctorId + " Found");
			}
			 return new ResponseEntity<Doctor>(HttpStatus.NOT_FOUND);
			
		}
		//Getting  all doctors records
		
		@GetMapping(path="/doctors")
		public ResponseEntity<List<Doctor>> getAllDoctors()
		{
			try
			{
			 List<Doctor> doctorList=doctorServiceImpl.displayAll();
			 if(doctorList!=null)
				return new ResponseEntity<List<Doctor>>(doctorList,HttpStatus.FOUND);
			}
			catch(Exception e)
			{
				throw new DataNotFoundException("No Such Doctor Exist");
			}
			return new ResponseEntity<List<Doctor>>(HttpStatus.NOT_FOUND);
		}

		//updating Soctor record based on id
		
		@PutMapping(path="/updateDoctorRecords/{doctorId}")
		public ResponseEntity<String> updateDoctor(@PathVariable("doctorId") Long doctorId, @RequestBody @Valid DoctorDto doctorDto)
		{
			try
			{
			 String doctor=doctorServiceImpl.updateDoctorRecord(doctorId, doctorDto);
			 if(doctor!=null)
				return new ResponseEntity<String>(doctor,HttpStatus.ACCEPTED);
			}
			catch(Exception e)
			{
				throw new DataNotHandledException("Unable to update Doctor records");
			}
			return new ResponseEntity<String>(HttpStatus.NOT_MODIFIED);		
		}
		//deleting Doctor By its Id
		@DeleteMapping(path="/deleteRecordById/{doctorId}")
		public ResponseEntity<String> deleteDoctorRecord(@PathVariable("doctorId") Long doctorId)
		{
			try 
			{
			 String doctor=doctorServiceImpl.deleteDoctorRecordById(doctorId);
			 if(doctor!=null)
				return new ResponseEntity<String>(doctor,HttpStatus.ACCEPTED);
			}
			catch(Exception e)
			{
				throw new DataNotFoundException("Unable to delete doctor records");
			}
			return new ResponseEntity<String>(HttpStatus.NOT_ACCEPTABLE);		
		}
		//deleting all Doctor records
				@DeleteMapping(path="/deleteAllDoctorRecords")
				public ResponseEntity<String> deleteAllDoctorRecord()
				{
					try
					{
					 String doctor=doctorServiceImpl.deleteAllDoctors();
					 if(doctor!=null)
						return new ResponseEntity<String>(doctor,HttpStatus.ACCEPTED);
					}
					catch(Exception e)
					{
						throw new DataNotFoundException("Unable to delete doctor records");
					}
					return new ResponseEntity<String>(HttpStatus.NOT_ACCEPTABLE);		
				}	
			
			//End Of code

}
