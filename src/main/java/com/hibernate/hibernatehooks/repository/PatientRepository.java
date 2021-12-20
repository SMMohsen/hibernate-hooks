package com.hibernate.hibernatehooks.repository;

import com.hibernate.hibernatehooks.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient,Long> {
}
