package ma.enset.examenjee.benhima.repositories;

import ma.enset.examenjee.benhima.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}

