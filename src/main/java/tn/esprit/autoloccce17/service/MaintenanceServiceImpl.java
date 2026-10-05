package tn.esprit.autoloccce17.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloccce17.Entities.Maintenance;
import tn.esprit.autoloccce17.repositories.MaintenanceRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MaintenanceServiceImpl implements IMaintenanceService {

    private final MaintenanceRepository maintenanceRepository;

    @Override
    public Maintenance add(Maintenance maintenance) {
        return maintenanceRepository.save(maintenance);
    }

    @Override
    public Maintenance update(Maintenance maintenance) {
        return maintenanceRepository.save(maintenance);
    }

    @Override
    public List<Maintenance> getAll() {
        return maintenanceRepository.findAll();
    }

    @Override
    public Maintenance getById(Long id) {
        return maintenanceRepository.findById(id).orElse(null);
    }

    @Override
    public void delete(Long id) {
        maintenanceRepository.deleteById(id);
    }
}
