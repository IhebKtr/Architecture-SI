package tn.esprit.autoloccce17.service;

import tn.esprit.autoloccce17.Entities.Client;
import java.util.List;

public interface IClientService {
    Client add(Client client);
    Client update(Client client);
    List<Client> getAll();
    Client getById(Long id);
    void delete(Long id);
}
