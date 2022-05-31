package com.example.demo.depression;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/depression")
public class DepressionController {
    @Autowired
    private final DepressionService depressionService;

    public DepressionController(DepressionService depressionService) { this.depressionService = depressionService; }

    @GetMapping
    public List<Depression> getDepression() {
        return depressionService.getDepression();
    }
}
