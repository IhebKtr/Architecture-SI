package tn.esprit.autoloccce17.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloccce17.Entities.Reservation;
import tn.esprit.autoloccce17.repositories.ReservationRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ReservationServiceImpl implements IReservationService {

    private final ReservationRepository reservationRepository;

    @Override
    public Reservation add(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    @Override
    public Reservation update(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    @Override
    public List<Reservation> getAll() {
        return reservationRepository.findAll();
    }

    @Override
    public Reservation getById(Long id) {
        return reservationRepository.findById(id).orElse(null);
    }

    @Override
    public void delete(Long id) {
        reservationRepository.deleteById(id);
    }
}
