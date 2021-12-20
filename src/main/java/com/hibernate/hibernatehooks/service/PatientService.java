package com.hibernate.hibernatehooks.service;

import com.hibernate.hibernatehooks.model.Patient;
import com.hibernate.hibernatehooks.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {

    @Autowired
    private PatientRepository patientRepository;

    public Patient createPatient(Patient patient) {

        return patientRepository.save(patient);
    }

    public List<Patient> findAll() {

        return patientRepository.findAll();
    }
}
