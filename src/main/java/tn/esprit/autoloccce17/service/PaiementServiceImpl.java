package tn.esprit.autoloccce17.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloccce17.Entities.Paiement;
import tn.esprit.autoloccce17.repositories.PaiementRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PaiementServiceImpl implements IPaiementService {

    private final PaiementRepository paiementRepository;

    @Override
    public Paiement add(Paiement paiement) {
        return paiementRepository.save(paiement);
    }

    @Override
    public Paiement update(Paiement paiement) {
        return paiementRepository.save(paiement);
    }

    @Override
    public List<Paiement> getAll() {
        return paiementRepository.findAll();
    }

    @Override
    public Paiement getById(Long id) {
        return paiementRepository.findById(id).orElse(null);
    }

    @Override
    public void delete(Long id) {
        paiementRepository.deleteById(id);
    }
}
