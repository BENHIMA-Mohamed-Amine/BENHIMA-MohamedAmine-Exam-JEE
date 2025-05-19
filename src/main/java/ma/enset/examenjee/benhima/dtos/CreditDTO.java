package ma.enset.examenjee.benhima.dtos;

import lombok.Data;

import java.time.LocalDate;

@Data
public class CreditDTO {
    private Long id;
    private LocalDate dateDemande;
    private String statut;
    private LocalDate dateAcception;
    private double montant;
    private int dureeRemboursement;
    private double tauxInteret;
    private Long clientId;
}
