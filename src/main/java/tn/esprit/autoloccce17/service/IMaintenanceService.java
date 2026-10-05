package tn.esprit.autoloccce17.service;

import tn.esprit.autoloccce17.Entities.Maintenance;
import java.util.List;

public interface IMaintenanceService {
    Maintenance add(Maintenance maintenance);
    Maintenance update(Maintenance maintenance);
    List<Maintenance> getAll();
    Maintenance getById(Long id);
    void delete(Long id);
}
