package com.hospitalmgmnt.dto;

import java.util.List;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.hospitalmgmnt.entities.Doctor;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class HospitalDto {
	@NotNull(message="Hospital Id cannot be Null")
	private Long hospitalId;	
	@NotEmpty(message="please enter hospital name")
	 @Size(max = 20, min = 3, message = "Invalid hospital name")
	private String hospitalName;
	@Size(max = 20, min = 3, message = "Invalid Location")
	@NotEmpty(message="location field cannot be empty")
	private String location;
	@NotNull(message="pincode cannot be empty")
	private Long pincode;
	private List<Doctor> doctors;

}
