package com.example;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public org.springframework.http.ResponseEntity<String> hello() {
        return org.springframework.http.ResponseEntity.ok("Hello from Spring Boot on GCP!");
    }

    @GetMapping("/status")
    public ResponseEntity<String> status() {
        return ResponseEntity.ok("Status: Running on GCP free instance.");
    }

    @GetMapping("/random-fact")
    public ResponseEntity<String> randomFact() {
        String[] facts = {
            "Bananas are berries, but strawberries aren't!",
            "A group of flamingos is called a 'flamboyance'.",
            "Honey never spoils. Archaeologists have eaten 3000-year-old honey!",
            "Octopuses have three hearts.",
            "The unicorn is the national animal of Scotland.",
            "If you lift a kangaroo's tail off the ground, it can't hop."
        };
        int idx = (int) (Math.random() * facts.length);
        return ResponseEntity.ok(facts[idx]);
    }

    @GetMapping("/")
    public ResponseEntity<Void> rootRedirect() {
        return ResponseEntity.status(HttpStatus.PERMANENT_REDIRECT)
                .header(HttpHeaders.LOCATION, "https://ghoomleabhi.in")
                .build();
    }
}
