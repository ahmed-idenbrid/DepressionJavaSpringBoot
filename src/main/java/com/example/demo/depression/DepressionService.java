package com.example.demo.depression;


import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepressionService {
    public List<Depression> getDepression(){
        return List.of(
                new Depression(
                        1L,
                        1L,
                        "",
                        ""
                )
        );
    }

}
