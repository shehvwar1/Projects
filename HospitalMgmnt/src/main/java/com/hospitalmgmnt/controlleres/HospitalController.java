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

import com.hospitalmgmnt.dto.HospitalDto;
import com.hospitalmgmnt.entities.Hospital;
import com.hospitalmgmnt.exceptionhandler.DataNotFoundException;
import com.hospitalmgmnt.exceptionhandler.DataNotHandledException;
import com.hospitalmgmnt.servicesimpl.HospitalServiceImpl;


@RestController
public class HospitalController {
	@Autowired
	HospitalServiceImpl hospitalServiceImpl;
	
	
	//For posting hospital records
	@PostMapping(path="/addHospitalRecord")
	public ResponseEntity<Hospital> addHospitalRecord(@RequestBody @Valid  HospitalDto hospitalDto){
		try
		{
			Hospital hospital = hospitalServiceImpl.addHospitalRecord(hospitalDto);
			 if(hospital!=null) {
					return new ResponseEntity<Hospital>(hospital,HttpStatus.CREATED);
				}
		}
		catch(Exception ex)
		{
			throw new DataNotFoundException("Unable to handle Hospital Request");
		}
		return new ResponseEntity<Hospital>(HttpStatus.BAD_REQUEST);
	}
	//getting hospital details by Its id
	
	@GetMapping(path="/getHospitalById/{hospitalId}")
	public ResponseEntity<Hospital> getHospitalDetailsById(@PathVariable("hospitalId") Long hospitalId)
	{
		try {
			Hospital hospital = hospitalServiceImpl.getHospitalDetailsById(hospitalId);
			if(hospital!=null) {
				return new ResponseEntity<Hospital>(hospital,HttpStatus.FOUND);
			}
		}
		catch(Exception e)
		{
			throw new DataNotFoundException("No Such hospital with id " + hospitalId + " Found");
		}
		 return new ResponseEntity<Hospital>(HttpStatus.NOT_FOUND);
		
	}
	//Getting hospital all hospital records
	
	@GetMapping(path="/hospitals")
	public ResponseEntity<List<Hospital>> getAllHospitals()
	{
		try
		{
		 List<Hospital> hospitalList=hospitalServiceImpl.displayAll();
		 if(hospitalList!=null)
			return new ResponseEntity<List<Hospital>>(hospitalList,HttpStatus.FOUND);
		}
		catch(Exception e)
		{
			throw new DataNotFoundException("No Such hospital Exist");
		}
		return new ResponseEntity<List<Hospital>>(HttpStatus.NOT_FOUND);
	}
	
	//updating hospitall record based on id
	
	@PutMapping(path="/updateHospitalRecords/{hospitalId}")
	public ResponseEntity<String> updateHospital(@PathVariable("hospitalId") Long hospitalId, @RequestBody @Valid HospitalDto hospitalDto)
	{
		try
		{
		 String hospital=hospitalServiceImpl.updateHospitalRecord(hospitalId, hospitalDto);
		 if(hospital!=null)
			return new ResponseEntity<String>(hospital,HttpStatus.ACCEPTED);
		}
		catch(Exception e)
		{
			throw new DataNotHandledException("Unable to update hospital records");
		}
		return new ResponseEntity<String>(HttpStatus.NOT_MODIFIED);		
	}
	//deleting Hosital By its Id
	@DeleteMapping(path="/deleteRecordById/{hospitalId}")
	public ResponseEntity<String> deleteHospitalRecord(@PathVariable("hospitalId") Long hospitalId)
	{
		try 
		{
		 String hospital=hospitalServiceImpl.deleteHospitalRecordById(hospitalId);
		 if(hospital!=null)
			return new ResponseEntity<String>(hospital,HttpStatus.ACCEPTED);
		}
		catch(Exception e)
		{
			throw new DataNotFoundException("Unable to delete hospital records");
		}
		return new ResponseEntity<String>(HttpStatus.NOT_ACCEPTABLE);		
	}
	//deleting all hospital records
		@DeleteMapping(path="/deleteAllHospitalRecords")
		public ResponseEntity<String> deleteAllHospitalRecord()
		{
			try
			{
			 String hospital=hospitalServiceImpl.deleteAllHospitalRecords();
			 if(hospital!=null)
				return new ResponseEntity<String>(hospital,HttpStatus.ACCEPTED);
			}
			catch(Exception e)
			{
				throw new DataNotFoundException("Unable to delete hospital records");
			}
			return new ResponseEntity<String>(HttpStatus.NOT_ACCEPTABLE);		
		}	
	
	//End Of code

}
