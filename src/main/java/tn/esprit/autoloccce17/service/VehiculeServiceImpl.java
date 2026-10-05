package tn.esprit.autoloccce17.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloccce17.Entities.Vehicule;
import tn.esprit.autoloccce17.repositories.VehiculeRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class VehiculeServiceImpl implements IVehiculeService {

    private final VehiculeRepository vehiculeRepository;

    @Override
    public Vehicule add(Vehicule vehicule) {
        return vehiculeRepository.save(vehicule);
    }

    @Override
    public Vehicule update(Vehicule vehicule) {
        return vehiculeRepository.save(vehicule);
    }

    @Override
    public List<Vehicule> getAll() {
        return vehiculeRepository.findAll();
    }

    @Override
    public Vehicule getById(Long id) {
        return vehiculeRepository.findById(id).orElse(null);
    }

    @Override
    public void delete(Long id) {
        vehiculeRepository.deleteById(id);
    }
}
