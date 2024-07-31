package com.quicksoft.customer.service;

import com.quicksoft.customer.model.dto.CustomerRequest;
import com.quicksoft.customer.model.dto.CustomerResponse;

import java.util.List;


public interface CustomerService {

    String createCustomer(CustomerRequest customerRequest);

    void updateCustomer(CustomerRequest customerRequest);

    Object findCustomerById(String customerId);

    List<CustomerResponse> findAllCustomers();

    Boolean exitsById(String customerId);

    void deleteCustomer(String customerId);
}
