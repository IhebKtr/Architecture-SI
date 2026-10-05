package tn.esprit.autoloccce17.service;

import tn.esprit.autoloccce17.Entities.Paiement;
import java.util.List;

public interface IPaiementService {
    Paiement add(Paiement paiement);
    Paiement update(Paiement paiement);
    List<Paiement> getAll();
    Paiement getById(Long id);
    void delete(Long id);
}
