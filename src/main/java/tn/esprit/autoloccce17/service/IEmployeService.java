package tn.esprit.autoloccce17.service;

import tn.esprit.autoloccce17.Entities.Employe;
import java.util.List;

public interface IEmployeService {
    Employe add(Employe employe);
    Employe update(Employe employe);
    List<Employe> getAll();
    Employe getById(Long id);
    void delete(Long id);
}
