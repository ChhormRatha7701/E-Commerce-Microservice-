package com.quicksoft.customer.model.dto;

import com.quicksoft.customer.model.Address;

public record CustomerResponse(
        String id,
        String firstname,
        String lastname,
        String email,
        Address address
) {
}
