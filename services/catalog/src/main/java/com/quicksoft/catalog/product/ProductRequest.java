package com.quicksoft.catalog.product;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;

import java.math.BigDecimal;

public record ProductRequest(
        Integer id,
        @NotNull
        String name,
        @NotNull
        String description,
        @PositiveOrZero
        double qty,
        @Positive
        BigDecimal price,
        @NotNull
        Integer categoryId
) {
}
