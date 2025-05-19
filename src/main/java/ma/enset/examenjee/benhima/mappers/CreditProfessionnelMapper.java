package ma.enset.examenjee.benhima.mappers;

import ma.enset.examenjee.benhima.dtos.CreditProfessionnelDTO;
import ma.enset.examenjee.benhima.entities.CreditProfessionnel;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CreditProfessionnelMapper {
    CreditProfessionnelDTO toDTO(CreditProfessionnel creditProfessionnel);
    CreditProfessionnel toEntity(CreditProfessionnelDTO dto);
}
