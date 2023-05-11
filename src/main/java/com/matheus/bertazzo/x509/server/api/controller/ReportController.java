package com.matheus.bertazzo.x509.server.api.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@Log4j2
@RestController
@RequestMapping("/report")
public class ReportController {
    @PostMapping()
    @PreAuthorize("hasAuthority('ROLE_USER')")
    public ResponseEntity<Void> post(@RequestBody String payload) {
        log.info(String.format("Received: %s", payload));
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .build();
    }
}
