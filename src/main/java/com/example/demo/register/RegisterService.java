package com.example.demo.register;

import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RegisterService {
    public List<Register> getRegister(){
        return List.of(
                new Register(
                        1l,
                        "",
                        "",
                        "",
                        ""
                )
        );
    }
}
