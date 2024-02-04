package com.bezkoder.springjwt.controllers;

import com.bezkoder.springjwt.payload.request.LoginRequest;
import com.bezkoder.springjwt.payload.response.JwtResponse;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/product/")
public class ProductController {
    @GetMapping("get")
    public ResponseEntity<?> getProduct() {
        return ResponseEntity.ok("hello");
    }
}
