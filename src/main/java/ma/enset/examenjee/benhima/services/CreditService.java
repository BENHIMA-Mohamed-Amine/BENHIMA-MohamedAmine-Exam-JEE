package ma.enset.examenjee.benhima.services;

import ma.enset.examenjee.benhima.dtos.CreditDTO;
import java.util.List;

public interface CreditService {
    CreditDTO addCreditToClient(Long clientId, CreditDTO creditDTO);
    CreditDTO getCredit(Long id);
    List<CreditDTO> getCreditsByClient(Long clientId);
    CreditDTO updateCredit(Long id, CreditDTO creditDTO);
    void deleteCredit(Long id);
}
