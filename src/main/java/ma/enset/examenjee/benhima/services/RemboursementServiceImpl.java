package ma.enset.examenjee.benhima.services;

import ma.enset.examenjee.benhima.dtos.RemboursementDTO;
import ma.enset.examenjee.benhima.entities.Credit;
import ma.enset.examenjee.benhima.entities.Remboursement;
import ma.enset.examenjee.benhima.mappers.RemboursementMapper;
import ma.enset.examenjee.benhima.repositories.CreditRepository;
import ma.enset.examenjee.benhima.repositories.RemboursementRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RemboursementServiceImpl implements RemboursementService {
    private final RemboursementRepository remboursementRepository;
    private final CreditRepository creditRepository;
    private final RemboursementMapper remboursementMapper;

    public RemboursementServiceImpl(RemboursementRepository remboursementRepository, CreditRepository creditRepository, RemboursementMapper remboursementMapper) {
        this.remboursementRepository = remboursementRepository;
        this.creditRepository = creditRepository;
        this.remboursementMapper = remboursementMapper;
    }

    @Override
    public RemboursementDTO addRemboursementToCredit(Long creditId, RemboursementDTO remboursementDTO) {
        Credit credit = creditRepository.findById(creditId)
                .orElseThrow(() -> new RuntimeException("Credit not found"));
        Remboursement remboursement = remboursementMapper.toEntity(remboursementDTO);
        remboursement.setCredit(credit);
        Remboursement saved = remboursementRepository.save(remboursement);
        return remboursementMapper.toDTO(saved);
    }

    @Override
    public RemboursementDTO getRemboursement(Long id) {
        Remboursement remboursement = remboursementRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Remboursement not found"));
        return remboursementMapper.toDTO(remboursement);
    }

    @Override
    public List<RemboursementDTO> getRemboursementsByCredit(Long creditId) {
        List<Remboursement> remboursements = remboursementRepository.findByCreditId(creditId);
        return remboursements.stream().map(remboursementMapper::toDTO).collect(Collectors.toList());
    }

    @Override
    public RemboursementDTO updateRemboursement(Long id, RemboursementDTO remboursementDTO) {
        Remboursement remboursement = remboursementRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Remboursement not found"));
        remboursement.setDate(remboursementDTO.getDate());
        remboursement.setMontant(remboursementDTO.getMontant());
        remboursement.setType(remboursementDTO.getType());
        Remboursement updated = remboursementRepository.save(remboursement);
        return remboursementMapper.toDTO(updated);
    }

    @Override
    public void deleteRemboursement(Long id) {
        remboursementRepository.deleteById(id);
    }
}
