package tn.esprit.autoloccce17.service;

import tn.esprit.autoloccce17.Entities.Reservation;
import java.util.List;

public interface IReservationService {
    Reservation add(Reservation reservation);
    Reservation update(Reservation reservation);
    List<Reservation> getAll();
    Reservation getById(Long id);
    void delete(Long id);
}
