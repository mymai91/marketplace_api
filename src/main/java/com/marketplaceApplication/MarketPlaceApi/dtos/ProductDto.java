package com.marketplaceApplication.MarketPlaceApi.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;
import lombok.Value;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.Instant;

/**
 * DTO for {@link com.marketplaceApplication.MarketPlaceApi.entities.Product}
 */
@Value
public class ProductDto implements Serializable {
    String title;
    BigDecimal price;
    Boolean published;
    Instant createdAt;
    Instant updatedAt;
    UserDto user;

    /**
     * DTO for {@link com.marketplaceApplication.MarketPlaceApi.entities.User}
     */
    @Value
    public static class UserDto implements Serializable {
        Long id;
        @Size(max = 255)
        String name;
        @Size(max = 255)
        String password;
        @Email(message = "Incorrect Email")
        String email;
        Instant createdAt;
        Instant updatedAt;
    }
}