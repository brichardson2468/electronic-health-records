package com.bradrichardson.ehrsystem.service;

import com.bradrichardson.ehrsystem.model.Patient;
import java.util.List;

public interface PatientService {
    List<Patient> getAllPatients();
    Patient getPatientById(Long id);
    Patient savePatient(Patient patient);
    void deletePatient(Long id);
}