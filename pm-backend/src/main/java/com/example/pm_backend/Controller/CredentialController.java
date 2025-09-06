package com.example.pm_backend.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class CredentialController{
         
    @GetMapping
    public String Test(){
        return "Test";
    }

}
