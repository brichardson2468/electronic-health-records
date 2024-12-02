package com.bradrichardson.ehrsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.bradrichardson.ehrsystem.model.Patient;

public interface PatientRepository extends JpaRepository<Patient, Long> {
    // Additional query methods can be defined here if needed
}