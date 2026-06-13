package com.example.sof.controller;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
// 프론트엔드 개발 서버(예: React/Vue의 5173 포트)를 허용
@CrossOrigin(origins = "http://localhost:5173")
public class ProductController {

    @GetMapping
    public List<String> getProducts() {
        return List.of("티셔츠", "바지", "스니커즈");
    }

    @PostMapping
    public String createProduct(@RequestBody String name) {
        return name + " 상품이 등록되었습니다.";
    }
}