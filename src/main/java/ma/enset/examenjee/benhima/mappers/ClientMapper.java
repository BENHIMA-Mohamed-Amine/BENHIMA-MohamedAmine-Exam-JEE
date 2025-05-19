package ma.enset.examenjee.benhima.mappers;

import ma.enset.examenjee.benhima.dtos.ClientDTO;
import ma.enset.examenjee.benhima.entities.Client;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ClientMapper {
    ClientDTO toDTO(Client client);
    Client toEntity(ClientDTO dto);
}
