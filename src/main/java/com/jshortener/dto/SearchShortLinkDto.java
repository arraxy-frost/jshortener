package com.jshortener.dto;

import jakarta.validation.constraints.*;
import org.hibernate.validator.constraints.URL;

public record SearchShortLinkDto(
        @Positive
        Integer id,

        @Size(min = 6, max = 6, message = "Short code must be exactly 6 characters long")
        String shortCode,

        @Size(max = 1024, message = "Original URL must be less than 1024 characters")
        @URL
        String originalUrl,

        @Positive
        Integer limit,

        @Min(0)
        Integer offset
) {
}