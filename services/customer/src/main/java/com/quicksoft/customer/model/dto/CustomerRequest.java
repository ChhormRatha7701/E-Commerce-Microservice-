package com.quicksoft.customer.model.dto;

import com.quicksoft.customer.model.Address;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

public record CustomerRequest(
        String id,
        @NotNull
        String firstname,
        @NotNull
        String lastname,
        @NotNull
        @Email
        String email,
        Address address
) {
}
