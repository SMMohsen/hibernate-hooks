package com.hibernate.hibernatehooks.controller;

import com.hibernate.hibernatehooks.model.Patient;
import com.hibernate.hibernatehooks.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patients")
public class PatientController {

    @Autowired
    private PatientService patientService;


    @PostMapping
    public Patient createPatient(@RequestBody Patient patient) {


        return patientService.createPatient(patient);
    }

    @GetMapping
    public List<Patient> getAll() {

        return patientService.findAll();
    }
}
