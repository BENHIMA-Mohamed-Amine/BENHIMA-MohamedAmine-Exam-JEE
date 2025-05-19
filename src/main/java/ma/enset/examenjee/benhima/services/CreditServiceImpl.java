package ma.enset.examenjee.benhima.services;

import ma.enset.examenjee.benhima.dtos.CreditDTO;
import ma.enset.examenjee.benhima.entities.Client;
import ma.enset.examenjee.benhima.entities.Credit;
import ma.enset.examenjee.benhima.mappers.CreditMapper;
import ma.enset.examenjee.benhima.repositories.ClientRepository;
import ma.enset.examenjee.benhima.repositories.CreditRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CreditServiceImpl implements CreditService {
    private final CreditRepository creditRepository;
    private final ClientRepository clientRepository;
    private final CreditMapper creditMapper;

    public CreditServiceImpl(CreditRepository creditRepository, ClientRepository clientRepository, CreditMapper creditMapper) {
        this.creditRepository = creditRepository;
        this.clientRepository = clientRepository;
        this.creditMapper = creditMapper;
    }

    @Override
    public CreditDTO addCreditToClient(Long clientId, CreditDTO creditDTO) {
        Client client = clientRepository.findById(clientId)
                .orElseThrow(() -> new RuntimeException("Client not found"));
        Credit credit = creditMapper.toEntity(creditDTO);
        credit.setClient(client);
        Credit savedCredit = creditRepository.save(credit);
        return creditMapper.toDTO(savedCredit);
    }

    @Override
    public CreditDTO getCredit(Long id) {
        Credit credit = creditRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Credit not found"));
        return creditMapper.toDTO(credit);
    }

    @Override
    public List<CreditDTO> getCreditsByClient(Long clientId) {
        List<Credit> credits = creditRepository.findByClientId(clientId);
        return credits.stream().map(creditMapper::toDTO).collect(Collectors.toList());
    }

    @Override
    public CreditDTO updateCredit(Long id, CreditDTO creditDTO) {
        Credit credit = creditRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Credit not found"));
        // Update fields (example)
        credit.setStatut(creditDTO.getStatut());
        credit.setMontant(creditDTO.getMontant());
        credit.setDateAcception(creditDTO.getDateAcception());
        // Add more fields as needed
        Credit updatedCredit = creditRepository.save(credit);
        return creditMapper.toDTO(updatedCredit);
    }

    @Override
    public void deleteCredit(Long id) {
        creditRepository.deleteById(id);
    }
}
