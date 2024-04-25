package br.inatel.dm111promo.api.promo.controller;

import br.inatel.dm111promo.api.promo.PromoRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dm111-promo")
public class PromoController {

    private static final Logger log = LoggerFactory.getLogger(PromoController.class);
    private final PromoService service;

    public PromoController(PromoService service) {
        this.service = service;
    }

    @GetMapping("/promo")
    public ResponseEntity<List<Promo>> getPromo() throws ApiException {
        log.debug("Getting all promos");
        var promo = service.searchPromo();
        return ResponseEntity.ok(promo);
    }

    @GetMapping("/promo/{id}")
    public ResponseEntity<Promo> getPromo(@PathVariable("id") String id) throws ApiException {
        log.debug("Getting the promo by id: " + id);
        var promo = service.searchPromo(id);
        return ResponseEntity.ok(promo);
    }

    @PostMapping("/promo")
    public ResponseEntity<Promo> postPromo(@RequestBody PromoRequest request) {
        var promo = service.createPromo(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(promo);
    }

    @PutMapping("/promo/{id}")
    public ResponseEntity<Promo> putPromo(@PathVariable("id") String id,
                                                              @PathVariable("id") String id,
                                                              @RequestBody PromoRequest request)
            throws ApiException {
        var promo = service.updatePromo(id, request);
        return ResponseEntity.ok(promo);
    }

    @DeleteMapping("/promo/{id}")
    public ResponseEntity<?> deletePromo(@PathVariable("id") String id,
                                                   @PathVariable("id") String id) throws ApiException {
        service.removePromo(id);
        return ResponseEntity.noContent().build();
    }
}

