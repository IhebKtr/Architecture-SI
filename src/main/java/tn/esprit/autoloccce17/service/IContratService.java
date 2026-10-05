package tn.esprit.autoloccce17.service;

import tn.esprit.autoloccce17.Entities.Contrat;
import java.util.List;

public interface IContratService {
    Contrat add(Contrat contrat);
    Contrat update(Contrat contrat);
    List<Contrat> getAll();
    Contrat getById(Long id);
    void delete(Long id);
}
