package tn.esprit.autoloccce17.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloccce17.Entities.Agence;
import tn.esprit.autoloccce17.repositories.AgenceRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AgenceServiceImpl implements IAgenceService {

    private final AgenceRepository agenceRepository;

    @Override
    public Agence add(Agence agence) {
        return agenceRepository.save(agence);
    }

    @Override
    public Agence update(Agence agence) {
        return agenceRepository.save(agence);
    }

    @Override
    public List<Agence> getAll() {
        return agenceRepository.findAll();
    }

    @Override
    public Agence getById(Long id) {
        return agenceRepository.findById(id).orElse(null);
    }

    @Override
    public void delete(Long id) {
        agenceRepository.deleteById(id);
    }
}
