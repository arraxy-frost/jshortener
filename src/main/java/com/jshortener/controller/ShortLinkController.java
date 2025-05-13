package com.jshortener.controller;

import com.jshortener.dto.SearchShortLinkDto;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("api/v1/short-links")
public class ShortLinkController {

    @RequestMapping(method = RequestMethod.GET, consumes = "application/json")
    public ResponseEntity<SearchShortLinkDto> searchShortLinks(@Valid @RequestBody SearchShortLinkDto searchData) {
        System.out.println("GET with body: " + searchData);
        return ResponseEntity.ok(searchData);
    }
}
