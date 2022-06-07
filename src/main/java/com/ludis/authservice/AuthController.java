package com.ludis.authservice;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("auth/")
public class AuthController {

    @GetMapping(value="hello")
    public String getAccountsByEmpId() {
        return "hello! authorized!";
    }
}
