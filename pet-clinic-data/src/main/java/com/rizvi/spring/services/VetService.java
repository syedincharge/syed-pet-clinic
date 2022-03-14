package com.rizvi.spring.services;

import com.rizvi.spring.model.Pet;
import com.rizvi.spring.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);
    Vet save(Vet vet);
    Set<Vet> findAll();
}
