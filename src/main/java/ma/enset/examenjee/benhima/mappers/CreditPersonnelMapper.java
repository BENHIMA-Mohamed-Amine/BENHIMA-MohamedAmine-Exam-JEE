package ma.enset.examenjee.benhima.mappers;

import ma.enset.examenjee.benhima.dtos.CreditPersonnelDTO;
import ma.enset.examenjee.benhima.entities.CreditPersonnel;
import org.springframework.stereotype.Service;

@Service
public class CreditPersonnelMapper {

    public CreditPersonnelDTO toDTO(CreditPersonnel credit) {
        CreditPersonnelDTO dto = new CreditPersonnelDTO();
        dto.setId(credit.getId());
        dto.setDateDemande(credit.getDateDemande());
        dto.setStatut(credit.getStatut());
        dto.setDateAcception(credit.getDateAcception());
        dto.setMontant(credit.getMontant());
        dto.setDureeRemboursement(credit.getDureeRemboursement());
        dto.setTauxInteret(credit.getTauxInteret());
        dto.setMotif(credit.getMotif());
        return dto;
    }

    public CreditPersonnel toEntity(CreditPersonnelDTO dto) {
        CreditPersonnel credit = new CreditPersonnel();
        credit.setId(dto.getId());
        credit.setDateDemande(dto.getDateDemande());
        credit.setStatut(dto.getStatut());
        credit.setDateAcception(dto.getDateAcception());
        credit.setMontant(dto.getMontant());
        credit.setDureeRemboursement(dto.getDureeRemboursement());
        credit.setTauxInteret(dto.getTauxInteret());
        credit.setMotif(dto.getMotif());
        return credit;
    }
}
