package com.quicksoft.customer.controller;

import com.quicksoft.customer.model.dto.CustomerRequest;
import com.quicksoft.customer.model.dto.CustomerResponse;
import com.quicksoft.customer.service.CustomerService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/v1/customers")
@RequiredArgsConstructor
public class CustomerController {
    private final CustomerService customerService;

    @PostMapping
    public ResponseEntity<?> getCustomers(@RequestBody @Valid CustomerRequest customerRequest) {
        return ResponseEntity.ok(customerService.createCustomer(customerRequest));
    }

    @PutMapping
    public ResponseEntity<?> updateCustomer(@RequestBody @Valid CustomerRequest customerRequest) {
        customerService.updateCustomer(customerRequest);
        return ResponseEntity.accepted().build();
    }


    @GetMapping("/exits/{customer-id}")
    public ResponseEntity<?> exitsById(@PathVariable(name = "customer-id") String customerId) {
        return ResponseEntity.ok(customerService.exitsById(customerId));
    }

    @GetMapping("/{customer-id}")
    public ResponseEntity<?> getCustomerById(@PathVariable(name = "customer-id") String customerId) {
        return ResponseEntity.ok(customerService.findCustomerById(customerId));
    }

    @GetMapping
    public ResponseEntity<List<CustomerResponse>> getAllCustomers() {
        return ResponseEntity.ok(customerService.findAllCustomers());
    }

    @DeleteMapping("/{customer-id}")

    public ResponseEntity<?> deleteCustomer(@PathVariable(name = "customer-id") String customerId) {
        customerService.deleteCustomer(customerId);
        return ResponseEntity.accepted().build();
    }
}
