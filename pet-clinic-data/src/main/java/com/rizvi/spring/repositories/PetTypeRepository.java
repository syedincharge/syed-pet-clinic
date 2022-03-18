package com.rizvi.spring.repositories;

import com.rizvi.spring.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {

}
