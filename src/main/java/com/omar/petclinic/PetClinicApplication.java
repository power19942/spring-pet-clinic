package com.omar.petclinic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PetClinicApplication {
    public static void main(String[] args) {
        var context = SpringApplication.run(PetClinicApplication.class, args);
    }
}
