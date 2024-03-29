package co.simplon.cdahopitalback.persistance.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.simplon.cdahopitalback.persistance.entity.Bed;

/**
 * Repository interface for accessing and managing Bed entities in the database.
 * Extends JpaRepository to inherit basic CRUD operations.
 */
public interface BedRepository extends JpaRepository<Bed, Long> {

}
