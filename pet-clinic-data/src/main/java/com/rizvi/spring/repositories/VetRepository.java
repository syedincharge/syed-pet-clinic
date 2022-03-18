package com.rizvi.spring.repositories;

import com.rizvi.spring.model.Vet;
import org.springframework.data.repository.CrudRepository;

public interface VetRepository extends CrudRepository<Vet, Long> {

}
