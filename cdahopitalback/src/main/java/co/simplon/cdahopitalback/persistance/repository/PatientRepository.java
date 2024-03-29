package co.simplon.cdahopitalback.persistance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import co.simplon.cdahopitalback.persistance.entity.Patient;

/**
 * Repository interface for accessing and managing Patient entities in the
 * database.
 * Extends JpaRepository to inherit basic CRUD operations.
 */
public interface PatientRepository extends JpaRepository<Patient, Long> {

    @Transactional
    @Query("UPDATE Patient p SET p.service.id = :id_service WHERE p.id = :id_patient")
    void updatePatientService(Long id_service, Long id_patient);

}
