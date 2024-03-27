package co.simplon.cdahopitalback.persistance.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.simplon.cdahopitalback.persistance.entity.Patient;

public interface PatientRepository extends JpaRepository<Patient, Long> {

}
