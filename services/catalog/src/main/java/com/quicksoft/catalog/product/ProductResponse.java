package com.quicksoft.catalog.product;

import java.math.BigDecimal;

public record ProductResponse(
        Integer id,
        String name,
        String description,
        double qty,
        BigDecimal price,
        Integer categoryId,
        String categoryName,
        String categoryDescription
) {
}
