package co.simplon.cdahopitalback.persistance.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.simplon.cdahopitalback.persistance.entity.Bedroom;

/**
 * Repository interface for accessing and managing Bedroom entities in the
 * database.
 * Extends JpaRepository to inherit basic CRUD operations.
 */
public interface BedroomRepository extends JpaRepository<Bedroom, Long> {

}
