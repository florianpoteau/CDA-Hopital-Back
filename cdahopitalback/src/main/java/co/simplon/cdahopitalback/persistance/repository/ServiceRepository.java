package co.simplon.cdahopitalback.persistance.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.simplon.cdahopitalback.persistance.entity.Service;

public interface ServiceRepository extends JpaRepository<Service, Long> {

}
