package tn.esprit.autoloccce17.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloccce17.Entities.Employe;
import tn.esprit.autoloccce17.repositories.EmployeRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeServiceImpl implements IEmployeService {

    private final EmployeRepository employeRepository;

    @Override
    public Employe add(Employe employe) {
        return employeRepository.save(employe);
    }

    @Override
    public Employe update(Employe employe) {
        return employeRepository.save(employe);
    }

    @Override
    public List<Employe> getAll() {
        return employeRepository.findAll();
    }

    @Override
    public Employe getById(Long id) {
        return employeRepository.findById(id).orElse(null);
    }

    @Override
    public void delete(Long id) {
        employeRepository.deleteById(id);
    }
}
