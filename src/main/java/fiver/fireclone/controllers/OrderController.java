package fiver.fireclone.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import fiver.fireclone.Dto.OrderConfirmationRequest;
import fiver.fireclone.models.Order;
import fiver.fireclone.service.OrderService;

import java.util.List;

// @RestController
// @RequestMapping("/orders")
// public class OrderController {

// private final OrderService orderService;

// public OrderController(OrderService orderService) {
// this.orderService = orderService;
// }

// @GetMapping
// public List<Order> getOrders() {
// // Implement getOrders logic using orderService
// }

// @PostMapping("/create-payment-intent/{id}")
// public ResponseEntity<String> createPaymentIntent(@PathVariable String id) {
// // Implement createPaymentIntent logic using orderService
// }

// @PutMapping
// public ResponseEntity<String> confirmOrder(@RequestBody
// OrderConfirmationRequest request) {
// // Implement confirmOrder logic using orderService
// }
// }
