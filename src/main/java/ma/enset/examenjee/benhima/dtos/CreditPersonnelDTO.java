package ma.enset.examenjee.benhima.dtos;

import lombok.Data;

@Data
public class CreditPersonnelDTO extends CreditDTO {
    public String getMotif() {
        return motif;
    }
    private String motif;
}
