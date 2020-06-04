package com.omar.petclinic.model.services;

import com.omar.petclinic.model.Owner;
import com.omar.petclinic.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(Long id);
    Vet save(Vet vet);
    Set<Vet> finaAll();
}
