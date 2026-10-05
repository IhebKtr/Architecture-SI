package tn.esprit.autoloccce17.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloccce17.Entities.Contrat;
import tn.esprit.autoloccce17.repositories.ContratRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ContratServiceImpl implements IContratService {

    private final ContratRepository contratRepository;

    @Override
    public Contrat add(Contrat contrat) {
        return contratRepository.save(contrat);
    }

    @Override
    public Contrat update(Contrat contrat) {
        return contratRepository.save(contrat);
    }

    @Override
    public List<Contrat> getAll() {
        return contratRepository.findAll();
    }

    @Override
    public Contrat getById(Long id) {
        return contratRepository.findById(id).orElse(null);
    }

    @Override
    public void delete(Long id) {
        contratRepository.deleteById(id);
    }
}
