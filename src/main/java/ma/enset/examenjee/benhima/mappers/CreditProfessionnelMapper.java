package ma.enset.examenjee.benhima.mappers;

import ma.enset.examenjee.benhima.dtos.CreditProfessionnelDTO;
import ma.enset.examenjee.benhima.entities.CreditProfessionnel;
import org.springframework.stereotype.Service;

@Service
public class CreditProfessionnelMapper {

    public CreditProfessionnelDTO toDTO(CreditProfessionnel credit) {
        CreditProfessionnelDTO dto = new CreditProfessionnelDTO();
        dto.setId(credit.getId());
        dto.setDateDemande(credit.getDateDemande());
        dto.setStatut(credit.getStatut());
        dto.setDateAcception(credit.getDateAcception());
        dto.setMontant(credit.getMontant());
        dto.setDureeRemboursement(credit.getDureeRemboursement());
        dto.setTauxInteret(credit.getTauxInteret());
        dto.setMotif(credit.getMotif());
        dto.setRaisonSociale(credit.getRaisonSociale());
        return dto;
    }

    public CreditProfessionnel toEntity(CreditProfessionnelDTO dto) {
        CreditProfessionnel credit = new CreditProfessionnel();
        credit.setId(dto.getId());
        credit.setDateDemande(dto.getDateDemande());
        credit.setStatut(dto.getStatut());
        credit.setDateAcception(dto.getDateAcception());
        credit.setMontant(dto.getMontant());
        credit.setDureeRemboursement(dto.getDureeRemboursement());
        credit.setTauxInteret(dto.getTauxInteret());
        credit.setMotif(dto.getMotif());
        credit.setRaisonSociale(dto.getRaisonSociale());
        return credit;
    }
}
