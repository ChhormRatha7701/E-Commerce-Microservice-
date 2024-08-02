package com.quicksoft.catalog.product;

import jakarta.validation.constraints.NotNull;

public record ProductPurchaseRequest(
        @NotNull
        Integer productId,
        @NotNull
        double qty
) {
}
