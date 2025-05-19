package ma.enset.examenjee.benhima.mappers;

import ma.enset.examenjee.benhima.dtos.RemboursementDTO;
import ma.enset.examenjee.benhima.entities.Remboursement;
import org.springframework.stereotype.Service;

@Service
public class RemboursementMapper {

    public RemboursementDTO toDTO(Remboursement remboursement) {
        RemboursementDTO dto = new RemboursementDTO();
        dto.setId(remboursement.getId());
        dto.setDate(remboursement.getDate());
        dto.setMontant(remboursement.getMontant());
        dto.setType(remboursement.getType());
        return dto;
    }

    public Remboursement toEntity(RemboursementDTO dto) {
        Remboursement remboursement = new Remboursement();
        remboursement.setId(dto.getId());
        remboursement.setDate(dto.getDate());
        remboursement.setMontant(dto.getMontant());
        remboursement.setType(dto.getType());
        return remboursement;
    }
}
