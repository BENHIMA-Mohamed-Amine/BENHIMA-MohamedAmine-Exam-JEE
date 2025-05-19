package ma.enset.examenjee.benhima.mappers;

import ma.enset.examenjee.benhima.dtos.CreditPersonnelDTO;
import ma.enset.examenjee.benhima.entities.CreditPersonnel;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CreditPersonnelMapper {
    CreditPersonnelDTO toDTO(CreditPersonnel creditPersonnel);
    CreditPersonnel toEntity(CreditPersonnelDTO dto);
}
