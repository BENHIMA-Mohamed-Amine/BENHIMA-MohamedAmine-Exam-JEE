package ma.enset.examenjee.benhima.mappers;

import ma.enset.examenjee.benhima.dtos.ClientDTO;
import ma.enset.examenjee.benhima.entities.Client;
import org.springframework.stereotype.Service;

@Service
public class ClientMapper {

    public ClientDTO toDTO(Client client) {
        ClientDTO dto = new ClientDTO();
        dto.setId(client.getId());
        dto.setNom(client.getNom());
        dto.setEmail(client.getEmail());
        return dto;
    }

    public Client toEntity(ClientDTO dto) {
        Client client = new Client();
        client.setId(dto.getId());
        client.setNom(dto.getNom());
        client.setEmail(dto.getEmail());
        return client;
    }
}
