package tn.esprit.autoloccce17.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idReservation;

    private LocalDate dateDebut;
    private LocalDate dateFin;

    @Enumerated(EnumType.STRING)
    private StatutReservation statut;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idClient")
    private Client client;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idVehicule")
    private Vehicule vehicule;

    @OneToOne(mappedBy = "reservation")
    private Contrat contrat;
}
