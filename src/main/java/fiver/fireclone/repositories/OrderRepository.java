package fiver.fireclone.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import fiver.fireclone.models.Order;

public interface OrderRepository extends MongoRepository<Order, String> {
    // Add any additional custom queries you need
}
