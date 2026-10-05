package tn.esprit.autoloccce17.service;

import tn.esprit.autoloccce17.Entities.Equipement;
import java.util.List;

public interface IEquipementService {
    Equipement add(Equipement equipement);
    Equipement update(Equipement equipement);
    List<Equipement> getAll();
    Equipement getById(Long id);
    void delete(Long id);
}
