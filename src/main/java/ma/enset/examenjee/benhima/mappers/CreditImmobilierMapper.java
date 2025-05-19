package ma.enset.examenjee.benhima.mappers;

import ma.enset.examenjee.benhima.dtos.CreditImmobilierDTO;
import ma.enset.examenjee.benhima.entities.CreditImmobilier;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CreditImmobilierMapper {
    CreditImmobilierDTO toDTO(CreditImmobilier creditImmobilier);
    CreditImmobilier toEntity(CreditImmobilierDTO dto);
}
