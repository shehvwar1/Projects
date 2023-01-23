package com.hospitalmgmnt.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

@Entity
@Table(name="doctor")
public class Doctor {
	@Id
	private Long doctorId;
	@Column
	private String doctorName;
	@Column
	private Long contactNumber;
	@Column
	private String email;
	@Column
	private String address;

}
