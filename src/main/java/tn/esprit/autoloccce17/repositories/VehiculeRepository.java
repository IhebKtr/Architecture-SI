package tn.esprit.autoloccce17.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.autoloccce17.Entities.Vehicule;

@Repository
public interface VehiculeRepository extends JpaRepository<Vehicule, Long> {
}
