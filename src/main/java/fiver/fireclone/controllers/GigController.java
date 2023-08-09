package fiver.fireclone.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import fiver.fireclone.models.Gig;
import fiver.fireclone.service.GigService;

import java.util.List;

@RestController
@RequestMapping("/gigs")
public class GigController {

    private final GigService gigService;

    @Autowired
    public GigController(GigService gigService) {
        this.gigService = gigService;
    }

    @PostMapping
    public Gig createGig(@RequestBody Gig gig) {
        // Implement createGig logic using gigService
    }

    @DeleteMapping("/{id}")
    public void deleteGig(@PathVariable String id) {
        // Implement deleteGig logic using gigService
    }

    @GetMapping("/single/{id}")
    public Gig getGig(@PathVariable String id) {
        // Implement getGig logic using gigService
    }

    @GetMapping
    public List<Gig> getGigs() {
        // Implement getGigs logic using gigService
    }
}
