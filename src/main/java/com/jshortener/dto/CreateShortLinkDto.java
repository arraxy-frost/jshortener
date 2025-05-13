package com.jshortener.dto;

import jakarta.validation.constraints.Size;
import org.hibernate.validator.constraints.URL;

public record CreateShortLinkDto(
    @Size(max = 1024, message = "Original URL must be less than 1024 characters")
    @URL
    String originalUrl
) {}
