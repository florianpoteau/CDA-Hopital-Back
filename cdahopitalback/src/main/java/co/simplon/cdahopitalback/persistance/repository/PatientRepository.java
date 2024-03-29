package co.simplon.cdahopitalback.persistance.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.simplon.cdahopitalback.persistance.entity.Patient;

/**
 * Repository interface for accessing and managing Patient entities in the
 * database.
 * Extends JpaRepository to inherit basic CRUD operations.
 */
public interface PatientRepository extends JpaRepository<Patient, Long> {

}
