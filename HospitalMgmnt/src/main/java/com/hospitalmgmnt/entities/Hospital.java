package com.hospitalmgmnt.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
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
@Table(name="hospital")
public class Hospital {
	@Id
	private Long hospitalId;	
	@Column
	private String hospitalName;
	@Column
	private String location;
	@Column
	private Long pincode;
	@OneToMany(cascade = CascadeType.ALL)
	//name we can give anything which is a primary key of other table 
	@JoinColumn(name="hospitalId",referencedColumnName = "hospitalId")
	private List<Doctor> doctors;

}
