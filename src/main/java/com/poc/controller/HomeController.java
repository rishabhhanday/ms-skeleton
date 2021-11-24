package com.poc.controller;

import example.model.Pet;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/home")
    ResponseEntity<Pet> getPet() {
        Pet pet = new Pet();
        pet.setId(12L);
        return ResponseEntity.ok(pet);
    }
}
