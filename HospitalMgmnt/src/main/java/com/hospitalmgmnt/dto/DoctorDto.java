package com.hospitalmgmnt.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
//import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
//import javax.validation.constraints.*;
import org.hibernate.validator.constraints.*;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DoctorDto {
	 @NotNull(message = "Please enter id")
		private Long doctorId;
		 @Size(max = 20, min = 3, message = "{user.name.invalid}")
		 @NotEmpty(message = "Please enter name")
		private String doctorName;
		@NotNull(message="contact Number cannot be empty")
		private Long contactNumber;
		@Email(message="invalid format")
		private String email;
		@NotEmpty(message="address fields cannot be empty")
		private String address;

}
