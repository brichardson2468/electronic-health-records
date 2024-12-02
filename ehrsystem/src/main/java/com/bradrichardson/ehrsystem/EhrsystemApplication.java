package com.bradrichardson.ehrsystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.CommandLineRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import com.bradrichardson.ehrsystem.model.Patient;
import com.bradrichardson.ehrsystem.repository.PatientRepository;

@SpringBootApplication
public class EhrsystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(EhrsystemApplication.class, args);
    }

    @Bean
    @Profile("!test")
    public CommandLineRunner loadData(PatientRepository patientRepository) {
        return (args) -> {
            // Save a couple of patients
            patientRepository.save(new Patient("John", "Doe"));
            patientRepository.save(new Patient("Jane", "Smith"));
        };
    }
}