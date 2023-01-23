package com.hospitalmgmnt.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hospitalmgmnt.entities.Doctor;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {

}
