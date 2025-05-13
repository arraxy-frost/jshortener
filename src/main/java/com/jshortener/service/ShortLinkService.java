package com.jshortener.service;

import com.jshortener.dto.CreateShortLinkDto;
import com.jshortener.dto.SearchShortLinkDto;
import com.jshortener.model.ShortLink;

import java.util.List;
import java.util.Optional;

public interface ShortLinkService {
    Optional<ShortLink> getShortLinkByCode(String shortCode);
    Optional<List<ShortLink>> searchShortLinks(SearchShortLinkDto searchData);
    ShortLink createShortLink(CreateShortLinkDto createShortLinkDto);
    boolean deleteShortLink(Integer shortLinkId);
}
