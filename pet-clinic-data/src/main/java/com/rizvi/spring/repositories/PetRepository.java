package com.rizvi.spring.repositories;

import com.rizvi.spring.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {

}
