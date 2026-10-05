package tn.esprit.autoloccce17.service;

import tn.esprit.autoloccce17.Entities.Vehicule;
import java.util.List;

public interface IVehiculeService {
    Vehicule add(Vehicule vehicule);
    Vehicule update(Vehicule vehicule);
    List<Vehicule> getAll();
    Vehicule getById(Long id);
    void delete(Long id);
}
