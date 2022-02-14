package com.example.openapi;

import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@PreAuthorize("isAuthenticated()")
@RestController
@RequestMapping("/api")
@SecurityRequirement(name = "Bearer")
public class ItemController {
    @GetMapping("/book")
    public List<String> getBooks() {
        return Arrays.asList("book1", "book2");
    }
}
