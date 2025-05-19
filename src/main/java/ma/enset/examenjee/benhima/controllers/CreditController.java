package ma.enset.examenjee.benhima.controllers;

import ma.enset.examenjee.benhima.dtos.CreditDTO;
import ma.enset.examenjee.benhima.services.CreditService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/credits")
public class CreditController {
    private final CreditService creditService;

    public CreditController(CreditService creditService) {
        this.creditService = creditService;
    }

    // Add a credit for a client
    @PostMapping("/client/{clientId}")
    public ResponseEntity<CreditDTO> addCreditToClient(@PathVariable Long clientId, @RequestBody CreditDTO creditDTO) {
        return ResponseEntity.ok(creditService.addCreditToClient(clientId, creditDTO));
    }

    @GetMapping("/{id}")
    public ResponseEntity<CreditDTO> getCredit(@PathVariable Long id) {
        return ResponseEntity.ok(creditService.getCredit(id));
    }

    // Get all credits for a client
    @GetMapping("/client/{clientId}")
    public ResponseEntity<List<CreditDTO>> getCreditsByClient(@PathVariable Long clientId) {
        return ResponseEntity.ok(creditService.getCreditsByClient(clientId));
    }

    @PutMapping("/{id}")
    public ResponseEntity<CreditDTO> updateCredit(@PathVariable Long id, @RequestBody CreditDTO creditDTO) {
        return ResponseEntity.ok(creditService.updateCredit(id, creditDTO));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCredit(@PathVariable Long id) {
        creditService.deleteCredit(id);
        return ResponseEntity.noContent().build();
    }
}
