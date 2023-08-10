package fiver.fireclone.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import fiver.fireclone.models.Gig;
import fiver.fireclone.service.GigService;

import java.util.List;

@RestController
@RequestMapping("/gigs")
public class GigController {

    private final GigService gigService;

    public GigController(GigService gigService) {
        this.gigService = gigService;
    }

    @PostMapping
    public Gig createGig(@RequestBody Gig gig) {
        return gigService.createGig(gig);
    }

    @DeleteMapping("/{id}")
    public void deleteGig(@PathVariable String id) {
        gigService.deleteGig(id);
    }

    @GetMapping("/single/{id}")
    public ResponseEntity<Gig> getGig(@PathVariable String id) {
        var gig = gigService.getGig(id);
        if (gig == null)
            return ResponseEntity.badRequest().body(new Gig());

        else
            return ResponseEntity.ok(gig);
    }

    @GetMapping
    public List<Gig> getGigs() {
        return gigService.getGigs();
    }
}
