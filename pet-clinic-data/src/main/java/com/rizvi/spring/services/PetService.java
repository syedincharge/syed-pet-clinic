package com.rizvi.spring.services;

import com.rizvi.spring.model.Owner;
import com.rizvi.spring.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);
    Pet save(Pet pet);
    Set<Pet> findAll();
}
