package co.simplon.cdahopitalback.persistance.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.simplon.cdahopitalback.persistance.entity.Services;

/**
 * Repository interface for accessing and managing service entities in the
 * database.
 * Extends JpaRepository to inherit basic CRUD operations.
 */
public interface ServicesRepository extends JpaRepository<Services, Long> {

}
