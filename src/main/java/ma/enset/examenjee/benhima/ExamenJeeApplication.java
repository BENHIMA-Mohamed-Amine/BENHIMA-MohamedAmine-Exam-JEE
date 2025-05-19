package ma.enset.examenjee.benhima;

import ma.enset.examenjee.benhima.entities.*;
import ma.enset.examenjee.benhima.repositories.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;

@SpringBootApplication
public class ExamenJeeApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExamenJeeApplication.class, args);
    }

    @Bean
    CommandLineRunner start(
            ClientRepository clientRepo,
            CreditPersonnelRepository creditPersonnelRepo,
            CreditImmobilierRepository creditImmobilierRepo,
            CreditProfessionnelRepository creditProfessionnelRepo,
            RemboursementRepository remboursementRepo
    ) {
        return args -> {
            Client client = clientRepo.save(new Client(null, "Ali", "ali@example.com", null));

            CreditPersonnel cp = new CreditPersonnel();
            cp.setClient(client);
            cp.setDateDemande(LocalDate.now());
            cp.setStatut("En cours");
            cp.setMontant(10000);
            cp.setDureeRemboursement(24);
            cp.setTauxInteret(3.5);
            cp.setMotif("Achat voiture");
            creditPersonnelRepo.save(cp);

            CreditImmobilier ci = new CreditImmobilier();
            ci.setClient(client);
            ci.setDateDemande(LocalDate.now());
            ci.setStatut("Accepté");
            ci.setDateAcception(LocalDate.now());
            ci.setMontant(200000);
            ci.setDureeRemboursement(240);
            ci.setTauxInteret(2.1);
            ci.setTypeBien("Appartement");
            creditImmobilierRepo.save(ci);

            CreditProfessionnel cpro = new CreditProfessionnel();
            cpro.setClient(client);
            cpro.setDateDemande(LocalDate.now());
            cpro.setStatut("Rejeté");
            cpro.setMontant(50000);
            cpro.setDureeRemboursement(36);
            cpro.setTauxInteret(4.0);
            cpro.setMotif("Investissement");
            cpro.setRaisonSociale("TechCorp SARL");
            creditProfessionnelRepo.save(cpro);

            remboursementRepo.save(new Remboursement(null, LocalDate.now(), 500.0, "Mensualité", cp));
        };
    }
}
