package tn.esprit.autoloccce17.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.autoloccce17.Entities.Equipement;

@Repository
public interface EquipementRepository extends JpaRepository<Equipement, Long> {
}
