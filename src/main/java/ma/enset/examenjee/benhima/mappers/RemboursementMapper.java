package ma.enset.examenjee.benhima.mappers;

import ma.enset.examenjee.benhima.dtos.RemboursementDTO;
import ma.enset.examenjee.benhima.entities.Remboursement;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface RemboursementMapper {
    RemboursementDTO toDTO(Remboursement remboursement);
    Remboursement toEntity(RemboursementDTO dto);
}
