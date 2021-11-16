package com.irostub.portfolio;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HerokuUpController {
    @GetMapping("/herokuup")
    public ResponseEntity<Object> up() {
        return ResponseEntity.ok().build();
    }
}
