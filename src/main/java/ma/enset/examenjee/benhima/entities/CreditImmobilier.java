package ma.enset.examenjee.benhima.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("IMMOBILIER")
public class CreditImmobilier extends Credit {
    private String typeBien; // Appartement, Maison, Local Commercial
}
