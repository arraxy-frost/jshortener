package com.jshortener.repository;

import com.jshortener.model.ShortLink;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShortLinkRepository extends JpaRepository<ShortLink, Integer> { }
