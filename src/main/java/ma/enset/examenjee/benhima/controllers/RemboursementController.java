package ma.enset.examenjee.benhima.controllers;

import ma.enset.examenjee.benhima.dtos.RemboursementDTO;
import ma.enset.examenjee.benhima.services.RemboursementService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/remboursements")
public class RemboursementController {
    private final RemboursementService remboursementService;

    public RemboursementController(RemboursementService remboursementService) {
        this.remboursementService = remboursementService;
    }

    // Add remboursement to credit
    @PostMapping("/credit/{creditId}")
    public ResponseEntity<RemboursementDTO> addRemboursementToCredit(@PathVariable Long creditId, @RequestBody RemboursementDTO dto) {
        return ResponseEntity.ok(remboursementService.addRemboursementToCredit(creditId, dto));
    }

    @GetMapping("/{id}")
    public ResponseEntity<RemboursementDTO> getRemboursement(@PathVariable Long id) {
        return ResponseEntity.ok(remboursementService.getRemboursement(id));
    }

    // Get remboursements for a credit
    @GetMapping("/credit/{creditId}")
    public ResponseEntity<List<RemboursementDTO>> getRemboursementsByCredit(@PathVariable Long creditId) {
        return ResponseEntity.ok(remboursementService.getRemboursementsByCredit(creditId));
    }

    @PutMapping("/{id}")
    public ResponseEntity<RemboursementDTO> updateRemboursement(@PathVariable Long id, @RequestBody RemboursementDTO dto) {
        return ResponseEntity.ok(remboursementService.updateRemboursement(id, dto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteRemboursement(@PathVariable Long id) {
        remboursementService.deleteRemboursement(id);
        return ResponseEntity.noContent().build();
    }
}
