package ma.enset.examenjee.benhima.services;

import ma.enset.examenjee.benhima.dtos.ClientDTO;
import java.util.List;

public interface ClientService {
    ClientDTO addClient(ClientDTO clientDTO);
    ClientDTO getClient(Long id);
    List<ClientDTO> getAllClients();
    ClientDTO updateClient(Long id, ClientDTO clientDTO);
    void deleteClient(Long id);
}
