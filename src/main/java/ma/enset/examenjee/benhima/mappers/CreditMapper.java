package ma.enset.examenjee.benhima.mappers;

import ma.enset.examenjee.benhima.dtos.CreditDTO;
import ma.enset.examenjee.benhima.entities.Credit;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CreditMapper {
    CreditDTO toDTO(Credit credit);
    Credit toEntity(CreditDTO dto);
}
