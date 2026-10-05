package tn.esprit.autoloccce17.service;

import tn.esprit.autoloccce17.Entities.Agence;
import java.util.List;

public interface IAgenceService {
    Agence add(Agence agence);
    Agence update(Agence agence);
    List<Agence> getAll();
    Agence getById(Long id);
    void delete(Long id);
}
