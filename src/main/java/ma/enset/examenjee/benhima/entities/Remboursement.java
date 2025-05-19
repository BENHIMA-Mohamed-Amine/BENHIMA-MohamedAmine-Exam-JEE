package ma.enset.examenjee.benhima.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.ManyToOne;
import org.springframework.data.annotation.Id;

import java.time.LocalDate;

@Entity
public class Remboursement {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private Long id;

    private LocalDate date;
    private double montant;
    private String type; // Mensualité, Remboursement anticipé

    @ManyToOne
    private Credit credit;
}
