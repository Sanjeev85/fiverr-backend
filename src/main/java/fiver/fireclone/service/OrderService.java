package fiver.fireclone.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import fiver.fireclone.Dto.OrderConfirmationRequest;
import fiver.fireclone.models.Order;
import fiver.fireclone.repositories.OrderRepository;

@Service
public class OrderService {

    private final OrderRepository orderRepository;

    @Autowired
    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public List<Order> getOrders() {
        return orderRepository.findAll();
    }

    public ResponseEntity<String> createPaymentIntent(String id) {
        // Implement createPaymentIntent logic
        return ResponseEntity.ok("Payment intent created");
    }

    public ResponseEntity<String> confirmOrder(OrderConfirmationRequest request) {
        // Implement confirmOrder logic
        return ResponseEntity.ok("Order confirmed");
    }
}
