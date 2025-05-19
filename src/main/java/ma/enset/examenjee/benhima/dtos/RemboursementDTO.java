package ma.enset.examenjee.benhima.dtos;

import java.time.LocalDate;

public class RemboursementDTO {
    private Long id;
    private LocalDate date;
    private double montant;
    private String type;
    private Long creditId;
}
