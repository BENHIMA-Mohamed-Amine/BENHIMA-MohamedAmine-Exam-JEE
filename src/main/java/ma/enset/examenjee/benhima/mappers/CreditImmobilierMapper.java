package ma.enset.examenjee.benhima.mappers;

import ma.enset.examenjee.benhima.dtos.CreditImmobilierDTO;
import ma.enset.examenjee.benhima.entities.CreditImmobilier;
import org.springframework.stereotype.Service;

@Service
public class CreditImmobilierMapper {

    public CreditImmobilierDTO toDTO(CreditImmobilier credit) {
        CreditImmobilierDTO dto = new CreditImmobilierDTO();
        dto.setId(credit.getId());
        dto.setDateDemande(credit.getDateDemande());
        dto.setStatut(credit.getStatut());
        dto.setDateAcception(credit.getDateAcception());
        dto.setMontant(credit.getMontant());
        dto.setDureeRemboursement(credit.getDureeRemboursement());
        dto.setTauxInteret(credit.getTauxInteret());
        dto.setTypeBien(credit.getTypeBien());
        return dto;
    }

    public CreditImmobilier toEntity(CreditImmobilierDTO dto) {
        CreditImmobilier credit = new CreditImmobilier();
        credit.setId(dto.getId());
        credit.setDateDemande(dto.getDateDemande());
        credit.setStatut(dto.getStatut());
        credit.setDateAcception(dto.getDateAcception());
        credit.setMontant(dto.getMontant());
        credit.setDureeRemboursement(dto.getDureeRemboursement());
        credit.setTauxInteret(dto.getTauxInteret());
        credit.setTypeBien(dto.getTypeBien());
        return credit;
    }
}
