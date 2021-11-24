package com.poc.controller;


import com.poc.model.HealthResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/home")
    ResponseEntity<HealthResponse> getHealth() {
        return ResponseEntity.ok(new HealthResponse());
    }
}
