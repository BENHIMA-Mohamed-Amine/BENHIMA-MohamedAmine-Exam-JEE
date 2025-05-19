package ma.enset.examenjee.benhima.services;

import ma.enset.examenjee.benhima.dtos.RemboursementDTO;
import java.util.List;

public interface RemboursementService {
    RemboursementDTO addRemboursementToCredit(Long creditId, RemboursementDTO remboursementDTO);
    RemboursementDTO getRemboursement(Long id);
    List<RemboursementDTO> getRemboursementsByCredit(Long creditId);
    RemboursementDTO updateRemboursement(Long id, RemboursementDTO remboursementDTO);
    void deleteRemboursement(Long id);
}
