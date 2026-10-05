package tn.esprit.autoloccce17.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloccce17.Entities.Equipement;
import tn.esprit.autoloccce17.repositories.EquipementRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EquipementServiceImpl implements IEquipementService {

    private final EquipementRepository equipementRepository;

    @Override
    public Equipement add(Equipement equipement) {
        return equipementRepository.save(equipement);
    }

    @Override
    public Equipement update(Equipement equipement) {
        return equipementRepository.save(equipement);
    }

    @Override
    public List<Equipement> getAll() {
        return equipementRepository.findAll();
    }

    @Override
    public Equipement getById(Long id) {
        return equipementRepository.findById(id).orElse(null);
    }

    @Override
    public void delete(Long id) {
        equipementRepository.deleteById(id);
    }
}
