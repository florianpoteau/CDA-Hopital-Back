package co.simplon.cdahopitalback.persistance.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.simplon.cdahopitalback.persistance.entity.Bed;

public interface BedRepository extends JpaRepository<Bed, Long> {

}
