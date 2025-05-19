package ma.enset.examenjee.benhima.mappers;

import ma.enset.examenjee.benhima.dtos.CreditDTO;
import ma.enset.examenjee.benhima.entities.Credit;
import org.springframework.stereotype.Service;

@Service
public class CreditMapper {

    public CreditDTO toDTO(Credit credit) {
        CreditDTO dto = new CreditDTO();
        dto.setId(credit.getId());
        dto.setDateDemande(credit.getDateDemande());
        dto.setStatut(credit.getStatut());
        dto.setDateAcception(credit.getDateAcception());
        dto.setMontant(credit.getMontant());
        dto.setDureeRemboursement(credit.getDureeRemboursement());
        dto.setTauxInteret(credit.getTauxInteret());
        return dto;
    }

    public Credit toEntity(CreditDTO dto) {
        Credit credit = new Credit();
        credit.setId(dto.getId());
        credit.setDateDemande(dto.getDateDemande());
        credit.setStatut(dto.getStatut());
        credit.setDateAcception(dto.getDateAcception());
        credit.setMontant(dto.getMontant());
        credit.setDureeRemboursement(dto.getDureeRemboursement());
        credit.setTauxInteret(dto.getTauxInteret());
        return credit;
    }
}
