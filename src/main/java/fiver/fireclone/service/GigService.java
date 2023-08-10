package fiver.fireclone.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fiver.fireclone.models.Gig;
import fiver.fireclone.repositories.GigRepository;

@Service
public class GigService {

    private final GigRepository gigRepository;

    public GigService(GigRepository gigRepository) {
        this.gigRepository = gigRepository;
    }

    public Gig createGig(Gig gig) {
        return gigRepository.save(gig);
    }

    public void deleteGig(String id) {
        gigRepository.deleteById(id);
    }

    public Gig getGig(String id) {
        return gigRepository.findById(id).orElse(null);
    }

    public List<Gig> getGigs() {
        return gigRepository.findAll();
    }
}
