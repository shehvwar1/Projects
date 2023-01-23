package com.hospitalmgmnt.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hospitalmgmnt.entities.Hospital;

public interface HospitalRepository extends JpaRepository<Hospital, Long>{

}
